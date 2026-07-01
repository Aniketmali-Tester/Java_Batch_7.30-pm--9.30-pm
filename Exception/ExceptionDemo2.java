package Exception;

public class ExceptionDemo2 {


    public static void main(String[] args) {



        System.out.println("program Started");

        String s1="12abc";

      try{
          int no = Integer.parseInt(s1);

          System.out.println(no);
      }catch (Exception e)

      {
          System.out.println(e);
      }


        System.out.println("Program Ended");


    }
}
