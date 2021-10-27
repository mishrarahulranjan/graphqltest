package com.exchange.crypto.tokenfetch.modal;

import lombok.*;

@Data
@NoArgsConstructor
@ToString
public class Token {
    String id;
    String symbol;
    String name;
    String derivedETH;
}
