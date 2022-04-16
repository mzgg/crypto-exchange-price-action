package com.mehmetzahit.kripto.exchange.huobi.resource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class TickResponse implements Serializable {
	private long id;
	private long version;
	private String open;
	private String close;
	private String low;
	private String high;
	private String amount;
	private String vol;
	private int count;
//	private List<String> bid;
//	private List<String> ask;
}