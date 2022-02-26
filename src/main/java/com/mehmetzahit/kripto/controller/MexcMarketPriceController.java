package com.mehmetzahit.kripto.controller;

import com.mehmetzahit.kripto.exchange.mexc.resource.MexcResponse;
import com.mehmetzahit.kripto.exchange.mexc.service.MexcClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/exchange/mexc")
public class MexcMarketPriceController {
	private final MexcClientService mexcClientService;


	@GetMapping("/open/api/v2/market/ticker")
	public MexcResponse getTicker(@RequestParam(name = "symbol") String symbol) {
		return mexcClientService.getPriceValue(symbol);
	}

}
