package com.mehmetzahit.kripto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAsync
@EnableRetry
@EnableScheduling
@EnableFeignClients
@SpringBootApplication
public class ExchangePriceActionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExchangePriceActionApplication.class, args);
	}

}
