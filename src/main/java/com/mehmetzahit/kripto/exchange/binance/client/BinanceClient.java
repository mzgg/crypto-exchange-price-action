package com.mehmetzahit.kripto.exchange.binance.client;


import com.mehmetzahit.kripto.exchange.binance.resource.BinanceResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "binance", url = "${binance.spot.url}")
public interface BinanceClient {

	@RequestMapping(method = RequestMethod.GET, value = "ticker/bookTicker")
	BinanceResponse getPairData(@RequestParam(value = "symbol") String symbol);

}
