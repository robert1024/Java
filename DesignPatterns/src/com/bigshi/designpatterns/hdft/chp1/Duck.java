package com.bigshi.designpatterns.hdft.chp1;

public abstract class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public abstract void display();
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void swim(){
		System.out.println("All ducks floats, even decoys!");
	}
	
	public void setFlyBehavior(FlyBehavior fb){
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb){
		quackBehavior = qb;
	}
	
}
