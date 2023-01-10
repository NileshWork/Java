package com.nil.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nil.bean.WishMessageGenerator;
import com.nil.config.AppConfig;

public class WishMessageGeneratorTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		WishMessageGenerator wmg = ctx.getBean("wishMessageGenerator", WishMessageGenerator.class);
		String wishMessage = wmg.wishMessageGenerator("Nilesh");
		System.out.println("Wish Message Is :"+ wishMessage);
	}

}
