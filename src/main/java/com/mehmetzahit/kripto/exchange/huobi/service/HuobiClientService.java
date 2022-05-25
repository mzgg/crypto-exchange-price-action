package com.mehmetzahit.kripto.exchange.huobi.service;

import com.mehmetzahit.kripto.exchange.huobi.client.HuobiClient;
import com.mehmetzahit.kripto.exchange.huobi.resource.HuobiOrderBookResponse;
import com.mehmetzahit.kripto.exchange.huobi.resource.HuobiTickerResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class HuobiClientService {

	private final HuobiClient huobiClient;


	public HuobiTickerResponse getTicker(String symbol) {
		return huobiClient.getPairData(symbol);
	}

	public HuobiOrderBookResponse getOrderBookByDepthAndType(String symbol, String depth, String type) {
		return huobiClient.getOrderBook(symbol, depth, type);
	}
}
