package Staticandnonstatic;

public class Static1 {


     //Static data member
      static String name="Aniket";
      static String Designation="Qa Tester";
      static double salary=27000;


     //Static Function member or Static methods
      public static void persondetails()
      {

          System.out.println("The Name of the person is : "+name);
          System.out.println("The Designation of the person is : "+Designation);
          System.out.println("The person salary is  : "+salary);


      }

    public static void main(String[] args) {


          persondetails();
          System.out.println("The name of the person is :"+name);

    }


    }


