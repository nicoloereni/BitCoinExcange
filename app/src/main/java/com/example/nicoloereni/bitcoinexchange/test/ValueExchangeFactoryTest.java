package com.example.nicoloereni.bitcoinexchange.test;


import android.test.AndroidTestCase;

import com.example.nicoloereni.bitcoinexchange.HttpBitCoinChangeRequest;
import com.example.nicoloereni.bitcoinexchange.ValueExchangeFactory;
import com.example.nicoloereni.bitcoinexchange.ValueExchangeModel;

import java.util.ArrayList;

public class ValueExchangeFactoryTest extends AndroidTestCase
{

    public void testCreateValueList(){

        ValueExchangeFactory valueExchangeFactory = new ValueExchangeFactory();
        //TODO fare il mock
        HttpBitCoinChangeRequest httpBitCoinChangeRequest = new HttpBitCoinChangeRequest();
        ArrayList<ValueExchangeModel> all = valueExchangeFactory.all(httpBitCoinChangeRequest);
        assertNotNull(all);
        assertFalse(all.isEmpty());
        assertNotNull(all.get(0));
    }

}
