package com.example.nicoloereni.bitcoinexchange;

import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpRequest
{
    private String valueData;

    public String getAllStringValueData(String urlString)
    {
        try {

            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            InputStream in = new BufferedInputStream(conn.getInputStream());
            return  IOUtils.toString(in, "UTF-8");

        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public JSONObject getJsonObjectValue(String urlString, String value) {
        try {

            return getAllJsonObjectValue(urlString).getJSONObject(value);
        } catch (JSONException e) {
            return null;
        }
    }

    public JSONObject getAllJsonObjectValue(String urlString) {
        try {
            if(valueData == null){
                valueData = getAllStringValueData(urlString);
            }
            return new JSONObject(valueData);
        } catch (JSONException e) {
            return null;
        }
    }
}