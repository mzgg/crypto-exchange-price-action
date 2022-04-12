package com.mehmetzahit.kripto.config.handler;

import feign.FeignException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
@RequiredArgsConstructor
public class CustomExceptionHandler {

	@ExceptionHandler(FeignException.class)
	ResponseEntity<Object> handleException(FeignException ex) {
		if (ex.responseBody().isPresent()) {
			String responseBody = new String(ex.responseBody().get().array());
			return ResponseEntity.status(ex.status()).body(responseBody);
		}
		return ResponseEntity.status(ex.status()).build();
	}

}
