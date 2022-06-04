package com.mehmetzahit.kripto.controller;

import com.mehmetzahit.kripto.exchange.binance.resource.BinanceExchangeInfoResponse;
import com.mehmetzahit.kripto.exchange.binance.resource.BinanceResponse;
import com.mehmetzahit.kripto.exchange.binance.resource.BinanceTickerResponse;
import com.mehmetzahit.kripto.exchange.binance.service.BinanceClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/exchange/binance")
public class BinanceMarketPriceController {

	private final BinanceClientService binanceClientService;

	@GetMapping("/ticker/bookTicker")
	public BinanceResponse getValueFromGetIORedirect(@RequestParam(name = "symbol") String symbol) {
		return binanceClientService.getPriceValue(symbol);
	}

	@GetMapping("/ticker/24hr")
	public Object getTicker(@RequestParam(name = "symbol",required = false) String symbol) {
		return binanceClientService.getTickerBySymbol(symbol);
	}


	@GetMapping("/exchangeInfo")
	public BinanceExchangeInfoResponse exchangeInfo() {
		return binanceClientService.exchangeInfo();
	}

}
