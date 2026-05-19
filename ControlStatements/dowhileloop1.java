package ControlStatements;

public class dowhileloop1 {

      //Write a java program to display battery percentage while charging.



    public static void main(String[] args) {


        int battery=20;

         /*==>Following syntax For do while ::

                         do
                           {
                                    ---------    //Java Statement
                                    ---------
                            }while(exp) */


        do {
                 System.out.print(" \n The battery percentage level : " +   battery +" %");
                 battery+=20;

        }while (battery<=100);


        System.out.println("\nBattery charged");



      /* while(battery<100)
        {
            System.out.print(" \n The battery percentage level : " +   battery +" %");

        }*/




    }
}
