package JavaScanner;

import java.util.Scanner;

public class Scanner1 {


    public static void main(String [] args)
    {


        //object create for scanner class
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=s.next();
        System.out.println("The name of the person is :" +name);

        System.out.println("Enter your emp id ");
       int empid=s.nextInt();
        System.out.println(" your  id is : "+empid);

        System.out.println("Enter your designation");
        String des=s.next();
        System.out.println("The designation is : "+des);

        System.out.println("Enter your salary");
        double sal=s.nextDouble();
        System.out.println("These salary is : "+sal);

        System.out.println("hank for given information");




    }



}
