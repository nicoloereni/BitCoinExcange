package com.example.nicoloereni.bitcoinexchange;

import java.util.ArrayList;
import java.util.Iterator;

public class ValueExchangeFactory {

    public static final String URL_BITCOIN_INFO = "https://blockchain.info/it/ticker";

    public ArrayList<ValueExchangeModel> all(HttpRequest httpRequest) {
        ArrayList<ValueExchangeModel> result = new ArrayList<>();

        Iterator<String> keys = httpRequest.getAllJsonObjectValue(URL_BITCOIN_INFO).keys();
        while(keys.hasNext()){
            result.add(new ValueExchangeModel(httpRequest.getJsonObjectValue(URL_BITCOIN_INFO, keys.next())));
        }
        return result;
    }
}
