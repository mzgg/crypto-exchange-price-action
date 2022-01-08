package com.mehmetzahit.kripto.exchange.gateio.resource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class OrderBookResponse{
	private Long current;
	private List<List<String>> asks;
	private List<List<String>> bids;
	private Long update;
}