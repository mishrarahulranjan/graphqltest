package com.exchange.crypto.tokenfetch.repository;

import java.util.Arrays;
import java.util.List;

import com.exchange.crypto.tokenfetch.modal.Token;
import com.exchange.crypto.tokenfetch.modal.TokenPair;
import com.exchange.crypto.tokenfetch.modal.builder.TokenBuilder;
import com.exchange.crypto.tokenfetch.modal.builder.TokenPairBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TokenPairInitializer implements ApplicationRunner {

	@Autowired
	private TokenPairRepository tokenPairRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Token token0 = new TokenBuilder()
				.withID("0x98765afh4646").
				withName("token0")
				.withSymbol("Token0-sumbol")
				.withDerivedETH("0.00038009")
				.build();

		Token token01 = new TokenBuilder()
				.withID("0xuukjhafh4646").
				withName("token01")
				.withSymbol("Token01-sumbol")
				.withDerivedETH("0.0003335")
				.build();

		Token token1 = new TokenBuilder()
				.withID("09ggavdajhafh4646").
				withName("token1")
				.withSymbol("Token1-sumbol")
				.withDerivedETH("0.0011098")
				.build();
		Token token12 = new TokenBuilder()
				.withID("0fghfgjhafh4646").
				withName("token12")
				.withSymbol("Token12-sumbol")
				.withDerivedETH("0.00000998")
				.build();

		TokenPair pair1= new TokenPairBuilder()
				.withId("0x1234OOOFF")
				.withToken0(token0)
				.withToken1(token1)
				.withToken0Price(".00089")
				.withToken0Price("0.8889")
				.withReserve0("1789000000")
				.withReserve1("2752857857")
				.withTrackedReserveUSD("18823758275")
				.withTxCount("2234")
				.withReserveUSD("9087")
				.build();
		TokenPair pair2= new TokenPairBuilder()
				.withId("0x1244OOOFF")
				.withToken0(token01)
				.withToken1(token12)
				.withToken0Price(".00000081")
				.withToken0Price("0.00018883")
				.withReserve0("991789000000")
				.withReserve1("992752857853")
				.withTrackedReserveUSD("9999958270")
				.withTxCount("567")
				.withReserveUSD("1119083")
				.build();

		List<TokenPair> repositoryList = Arrays.asList(pair1,pair2);
		tokenPairRepository.setRepositoryList(repositoryList);
	}

}