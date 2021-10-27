package com.exchange.crypto.tokenfetch.modal.builder;

import com.exchange.crypto.tokenfetch.modal.Token;

public class TokenBuilder {

    private Token token;

    public TokenBuilder(){
        token= new Token();
    }

    public TokenBuilder withID(String id){
        token.setId(id);
        return this;
    }

    public TokenBuilder withSymbol(String symbol){
        token.setSymbol(symbol);
        return this;
    }

    public TokenBuilder withName(String name){
        token.setName(name);
        return this;
    }

    public TokenBuilder withDerivedETH(String derivedETH){
        token.setDerivedETH(derivedETH);
        return this;
    }

    public Token build(){
        return token;
    }
}
