package MethodOveriding;

import java.lang.classfile.Superclass;

public class Manager extends Employee {


    Manager(String empname,int workingdays)

    {

        super( empname, workingdays);
    }

    //overide method
    void calculateSalary()
    {

        double  basicsalary=700000;
        double bonus=10000;
        double Travelallowance=5000;


        double mansal = basicsalary + bonus + Travelallowance;
        System.out.println("Total sal is "+mansal);


        if(workingdays<=20)
        {

            double dedsal = mansal - 2000;
            System.out.println("After Deducted Manager sal is : "+dedsal);
        }


        else if(workingdays==30)
        {


            double performancebou = mansal + 3000;
            System.out.println("Performance Bonus added ");
        }

        System.out.println("===========Salary Details ===============");
        System.out.println("Employe Role is : manager");
        System.out.println("Total working days : "+workingdays);
        System.out.println("Basic salasry : "+basicsalary);
        System.out.println("Bonus  : "+bonus);
        System.out.println("total Salary : "+mansal);
        System.out.println("Travelallowance "+Travelallowance);


    }




}
