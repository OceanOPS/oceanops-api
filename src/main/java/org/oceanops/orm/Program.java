package org.oceanops.orm;

import org.json.JSONObject;
import org.oceanops.orm.auto._Program;

public class Program extends _Program {

    private static final long serialVersionUID = 1L;

    private static String ID_JSON_KEY = "id";
    private static String NAME_JSON_KEY = "name";
    private static String NAME_SHORT_JSON_KEY = "nameShort";
    private static String DESCRIPTION_JSON_KEY = "description";
    private static String NETWORK_JSON_KEY = "network";
    private static String COUNTRY_JSON_KEY = "country";

    public JSONObject buildJSON(){
        JSONObject o = new JSONObject();
        o.put(Program.ID_JSON_KEY, this.getId());
        o.put(Program.NAME_JSON_KEY, this.getName());
        o.put(Program.NAME_SHORT_JSON_KEY, this.getNameShort());
        o.put(Program.NETWORK_JSON_KEY, this.getNetwork().buildJSON());
        o.put(Program.COUNTRY_JSON_KEY, this.getCountry().buildJSON());
        o.put(Program.DESCRIPTION_JSON_KEY, this.getDescription());
        
        // add all properties and relationships ...

        return o;
    }
}
