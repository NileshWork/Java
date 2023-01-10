package com.nil.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dieselEngine")
@Primary // it will be inject if we enable this annotation if @Qualifier not enable on vehicle
public class DiaselEngine implements Engine {

	@Override
	public void start() {
		System.out.println("DiaselEngine.start()");
	}

	@Override
	public void stop() {
		System.out.println("DiaselEngine.stop()");
	}

}
