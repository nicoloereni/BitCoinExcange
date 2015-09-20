package com.example.nicoloereni.bitcoinexchange.tests;


import android.test.AndroidTestCase;

import com.example.nicoloereni.bitcoinexchange.HttpRequest;
import com.example.nicoloereni.bitcoinexchange.ValueExchangeFactory;
import com.example.nicoloereni.bitcoinexchange.ValueExchangeModel;

import java.util.ArrayList;

public class ValueExchangeFactoryTest extends AndroidTestCase
{

    public void testCreateValueList(){

        ValueExchangeFactory valueExchangeFactory = new ValueExchangeFactory();
        //TODO fare il mock
        HttpRequest httpRequest = new HttpRequest();
        ArrayList<ValueExchangeModel> all = valueExchangeFactory.all(httpRequest);
        assertNotNull(all);
        assertFalse(all.isEmpty());
        assertNotNull(all.get(0));
    }

}
