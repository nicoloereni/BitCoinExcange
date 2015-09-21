package com.example.nicoloereni.bitcoinexchange.test;

import android.test.AndroidTestCase;

import com.example.nicoloereni.bitcoinexchange.HttpRequest;
import com.example.nicoloereni.bitcoinexchange.ValueExchangeFactory;
import com.example.nicoloereni.bitcoinexchange.ValueExchangeModel;

import java.util.ArrayList;

public class ValueExchangeFactoryTest extends AndroidTestCase {

    private HttpRequest httpRequest;
    private final String fakeResponse = "{\n" +
            "  \"USD\" : {\"15m\" : 226.94, \"last\" : 226.94, \"buy\" : 226.31, \"sell\" : 226.89,  \"symbol\" : \"$\"},\n" +
            "  \"ISK\" : {\"15m\" : 28881.29, \"last\" : 28881.29, \"buy\" : 28801.12, \"sell\" : 28874.93,  \"symbol\" : \"kr\"},\n" +
            "  \"HKD\" : {\"15m\" : 1758.82, \"last\" : 1758.82, \"buy\" : 1753.94, \"sell\" : 1758.43,  \"symbol\" : \"$\"},\n" +
            "  \"TWD\" : {\"15m\" : 7381.96, \"last\" : 7381.96, \"buy\" : 7361.47, \"sell\" : 7380.33,  \"symbol\" : \"NT$\"},\n" +
            "  \"CHF\" : {\"15m\" : 220.22, \"last\" : 220.22, \"buy\" : 219.61, \"sell\" : 220.17,  \"symbol\" : \"CHF\"},\n" +
            "  \"EUR\" : {\"15m\" : 200.5, \"last\" : 200.5, \"buy\" : 199.95, \"sell\" : 200.46,  \"symbol\" : \"€\"},\n" +
            "  \"DKK\" : {\"15m\" : 1495.28, \"last\" : 1495.28, \"buy\" : 1491.13, \"sell\" : 1494.96,  \"symbol\" : \"kr\"},\n" +
            "  \"CLP\" : {\"15m\" : 156330.57, \"last\" : 156330.57, \"buy\" : 155896.59, \"sell\" : 156296.13,  \"symbol\" : \"$\"},\n" +
            "  \"CAD\" : {\"15m\" : 300.84, \"last\" : 300.84, \"buy\" : 300.01, \"sell\" : 300.78,  \"symbol\" : \"$\"},\n" +
            "  \"CNY\" : {\"15m\" : 1445.78, \"last\" : 1445.78, \"buy\" : 1441.76, \"sell\" : 1445.46,  \"symbol\" : \"¥\"},\n" +
            "  \"THB\" : {\"15m\" : 8178.06, \"last\" : 8178.06, \"buy\" : 8155.35, \"sell\" : 8176.25,  \"symbol\" : \"฿\"},\n" +
            "  \"AUD\" : {\"15m\" : 318.55, \"last\" : 318.55, \"buy\" : 317.66, \"sell\" : 318.48,  \"symbol\" : \"$\"},\n" +
            "  \"SGD\" : {\"15m\" : 319.61, \"last\" : 319.61, \"buy\" : 318.72, \"sell\" : 319.54,  \"symbol\" : \"$\"},\n" +
            "  \"KRW\" : {\"15m\" : 268404.59, \"last\" : 268404.59, \"buy\" : 267659.48, \"sell\" : 268345.45,  \"symbol\" : \"₩\"},\n" +
            "  \"JPY\" : {\"15m\" : 27320.58, \"last\" : 27320.58, \"buy\" : 27244.74, \"sell\" : 27314.56,  \"symbol\" : \"¥\"},\n" +
            "  \"PLN\" : {\"15m\" : 843.51, \"last\" : 843.51, \"buy\" : 841.17, \"sell\" : 843.33,  \"symbol\" : \"zł\"},\n" +
            "  \"GBP\" : {\"15m\" : 147.26, \"last\" : 147.26, \"buy\" : 146.85, \"sell\" : 147.23,  \"symbol\" : \"£\"},\n" +
            "  \"SEK\" : {\"15m\" : 1871.63, \"last\" : 1871.63, \"buy\" : 1866.44, \"sell\" : 1871.22,  \"symbol\" : \"kr\"},\n" +
            "  \"NZD\" : {\"15m\" : 358.7, \"last\" : 358.7, \"buy\" : 357.7, \"sell\" : 358.62,  \"symbol\" : \"$\"},\n" +
            "  \"BRL\" : {\"15m\" : 879.17, \"last\" : 879.17, \"buy\" : 876.73, \"sell\" : 878.97,  \"symbol\" : \"R$\"},\n" +
            "  \"RUB\" : {\"15m\" : 15360.95, \"last\" : 15360.95, \"buy\" : 15318.31, \"sell\" : 15357.57,  \"symbol\" : \"RUB\"}\n" +
            "  \n" +
            "}";

    public void testCreateValueList() {

        //when(httpRequest.getAllStringValueData()).thenReturn(fakeResponse);

        ValueExchangeFactory valueExchangeFactory = new ValueExchangeFactory(httpRequest);
        ArrayList<ValueExchangeModel> all = valueExchangeFactory.all();
        assertNotNull(all);
        assertFalse(all.isEmpty());
        assertNotNull(all.get(0));
    }

}
