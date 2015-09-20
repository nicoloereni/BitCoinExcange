package com.example.nicoloereni.bitcoinexchange.tests;


import android.test.AndroidTestCase;

import com.example.nicoloereni.bitcoinexchange.HttpRequest;
import com.example.nicoloereni.bitcoinexchange.ValueExchangeFactory;
import com.example.nicoloereni.bitcoinexchange.ValueExchangeModel;
import com.example.nicoloereni.bitcoinexchange.module.ValueExchangeFactoryModule;

import java.util.ArrayList;

public class ValueExchangeFactoryTest extends AndroidTestCase
{

    public void testCreateValueList(){

        //TODO fare il mock di HTTP REQUEST
        ValueExchangeFactory valueExchangeFactory = new ValueExchangeFactory(new HttpRequest(ValueExchangeFactoryModule.URL_BITCOIN_INFO));
        ArrayList<ValueExchangeModel> all = valueExchangeFactory.all();
        assertNotNull(all);
        assertFalse(all.isEmpty());
        assertNotNull(all.get(0));
    }

}
