package Ternaryoperator;

import java.util.Enumeration;
import java.util.Scanner;

public class Program1 {


    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int no = sc.nextInt();


        //  Variable=(conditions...n)? "exp1 " : "exp2";
                                       //if        else

        String result = (no > 0) ? "positive" : "Negative";
        System.out.println("The result is "+ result);

    }
}
