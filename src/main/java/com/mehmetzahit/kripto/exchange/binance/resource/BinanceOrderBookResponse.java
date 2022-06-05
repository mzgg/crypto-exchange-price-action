package com.mehmetzahit.kripto.exchange.binance.resource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class BinanceOrderBookResponse implements Serializable {
	private long lastUpdateId;
	private List<List<String>> bids;
	private List<List<String>> asks;
}