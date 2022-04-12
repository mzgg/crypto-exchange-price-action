package com.mehmetzahit.kripto.exchange.mexc.v2.resource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class DeleteOrderResponse implements Serializable {
	private int code;
	private Map<String, String> data;

}