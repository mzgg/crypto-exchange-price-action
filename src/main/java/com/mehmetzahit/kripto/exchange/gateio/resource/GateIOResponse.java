package com.mehmetzahit.kripto.exchange.gateio.resource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GateIOResponse{
	private String side;
	private String amount;
	private String currencyPair;
	private String create_time;
	private String create_time_ms;
	private LocalDateTime dateTime;
	private String price;
	private String id;
}
