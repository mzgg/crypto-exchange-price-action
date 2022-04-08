package com.mehmetzahit.kripto.exchange.mexc.v2.resource.depth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class MexcOrderBookResponse implements Serializable {
	private int code;
	private MexcOrderBookDataResponse data;
}