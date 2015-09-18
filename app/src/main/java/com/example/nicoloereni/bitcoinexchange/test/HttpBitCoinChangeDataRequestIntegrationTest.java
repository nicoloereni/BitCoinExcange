package com.example.nicoloereni.bitcoinexchange.test;

import android.test.AndroidTestCase;
import android.util.Log;

import com.example.nicoloereni.bitcoinexchange.HttpBitCoinChangeRequest;

import org.json.JSONException;
import org.json.JSONObject;

public class HttpBitCoinChangeDataRequestIntegrationTest extends AndroidTestCase
{

    private HttpBitCoinChangeRequest httpBitCoinChangeRequest;

    public void setUp()
    {
        httpBitCoinChangeRequest = new HttpBitCoinChangeRequest();
    }

    public void testGetBitCoinExchangeString()
    {
        String httpBitCoinChangeRequestData = httpBitCoinChangeRequest.getAllStringValueData();
        assertNotNull(httpBitCoinChangeRequestData);
        assertFalse(httpBitCoinChangeRequestData.isEmpty());
    }

    public void testGetBitCoinExchangeJsonObject() throws JSONException {
        JSONObject usdJsonObject = httpBitCoinChangeRequest.getJsonObjectValue("USD");
        assertNotNull(usdJsonObject);
        assertEquals("$", usdJsonObject.getString("symbol"));
        JSONObject iskJsonObject = httpBitCoinChangeRequest.getJsonObjectValue("ISK");
        assertNotNull(iskJsonObject);
        assertEquals("kr", iskJsonObject.getString("symbol"));
    }

}
