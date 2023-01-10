package com.nil.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nil.bean.Vehicle;
import com.nil.config.AppConfig;

public class StrategyDPTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Vehicle vehicle = ctx.getBean("vehicle", Vehicle.class);
		vehicle.journey("Vadodara", "Pune");
	}

}
