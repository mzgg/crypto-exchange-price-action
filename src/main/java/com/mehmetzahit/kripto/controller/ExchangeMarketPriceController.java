package com.mehmetzahit.kripto.controller;

import com.mehmetzahit.kripto.exchange.gateio.resource.GateIOResponse;
import com.mehmetzahit.kripto.exchange.gateio.resource.GetTickerResponse;
import com.mehmetzahit.kripto.exchange.gateio.service.GateIOClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/exchange")
public class ExchangeMarketPriceController {
	private final GateIOClientService gateIOClientService;

	@GetMapping("/gateio/spot/trades")
	public List<GateIOResponse> getValueFromGetIORedirect(@RequestParam(name = "currency_pair") String symbol) {
		return gateIOClientService.getPairData(symbol);
	}

	@GetMapping("/gateio/spot/tickers")
	public List<GetTickerResponse> getTicker(@RequestParam(name = "currency_pair") String symbol) {
		return gateIOClientService.getTickers(symbol);
	}
}
