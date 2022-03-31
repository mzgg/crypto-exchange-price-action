package com.mehmetzahit.kripto.exchange.mexc.service;

import com.mehmetzahit.kripto.exchange.mexc.client.MexcClient;
import com.mehmetzahit.kripto.exchange.mexc.resource.MexcOrderBookResponse;
import com.mehmetzahit.kripto.exchange.mexc.resource.MexcTickerResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class MexcClientService {

	private final MexcClient mexcClient;

	public MexcTickerResponse getPriceValue(String symbol) {
		return mexcClient.getPairData(symbol);
	}

	public MexcOrderBookResponse getOrderBook(String symbol, String limit) {
		return mexcClient.getOrderBook(symbol, limit);
	}
}
