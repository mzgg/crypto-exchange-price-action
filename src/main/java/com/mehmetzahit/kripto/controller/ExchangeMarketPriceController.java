package com.mehmetzahit.kripto.controller;

import com.mehmetzahit.kripto.config.cache.GuavaCacheManagerConfig;
import com.mehmetzahit.kripto.exchange.gateio.resource.AllCurrencyResponse;
import com.mehmetzahit.kripto.exchange.gateio.resource.GateIOResponse;
import com.mehmetzahit.kripto.exchange.gateio.resource.GetTickerResponse;
import com.mehmetzahit.kripto.exchange.gateio.resource.OrderBookResponse;
import com.mehmetzahit.kripto.exchange.gateio.service.GateIOClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
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

	@Cacheable(value = "allcurrenies", key = "'value'", unless = "#result.empty", cacheManager = GuavaCacheManagerConfig.ONE_MINUTE)
	@GetMapping("/gateio/spot/currency_pairs")
	public List<AllCurrencyResponse> getAllCurrency() {
		return gateIOClientService.getAllCurrency();
	}

	@GetMapping("/gateio/spot/order_book")
	public OrderBookResponse gerOrderBook(@RequestParam(name = "currency_pair") String symbol, @RequestParam(name = "limit") String limit) {
		return gateIOClientService.gerOrderBook(symbol, limit);
	}
}
