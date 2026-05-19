package ControlStatements;

import java.util.Scanner;

public class Loan {

    public static void main(String[] args) {

        int score=745;

        //Write a program to check loan eligibility
        //Take salary as input from user
        //if salary>30000  --->ask credit score
        //if credit score>745 --->your eligible for the loan
        //else ----> your not eleigible for loan because credit score low;
        //if salary<30000 --->Loan rejected for low salary


        //Take salary as input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a salary");
        double sal=sc.nextDouble();


        //if salary>30000  --->ask credit score
        if(sal>=300000)
        {
            System.out.println("Enter a credit score");
            int credit = sc.nextInt();

            if(credit>=score)
            {
                System.out.println("your eligible for the loan");

            }
            else
            {
                System.out.println("your  not eligible for the loan because credit score is low");

            }
        }
        else
        {

            System.out.println("Loan rejected for low salary");
        }


    }


}
