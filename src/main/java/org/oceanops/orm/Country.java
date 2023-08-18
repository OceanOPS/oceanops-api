package org.oceanops.orm;

import org.json.JSONObject;
import org.oceanops.orm.auto._Country;

public class Country extends _Country {

    private static final long serialVersionUID = 1L;

    private static String ID_JSON_KEY = "id";
    private static String NAME_JSON_KEY = "name";
    private static String NAME_SHORT_JSON_KEY = "nameShort";
    private static String NAME_LONG_JSON_KEY = "nameLong";
    private static String CODE2_JSON_KEY = "code2";
    private static String CODE3_JSON_KEY = "code3";
    
    public JSONObject buildJSON(){
        JSONObject o = new JSONObject();
        o.put(Country.ID_JSON_KEY, this.getId());
        o.put(Country.NAME_JSON_KEY, this.getName());
        o.put(Country.NAME_SHORT_JSON_KEY, this.getNameShort());
        o.put(Country.NAME_LONG_JSON_KEY, this.getNameLong());
        o.put(Country.CODE2_JSON_KEY, this.getCode2());
        o.put(Country.CODE3_JSON_KEY, this.getCode3());
        
        // add all properties and relationships ...

        return o;
    }
}
