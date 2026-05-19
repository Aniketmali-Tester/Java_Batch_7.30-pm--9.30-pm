package ControlStatements;

public class whileloop1 {


    public static void main() {


        int a = 10;


      /* Following Syntax for while loop.

       while (Expression/Condition)

       {
           -------     //Java Statements
                   ------
       }*/

        while (a <= 100)
        {

            System.out.println("the vlaue of a is :" + a);
            a=a+10;
        }
    }
}