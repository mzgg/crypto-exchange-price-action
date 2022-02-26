package com.mehmetzahit.kripto.exchange.mexc.client;


import com.mehmetzahit.kripto.exchange.mexc.resource.MexcResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "mexc", url = "${mexc.spot.url}")
public interface MexcClient {

	@RequestMapping(method = RequestMethod.GET, value = "market/ticker")
	MexcResponse getPairData(@RequestParam(value = "symbol") String symbol);

}
