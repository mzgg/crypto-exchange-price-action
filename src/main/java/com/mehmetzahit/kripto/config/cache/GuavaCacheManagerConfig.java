package com.mehmetzahit.kripto.config.cache;

import com.google.common.cache.CacheBuilder;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.guava.GuavaCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.concurrent.TimeUnit;

@Configuration
@EnableCaching
public class GuavaCacheManagerConfig {

	public final static String ONE_MINUTE = "GUAVA_ONE_MINUTE";
	public final static String TWENTY_MINUTE = "GUAVA_TEN_MINUTE";
	public final static String FIVE_HOUR= "GUAVA_FIVE_HOUR";


	@Primary
	@Bean(GuavaCacheManagerConfig.ONE_MINUTE)
	public CacheManager guavaCacheOneMinute() {
		GuavaCacheManager cacheManager = new GuavaCacheManager();
		cacheManager.setCacheBuilder(getCacheBuilder(60));
		return cacheManager;
	}

	@Bean(GuavaCacheManagerConfig.TWENTY_MINUTE)
	public CacheManager guavaCacheTenMinute() {
		GuavaCacheManager cacheManager = new GuavaCacheManager();
		cacheManager.setCacheBuilder(getCacheBuilder(1200));
		return cacheManager;
	}

	@Bean(GuavaCacheManagerConfig.ONE_MINUTE)
	public CacheManager guavaCacheFiveMinute() {
		GuavaCacheManager cacheManager = new GuavaCacheManager();
		cacheManager.setCacheBuilder(getCacheBuilder(300));
		return cacheManager;
	}

	@Bean(GuavaCacheManagerConfig.FIVE_HOUR)
	public CacheManager guavaCacheFiveHour() {
		GuavaCacheManager cacheManager = new GuavaCacheManager();
		cacheManager.setCacheBuilder(getCacheBuilder(18000));
		return cacheManager;
	}


	private CacheBuilder<Object, Object> getCacheBuilder(Integer ttl) {
		return CacheBuilder.
				newBuilder().
				expireAfterWrite(ttl, TimeUnit.SECONDS).
				maximumSize(10000000);
	}


}