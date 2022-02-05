package com.mehmetzahit.kripto.exchange.gateio.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AllCurrencyResponse {

	private String id;

	private String quote;

	private String fee;

	private Integer precision;

	private String base;

	@JsonProperty("trade_status")
	private String tradeStatus;

	@JsonProperty("sell_start")
	private Integer sellStart;

	@JsonProperty("min_quoteAmount")
	private String minQuoteAmount;

	@JsonProperty("amount_precision")
	private Integer amountPrecision;

	@JsonProperty("buy_start")
	private Integer buyStart;

}
