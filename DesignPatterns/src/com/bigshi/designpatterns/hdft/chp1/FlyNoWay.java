package com.bigshi.designpatterns.hdft.chp1;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can't fly!");
	}

}
