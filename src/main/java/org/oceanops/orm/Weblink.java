package org.oceanops.orm;

import org.apache.cayenne.query.SelectById;
import org.json.JSONObject;
import org.oceanops.orm.auto._Weblink;
import org.apache.cayenne.ObjectContext;
import org.oceanops.api.Utils;

public class Weblink extends _Weblink {

    private static final long serialVersionUID = 1L;
    
    private static String ID_JSON_KEY = "id";
    private static String NAME_JSON_KEY = "name";
    private static String URL_JSON_KEY = "url";
    private static String DESCRIPTION_JSON_KEY = "description";
    private static String RANK_JSON_KEY = "rank";
    private static String TOPIC_JSON_KEY = "topic";
    private static String PROGRAM_JSON_KEY = "program";
    private static String TOPIC_ID_JSON_KEY = "id";
    private static String PROGRAM_ID_JSON_KEY = "id";

    public static Weblink createWeblinkFromJson(JSONObject json, ObjectContext context) {
        Weblink weblink = new Weblink();
        if(json.has(Weblink.NAME_JSON_KEY)){
            weblink.setName(json.get(Weblink.NAME_JSON_KEY).toString());
        }
        if(json.has(Weblink.URL_JSON_KEY)){
            weblink.setUrl(json.get(Weblink.URL_JSON_KEY).toString());
        }
        if(json.has(Weblink.DESCRIPTION_JSON_KEY)){
            weblink.setDescription(json.get(Weblink.DESCRIPTION_JSON_KEY).toString());
        }
        if(json.has(Weblink.RANK_JSON_KEY)){
            weblink.setRank(Integer.parseInt(json.get(Weblink.RANK_JSON_KEY).toString()));
        }

        setTopicIfPresent(weblink, json, context);     
        setProgramIfPresent(weblink, json, context);     
        // set other relationships... (network, program, country, usergroup)

        context.registerNewObject(weblink);
        return weblink;
    }

    private static void setTopicIfPresent(Weblink weblink, JSONObject json, ObjectContext context){
        if(json.has(Weblink.TOPIC_JSON_KEY)){
			JSONObject topicJson = json.getJSONObject(Weblink.TOPIC_JSON_KEY);
            if(topicJson.has(Weblink.TOPIC_ID_JSON_KEY) && Utils.isInteger(topicJson.get(Weblink.TOPIC_ID_JSON_KEY).toString())){
                Integer topicId = topicJson.getInt(Weblink.TOPIC_ID_JSON_KEY);
                Topic topic = SelectById.query(Topic.class, topicId).selectOne(context);
                if(topic != null){
                    weblink.setTopic(topic);
                }
            }
        }
    }

    private static void setProgramIfPresent(Weblink weblink, JSONObject fullJson, ObjectContext context){
        if(fullJson.has(Weblink.PROGRAM_JSON_KEY)){
			JSONObject json = fullJson.getJSONObject(Weblink.PROGRAM_JSON_KEY);
            if(json.has(Weblink.PROGRAM_ID_JSON_KEY) && Utils.isInteger(json.get(Weblink.PROGRAM_ID_JSON_KEY).toString())){
                Integer id = json.getInt(Weblink.PROGRAM_ID_JSON_KEY);
                Program program = SelectById.query(Program.class, id).selectOne(context);
                if(program != null){
                    weblink.setProgram(program);
                }
            }
        }
    }

    public JSONObject buildJSON(){
        JSONObject o = new JSONObject();
        o.put(Weblink.ID_JSON_KEY, this.getId());
        o.put(Weblink.NAME_JSON_KEY, this.getName());
        o.put(Weblink.URL_JSON_KEY, this.getUrl());
        o.put(Weblink.NAME_JSON_KEY, this.getRank());
        o.put(Weblink.TOPIC_JSON_KEY, this.getTopic().buildJSON());
        o.put(Weblink.PROGRAM_JSON_KEY, this.getProgram().buildJSON());
        return o;
    }
}
