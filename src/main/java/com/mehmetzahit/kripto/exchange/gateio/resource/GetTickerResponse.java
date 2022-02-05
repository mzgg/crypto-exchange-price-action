package com.mehmetzahit.kripto.exchange.gateio.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GetTickerResponse{

	@JsonProperty("currency_pair")
	private String currencyPair;

	@JsonProperty("last")
	private String last;

	@JsonProperty("change_percentage")
	private String changePercentage;

	@JsonProperty("quote_volume")
	private String quoteVolume;

	@JsonProperty("base_volume")
	private String baseVolume;

	@JsonProperty("high_24h")
	private String high24h;

	@JsonProperty("low_24h")
	private String low24h;

	@JsonProperty("lowest_ask")
	private String lowestAsk;

	@JsonProperty("highest_bid")
	private String highestBid;
}
