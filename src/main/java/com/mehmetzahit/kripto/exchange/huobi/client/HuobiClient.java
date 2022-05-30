package com.mehmetzahit.kripto.exchange.huobi.client;


import com.mehmetzahit.kripto.exchange.huobi.resource.HuobiGetAllSymbolResponse;
import com.mehmetzahit.kripto.exchange.huobi.resource.HuobiGetAllTickers;
import com.mehmetzahit.kripto.exchange.huobi.resource.HuobiOrderBookResponse;
import com.mehmetzahit.kripto.exchange.huobi.resource.HuobiTickerResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "huobi", url = "${huobi.spot.url}")
public interface HuobiClient {

	@RequestMapping(method = RequestMethod.GET, value = "market/detail/merged")
	HuobiTickerResponse getPairData(@RequestParam(value = "symbol") String symbol);

	@RequestMapping(method = RequestMethod.GET, value = "market/depth")
	HuobiOrderBookResponse getOrderBook(@RequestParam(value = "symbol") String symbol,
										@RequestParam(value = "depth") String depth,
										@RequestParam(value = "type") String type);

	@RequestMapping(method = RequestMethod.GET, value = "v2/settings/common/symbols")
	HuobiGetAllSymbolResponse getAllSymbols();

	@RequestMapping(method = RequestMethod.GET, value = "market/tickers")
	HuobiGetAllTickers getAllTicker();


}
