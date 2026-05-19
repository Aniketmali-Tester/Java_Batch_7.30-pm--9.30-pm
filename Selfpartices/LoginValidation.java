package Selfpartices;

import java.util.Scanner;

public class LoginValidation {

    //2.Write  a Java program for login validation?
    //
    //a) Correct PIN is 1234
    //b) User enters PIN
    //c) If correct → print "Login Success".
    //d) If wrong → increment attempt counter and show  warning.
    //c) If attempts >3 → display "Account Blocked".

    public static void main(String[] args) {

        //Enter correct Pin is 1234

        int pin = 1234;

        //Get Pin From Users
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Pin");
        int Userpin = sc.nextInt();

        //) If correct → print "Login Success".

        int attempts = 0;

        //Attempt 1


        if (Userpin == pin) {
            System.out.println("Login Success");
        } else {

            if (Userpin != pin) {

                attempts++;
                System.out.println(" Wrong pin");
            }

            System.out.println("Please Enter Your Pin again");
            int Userpin2 = sc.nextInt();

            //Attempt 2
            if (Userpin == pin) {
                System.out.println("Login Success");
            } else {

                if (Userpin != pin) {

                    attempts++;
                    System.out.println(" Wrong pin");
                }


                System.out.println("Please Enter Your again Pin");
                int Userpin3 = sc.nextInt();

                //Attempt 3
                if (Userpin == pin) {
                    System.out.println("Login Success");
                } else {

                    if (Userpin != pin) {

                        attempts++;
                        System.out.println(" Account Blocked Please Contact your Bank");
                    }


                }


            }
        }
    }
}