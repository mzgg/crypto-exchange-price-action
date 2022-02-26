package com.mehmetzahit.kripto.exchange.mexc.service;

import com.mehmetzahit.kripto.exchange.mexc.client.MexcClient;
import com.mehmetzahit.kripto.exchange.mexc.resource.MexcResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class MexcClientService {

	private final MexcClient mexcClient;

	public MexcResponse getPriceValue(String symbol) {
		return mexcClient.getPairData(symbol);
	}
}
