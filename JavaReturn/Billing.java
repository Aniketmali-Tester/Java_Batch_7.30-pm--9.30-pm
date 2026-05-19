package JavaReturn;

public class Billing {



    public static double amount(double price,double tax)
    {

        double gstamount=price*0.18;
        double Newamount= price+gstamount;
        return Newamount;
    }



    public static void main(String [] args)
    {

      double finalamount=amount(1450,0.18);
      System.out.print("The Final amount is : "+finalamount);

    }


}
