package com.mehmetzahit.kripto.controller;

import com.mehmetzahit.kripto.exchange.binance.resource.BinanceResponse;
import com.mehmetzahit.kripto.exchange.binance.service.BinanceClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/exchange/binance")
public class BinanceMarketPriceController {

	private final BinanceClientService binanceClientService;

	@GetMapping("/ticker/bookTicker")
	public BinanceResponse getValueFromGetIORedirect(@RequestParam(name = "symbol") String symbol) {
		return binanceClientService.getPriceValue(symbol);
	}

}