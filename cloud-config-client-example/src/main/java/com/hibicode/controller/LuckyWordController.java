package com.hibicode.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix = "wordConfig")
@RefreshScope
public class LuckyWordController {

	@Value("${service-url}")
	private String serviceUrl;

	private String luckyWord;

	@GetMapping("/something")
	public String showServiceUrl() {
		return "The url is: " + serviceUrl + ".... luckyWord: " + luckyWord;
	}

	public String getLuckyWord() {
		return luckyWord;
	}

	public void setLuckyWord(String luckyWord) {
		this.luckyWord = luckyWord;
	}

}
