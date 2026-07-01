package Exception;

public class ExceptionDemo1 {


    public static void main(String[] args) {


        System.out.println("program Started");


        String s=null;

try{
    System.out.println(s.length());
   } catch (NullPointerException e) {

    System.out.println(e);

}


        System.out.println("Program Ended");

    }
}
