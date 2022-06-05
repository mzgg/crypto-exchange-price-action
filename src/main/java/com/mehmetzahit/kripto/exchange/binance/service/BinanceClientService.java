package com.mehmetzahit.kripto.exchange.binance.service;

import com.mehmetzahit.kripto.exchange.binance.client.BinanceClient;
import com.mehmetzahit.kripto.exchange.binance.resource.BinanceExchangeInfoResponse;
import com.mehmetzahit.kripto.exchange.binance.resource.BinanceOrderBookResponse;
import com.mehmetzahit.kripto.exchange.binance.resource.BinanceResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Slf4j
@Component
@RequiredArgsConstructor
public class BinanceClientService {

	private final BinanceClient binanceClient;

	public BinanceResponse getPriceValue(String symbol) {
		return binanceClient.getPairData(symbol);
	}

	public Object getTickerBySymbol(String symbol) {
		if (Objects.isNull(symbol)) {
			return binanceClient.getAllTicker();
		}
		return binanceClient.getTickerBySymbol(symbol);
	}


	public BinanceExchangeInfoResponse exchangeInfo() {
		return binanceClient.exchangeInfo();
	}

	public BinanceOrderBookResponse getOrderBook(String symbol, String limit) {
		return binanceClient.getOrderBook(symbol, limit);
	}
}
