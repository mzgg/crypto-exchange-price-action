package com.mehmetzahit.kripto.exchange.mexc.v2.service;

import com.mehmetzahit.kripto.exchange.mexc.v2.client.MexcV2Client;
import com.mehmetzahit.kripto.exchange.mexc.v2.resource.MexcResponse;
import com.mehmetzahit.kripto.exchange.mexc.v2.resource.depth.MexcOrderBookResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class MexcV2ClientService {

	private final MexcV2Client mexcClient;

	public MexcResponse getPriceValue(String symbol) {
		return mexcClient.getPairData(symbol);
	}

	public MexcOrderBookResponse getOrderBook(String symbol, String depth) {
		return mexcClient.getOrderBook(symbol, depth);
	}
}
