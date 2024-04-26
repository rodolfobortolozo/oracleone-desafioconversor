package com.oracle.services;

import com.oracle.models.Exchange;


public class ImpGetExchange extends GetExchange<Exchange> {
    public ImpGetExchange(String url) {
        super(url);
    }

    @Override
    public Class<Exchange> getEntidade() {
        return Exchange.class;
    }


}
