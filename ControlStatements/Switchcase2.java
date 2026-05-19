package ControlStatements;

import java.util.Scanner;

public class Switchcase2 {

/*write a java program using switch case for food ordering system??
  1.Pizza
  2.Burger
  3.Sandwich
  4.juice
 */


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please order type \n 1.pizza \n 2.burger \n 3.Sandwich \n 4.juice");
        int choice = sc.nextInt();


        switch (choice)
        {

            case 1:
                System.out.println("Pizza ordered  and price is 500/- Rs");
                break;


            case 2:
                System.out.println("Burger ordered  and price is 400/- Rs");
                break;



            case 3:
                System.out.println("Sandwich ordered  and price is 300/- Rs");
                break;


            case 4:
                System.out.println("Juice  ordered  and price is 20000/- Rs");
                break;


            default:
                System.out.println("Order Not Selected");



        }



    }
}



