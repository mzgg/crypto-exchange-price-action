package com.mehmetzahit.kripto.controller;

import com.mehmetzahit.kripto.exchange.mexc.v2.resource.CreateOrderResource;
import com.mehmetzahit.kripto.exchange.mexc.v2.resource.DeleteOrderResponse;
import com.mehmetzahit.kripto.exchange.mexc.v2.resource.MexcCreateOrderResponse;
import com.mehmetzahit.kripto.exchange.mexc.v2.resource.depth.MexcOrderBookResponse;
import com.mehmetzahit.kripto.exchange.mexc.v2.resource.getorder.GetMexcOrderResponse;
import com.mehmetzahit.kripto.exchange.mexc.v2.resource.getpair.MexcResponse;
import com.mehmetzahit.kripto.exchange.mexc.v2.service.MexcV2ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/exchange/mexc/open/api/v2")
public class MexcMarketV2PriceController {
	private final MexcV2ClientService mexcClientService;


	@GetMapping("/market/ticker")
	public MexcResponse getTicker(@RequestParam(name = "symbol") String symbol) {
		return mexcClientService.getPriceValue(symbol);
	}

	@GetMapping("/market/depth")
	public MexcOrderBookResponse getOrderBook(@RequestParam(name = "symbol") String symbol, @RequestParam(name = "depth") String depth) {
		return mexcClientService.getOrderBook(symbol, depth);
	}

	@GetMapping(value = "/order/query")
	public GetMexcOrderResponse getOrders(@RequestHeader HttpHeaders headers, @RequestParam(value = "order_ids") String order_ids) {
		return mexcClientService.getOrders(headers, order_ids);
	}

	@PostMapping(value = "/order/place")
	MexcCreateOrderResponse createOrder(@RequestHeader HttpHeaders headers, @RequestBody CreateOrderResource createOrderResource) {
		return mexcClientService.createOrder(headers, createOrderResource);
	}

	@DeleteMapping(value = "/order/cancel")
	DeleteOrderResponse cancelOrder(@RequestHeader HttpHeaders headers, @RequestParam(value = "order_ids") String orderIds) {
		return mexcClientService.cancelOrder(headers, orderIds);
	}


}
