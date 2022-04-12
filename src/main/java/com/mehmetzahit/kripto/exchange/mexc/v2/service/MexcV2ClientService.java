package com.mehmetzahit.kripto.exchange.mexc.v2.service;

import com.mehmetzahit.kripto.exchange.mexc.v2.client.MexcV2Client;
import com.mehmetzahit.kripto.exchange.mexc.v2.resource.CreateOrderResource;
import com.mehmetzahit.kripto.exchange.mexc.v2.resource.DeleteOrderResponse;
import com.mehmetzahit.kripto.exchange.mexc.v2.resource.MexcCreateOrderResponse;
import com.mehmetzahit.kripto.exchange.mexc.v2.resource.getorder.GetMexcOrderResponse;
import com.mehmetzahit.kripto.exchange.mexc.v2.resource.getpair.MexcResponse;
import com.mehmetzahit.kripto.exchange.mexc.v2.resource.depth.MexcOrderBookResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Component
@RequiredArgsConstructor
public class MexcV2ClientService {

	private final MexcV2Client mexcClient;

	public MexcResponse getPriceValue(String symbol) {
		return mexcClient.getPairData(symbol);
	}

	public MexcOrderBookResponse getOrderBook(String symbol, String depth) {
		return mexcClient.getOrderBook(symbol, depth);
	}

	public GetMexcOrderResponse getOrders(HttpHeaders headers, String order_ids) {
		return mexcClient.getOrders(headerWithAuth(headers), order_ids);
	}

	public MexcCreateOrderResponse createOrder(HttpHeaders headers, CreateOrderResource createOrderResource) {
		return mexcClient.createOrder(headerWithAuth(headers), createOrderResource);
	}

	public DeleteOrderResponse cancelOrder(HttpHeaders headers, String order_ids) {
		return mexcClient.cancelOrder(headerWithAuth(headers), order_ids);
	}

	private HashMap<String, String> headerWithAuth(HttpHeaders headers) {
		Map<String, String> headers1 = headers.toSingleValueMap();
		HashMap<String, String> map = new HashMap<>();
		map.put("Signature", headers1.get("signature"));
		map.put("Content-Type", headers1.get("content-type"));
		map.put("Request-Time", headers1.get("request-time"));
		map.put("ApiKey", headers1.get("apikey"));
		return map;
	}
}
