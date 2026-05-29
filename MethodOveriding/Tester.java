package MethodOveriding;

public class Tester extends Employee {


    Tester(String empname,int workingdays)
    {
        super(empname, workingdays);
    }


    //override method


    @Override
    void calculateSalary() {

        double  basicsalary=40000;
        double bonus=3000;
        double overtimepay=1000;


        double testersal = basicsalary + bonus + overtimepay;
        System.out.println("Total sal is "+testersal);


        if(workingdays<=20)
        {

            double dedsal = testersal - 2000;
            System.out.println("After Deducted Manager sal is : "+dedsal);
        }


        else if(workingdays==30)
        {


            double performancebou = testersal + 3000;
            System.out.println("Performance Bonus added ");
        }

        System.out.println("===========Salary Details ===============");


        System.out.println("Employe Role is : Tester");
        System.out.println("Total working days : "+workingdays);
        System.out.println("Basic salasry : "+basicsalary);
        System.out.println("Bonus  : "+bonus);
        System.out.println("Total sal : "+testersal);
        System.out.println("overtimepay: "+overtimepay);






    }
}
