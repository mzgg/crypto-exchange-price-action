package com.mehmetzahit.kripto.exchange.mexc.v2.resource.depth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class MexcOrderBookDataResponse implements Serializable {
	private String version;
	private List<OrderBookDetailResponse> asks;
	private List<OrderBookDetailResponse> bids;

}