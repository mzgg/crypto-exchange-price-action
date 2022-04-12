package com.mehmetzahit.kripto.exchange.mexc.v2.client;


import com.mehmetzahit.kripto.exchange.mexc.v2.resource.CreateOrderResource;
import com.mehmetzahit.kripto.exchange.mexc.v2.resource.DeleteOrderResponse;
import com.mehmetzahit.kripto.exchange.mexc.v2.resource.MexcCreateOrderResponse;
import com.mehmetzahit.kripto.exchange.mexc.v2.resource.depth.MexcOrderBookResponse;
import com.mehmetzahit.kripto.exchange.mexc.v2.resource.getorder.GetMexcOrderResponse;
import com.mehmetzahit.kripto.exchange.mexc.v2.resource.getpair.MexcResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(value = "mexc-v2", url = "${mexc-v2.spot.url}")
public interface MexcV2Client {

	@RequestMapping(method = RequestMethod.GET, value = "market/ticker")
	MexcResponse getPairData(@RequestParam(value = "symbol") String symbol);

	@RequestMapping(method = RequestMethod.GET, value = "market/depth")
	MexcOrderBookResponse getOrderBook(@RequestParam(value = "symbol") String symbol, @RequestParam(value = "depth") String depth);

	@RequestMapping(method = RequestMethod.GET, value = "/order/query")
	GetMexcOrderResponse getOrders(@RequestHeader Map<String, String> headers, @RequestParam(value = "order_ids") String order_ids);

	@RequestMapping(method = RequestMethod.POST, value = "/order/place")
	MexcCreateOrderResponse createOrder(@RequestHeader Map<String, String> headers, CreateOrderResource createOrderResource);

	@RequestMapping(method = RequestMethod.DELETE, value = "/order/cancel")
	DeleteOrderResponse cancelOrder(@RequestHeader Map<String, String> headers, @RequestParam(value = "order_ids") String order_ids);


}
