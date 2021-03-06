package com.mehmetzahit.kripto.exchange.mexc.v2.resource.getpair;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class MexcResponse{
	private Integer code;
	private List<DataItem> data;
}