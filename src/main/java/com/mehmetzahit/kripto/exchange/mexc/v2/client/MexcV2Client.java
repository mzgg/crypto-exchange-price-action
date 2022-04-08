package com.mehmetzahit.kripto.exchange.mexc.v2.client;


import com.mehmetzahit.kripto.exchange.mexc.v2.resource.MexcResponse;
import com.mehmetzahit.kripto.exchange.mexc.v2.resource.depth.MexcOrderBookResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "mexc-v2", url = "${mexc-v2.spot.url}")
public interface MexcV2Client {

	@RequestMapping(method = RequestMethod.GET, value = "market/ticker")
	MexcResponse getPairData(@RequestParam(value = "symbol") String symbol);

	@RequestMapping(method = RequestMethod.GET, value = "market/depth")
	MexcOrderBookResponse getOrderBook(@RequestParam(value = "symbol") String symbol, @RequestParam(value = "depth") String depth);

}
