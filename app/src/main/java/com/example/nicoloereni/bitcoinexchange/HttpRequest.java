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
    private final String url;
    private String valueData;

    public HttpRequest(String url) {
        this.url = url;
    }

    public String getAllStringValueData()
    {
        try {

            URL url = new URL(this.url);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            InputStream in = new BufferedInputStream(conn.getInputStream());
            return  IOUtils.toString(in, "UTF-8");

        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public JSONObject getJsonObjectValue(String value) {
        try {

            return getAllJsonObjectValue().getJSONObject(value);
        } catch (JSONException e) {
            return null;
        }
    }

    public JSONObject getAllJsonObjectValue() {
        try {
            if(valueData == null){
                valueData = getAllStringValueData();
            }
            return new JSONObject(valueData);
        } catch (JSONException e) {
            return null;
        }
    }
}