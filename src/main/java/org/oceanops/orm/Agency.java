package org.oceanops.orm;

import org.oceanops.api.Utils;
import org.oceanops.orm.auto._Agency;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.query.SelectById;
import org.json.JSONObject;

public class Agency extends _Agency {

    private static final long serialVersionUID = 1L;
    
    private static String ID_JSON_KEY = "id";
    private static String NAME_JSON_KEY = "name";
    private static String NAME_SHORT_JSON_KEY = "nameShort";
    private static String LAT_JSON_KEY = "lat";
    private static String LON_JSON_KEY = "lon";
    private static String FAX_JSON_KEY = "fax";
    private static String ADDRESS_JSON_KEY = "address";
    private static String COUNTRY_JSON_KEY = "country";
    private static String WEBLINK_JSON_KEY = "weblink";
    private static String COUNTRY_ID_JSON_KEY = "id";
    private static String WEBLINK_ID_JSON_KEY = "id";

    /**
     * Build the JSONObject returned in reponse, conforming to the json-schema
     * @return
     */
    public JSONObject buildJSON(){
        JSONObject o = new JSONObject();
        o.put(Agency.ID_JSON_KEY, this.getId());
        o.put(Agency.NAME_JSON_KEY, this.getName());
        o.put(Agency.NAME_SHORT_JSON_KEY, this.getNameShort());
        o.put(Agency.LAT_JSON_KEY, this.getLat());
        o.put(Agency.LON_JSON_KEY, this.getLon());
        o.put(Agency.FAX_JSON_KEY, this.getFax());
        o.put(Agency.ADDRESS_JSON_KEY, this.getAddress());
        o.put(Agency.COUNTRY_JSON_KEY, this.getCountry().buildJSON());
        o.put(Agency.WEBLINK_JSON_KEY, this.getWeblink().buildJSON());
        return o;
    }
	
	/**
	 * Set's the agency's properties by calling all the set methods
	 * @param receivedData provided JSON to parse to get the properties
	 * @param agency entity
	 * @param context
	 */
	public void setAgencyPropertiesWithRecievedValues(JSONObject receivedData, ObjectContext context){
        this.setTheNonNestedProperties(receivedData, context);
        this.setCountryIfPresent(receivedData, context);
        this.setWeblinkIfPresent(receivedData, context);

        // Other update methods ...
    }

    /**
	 * Set's the agency's properties, all except the nested properties/relationships
	 * @param jsonData provided JSON to parse to get the properties
	 * @param agency entity
	 * @param context
	 */
	public void setTheNonNestedProperties(JSONObject jsonData, ObjectContext context){
		if(jsonData.has(Agency.NAME_JSON_KEY)){
        	this.setName(jsonData.get(Agency.NAME_JSON_KEY).toString());
		}
		if(jsonData.has(Agency.NAME_SHORT_JSON_KEY)){
        	this.setNameShort(jsonData.get(Agency.NAME_SHORT_JSON_KEY).toString());
		}
		if(jsonData.has(Agency.LAT_JSON_KEY)){
        	this.setLat(Double.parseDouble(jsonData.get(Agency.LAT_JSON_KEY).toString()));
		}
		if(jsonData.has(Agency.LON_JSON_KEY)){
        	this.setLon(Double.parseDouble(jsonData.get(Agency.LON_JSON_KEY).toString()));
		}
		if(jsonData.has(Agency.FAX_JSON_KEY)){
        	this.setFax(jsonData.get(Agency.FAX_JSON_KEY).toString());
		}
		if(jsonData.has(Agency.ADDRESS_JSON_KEY)){
        	this.setAddress(jsonData.get(Agency.ADDRESS_JSON_KEY).toString());
		}
    }


	/**
	 * Set's the agency's country from a provided id
	 * @param jsonData provided JSON to parse to get the country id
	 * @param agency entity
	 * @param context
	 */
	public void setCountryIfPresent(JSONObject jsonData, ObjectContext context) {
		if (jsonData.has(Agency.COUNTRY_JSON_KEY)) {
			JSONObject countryJson = jsonData.getJSONObject(Agency.COUNTRY_JSON_KEY);
			if (countryJson.has(Agency.COUNTRY_ID_JSON_KEY) && Utils.isInteger(countryJson.get(Agency.COUNTRY_ID_JSON_KEY).toString())) {
				int countryId = countryJson.getInt(Agency.COUNTRY_ID_JSON_KEY);
				Country country = SelectById.query(Country.class, countryId).selectOne(context);
				if(country != null){
					this.setCountry(country);
				}
			}
		}
	}


	/**
	 * Set's the agency's weblink (an existing weblink if provided an id, or create a weblink from other params)
	 * @param jsonData provided JSON to parse
	 * @param agency entity
	 * @param context
	 */
	public void setWeblinkIfPresent(JSONObject jsonData, ObjectContext context) {
		if (jsonData.has(Agency.WEBLINK_JSON_KEY)) {
			JSONObject weblinkJson = jsonData.getJSONObject(Agency.WEBLINK_JSON_KEY);
			if (weblinkJson.has(Agency.WEBLINK_ID_JSON_KEY)) {
				int weblinkId = weblinkJson.getInt(Agency.WEBLINK_ID_JSON_KEY);
				Weblink weblink = SelectById.query(Weblink.class, weblinkId).selectOne(context);
				this.setWeblink(weblink);
			}else{
				Weblink weblink = Weblink.createWeblinkFromJson(weblinkJson, context);
				this.setWeblink(weblink);
			}
		}
	}
}
