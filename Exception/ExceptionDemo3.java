package Exception;

import java.util.Scanner;

public class ExceptionDemo3 {


    public static void main(String[] args) {

        System.out.print("program Started");

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter First number");
        int no1 = scan.nextInt();


        System.out.println("Enter Second Number");
        int no2=scan.nextInt();

  try{

      int no3 = no1 / no2;
      System.out.println(no3);

  }catch (Exception e)
  {

      System.out.println(e);
  }



        System.out.println("Program Ended");
    }
}
