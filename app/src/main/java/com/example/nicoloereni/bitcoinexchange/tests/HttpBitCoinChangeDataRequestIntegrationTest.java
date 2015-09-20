package com.example.nicoloereni.bitcoinexchange.tests;

import android.test.AndroidTestCase;

import com.example.nicoloereni.bitcoinexchange.HttpRequest;

import org.json.JSONException;
import org.json.JSONObject;

public class HttpBitCoinChangeDataRequestIntegrationTest extends AndroidTestCase
{

    private static final String URL_BITCOIN_INFO = "https://blockchain.info/it/ticker";
    private HttpRequest httpRequest;

    public void setUp()
    {
        httpRequest = new HttpRequest();
    }

    public void testGetBitCoinExchangeString()
    {
        String httpBitCoinChangeRequestData = httpRequest.getAllStringValueData(URL_BITCOIN_INFO);
        assertNotNull(httpBitCoinChangeRequestData);
        assertFalse(httpBitCoinChangeRequestData.isEmpty());
    }

    public void testGetBitCoinExchangeJsonObject() throws JSONException {
        JSONObject usdJsonObject = httpRequest.getJsonObjectValue(URL_BITCOIN_INFO, "USD");
        assertNotNull(usdJsonObject);
        assertEquals("$", usdJsonObject.getString("symbol"));
        JSONObject iskJsonObject = httpRequest.getJsonObjectValue(URL_BITCOIN_INFO, "ISK");
        assertNotNull(iskJsonObject);
        assertEquals("kr", iskJsonObject.getString("symbol"));
    }

}
