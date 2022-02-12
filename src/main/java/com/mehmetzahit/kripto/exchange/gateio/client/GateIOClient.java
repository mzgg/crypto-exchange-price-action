package com.mehmetzahit.kripto.exchange.gateio.client;


import com.mehmetzahit.kripto.exchange.gateio.config.GateIOClientConfig;
import com.mehmetzahit.kripto.exchange.gateio.resource.AllCurrencyResponse;
import com.mehmetzahit.kripto.exchange.gateio.resource.GateIOResponse;
import com.mehmetzahit.kripto.exchange.gateio.resource.GetTickerResponse;
import com.mehmetzahit.kripto.exchange.gateio.resource.OrderBookResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@FeignClient(value = "gateio", url = "${exchange.gateio.spot.url}")
public interface GateIOClient {

	@RequestMapping(method = RequestMethod.GET, value = "spot/trades?limit=1")
	List<GateIOResponse> getPairData(@RequestParam(value = "currency_pair") String symbol);

	@RequestMapping(method = RequestMethod.GET, value = "spot/order_book")
	OrderBookResponse getOrderBook(@RequestParam(value = "currency_pair") String symbol, @RequestParam(value = "limit") String limit);


	@RequestMapping(method = RequestMethod.GET, value = "spot/trades")
	List<GateIOResponse> marketTrade(@RequestParam(value = "currency_pair") String symbol,
									 @RequestParam(value = "from") String from,
									 @RequestParam(value = "to") String to,
									 @RequestParam(value = "limit") String limit);

	@RequestMapping(method = RequestMethod.GET, value = "spot/tickers")
	List<GetTickerResponse> getTickers(@RequestParam(value = "currency_pair") String symbol);


	@RequestMapping(method = RequestMethod.GET, value = "spot/currency_pairs")
	List<AllCurrencyResponse> getAllCurrency();

}


