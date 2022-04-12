package com.mehmetzahit.kripto.exchange.mexc.v3.service;



import com.mehmetzahit.kripto.exchange.mexc.v3.client.MexcV3Client;
import com.mehmetzahit.kripto.exchange.mexc.v3.resource.MexcOrderBookResponse;
import com.mehmetzahit.kripto.exchange.mexc.v3.resource.MexcTickerResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class MexcV3ClientService {

	private final MexcV3Client mexcClient;

	public MexcTickerResponse getPriceValue(String symbol) {
		return mexcClient.getPairData(symbol);
	}

	public MexcOrderBookResponse getOrderBook(String symbol, String limit) {
		return mexcClient.getOrderBook(symbol, limit);
	}
}
