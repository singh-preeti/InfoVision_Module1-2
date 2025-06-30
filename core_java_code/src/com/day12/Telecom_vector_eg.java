package com.day12;

public class Telecom_vector_eg  extends Thread {
	
	public synchronized void log(String message)
	{
		System.out.println(Thread.currentThread().getName()+": "+message);
	}
	
	public void call(){
		
		log("Call has been made");
		
	}
	
	public void sms()
	{
		log("Message has been sent");
	}
	
	public void internet_usage()
	{
		log("Data has been used");
	}
	
	@Override
	public void run()
	{
		call();
		sms();
		internet_usage();
	}
	
	public static void main(String[] args) {
		
		Telecom_vector_eg t1 = new Telecom_vector_eg();
		Telecom_vector_eg t2 = new Telecom_vector_eg();
		Telecom_vector_eg t3 = new Telecom_vector_eg();
		t1.start();
		t2.start();
		t3.start();
		
		
		
		
	}
 
}