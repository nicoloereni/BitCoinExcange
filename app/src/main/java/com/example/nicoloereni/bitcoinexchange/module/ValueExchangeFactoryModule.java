package com.example.nicoloereni.bitcoinexchange.module;

import com.example.nicoloereni.bitcoinexchange.HttpRequest;
import com.example.nicoloereni.bitcoinexchange.ValueExchangeFactory;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ValueExchangeFactoryModule {

    public static final String URL_BITCOIN_INFO = "https://blockchain.info/it/ticker";

    @Provides
    @Singleton
    ValueExchangeFactory ValueExchangeFactory(){
        return new ValueExchangeFactory(new HttpRequest(URL_BITCOIN_INFO));
    }

    @Provides
    @Singleton
    HttpRequest HttpRequest(){
        return new HttpRequest(URL_BITCOIN_INFO);
    }

}
