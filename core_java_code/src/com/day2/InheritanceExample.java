package com.day2;
class Company{
	
	String comp_id = "Inf002";
	String comp_type = "Telecom";
	
	public void showCompanyDetails() {
		System.out.println(comp_id + ""+ comp_type);
	}
}
class Department extends Company{
	
	String dept_id = "dept002";
	String dept_name = "HR";
	
	
	public void  showDepartment() {
		System.out.println(dept_id + "" +dept_name);
	}
	
}
class Employee extends Department {
	
	int emp_id ;
	String emp_name;
	
	public void showEmployee() {
		System.out.println("Showing details...");
	}
}
public class InheritanceExample {
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.showCompanyDetails();
		emp.showDepartment();
		emp.showEmployee();
	}

}
