package com.exchange.crypto.tokenfetch.modal;

import lombok.*;

@Data
@NoArgsConstructor
@ToString
public class TokenPair {
    String id;
    String reserve0;
    String reserve1;
    String reserveUSD;
    String trackedReserveUSD;
    String token0Price;
    String token1Price;
    String volumeUSD;
    String txCount;
    Token token0;
    Token token1;
    public TokenPair(String id){
        this.id= id;
    }
}
