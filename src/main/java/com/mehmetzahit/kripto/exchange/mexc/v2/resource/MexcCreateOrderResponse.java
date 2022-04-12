package com.mehmetzahit.kripto.exchange.mexc.v2.resource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class MexcCreateOrderResponse implements Serializable {
	private int code;
	private String data;
}