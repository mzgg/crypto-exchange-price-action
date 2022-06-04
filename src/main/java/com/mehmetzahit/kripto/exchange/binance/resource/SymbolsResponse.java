package com.mehmetzahit.kripto.exchange.binance.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class SymbolsResponse implements Serializable {
	private String symbol;
	private String status;
	private String baseAsset;
	private int baseAssetPrecision;
	private String quoteAsset;
	private int quotePrecision;
	private int quoteAssetPrecision;
	private int baseCommissionPrecision;
	private int quoteCommissionPrecision;
	private List<String> orderTypes;
	private boolean icebergAllowed;
	private boolean ocoAllowed;
	private boolean quoteOrderQtyMarketAllowed;
	private List<String> permissions;
	private boolean allowTrailingStop;

	@JsonProperty("isSpotTradingAllowed")
	private boolean isSpotTradingAllowed;

	@JsonProperty("isMarginTradingAllowed")
	private boolean isMarginTradingAllowed;




}