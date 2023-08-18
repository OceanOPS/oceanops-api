package org.oceanops.orm;

import org.json.JSONObject;
import org.oceanops.orm.auto._Topic;

public class Topic extends _Topic {

    private static final long serialVersionUID = 1L;

    private static String ID_JSON_KEY = "id";
    private static String NAME_JSON_KEY = "name";

    public JSONObject buildJSON(){
        JSONObject o = new JSONObject();
        o.put(Topic.ID_JSON_KEY, this.getId());
        o.put(Topic.NAME_JSON_KEY, this.getName());
        return o;
    }
}
