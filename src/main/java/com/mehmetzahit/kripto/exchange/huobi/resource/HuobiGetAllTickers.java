package com.mehmetzahit.kripto.exchange.huobi.resource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class HuobiGetAllTickers implements Serializable {
	private List<HuobiDataTickers> data;
	private String status;
	private long ts;
}