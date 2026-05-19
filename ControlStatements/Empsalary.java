package ControlStatements;

import java.util.Scanner;

public class Empsalary {

    //Select Employee type
    //1)HR(+20%)
    //2)Manager(+30%)
    //1 // 2 (Accept choice)
    //Enter salary
    // print Incremental salary

    public static void main(String[] args)

    {
        Scanner sc1=new Scanner(System.in);
        //System.out.println();
        System.out.println("Select employee type \n 1:Hr \n 2:Manager");
        int choice = sc1.nextInt();

        System.out.println("Enter your salary");
        double salary = sc1.nextDouble();

        System.out.println("Before Increment salary + :"+salary);
            //2==1
        if(choice==1)
        {
               Hr(salary);

        }        //2==2
        else if(choice==2)
        {

            Manager(salary);
        }
        else {
            System.out.println("salary is invalid or type");
        }


    }


    //External static method
    public static void Hr(double sal)
    {

        double updatedsal = sal+ sal * 0.2;
        System.out.println("After Increment Hr salary + : "+updatedsal);
    }

    //Create Method for Manager salty Calulation
    public static void Manager(double sal)
    {
        double updatedsal = sal + sal * 0.3;
        System.out.println("After Increment  manager salary + : "+updatedsal);
    }







}
