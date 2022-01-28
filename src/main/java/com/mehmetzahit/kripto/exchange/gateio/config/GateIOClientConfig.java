package com.mehmetzahit.kripto.exchange.gateio.config;

import feign.Retryer;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;

@RequiredArgsConstructor
public class GateIOClientConfig {

	@Bean
	public Retryer retryer() {
		return new Retryer.Default(10, 30, 3);
	}

}
