package MethodOveriding;

public class Employee {

    //Instance variables

   String employeename;
   double basicsalary;
   int workingdays;

   //Constructor
   Employee(String empname,int workingdays)
   {

       employeename=empname;
       this.workingdays=workingdays;
       this.basicsalary=basicsalary;
   }



   void calculateSalary()
   {

       System.out.println("This method used to calculate salary");
   }


}
