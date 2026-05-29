package MethodOveriding;

public class Developer extends Employee {



    Developer(String empname ,int workingdays) {

        super(empname, workingdays);

    }


    //override method
     void calculateSalary()
     {

        double  basicsalary=50000;
        double bonus=5000;
        double overtimepay=2000;


         double Totaldevsal = basicsalary + bonus + overtimepay;

         System.out.println("Total sal is "+Totaldevsal);

         if(workingdays<=20)
         {

             double dedsal = Totaldevsal - 2000;
             System.out.println("After deducted Dev sal  : "+dedsal);
         }


         else if(workingdays==30)
         {


             double performancebou = Totaldevsal + 3000;
             System.out.println("Performance Bonus added ");
         }

         System.out.println("===========Salary Details ===============");
         System.out.println("Employe Role is : Developer");
         System.out.println("Total working days : "+workingdays);
         System.out.println("Basic salasry : "+basicsalary);
         System.out.println("Bonus  : "+bonus);
         System.out.println("total Salary : "+Totaldevsal);
         System.out.println("overtimepay"+overtimepay);




}
}
