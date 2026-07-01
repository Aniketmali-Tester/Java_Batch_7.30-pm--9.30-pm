package Exception;

import java.util.Scanner;

public class Usernam {


     static   String username;
    static String password;


    public static void main(String[] args) {



        Scanner s=new Scanner(System.in);
        System.out.println("Enter a name");
        String name=s.next();



        System.out.println("Enter a password");
        String pass=s.next();
       try {
           System.out.println(username.length());
      } catch (Exception e) {
           System.out.println(e);
      }




        checkcredentinals(name,pass);



    }



    public static void checkcredentinals(String u,String p)
    {
        username=u;
        password=p;


        if(username.equalsIgnoreCase("ram") && password.equalsIgnoreCase("1234"))
        {

            System.out.println("Login succefully");
        }
        else {

            System.out.println("Invalid Cred");
        }


    }



    }





