package com.mehmetzahit.kripto.exchange.mexc.v2.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CreateOrderResource implements Serializable {

	private String price;
	private String quantity;
	private String symbol;

	@JsonProperty("order_type")
	private String order_type;

	@JsonProperty("trade_type")
	private String trade_type;
}