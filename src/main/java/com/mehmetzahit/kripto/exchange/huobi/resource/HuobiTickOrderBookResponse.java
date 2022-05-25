package com.mehmetzahit.kripto.exchange.huobi.resource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class HuobiTickOrderBookResponse implements Serializable {

	private List<List<String>> bids;
	private List<List<String>> asks;
	private long version;
	private long ts;
}