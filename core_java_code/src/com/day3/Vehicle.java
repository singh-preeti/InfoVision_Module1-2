package com.day3;
interface Common{
	void move();
}
public abstract class Vehicle  implements Common{
	void startEngine() {
		System.out.println("Engine started");
	}
	
}
