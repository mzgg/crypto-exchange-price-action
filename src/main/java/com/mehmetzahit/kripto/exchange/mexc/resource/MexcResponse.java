package com.mehmetzahit.kripto.exchange.mexc.resource;

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