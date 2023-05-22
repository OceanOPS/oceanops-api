package org.oceanops.api.parsers;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.apache.cayenne.query.ObjectSelect;
import org.apache.cayenne.query.SQLSelect;
import org.apache.cayenne.query.SelectById;
import org.json.JSONArray;
import org.json.JSONObject;
import org.oceanops.orm.Network;
import org.oceanops.orm.Program;
import org.oceanops.orm.PtfBattery;
import org.oceanops.orm.PtfModel;
import org.oceanops.orm.SensorModel;
import org.oceanops.orm.Ship;
import org.oceanops.orm.TelecomService;
import org.oceanops.orm.TelecomType;

public class PlatformArgoNcParser extends AbstractPlatformFileParser implements PlatformFileParser {
    public PlatformArgoNcParser(InputStream fileInputStream){
        super(fileInputStream);
    }

    public JSONArray processRecords(){
        return null;
    }

    public JSONArray toJSON(){
        JSONObject ptfJson = new JSONObject();
        try{
            String fileString = new String(this.fileInputStream.readAllBytes(), StandardCharsets.UTF_8);
            String[] lines = fileString.split("\n");
            boolean isUpdate = false;
            HashMap<String, String> map = new HashMap<String, String>();
            for (String line : lines) {
                if (line.length() != 0 && line.length() > 39) {
                    String name = line.substring(0, 39).trim();
                    String value = line.substring(40).trim();
                    map.put(name, value);
                }
            }

            Set<String> keys = map.keySet();
            JSONObject telecom = new JSONObject(),
                    identifiers = new JSONObject(),
                    deployment = new JSONObject(),
                    retrieval = new JSONObject(),
                    software = new JSONObject(),
                    hardware = new JSONObject(),
                    configuration = new JSONObject();
            JSONArray sensors = new JSONArray();
            String batteryType = null, batteryVoltage = null, batteryName = null, cruiseName = "";
            PtfModel ptfModel = null;
            Ship ship = null;
            ArrayList<String> otherSensorTypes = new ArrayList<String>();
            ArrayList<String> extraSensorTypes = new ArrayList<String>();
            ArrayList<String> extraSensorSerials = new ArrayList<String>();
            ArrayList<String> extraSensorManus = new ArrayList<String>();

            // FIRST ITERATE THROUGH ALL THE KEYS IN DRAFT TO FIND OUT IF EXISTING FLOAT OR
            // NOT

            for (String key : keys) {
                String value = map.get(key);
                if (key.contains("WMO ID number")) {
                    String wmoNum = value;
                    ptfJson.put("reference", wmoNum);
                    identifiers.put("wmoid", value);
                    Integer ptfId = SQLSelect.scalarQuery("select id from ptf where ref=#bind($ref)", Integer.class)
                        .param("ref", wmoNum).selectFirst(editingContext);
                    if (ptfId != null) {
                        ptfJson.put("id", ptfId);
                        isUpdate = true;
                    }
                }
            }

            // RE-ITERATE FOR ALL THE OTHER KEYS IN DRAFT

            for (String key : keys) {

                String value = map.get(key);

                if (key.contains("transmission IMEI number")) {
                    telecom.put("imei", value);
                }
                if (key.contains("transmission ID number")) {
                    telecom.put("number", value);
                }
                if (key.contains("transmission type")) {
                    String typeName = value.trim();
                    if (typeName.contains("IRIDIUM")) {
                        if (typeName.contains("(SBD)")) {
                            TelecomService telService = ObjectSelect.query(TelecomService.class)
                                .where(TelecomService.NAME.eq("IRIDIUM_SBD")).selectFirst(editingContext);
                            if (telService != null) {
                                JSONObject serviceObj = new JSONObject();
                                serviceObj.put("id", telService.getId());
                                serviceObj.put("text", telService.getName());
                                telecom.put("service", serviceObj);
                            }
                        }
                        typeName = "IRIDIUM";
                    }
                    TelecomType telType = ObjectSelect.query(TelecomType.class, TelecomType.NAME.eq(typeName)).selectFirst(editingContext);
                    if (telType != null) {
                        JSONObject typeObj = new JSONObject();
                        typeObj.put("id", telType.getId());
                        typeObj.put("text", telType.getName());
                        telecom.put("type", typeObj);
                    }
                }

                if (key.contains("float serial number")) {
                    identifiers.put("serialnumber", value);
                }

                if (key.contains("ROM version")) {
                    software.put("version", value);
                }
                if (key.contains("CPU serial number") || key.contains("board serial number")
                        || key.contains("Board serial number")) {
                    hardware.put("controlBoardSerialNumber", value);
                }
                if (key.contains("board type") || key.contains("Board version")) {
                    hardware.put("controlBoard", value);
                }
                if ((key.contains("instrument type")) && (!key.contains("WMO"))) {
                    String instrument = value.trim();
                    if (instrument == null || instrument.length() == 0) {
                        instrument = "APEX";
                    }
                    if (instrument.contains("SOLO2")) {
                        instrument = "SOLO_II";
                    }
                    if (value.contains("SOLODIR_TS37")) {
                        instrument = "SOLO_D";
                    }
                    if (value.contains("NAVIS")) {
                        instrument = "NAVIS_A";
                    }
                    ptfModel = ObjectSelect.query(PtfModel.class).where(PtfModel.NAME_SHORT.eq(instrument)).selectFirst(editingContext);
                }

                if ((key.contains("ref table PLATFORM_TYPE"))) {
                    String ptfModelKey = value.trim();
                    ptfModel = ObjectSelect.query(PtfModel.class).where(PtfModel.KEY.eq(ptfModelKey)).selectFirst(editingContext);
                }

                if ((key.contains("ref table PROJECT_NAME"))) {
                    String progName = value.trim();
                    List<Program> progs = ObjectSelect.query(Program.class)
                        .or(Program.NAME.likeIgnoreCase(progName),
                            Program.NAME_SHORT.likeIgnoreCase(progName))
                        .select(editingContext);
                    if (progs != null && progs.size() == 1) {
                        Program prog = progs.get(0);
                        JSONObject programObj = new JSONObject();
                        programObj.put("id", prog.getId());
                        programObj.put("text", prog.getName());
                        ptfJson.put("program", programObj);
                        if (!isUpdate) {
                            Network masterNetwork = prog.getNetwork();
                            if (!ptfJson.has("networks")) {
                                ptfJson.put("networks", new JSONArray());
                            }
                            if (!ptfJson.has("allNetworks")) {
                                ptfJson.put("allNetworks", new JSONArray());
                            }
                            ((JSONArray) ptfJson.get("allNetworks")).put(masterNetwork.getName());
                            ((JSONArray) ptfJson.get("networks")).put(masterNetwork.getName());
                        }
                    } else {
                        ptfJson.put("progName", progName);
                    }
                }

                if (key.contains("deployment platform")) {
                    value = value.replace("R/V", "");
                    value = value.replace("M/V", "");
                    value = value.replace("S/V", "");
                    value = value.replace("SS/V", "");
                    value = value.replace("T/V", "");
                    value = value.replace("NOAA ship", "");
                    if (value.toUpperCase().contains("LANGSETH")) {
                        value = "MARCUS G. LANGSETH";
                    }
                    if (value.toUpperCase().contains("RONALD BROWN")) {
                        value = "RONALD H. BROWN";
                    }
                    if (value.toUpperCase().contains("KAHAROA")) {
                        value = "KAHAROA";
                    }
                    String shipName = value.trim();
                    List<Ship> ships = ObjectSelect.query(Ship.class).where(Ship.NAME.likeIgnoreCase(shipName)).select(editingContext);
                    if (ships != null && ships.size() == 1) {
                        ship = ships.get(0);
                    } else {
                        deployment.put("shipName", shipName);
                    }
                }
                if (key.contains("ref table DEPLOYMENT_PLATFORM_ID")) {
                    String shipRef = value.trim();
                    Ship fetchedShip = ObjectSelect.query(Ship.class).where(Ship.REF.eq(shipRef)).selectFirst(editingContext);
                    if (fetchedShip != null) {
                        ship = fetchedShip;
                    }
                }

                if (key.contains("launch position [") && value.indexOf(" ") != -1) {
                    value = value.replace("    ", " ");
                    value = value.replace("   ", " ");
                    value = value.replace("  ", " ");
                    String latLong = value;
                    String lat = latLong.substring(0, latLong.indexOf(" "));
                    if (String.valueOf(lat.charAt(lat.length() - 1)).equals(".")) {
                        lat = lat.substring(0, lat.length() - 1);
                    }
                    String next = latLong.substring(latLong.indexOf(" ") + 1);
                    String latm = next.substring(0, next.indexOf(" "));
                    next = next.substring(next.indexOf(" ") + 1);
                    if (next.indexOf(" ") == 0) {
                        next = next.substring(next.indexOf(" ") + 1);
                    }
                    String lon = next.substring(0, next.indexOf(" "));
                    if (String.valueOf(lon.charAt(lon.length() - 1)).equals(".")) {
                        lon = lon.substring(0, lon.length() - 1);
                    }
                    String lonm = next.substring(next.indexOf(" ") + 1);
                    Integer latInt = Integer.parseInt(lat);
                    Double latmInt = Double.parseDouble(latm);
                    Integer lonInt = Integer.parseInt(lon);
                    Double lonmInt = Double.parseDouble(lonm);
                    Double latitude = latInt + (latmInt / 60);
                    Double longitude = lonInt + (lonmInt / 60);

                    deployment.put("latitude", latitude);
                    deployment.put("longitude", longitude);
                }

                if (key.contains("launch time [dd mm")) {
                    String deplDate = value;
                    String day = deplDate.substring(0, 2);
                    String rest = deplDate.substring(deplDate.indexOf(" ") + 1);
                    String month = rest.substring(0, 2);
                    rest = rest.substring(rest.indexOf(" ") + 1);
                    String year = rest.substring(0, 4);
                    rest = rest.substring(rest.indexOf(" ") + 1);
                    deplDate = year + "-" + month + "-" + day;
                    String hour = rest.substring(0, 2);
                    rest = rest.substring(rest.indexOf(" ") + 1);
                    String min = rest.substring(0, 2);
                    String deplTime = hour + ':' + min + ":00";
                    deployment.put("date", deplDate + " " + deplTime);
                }

                if (key.contains("launch time [mm dd")) {
                    String deplDate = value;
                    String month = deplDate.substring(0, 2);
                    String rest = deplDate.substring(deplDate.indexOf(" ") + 1);
                    String day = rest.substring(0, 2);
                    rest = rest.substring(rest.indexOf(" ") + 1);
                    String year = rest.substring(0, 4);
                    rest = rest.substring(rest.indexOf(" ") + 1);
                    deplDate = year + "-" + month + "-" + day;
                    String hour = rest.substring(0, 2);
                    rest = rest.substring(rest.indexOf(" ") + 1);
                    String min = rest.substring(0, 2);
                    String deplTime = hour + ':' + min + ":00";
                    deployment.put("date", deplDate + " " + deplTime);
                }

                if (key.contains("Installation date")) {
                    String deplDate = value;
                    String year = deplDate.substring(0, 4);
                    String month = deplDate.substring(4, 7);
                    String day = deplDate.substring(7, 9);
                    deplDate = year + "-" + month + "-" + day;
                    deployment.put("date", deplDate);
                }
                if (key.contains("De-installation date")) {
                    String endingDate = value;
                    String year = endingDate.substring(0, 4);
                    String month = endingDate.substring(4, 7);
                    String day = endingDate.substring(7, 9);
                    endingDate = year + "-" + month + "-" + day;
                    retrieval.put("endDate", endingDate);
                }
                if (key.contains("nominal drift pressure")) {
                    configuration.put("driftPressure", Integer.parseInt(value));
                }

                if (key.contains("nominal profile pressure")) {
                    configuration.put("profilePressure", Integer.parseInt(value));
                }

                if (key.contains("surface time")) {
                    configuration.put("surfaceTime", Float.parseFloat(value));
                }

                if (key.contains("cycle time")) {
                    Double cycleTime = Double.parseDouble(value) * 24;
                    configuration.put("cycleTime", cycleTime);
                }

                if ((key.contains("battery type"))) {
                    batteryType = value.trim();
                }

                if ((key.contains("initial battery voltage"))) {
                    batteryVoltage = value.substring(0, 2) + "V";
                }

                if ((key.contains("internal ID number"))) {
                    identifiers.put("internalid", value);
                }

                if ((key.contains("deployment cruise id"))) {
                    cruiseName += value;
                }
                if ((key.contains("comment"))) {
                    ptfJson.put("description", value);
                }

                if (key.contains("SENSOR_TYPE") && !otherSensorTypes.contains(value.trim())) {
                    otherSensorTypes.add(value.trim());
                }
                if (key.contains("sensor type") && !extraSensorTypes.contains(value.trim())) {
                    extraSensorTypes.add(value.trim());
                    String snKey = key.replace("type", "serial number").trim(),
                            manuKey = key.replace("type", "manufacturer").trim(), snValue = " ", manuValue = " ";
                    for (String jKey : keys) {
                        if (jKey.contains(snKey)) {
                            snValue = map.get(jKey);
                        }
                        if (jKey.contains(manuKey)) {
                            manuValue = map.get(jKey);
                        }
                    }
                    extraSensorSerials.add(snValue);
                    extraSensorManus.add(manuValue);
                }
            }

            if (batteryType != null && batteryVoltage != null && batteryType != "" && batteryVoltage != "") {
                batteryName = batteryType + " " + batteryVoltage;
                PtfBattery battery = ObjectSelect.query(PtfBattery.class, PtfBattery.NAME.eq(batteryName)).selectFirst(editingContext);
                if (battery != null) {
                    JSONObject batteryObj = new JSONObject();
                    batteryObj.put("id", battery.getId());
                    batteryObj.put("text", battery.getName().replace("&", "and"));
                    hardware.put("battery", batteryObj);
                }
            }
            if (ship != null) {
                JSONObject shipObj = new JSONObject();
                shipObj.put("id", ship.getId());
                shipObj.put("text", ship.getName());
                deployment.put("ship", shipObj);
                deployment.remove("shipName");
            }
            if (ptfModel != null) {
                JSONObject model = new JSONObject();
                model.put("id", ptfModel.getId());
                model.put("text", ptfModel.getNameShort());
                ptfJson.put("model", model);
            }

            int s = 0;

            for (String sensorTypeName : extraSensorTypes) {
                String sensorManufacturor = extraSensorManus.get(s);
                if (sensorTypeName != null && sensorManufacturor != null
                        && (sensorTypeName.toUpperCase().equals("2900 PSIA")
                                || sensorTypeName.toUpperCase().equals("2900PSIA"))
                        && sensorManufacturor.toUpperCase().equals("DRUCK")) {
                    sensorTypeName = "DRUCK_2900PSIA";
                }
                extraSensorTypes.set(s, sensorTypeName);
                s++;
            }

            for (s = 0; s < otherSensorTypes.size(); s++) {
                if (extraSensorTypes.contains(otherSensorTypes.get(s))) {
                    otherSensorTypes.set(s, "");
                }
                s++;
            }

            String unknownSensors = "";
            if (otherSensorTypes.size() > 0) {
                for (s = 0; s < otherSensorTypes.size(); s++) {
                    String sensorModel = otherSensorTypes.get(s);
                    if (sensorModel != "") {
                        SensorModel rec = ObjectSelect.query(SensorModel.class)
                            .or(SensorModel.NAME.likeIgnoreCase(sensorModel), SensorModel.NAME_LONG.likeIgnoreCase(sensorModel),
                                SensorModel.BODC_ID.endsWithIgnoreCase(sensorModel))
                            .selectFirst(editingContext);
                        if (rec == null) {
                            // TRY MAPPING ON NAME_SHORT
                            rec = ObjectSelect.query(SensorModel.class)
                                .or(SensorModel.NAME_SHORT.likeIgnoreCase(sensorModel))
                                .selectFirst(editingContext);
                            if (rec == null) {
                                // TRY FETCHING WITH WILDCARDS IN SPACES AND UNDERSCORES
                                String nameWithWildcards = sensorModel.replace(" ", "%").replace("_", "%").replace("/", "%")
                                        .replace("-", "%");
                                List<SensorModel> models = ObjectSelect.query(SensorModel.class)
                                    .or(SensorModel.NAME.likeIgnoreCase(nameWithWildcards), SensorModel.NAME_LONG.likeIgnoreCase(nameWithWildcards),
                                        SensorModel.BODC_ID.endsWithIgnoreCase(nameWithWildcards))
                                    .select(editingContext);
                                if (models.size() == 1) {
                                    rec = models.get(0);
                                }
                            }
                        }

                        JSONObject ptfSensor = new JSONObject();

                        if (rec != null && rec.getId() != null) {
                            ptfSensor.put("id", rec.getId());
                            ptfSensor.put("model", rec.getName());
                        } else {
                            ptfSensor.put("id", "");
                            ptfSensor.put("model", sensorModel);
                            if (!unknownSensors.contains(sensorModel)) {
                                if (unknownSensors.length() > 0) {
                                    unknownSensors += ", ";
                                }
                                unknownSensors += sensorModel;
                            }
                        }
                        sensors.put(ptfSensor);
                    }
                }
            }

            if (extraSensorTypes.size() > 0) {
                for (s = 0; s < extraSensorTypes.size(); s++) {
                    String sensorTypeName = extraSensorTypes.get(s);
                    String sensorSerial = extraSensorSerials.get(s);
                    String sensorManufacturor = extraSensorManus.get(s);

                    if (sensorManufacturor.toUpperCase() == "AANDERAA") {
                        sensorTypeName = "AANDERAA_OPTODE_" + sensorTypeName;
                    }
                    if ((sensorTypeName.toUpperCase().equals("2900 PSIA")
                            || sensorTypeName.toUpperCase().equals("2900PSIA"))
                            && sensorManufacturor.toUpperCase().equals("DRUCK")) {
                        sensorTypeName = "DRUCK_2900PSIA";
                    }

                    if (sensorTypeName != "") {
                        SensorModel rec = ObjectSelect.query(SensorModel.class)
                            .or(SensorModel.NAME.likeIgnoreCase(sensorTypeName), SensorModel.NAME_LONG.likeIgnoreCase(sensorTypeName),
                                SensorModel.BODC_ID.endsWithIgnoreCase(sensorTypeName))
                            .selectFirst(editingContext);
                        if (rec == null) {
                            // TRY MAPPING ON NAME_SHORT
                            rec = ObjectSelect.query(SensorModel.class)
                                .or(SensorModel.NAME_SHORT.likeIgnoreCase(sensorTypeName))
                                .selectFirst(editingContext);
                            if (rec == null) {
                                // TRY FETCHING WITH WILDCARDS IN SPACES AND UNDERSCORES
                                String nameWithWildcards = sensorTypeName.replace(" ", "%").replace("_", "%").replace("/", "%")
                                        .replace("-", "%");
                                List<SensorModel> models = ObjectSelect.query(SensorModel.class)
                                    .or(SensorModel.NAME.likeIgnoreCase(nameWithWildcards), SensorModel.NAME_LONG.likeIgnoreCase(nameWithWildcards),
                                        SensorModel.BODC_ID.endsWithIgnoreCase(nameWithWildcards))
                                    .select(editingContext);
                                if (models.size() == 1) {
                                    rec = models.get(0);
                                }
                            }
                        }

                        JSONObject ptfSensor = new JSONObject();

                        if (rec != null && rec.getId() != null) {
                            ptfSensor.put("id", rec.getId());
                            ptfSensor.put("model", rec.getName());
                        } else {
                            ptfSensor.put("id", "");
                            ptfSensor.put("model", sensorTypeName);
                            if (!unknownSensors.contains(sensorTypeName)) {
                                if (unknownSensors.length() > 0) {
                                    unknownSensors += ", ";
                                }
                                unknownSensors += sensorTypeName;
                            }
                        }
                        ptfSensor.put("serial", sensorSerial);
                        sensors.put(ptfSensor);
                    }
                }
            }

            if (unknownSensors.length() > 0 && !ptfJson.has("errors")) {
                JSONObject errors = new JSONObject();
                errors.put("unknownSensors", Arrays.asList(unknownSensors.split("\\s*, \\s*")));
                ptfJson.put("errors", errors);
            }
            if (sensors.length() > 0) {
                ptfJson.put("variables", sensors);
            }
            if (telecom.length() > 0) {
                ptfJson.put("telecom", telecom);
            }
            if (identifiers.length() > 0) {
                ptfJson.put("identifiers", identifiers);
            }
            if (deployment.length() > 0) {
                ptfJson.put("deployment", deployment);
            }
            if (retrieval.length() > 0) {
                ptfJson.put("retrieval", retrieval);
            }
            if (software.length() > 0) {
                ptfJson.put("software", software);
            }
            if (hardware.length() > 0) {
                ptfJson.put("hardware", hardware);
            }
            if (configuration.length() > 0) {
                ptfJson.put("configuration", configuration);
            }

            // LIST MISSING VALUES (ONLY FOR NEW REGISTRATIONS - NOT EDITING EXISTING)

            JSONArray missingInputs = new JSONArray();

            if (!isUpdate) {

                // IF NO NETWORK WAS FOUND FROM FILE OR FROM PROGRAM THEN NETWORK IS DETERMINED
                // FROM CURRENT SESSION THEME

                if (!ptfJson.has("networks") || ((JSONArray) ptfJson.get("networks")).length() == 0) {
                    Network masterNetwork = SelectById.query(Network.class, Network.ARGO_ID).selectFirst(editingContext);
                    if (!ptfJson.has("networks")) {
                        ptfJson.put("networks", new JSONArray());
                    }
                    if (!ptfJson.has("allNetworks")) {
                        ptfJson.put("allNetworks", new JSONArray());
                    }
                    ((JSONArray) ptfJson.get("allNetworks")).put(masterNetwork.getName());
                    ((JSONArray) ptfJson.get("networks")).put(masterNetwork.getName());
                }

                // CHECKS FOR ALL NETWORKS

                if (!ptfJson.has("id")
                        && (!ptfJson.has("deployment") || !((JSONObject) ptfJson.get("deployment")).has("date")
                                || ((JSONObject) ptfJson.get("deployment")).get("date").equals(""))) {
                    missingInputs.put("date");
                }
                if (!ptfJson.has("id") && (!ptfJson.has("program") || !((JSONObject) ptfJson.get("program")).has("text"))) {
                    missingInputs.put("program");
                }

                // NETWORK SPECIFIC CHECKS

                boolean isOceansites = false, isDBCP = false, isArgo = false;
                for (int i = 0; i < ((JSONArray) ptfJson.get("networks")).length(); i++) {
                    String networkName = ((JSONArray) ptfJson.get("networks")).getString(i);
                    if (networkName.equals("OceanSITES")) {
                        isOceansites = true;
                    }
                    if (networkName.equals("DBCP")) {
                        isDBCP = true;
                    }
                    if (networkName.equals("Argo")) {
                        isArgo = true;
                    }
                }

                if (!ptfJson.has("id") && !isOceansites && !isArgo
                        && (!ptfJson.has("identifiers") || !((JSONObject) ptfJson.get("identifiers")).has("wmoid"))) {
                    missingInputs.put("wmoid");
                }
                if (isOceansites && !ptfJson.has("id")
                        && (!ptfJson.has("site") || !((JSONObject) ptfJson.get("site")).has("id"))) {
                    missingInputs.put("site");
                }
                if (isDBCP && !ptfJson.has("id")
                        && (!ptfJson.has("deployment") || !((JSONObject) ptfJson.get("deployment")).has("latitude")
                                || !((JSONObject) ptfJson.get("deployment")).has("longitude"))) {
                    missingInputs.put("coordinates");
                }
            }

            ptfJson.put("missingInputs", missingInputs);
        }
        catch(IOException e){
            // Leaving ptfJson empty
        }

		JSONArray ptfArray = new JSONArray();
		ptfArray.put(ptfJson);
        return ptfArray;
    }
}
