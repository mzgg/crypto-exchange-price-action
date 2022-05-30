package com.mehmetzahit.kripto.exchange.huobi.resource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class HuobiGetAllSymbolResponse implements Serializable {
	private String status;
	private List<HuobiGetAllSymbolsDetail> data;
	private String ts;
	private int full;
}