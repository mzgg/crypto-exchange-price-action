package com.mehmetzahit.kripto.exchange.binance.service;

import com.mehmetzahit.kripto.exchange.binance.client.BinanceClient;
import com.mehmetzahit.kripto.exchange.binance.resource.BinanceResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class BinanceClientService   {

	private final BinanceClient binanceClient;

	public BinanceResponse getPriceValue(String symbol) {
		return binanceClient.getPairData(symbol);
	}
}
