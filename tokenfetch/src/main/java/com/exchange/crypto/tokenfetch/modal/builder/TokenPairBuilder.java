package com.exchange.crypto.tokenfetch.modal.builder;

import com.exchange.crypto.tokenfetch.modal.Token;
import com.exchange.crypto.tokenfetch.modal.TokenPair;

public class TokenPairBuilder {

    private TokenPair pair;

    public TokenPairBuilder(){
        pair= new TokenPair();
    }

    public TokenPairBuilder withId(String id){
        pair.setId(id);
        return this;
    }

    public TokenPairBuilder withReserve0(String reserve0){
        pair.setReserve0(reserve0);
        return this;
    }

    public TokenPairBuilder withReserve1(String reserve1){
        pair.setReserve1(reserve1);
        return this;
    }

    public TokenPairBuilder withReserveUSD(String reserveUSD){
        pair.setReserveUSD(reserveUSD);
        return this;
    }

    public TokenPairBuilder withTrackedReserveUSD(String trackedReserveUSD){
        pair.setTrackedReserveUSD(trackedReserveUSD);
        return this;
    }

    public TokenPairBuilder withToken0Price(String token0Price){
        pair.setToken0Price(token0Price);
        return this;
    }

    public TokenPairBuilder withToken1Price(String token1Price){
        pair.setToken1Price(token1Price);
        return this;
    }

    public TokenPairBuilder withVolumeUSD(String volumeUSD){
        pair.setVolumeUSD(volumeUSD);
        return this;
    }

    public TokenPairBuilder withTxCount(String txCount){
        pair.setTxCount(txCount);
        return this;
    }

    public TokenPairBuilder withToken0(Token token){
        pair.setToken0(token);
        return this;
    }

    public TokenPairBuilder withToken1(Token token){
        pair.setToken1(token);
        return this;
    }

    public TokenPair build(){
        return pair;
    }
}
