package com.mehmetzahit.kripto.controller;

import com.mehmetzahit.kripto.exchange.mexc.v2.resource.MexcResponse;
import com.mehmetzahit.kripto.exchange.mexc.v2.resource.depth.MexcOrderBookResponse;
import com.mehmetzahit.kripto.exchange.mexc.v2.service.MexcV2ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/exchange/mexc/open/api/v2")
public class MexcMarketV2PriceController {
	private final MexcV2ClientService mexcClientService;


	@GetMapping("/market/ticker")
	public MexcResponse getTicker(@RequestParam(name = "symbol") String symbol) {
		return mexcClientService.getPriceValue(symbol);
	}

	@GetMapping("/market/depth")
	public MexcOrderBookResponse getOrderBook(@RequestParam(name = "symbol") String symbol, @RequestParam(name = "depth") String depth) {
		return mexcClientService.getOrderBook(symbol, depth);
	}

}
