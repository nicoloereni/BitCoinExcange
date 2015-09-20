package com.example.nicoloereni.bitcoinexchange.tests;

import android.test.AndroidTestCase;

import com.example.nicoloereni.bitcoinexchange.HttpRequest;
import com.example.nicoloereni.bitcoinexchange.module.ValueExchangeFactoryModule;

import org.json.JSONException;
import org.json.JSONObject;

public class HttpBitCoinChangeDataRequestIntegrationTest extends AndroidTestCase
{

    private HttpRequest httpRequest;

    public void setUp()
    {
        httpRequest = new HttpRequest(ValueExchangeFactoryModule.URL_BITCOIN_INFO);
    }

    public void testGetBitCoinExchangeString()
    {
        String httpBitCoinChangeRequestData = httpRequest.getAllStringValueData();
        assertNotNull(httpBitCoinChangeRequestData);
        assertFalse(httpBitCoinChangeRequestData.isEmpty());
    }

    public void testGetBitCoinExchangeJsonObject() throws JSONException {
        JSONObject usdJsonObject = httpRequest.getJsonObjectValue("USD");
        assertNotNull(usdJsonObject);
        assertEquals("$", usdJsonObject.getString("symbol"));
        JSONObject iskJsonObject = httpRequest.getJsonObjectValue("ISK");
        assertNotNull(iskJsonObject);
        assertEquals("kr", iskJsonObject.getString("symbol"));
    }

}
