package Wrapper;

public class WrapperClasses {


    public static void main(String[] args) {


    //Primitive Datatype
     int a=20;//Primitive Variable

    Integer i=new Integer(40);//Non-primitive


   // System.out.println(a+i);

     //Convert Primitive Datatype into Non-Primitive Datatype
      Integer b=a;//AutoBoxing

     // System.out.println(b);


      //Convert Non-primitive Datatype into Primitive Datatype
          int j=i;//Autounboxing


              String s1="10";
              String s2="20";
              System.out.println("Before Convert String into primitive value : " +s1+s2);


        int s3 = Integer.parseInt(s1);
        int s4 = Integer.parseInt(s2);


        System.out.println("After Convert String into primitive value : " +(s3+s4));


        //Convert primitive Datatype into String

        String s5 = Integer.toString(s3);
        String s6 = Integer.toString(s4);

        System.out.println(s5+s6);

        String b1="true";

        System.out.println(Boolean.parseBoolean(b1));









    }



}
