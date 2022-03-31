package com.mehmetzahit.kripto.exchange.mexc.resource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class MexcTickerResponse{
	private String priceChange;
	private String symbol;
	private String askPrice;
	private String bidQty;
	private Object count;
	private String openPrice;
	private Object quoteVolume;
	private String bidPrice;
	private String volume;
	private String lastQty;
	private String askQty;
	private String lowPrice;
	private String highPrice;
	private Long closeTime;
	private String prevClosePrice;
	private Long openTime;
	private String priceChangePercent;
	private String lastPrice;
}
