package org.oceanops.orm;

import org.apache.cayenne.query.SelectById;
import org.json.JSONObject;
import org.oceanops.orm.auto._Weblink;
import org.apache.cayenne.ObjectContext;
import org.oceanops.api.Utils;

public class Weblink extends _Weblink {

    private static final long serialVersionUID = 1L;
  
    public static Weblink createWeblinkFromJson(JSONObject json, ObjectContext context) {
        Weblink weblink = new Weblink();
        if(json.has("name")){
            weblink.setName(json.get("name").toString());
        }
        if(json.has("url")){
            weblink.setUrl(json.get("url").toString());
        }
        if(json.has("description")){
            weblink.setDescription(json.get("description").toString());
        }
        if(json.has("rank")){
            weblink.setRank(Integer.parseInt(json.get("rank").toString()));
        }

        setTopicIfPresent(weblink, json, context);     
        setProgramIfPresent(weblink, json, context);     
        // set other relationships... (network, program, country, usergroup)

        context.registerNewObject(weblink);
        return weblink;
    }

    private static void setTopicIfPresent(Weblink weblink, JSONObject json, ObjectContext context){
        if(json.has("topic")){
			JSONObject topicJson = json.getJSONObject("topic");
            if(topicJson.has("id") && Utils.isInteger(topicJson.get("id").toString())){
                Integer topicId = topicJson.getInt("id");
                Topic topic = SelectById.query(Topic.class, topicId).selectOne(context);
                if(topic != null){
                    weblink.setTopic(topic);
                }
            }
        }
    }

    private static void setProgramIfPresent(Weblink weblink, JSONObject fullJson, ObjectContext context){
        if(fullJson.has("program")){
			JSONObject json = fullJson.getJSONObject("program");
            if(json.has("id") && Utils.isInteger(json.get("id").toString())){
                Integer id = json.getInt("id");
                Program program = SelectById.query(Program.class, id).selectOne(context);
                if(program != null){
                    weblink.setProgram(program);
                }
            }
        }
    }
    
}
