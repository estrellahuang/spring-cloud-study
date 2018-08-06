package com.estrella.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @RefreshScope注解不能少，否则即使调用/refresh，配置也不会被刷新
 * @author huang
 *
 */
@RestController
@RefreshScope
public class ConfigClientController {
	@Value("${profile}")
	private String profile;
	
	@GetMapping("/hello")
	public String getProfile(){
		return profile;
	}
}
