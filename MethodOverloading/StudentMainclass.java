package MethodOverloading;

import java.util.Scanner;

public class StudentMainclass {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        Student s=new Student();


       System.out.println("Please Search criteria");
       System.out.println("1.Search By name");
       System.out.println("2.Search by roll");
        int choice = scan.nextInt();


        if(choice==1)
        {
            System.out.println("Enter a Name");
            String name = scan.next();
            s.searchStudent(name);


        }
        else if(choice==2)
        {

            System.out.println("Enter a rollno");
            int rollno = scan.nextInt();
            s.searchStudent(rollno);

        }


    }
}
