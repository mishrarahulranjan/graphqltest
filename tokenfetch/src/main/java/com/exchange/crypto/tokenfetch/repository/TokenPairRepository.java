package com.exchange.crypto.tokenfetch.repository;

import com.exchange.crypto.tokenfetch.modal.TokenPair;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class TokenPairRepository {

    public  List<TokenPair> repositoryList;

    public  List<TokenPair> getRepositoryList() {
        return repositoryList;
    }

    public void setRepositoryList(List<TokenPair> repositoryList) {
        this.repositoryList = repositoryList;
    }

    public Optional<TokenPair> getPair(String id) {
        return repositoryList.stream().filter(author -> id.equals(author.getId())).findFirst();
    }
}
