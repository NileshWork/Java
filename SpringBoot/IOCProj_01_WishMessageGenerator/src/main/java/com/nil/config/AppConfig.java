package com.nil.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nil.bean")
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig.AppConfig(): 0 param constructor");
	}

	@Bean("sysDate")
	public LocalDateTime createLocalDateTime() {
		return LocalDateTime.now();
	}
	
}
