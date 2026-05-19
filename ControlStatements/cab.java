package ControlStatements;

import java.util.Scanner;

public class cab {

    public static void main(String[] args)
    {

       //Write  a java program to calculate cab fare::
       //if distance <5km ---fare 100
       //else ---5km> 200
        //Take input user


        //Take input user
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a distance(Km) :");
        int distance = sc.nextInt();


        if(distance<=5)
        {
            System.out.println("Your fare is 100 rs/-");

        }
        else
        {

            System.out.println("your fare is 200 rs/-");
        }





    }



}
