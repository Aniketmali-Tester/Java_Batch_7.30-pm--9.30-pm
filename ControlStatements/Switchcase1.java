package ControlStatements;

import java.util.Scanner;

public class Switchcase1 {


    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Please select a city  1.chennai \n 2.coimbatore  \n3.Bengaluru");
        String city= sc.next();

        /*switch(Expression)
                       {
                             case1:
                                    -----
                                    -----
                                    break;

                              case2:

                                      ----
                                      ----
                                      ----
                                      break;

                                default:

                        }*/

           switch (city)

           {

               case "chennai":
               System.out.println("Welcome to  chennai");
                break;


               case "coimbatore":
                   System.out.println("Welcome to Coimbatore");
                   break;

               case "Bengaluru":
                   System.out.println("Welcome to  Bengaluru");
                   break;

               default:
                   System.out.println("Invalid City");
                   break;

           }
    }
}
