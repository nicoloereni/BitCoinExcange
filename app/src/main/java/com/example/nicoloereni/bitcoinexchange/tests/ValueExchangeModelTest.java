package com.example.nicoloereni.bitcoinexchange.tests;

import android.test.AndroidTestCase;

import com.example.nicoloereni.bitcoinexchange.ValueExchangeModel;

import org.json.JSONException;
import org.json.JSONObject;

public class ValueExchangeModelTest extends AndroidTestCase{

    public void testCreate() throws JSONException {
//        "USD" : {"15m" : 233.4, "last" : 233.4, "buy" : 233, "sell" : 233.39,  "symbol" : "$"}
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("last","443");
        jsonObject.put("buy","442");
        jsonObject.put("sell","998");
        jsonObject.put("symbol","$");

        ValueExchangeModel valueExchangeModel = new ValueExchangeModel(jsonObject);

        assertEquals("443",valueExchangeModel.last);
        assertEquals("442",valueExchangeModel.buy);
        assertEquals("998",valueExchangeModel.sell);
        assertEquals("$",valueExchangeModel.symbol);
    }

}
