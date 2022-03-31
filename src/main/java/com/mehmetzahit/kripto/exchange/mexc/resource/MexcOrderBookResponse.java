package com.mehmetzahit.kripto.exchange.mexc.resource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class MexcOrderBookResponse{
	private Long lastUpdateId;
	private List<List<String>> asks;
	private List<List<String>> bids;
}