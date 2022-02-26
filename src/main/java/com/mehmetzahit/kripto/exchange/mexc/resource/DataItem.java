package com.mehmetzahit.kripto.exchange.mexc.resource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class DataItem{
	private String volume;
	private String symbol;
	private String high;
	private String last;
	private String low;
	private String ask;
	private Long time;
	private String bid;
	private String open;
	private String changeRate;
}
