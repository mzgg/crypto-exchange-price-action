package com.mehmetzahit.kripto.exchange.binance.resource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class RateLimitsResponse implements Serializable {
	private String rateLimitType;
	private String interval;
	private int intervalNum;
	private int limit;


}