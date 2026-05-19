package ControlStatements;

import java.util.Scanner;

public class ifelse1 {

    public static void main (String[] args)
    {

        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter A number");
         double no= sc1.nextDouble();

         if(no>0) {

             if (no % 3 == 0) {

                 System.out.println("The number is positive and it's divisible by 3");
             } else {

                 System.out.println("Number is positive and Not divisible by 3");
             }
         }
          if(no<0)
             {
                 if(no%7==0) {

                     System.out.println("The number is Negative and it's divisible by 7");
                 }
                 else {
                     System.out.println("The number is Negative and not divisible by 7");
                 }
             }
         else
         {

             System.out.println("Number is not divisible");
         }
         }

    }



