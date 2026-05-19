package Ternaryoperator;

import java.util.Scanner;

public class Ternaryoperator1 {

    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("1.Red");
        System.out.println("2.Green");
        System.out.println("3.Blue");

        int choice = sc.nextInt();

        //  Variable=(conditions...n)? "exp1 " : "exp2";
                                       //if        else

        String result = (choice == 1) ? "RED" :  (choice == 2) ? "Green" : (choice == 3) ? "Blue " : "Invalid";


        System.out.println("The Result is : "+result);

    }


}
