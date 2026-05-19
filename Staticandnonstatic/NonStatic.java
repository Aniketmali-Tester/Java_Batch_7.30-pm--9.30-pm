package Staticandnonstatic;

public class NonStatic
{
        //Non-Static Data Member
        String mobilename="Samaung m51";
        String Processor="Sanpdargon 780";
        static  int ram=8;
        String colour="Black";
        double price=23500;



        //Non-static Function Member or non-static method

          public void mobilename()
          {
              System.out.println("The mobile name is :"+mobilename);
          }

          public void Processor()
         {
               System.out.println("The mobile processor is  :"+Processor);
         }

         public void ram()
        {
           System.out.println("The mobile ram  is :"+ram);
        }

        public void colour()
        {
         System.out.println("The mobile color is :"+colour);
        }

        public void price()
       {
         System.out.println("The mobile price is :"+price);
       }


    public static void main(String[] args) {

              //Creat Object for class and acess the non-static methods
              NonStatic n=new NonStatic();
              n.mobilename();
              n.price();
              n.colour();
              n.ram();
              n.Processor();


              System.out.println("==============================================");


              //Call Non -static data members
              System.out.println("The mobile name is : "+n.mobilename);
              System.out.println("The mobile price is : "+n.price);
              System.out.println("The mobile processor is : "+n.Processor);
              System.out.println("The mobile color is : "+n.colour);
              System.out.println("The mobile ram is : "+ram);





    }



}
