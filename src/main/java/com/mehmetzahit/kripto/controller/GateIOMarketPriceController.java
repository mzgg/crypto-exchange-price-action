package com.mehmetzahit.kripto.controller;

import com.mehmetzahit.kripto.config.cache.GuavaCacheManagerConfig;
import com.mehmetzahit.kripto.exchange.gateio.resource.AllCurrencyResponse;
import com.mehmetzahit.kripto.exchange.gateio.resource.GateIOResponse;
import com.mehmetzahit.kripto.exchange.gateio.resource.GetTickerResponse;
import com.mehmetzahit.kripto.exchange.gateio.resource.OrderBookResponse;
import com.mehmetzahit.kripto.exchange.gateio.service.GateIOClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/exchange/gateio")
public class GateIOMarketPriceController {
	private final GateIOClientService gateIOClientService;

	@GetMapping("/spot/trades")
	public List<GateIOResponse> getValueFromGetIORedirect(@RequestParam(name = "currency_pair") String symbol) {
		return gateIOClientService.getPairData(symbol);
	}

	@GetMapping("/spot/tickers")
	public List<GetTickerResponse> getTicker(@RequestParam(name = "currency_pair",required = false) String symbol) {
		return gateIOClientService.getTickers(symbol);
	}

	//@Cacheable(value = "allcurrenies", key = "'value'", unless = "#result.empty", cacheManager = GuavaCacheManagerConfig.ONE_MINUTE)
	@GetMapping("/spot/currency_pairs")
	public List<AllCurrencyResponse> getAllCurrency() {
		try {
			return gateIOClientService.getAllCurrency();
		} catch (Exception e) {
			return Collections.emptyList();
		}
	}

	@GetMapping("/spot/order_book")
	public OrderBookResponse gerOrderBook(@RequestParam(name = "currency_pair") String symbol, @RequestParam(name = "limit") String limit) {
		return gateIOClientService.gerOrderBook(symbol, limit);
	}

	@GetMapping("/spot/candlesticks")
	List<List<String>> getCandlesticks(@RequestParam(value = "currency_pair") String symbol,
									   @RequestParam(value = "interval") String interval,
									   @RequestParam(value = "limit") String limit) {
		return gateIOClientService.getCandlesticks(symbol, interval, limit);

	}


}
