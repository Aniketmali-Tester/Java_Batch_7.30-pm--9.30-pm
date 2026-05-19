package ControlStatements;

import java.util.Scanner;

public class Ifelse {


    public static void main(String[] args)
    {

        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter a First number");
        double num1 = sc1.nextDouble();


        System.out.println("Enter a second number");
        double num2 = sc1.nextDouble();


        if(num1>num2)
        {

            System.out.println("Number 1 is greater than num2");
        }

        if (num2>num1)
        {
            System.out.println("Number 2 is greater than num1");

        }



        if(num1==num2)
        {

            System.out.println("Number 1 Is equal to Number 2");
        }

        else
        {

            System.out.println("Please provided a number");
        }


    }


}
