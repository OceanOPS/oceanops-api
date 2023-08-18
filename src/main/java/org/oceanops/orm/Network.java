package org.oceanops.orm;

import org.json.JSONObject;
import org.oceanops.orm.auto._Network;

public class Network extends _Network {

    private static final long serialVersionUID = 1L;

    private static String ID_JSON_KEY = "id";
    private static String NAME_JSON_KEY = "name";
    private static String NAME_SHORT_JSON_KEY = "nameShort";
    private static String DESCRIPTION_JSON_KEY = "description";

    public JSONObject buildJSON(){
        JSONObject o = new JSONObject();
        o.put(Network.ID_JSON_KEY, this.getId());
        o.put(Network.NAME_JSON_KEY, this.getName());
        o.put(Network.NAME_SHORT_JSON_KEY, this.getNameShort());
        o.put(Network.DESCRIPTION_JSON_KEY, this.getDescription());
        
        // add all properties and relationships ...

        return o;
    }

}
