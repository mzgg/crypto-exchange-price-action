package com.mehmetzahit.kripto.exchange.binance.resource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class BinanceTickerResponse implements Serializable {
	private String symbol;
	private String priceChange;
	private String priceChangePercent;
	private String weightedAvgPrice;
	private String prevClosePrice;
	private String lastPrice;
	private String lastQty;
	private String bidPrice;
	private String bidQty;
	private String askPrice;
	private String askQty;
	private String openPrice;
	private String highPrice;
	private String lowPrice;
	private String volume;
	private String quoteVolume;
	private long openTime;
	private long closeTime;
	private int firstId;
	private int lastId;
	private int count;
}