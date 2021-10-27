package com.exchange.crypto.tokenfetch.config;

import com.exchange.crypto.tokenfetch.modal.TokenPair;
import com.exchange.crypto.tokenfetch.repository.TokenPairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Service;

@Service
public class TokenPairResolver implements GraphQLQueryResolver{

    private TokenPairRepository tokenPairRepository;

    @Autowired
    public TokenPairResolver(TokenPairRepository tokenPairRepository) {
        this.tokenPairRepository = tokenPairRepository;
    }

    public TokenPair pair(TokenPair pair) {
        return tokenPairRepository.getPair(pair.getId()).orElseThrow(RuntimeException::new);
    }
}