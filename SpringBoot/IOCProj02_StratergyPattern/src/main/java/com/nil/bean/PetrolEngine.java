package com.nil.bean;

import org.springframework.stereotype.Component;

@Component("petrolEngine")
public class PetrolEngine implements Engine {

	@Override
	public void start() {
		System.out.println("PetrolEngine.start()");
	}

	@Override
	public void stop() {
		System.out.println("PetrolEngine.stop()");
	}

}
