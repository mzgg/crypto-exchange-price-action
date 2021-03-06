package com.mehmetzahit.kripto.controller;


import com.mehmetzahit.kripto.exchange.mexc.v3.resource.MexcOrderBookResponse;
import com.mehmetzahit.kripto.exchange.mexc.v3.resource.MexcTickerResponse;
import com.mehmetzahit.kripto.exchange.mexc.v3.service.MexcV3ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/exchange/mexc/api/v3")
public class MexcMarketPriceController {
	private final MexcV3ClientService mexcClientService;


	@GetMapping("/ticker/24hr")
	public MexcTickerResponse getTicker(@RequestParam(name = "symbol") String symbol) {
		return mexcClientService.getPriceValue(symbol);
	}

	@GetMapping("/depth")
	public MexcOrderBookResponse getOrderBook(@RequestParam(name = "symbol") String symbol, @RequestParam(name = "limit") String limit) {
		return mexcClientService.getOrderBook(symbol, limit);
	}

}
