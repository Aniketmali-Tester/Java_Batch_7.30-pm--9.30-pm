package ControlStatements;

import java.util.Scanner;

public class ifelseclass {


    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();


        if(age>=18)
        {

            System.out.println("your are Eligible");
        }
        else
        {
            System.out.println("Not eligible");
        }
    }



}
