class Employee{
  // int emp_id =102;
  // String emp_name = "Pawan";
 // static  String company_name = "InfoVision";

   public double getSalary(double salary,double bonus){
       double total_salary = salary + bonus;

       System.out.println(total_salary);
       return total_salary;
   }
   public  static void display_company_name(){
       String comp_name = "InfoVision";
      System.out.println("the name of company of all the employee" +comp_name);
   }
 
 public static void main(String args[]){
      Employee.display_company_name();
     //Employee emp = new Employee();
     //emp.getSalary(20000,2000);
  }
}





