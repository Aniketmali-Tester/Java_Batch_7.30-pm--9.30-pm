package VariableTypes;

public class ClassVariables {


   static  String name="Aniket";
    static double empid=1245;
    static String Dob="14-08-1998";


    public static void display()
    {

      /*  System.out.println("The name is ;"+name);
        System.out.println("The empid is ;"+empid);
        System.out.println("The dob is "+Dob);*/

    }

    public static void main(String[] args) {

        display();
         System.out.println("The name of the person is;"+name);
        System.out.println("The name of the person is;"+name);

    }


}


 class excueteclass {

     public static void main(String[] args) {

         System.out.println("The name of the person is:"+ClassVariables.name);
         System.out.println("The person  empid is:"+ClassVariables.empid);
         System.out.println("The dob is  is :"+ClassVariables.name);
         ClassVariables.name="Ramu";

     }
 }




