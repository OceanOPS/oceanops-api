package org.oceanops.orm;

import org.oceanops.orm.auto._Agency;
import org.json.JSONObject;

public class Agency extends _Agency {

    private static final long serialVersionUID = 1L;
    
    public JSONObject buildJSON(){
        JSONObject o = new JSONObject();
        o.put("name", this.getName());
        o.put("nameShort", this.getNameShort());
        o.put("lat", this.getLat());
        o.put("lon", this.getLon());
        o.put("fax", this.getFax());
        o.put("address", this.getAddress());
        return o;
    }
}
