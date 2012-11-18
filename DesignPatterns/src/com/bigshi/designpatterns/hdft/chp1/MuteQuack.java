package com.bigshi.designpatterns.hdft.chp1;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("<< Silence >>");
	}

}
