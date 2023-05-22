package org.oceanops.api.loaders;

import java.io.InputStream;

import org.json.JSONArray;
import org.json.JSONObject;
import org.oceanops.api.parsers.PlatformArgoNcParser;
import org.oceanops.api.parsers.PlatformFileParser;
import org.oceanops.api.parsers.PlatformFileParsers;
import org.oceanops.api.parsers.PlatformOceanOPSCSVParser;
import org.oceanops.api.parsers.PlatformUSMetaParser;


public class PlatformLoader {

    public class PlatformLoadResult {
        private Integer id;
        private boolean success;
        private String log;

        public PlatformLoadResult(Integer id, boolean success, String log){
            this.id = id;
            this.success = success;
            this.log = log;
        }
        
        public Integer getId() {
            return id;
        }

        public boolean isSuccess() {
            return success;
        }

        public String getLog() {
            return log;
        }
    }

    /**
     * Takes an InputStream, checks the contents, sends it to a parser which will analyse and upsert the platform records.
     * @param uploadedInputStream The uploaded input file stream
     * @param fileType file type checked by the request router, based on MIME type.
     * @return a JSONObject containing a JSONArray 'data', which contains itself the logs of the loading process. 
     * A integer 'total' is returned as well indicating the number of elements in the 'data' array.
     */
    public static JSONObject loadFile(InputStream uploadedInputStream, String fileType) {
        JSONObject result = new JSONObject();
        JSONArray data = new JSONArray();
        PlatformFileParser parser = null;

        switch(fileType){
            case "csv":
                parser = new PlatformOceanOPSCSVParser(uploadedInputStream);
                break;
            case "netcdf":
                if(PlatformFileParsers.isArgoNetCDF(uploadedInputStream))
                    parser = new PlatformArgoNcParser(uploadedInputStream);
                break;
            case "plaintext":
                if(PlatformFileParsers.isUSMetafile(uploadedInputStream))
                    parser = new PlatformUSMetaParser(uploadedInputStream);
                break;
            default:
                break;
        }
        data = parser.processRecords();
        result.put("total", data.length());
        result.put("data", data);
        return result;
    }
    
    /**
     * Takes a deep JSON representation of a platform (PTF) and insert or update the records through the API
     * @param inputJSON
     * @return
     */
    public static PlatformLoadResult loadJSON(JSONObject inputJSON) {
        // TODO stubb
        return null;
    }
}
