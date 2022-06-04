package com.mehmetzahit.kripto.exchange.binance.client;


import com.mehmetzahit.kripto.exchange.binance.resource.BinanceExchangeInfoResponse;
import com.mehmetzahit.kripto.exchange.binance.resource.BinanceResponse;
import com.mehmetzahit.kripto.exchange.binance.resource.BinanceTickerResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "binance", url = "${binance.spot.url}")
public interface BinanceClient {

	@RequestMapping(method = RequestMethod.GET, value = "ticker/bookTicker")
	BinanceResponse getPairData(@RequestParam(value = "symbol") String symbol);

	@RequestMapping(method = RequestMethod.GET, value = "ticker/24hr")
	List<BinanceTickerResponse> getTicker(@RequestParam(value = "symbol", required = false) String symbol);

	@RequestMapping(method = RequestMethod.GET, value = "exchangeInfo")
	BinanceExchangeInfoResponse exchangeInfo();

}
