package com.mehmetzahit.kripto.exchange.gateio.service;



import com.mehmetzahit.kripto.exchange.BaseClient;
import com.mehmetzahit.kripto.exchange.enums.ExchangeMarketType;
import com.mehmetzahit.kripto.exchange.gateio.client.GateIOClient;
import com.mehmetzahit.kripto.exchange.gateio.resource.GateIOResponse;
import feign.RetryableException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.context.ApplicationContext;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class GateIOClientService extends BaseClient {

	private final GateIOClient gateIOClient;

	private final ApplicationContext applicationContext;

	public List<GateIOResponse> getPairData(String symbol) {
		return gateIOClient.getPairData(symbol);
	}


	@Retryable(value = {RetryableException.class}, maxAttempts = 2, backoff = @Backoff(delay = 20))
	@Override
	public String getPriceValue(String symbol) {
		try {
			GateIOClientService bean = applicationContext.getBean(GateIOClientService.class);
			if (bean.isNotFound(symbol, ExchangeMarketType.GATEIO.name()).isPresent()) {
				return "0.0";
			}

			List<GateIOResponse> pairData = gateIOClient.getPairData(symbol);
			if (!ObjectUtils.isEmpty(pairData)) {
				return pairData.get(0).getPrice();
			}

			bean.setNotfound(symbol,  ExchangeMarketType.GATEIO.name());
			return "0.0";
		} catch (Exception ex) {
			log.error("get price is error from gateIO market, symbol:{}, cause:{}", symbol, ex.getMessage());
			return "0.0";
		}
	}

}
