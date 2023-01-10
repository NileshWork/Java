package com.nil.bean;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wishMessageGenerator")
public class WishMessageGenerator {

	@Autowired
	private LocalDateTime locaDateTime;

	public String wishMessageGenerator(String userName) {
		int hour = locaDateTime.getHour();
		if (hour < 12) {
			return "Good Morning " +userName;
		} else if (hour < 13) {
			return "Good Afternoon " + userName;
		} else if (hour < 16) {
			return "Good Evening " + userName;
		} else {
			return "Good Night " + userName;	
		}
	}
}
