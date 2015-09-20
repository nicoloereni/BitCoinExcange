package com.example.nicoloereni.bitcoinexchange;

import java.util.ArrayList;
import java.util.Iterator;

public class ValueExchangeFactory {
    public ArrayList<ValueExchangeModel> all(HttpBitCoinChangeRequest httpBitCoinChangeRequest) {
        ArrayList<ValueExchangeModel> result = new ArrayList<>();

        Iterator<String> keys = httpBitCoinChangeRequest.getAllJsonObjectValue().keys();
        while(keys.hasNext()){
            result.add(new ValueExchangeModel(httpBitCoinChangeRequest.getJsonObjectValue(keys.next())));
        }
        return result;
    }
}
