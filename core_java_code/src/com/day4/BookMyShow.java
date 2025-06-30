package com.day4;
import java.lang.*;
//import java.util.concurrent.*;
class MovieApp{
	
	int total_seats = 180;
	
	synchronized void bookSeats(int seats) {
		if(total_seats >=seats) {
			System.out.println("Booked Successfully" +seats);
			total_seats = total_seats - seats;
			System.out.println("Seats left" +total_seats);
		}
		else
		{
			System.out.println("seats not booked");
			System.out.println("seats available" +total_seats);
		}
	}
}
public class BookMyShow extends Thread {
	
	static MovieApp movie;
    int seats;
    
    public void run() {
    	movie.bookSeats(seats);
    }
    
    public static void main(String[] args) {
    	movie = new MovieApp();
    	BookMyShow custmer1 = new BookMyShow();
    	custmer1.seats =40;
    	custmer1.start();
    	BookMyShow custmer2 = new BookMyShow();
    	custmer2.seats =60;
    	custmer2.start();
    	BookMyShow custmer3 = new BookMyShow();
    	custmer3.seats =20;
    	custmer3.start();
    	BookMyShow custmer4 = new BookMyShow();
    	custmer4.seats =10;
    	custmer4.start();
    	BookMyShow custmer5 = new BookMyShow();
    	custmer5.seats =20;
    	custmer5.start();
    	BookMyShow custmer6 = new BookMyShow();
    	custmer6.seats =5;
    	custmer6.start();
    	BookMyShow custmer7 = new BookMyShow();
    	custmer7.seats =75;
    	custmer7.start();
	}
}
