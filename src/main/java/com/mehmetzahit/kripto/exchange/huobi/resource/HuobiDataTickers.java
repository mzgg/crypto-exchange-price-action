package com.mehmetzahit.kripto.exchange.huobi.resource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class HuobiDataTickers implements Serializable {
	private String symbol;
	private String open;
	private String high;
	private String low;
	private String close;
	private String amount;
	private String vol;
	private int count;
	private String bid;
	private String bidSize;
	private String ask;
	private String askSize;
}