package Exception;

import java.util.Scanner;

public class ThrowException {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter A Basic Salary");
        double basicsal = scan.nextDouble();

        System.out.println("Enter Incentives");
        double Incenv = scan.nextDouble();

        calculatesal(basicsal,Incenv);


    }


    public static void calculatesal(double basic,double ince)
    {

        if(basic>0)
        {
            double totalsal = basic + ince;
            System.out.println(totalsal);
        }

        else {

                throw new ArithmeticException("Invalid Salary");
        }

    }


}
