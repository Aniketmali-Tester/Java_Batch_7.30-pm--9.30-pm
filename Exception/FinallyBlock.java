package Exception;

public class FinallyBlock {


    public static void main(String[] args) {

        System.out.println("Program Started");


        int [] data=new int[3];
  try
  {

      System.out.println("Try block Started");
      data[0]=10;
      data[1]=20;
      data[2]=30;


      System.out.println(data[2]+data[3]);

  } catch (ArrayIndexOutOfBoundsException e) {
     System.out.println(e);
  }
  finally {
      System.out.println("closing costly resources");
  }

  System.out.println("program Ended");





    }
}
