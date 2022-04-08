package com.mehmetzahit.kripto.exchange.mexc.v2.resource.depth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class OrderBookDetailResponse implements Serializable {
	private String price;
	private String quantity;
}