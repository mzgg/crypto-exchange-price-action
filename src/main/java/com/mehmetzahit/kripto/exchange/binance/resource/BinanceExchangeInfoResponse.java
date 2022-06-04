package com.mehmetzahit.kripto.exchange.binance.resource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class BinanceExchangeInfoResponse implements Serializable {
	private String timezone;
	private long serverTime;
	private List<RateLimitsResponse> rateLimits;
	private List<SymbolsResponse> symbols;
}