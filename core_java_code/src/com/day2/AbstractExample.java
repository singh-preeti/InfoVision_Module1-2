package com.day2;
abstract class NetflixDisplay{
	
	public void display() {
		System.out.println("Displaying all the buttons!");
	}
	abstract public void showNetflix();
	
}
abstract class HotstarDisplay extends NetflixDisplay{
	
	abstract public void displayJioHotstar();
	abstract public void showNetflix();
}

 class AbstractExample extends NetflixDisplay {

	@Override
	public void showNetflix() {
		System.out.println("redirecting to the intalled netflix app!");
		
	}


  public static void main(String[] args) {
	  AbstractExample tv = new AbstractExample();
	  tv.display();
	 // tv.displayJioHotstar();
	  tv.showNetflix();
}
}
