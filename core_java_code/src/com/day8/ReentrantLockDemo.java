package com.day8;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
	public static void main(String[] args) {
		ReentrantLock renter  = new ReentrantLock();
		renter.lock(); // counter = 1
		renter.lock(); // counter = 2
		
		System.out.println(renter.isLocked());
		System.out.println(renter.isHeldByCurrentThread());
		
		renter.unlock();
		System.out.println(renter.isLocked());
		System.out.println(renter.isHeldByCurrentThread());
		
		
		renter.unlock();
		System.out.println(renter.isLocked());
		System.out.println(renter.isHeldByCurrentThread());
		
		renter.lock();
		System.out.println(renter.isLocked());
		System.out.println(renter.isHeldByCurrentThread());
	}

}
