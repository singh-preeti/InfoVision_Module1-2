package com.day3;
//interface Emp
//{
//	default void displayEmp() {
//		 System.out.println("Displaying the list of employees....");
//	 }	
//}
public  class Employee  {
	public  void displayEmp() {
		 System.out.println("Displaying the list of employees....");
	 }
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.displayEmp();
		
	}

}
