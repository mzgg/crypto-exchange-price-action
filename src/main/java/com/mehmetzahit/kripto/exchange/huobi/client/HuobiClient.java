package com.mehmetzahit.kripto.exchange.huobi.client;


import com.mehmetzahit.kripto.exchange.huobi.resource.HuobiTickerResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "huobi", url = "${huobi.spot.url}")
public interface HuobiClient {

	@RequestMapping(method = RequestMethod.GET, value = "market/detail/merged")
	HuobiTickerResponse getPairData(@RequestParam(value = "symbol") String symbol);


}
