package com.day2;
//interface in java 8
@FunctionalInterface
interface Laptop{
	//Single abstract method
	public void showOSCode();
	public default void showLaptopSpecification() {
		System.out.println("memmory!");
		
	}
}
//method in interface that is  abstract till java 7
interface WashingMachine{
	public void start();
	public void pause();
	public void stop();
}
public class InterfaceExample implements  WashingMachine{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

}
