package org.oceanops.api.parsers;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Interface for Platform file parsers.
 * 
 */
public interface PlatformFileParser {
    public abstract JSONArray toJSON();

    public abstract JSONArray processRecords();
}
