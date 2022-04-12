package com.mehmetzahit.kripto.exchange.mexc.v2.resource.getorder;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class DataResponse implements Serializable {
	private String id;
	private String symbol;
	private String price;
	private String quantity;
	private String state;
	private String type;

	@JsonProperty("deal_quantity")
	private String dealQuantity;

	@JsonProperty("deal_amount")
	private String dealAmount;

	@JsonProperty("create_time")
	private long createTime;
}