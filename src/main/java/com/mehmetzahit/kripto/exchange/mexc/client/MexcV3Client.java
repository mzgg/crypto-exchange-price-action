package com.mehmetzahit.kripto.exchange.mexc.client;


import com.mehmetzahit.kripto.exchange.mexc.resource.MexcOrderBookResponse;
import com.mehmetzahit.kripto.exchange.mexc.resource.MexcTickerResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "mexc", url = "${mexc.spot.url}")
public interface MexcV3Client {

	@RequestMapping(method = RequestMethod.GET, value = "ticker/24hr")
	MexcTickerResponse getPairData(@RequestParam(value = "symbol") String symbol);

	@RequestMapping(method = RequestMethod.GET, value = "depth")
	MexcOrderBookResponse getOrderBook(@RequestParam(value = "symbol") String symbol, @RequestParam(value = "limit") String limit);

}
