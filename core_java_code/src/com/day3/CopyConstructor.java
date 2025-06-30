package com.day3;

public class CopyConstructor {

	
	String web;
	CopyConstructor(String w){
		web = w;
	}
	
	CopyConstructor(CopyConstructor cc){
	  web = cc.web;
	}
	void disp()
	{
		System.out.println("Constructor" +web);
	}
	public static void main(String[] args) {
		CopyConstructor obj1 = new CopyConstructor("example of copy constructor");
		
		CopyConstructor obj2 = new CopyConstructor(obj1);
		
		
	}
}
