package com.mehmetzahit.kripto.exchange;


import com.mehmetzahit.kripto.config.cache.GuavaCacheManagerConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public abstract class BaseClient {

	public abstract String getPriceValue(String symbol);


	@CachePut(value = "not_found", key = "#symbol +'__'+ #market", cacheManager = GuavaCacheManagerConfig.FIVE_HOUR)
	public Optional<Boolean> setNotfound(String symbol, String market) {
		return Optional.of(Boolean.TRUE);
	}

	@Cacheable(value = "not_found", key = "#symbol +'__'+ #market", unless = "#result==null", cacheManager = GuavaCacheManagerConfig.FIVE_HOUR)
	public Optional<Boolean> isNotFound(String symbol, String market) {
		return Optional.empty();
	}


}
