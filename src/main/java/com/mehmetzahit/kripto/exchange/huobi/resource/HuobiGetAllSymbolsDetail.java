package com.mehmetzahit.kripto.exchange.huobi.resource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class HuobiGetAllSymbolsDetail implements Serializable {
	private String tags;
	private String state;
	private String wr;
	private String sc;
	private boolean whe;
	private boolean cd;
	private boolean te;
	private String sp;
	private Object D;
	private Object P;
	private Object smlr;
	private Object flr;
	private long toa;
	private Object lr;
	private int tpp;
	private int tap;
	private int ttp;
	private int fp;
	private int W;
	private String bcdn;
	private String qcdn;
	private Object elr;
	private String bc;
	private String qc;
	private String dn;
}