package com.day8;

public class ConsumerThread extends Thread {

	private ProducerConsumerProblemDemo pc;
	
	public ConsumerThread(ProducerConsumerProblemDemo pc) {
		super();
		this.pc = pc;
	}

	public void run() {
		try {
		while(true) {
			pc.consume();
			Thread.sleep(1000);
		}
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}

