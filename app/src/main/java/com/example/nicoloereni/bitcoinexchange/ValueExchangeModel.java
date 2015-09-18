package com.example.nicoloereni.bitcoinexchange;

import org.json.JSONException;
import org.json.JSONObject;

public class ValueExchangeModel {


    public String sell;
    public String symbol;
    public String last;
    public String buy;

    public ValueExchangeModel(JSONObject jsonObjectValue) {

        try {
            last = jsonObjectValue.getString("last");
            buy = jsonObjectValue.getString("buy");
            sell = jsonObjectValue.getString("sell");
            symbol = jsonObjectValue.getString("symbol");

        } catch (JSONException e) {

        }

    }
}
