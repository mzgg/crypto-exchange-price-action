package com.mehmetzahit.kripto.exchange.binance.service;

import com.mehmetzahit.kripto.exchange.binance.client.BinanceClient;
import com.mehmetzahit.kripto.exchange.binance.resource.BinanceExchangeInfoResponse;
import com.mehmetzahit.kripto.exchange.binance.resource.BinanceResponse;
import com.mehmetzahit.kripto.exchange.binance.resource.BinanceTickerResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class BinanceClientService   {

	private final BinanceClient binanceClient;

	public BinanceResponse getPriceValue(String symbol) {
		return binanceClient.getPairData(symbol);
	}

	public List<BinanceTickerResponse> getTicker(String symbol) {
		return binanceClient.getTicker(symbol);
	}

	public BinanceExchangeInfoResponse exchangeInfo() {
		return binanceClient.exchangeInfo();
	}
}
