package com.nil.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nil.bean")
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig.AppConfig()");
	}

}
