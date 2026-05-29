package MethodOveriding;

import java.util.Scanner;

public class EmployeeSalMain {


    static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        System.out.println("Enter Employee Name: ");
        String name = scan.next();

        System.out.println("Enter Employee Role (Developer/Tester/manager");
        String role = scan.next();
        System.out.println("Enter a working days");
        int days=scan.nextInt();

        System.out.println("========Employee Salary System===========" );
        System.out.println("Enter Employe name : "+name);
        System.out.println(" Enter Employee role : "+role);
        System.out.println("Enter Working days"+days);

        Employee e=null;
        if(role.equalsIgnoreCase("Developer"))
        {

            e=new Developer(name,days);
            e.calculateSalary();
        }


        else if (role.equalsIgnoreCase("Tester"))
        {
            e=new Tester(name,days);

            e.calculateSalary();


        }

        else if(role.equalsIgnoreCase("manager"))
        {

            e=new Manager(name,days);
            e.calculateSalary();

        }


    }
}
