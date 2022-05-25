package com.mehmetzahit.kripto.controller;

import com.mehmetzahit.kripto.exchange.huobi.resource.HuobiOrderBookResponse;
import com.mehmetzahit.kripto.exchange.huobi.resource.HuobiTickerResponse;
import com.mehmetzahit.kripto.exchange.huobi.service.HuobiClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/exchange/huobi")
public class HuobiController {

	private final HuobiClientService huobiClientService;

	@GetMapping("/market/detail/merged")
	public HuobiTickerResponse getTicker(@RequestParam(name = "symbol") String symbol) {
		return huobiClientService.getTicker(symbol);
	}

	@GetMapping("/market/depth")
	public HuobiOrderBookResponse getOrderBookByDepthAndType(@RequestParam(name = "symbol") String symbol,
															 @RequestParam(name = "depth") String depth,
															 @RequestParam(name = "type") String type) {
		return huobiClientService.getOrderBookByDepthAndType(symbol, depth, type);
	}

}
