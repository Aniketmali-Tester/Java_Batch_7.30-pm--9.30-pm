package Exception;

public class NestedTrycatch {


    public static void main(String[] args) {

        System.out.println("Program Started");

        int a=10;
        int b=0;


        String s=null;
      try
      {

          try
          {
              int c=a/b;

              System.out.println(c);


          }
          catch (ArithmeticException e)
          {

              System.out.println(e);

          }
          System.out.println(s.length());
      }catch (Exception e)
      {

          System.out.println(e);
      }





       System.out.println("Program Ended");
    }
}
