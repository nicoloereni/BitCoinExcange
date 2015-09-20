package com.example.nicoloereni.bitcoinexchange.component;

import com.example.nicoloereni.bitcoinexchange.ValueExchangeFactory;
import com.example.nicoloereni.bitcoinexchange.module.ValueExchangeFactoryModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ValueExchangeFactoryModule.class})
public interface ValueExchangeFactoryComponent {

    ValueExchangeFactory provideValueExchangeFactory();
}
