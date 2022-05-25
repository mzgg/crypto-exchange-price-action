package com.mehmetzahit.kripto.exchange.huobi.resource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class HuobiOrderBookResponse implements Serializable {
	private String ch;
	private String status;
	private long ts;
	private HuobiTickOrderBookResponse tick;
}