package com.example.nicoloereni.bitcoinexchange;

import java.util.ArrayList;
import java.util.Iterator;

import javax.inject.Inject;

public class ValueExchangeFactory {

    private final HttpRequest httpRequest;

    @Inject
    public ValueExchangeFactory(HttpRequest httpRequest){
        this.httpRequest = httpRequest;
    }

    public ArrayList<ValueExchangeModel> all() {
        ArrayList<ValueExchangeModel> result = new ArrayList<>();

        Iterator<String> keys = httpRequest.getAllJsonObjectValue().keys();
        while(keys.hasNext()){
            result.add(new ValueExchangeModel(httpRequest.getJsonObjectValue(keys.next())));
        }
        return result;
    }
}
