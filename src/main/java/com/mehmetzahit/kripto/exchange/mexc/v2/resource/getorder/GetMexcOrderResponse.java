package com.mehmetzahit.kripto.exchange.mexc.v2.resource.getorder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class GetMexcOrderResponse implements Serializable {
	private int code;
	private List<DataResponse> data;
}