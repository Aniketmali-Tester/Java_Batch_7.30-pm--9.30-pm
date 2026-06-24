package Array;

public class OnedimensionalArray {


   public  static void main(String[] args) {


       /*Syntax::-

               Declaration::-
               datatype [] arrayName;*/

               // int [] Empids;

          /*Declaration and Creation
       datatype  arrayName [] = new datatype[size];*/


       //First Way Apporach to store  values in a array
      /* int []   Empids =new int[5];

       Empids[0]=101;
       Empids[1]=102;
       Empids[2]=103;
       Empids[3]=104;
       Empids[4]=105;
       //Empids[5]=106;*/


       //Second way apporach to store value in a array
       int [] Empids={101,102,103,104,105};


       /*System.out.println("The Array of Index 4th value is :  "+Empids);
       System.out.println("The Array of Index 4th value is :  "+Empids[0]);
       System.out.println("The Array of Index 4th value is :  "+Empids[1]);*/

       System.out.println("The EmpidArray lenght is : "+Empids.length);

      for(int i=0;i<Empids.length;i++)
      {
          System.out.println("The EmpidArray value is :  "+Empids[i]);

      }




}



   }

