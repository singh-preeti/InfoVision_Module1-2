package com.day16;
interface  A
{
	//Single abstract method  and static and default methods in it
  void show();	
}

public class FunctionalInterfaceExample {
	public static void main(String[] args) {
		A obj;
	    obj = () ->System.out.println("Show");
		obj.show();
	}

}
