package com.mehmetzahit.kripto.exchange.binance.resource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class BinanceResponse{
	private String symbol;
	private String askPrice;
	private String askQty;
	private String bidQty;
	private String bidPrice;
}
