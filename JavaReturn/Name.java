package JavaReturn;

public class Name {



    public static String Fullname(String firstname,String lastname)

    {
       return firstname + " " +lastname;

    }

    public static void salaryincrem(double sal,double incre)
    {

                   double newsal= sal+incre;
                   System.out.println("The new salary : "+newsal);
    }


    public static double salarydecremenr(double sal,double decrem)
    {

        double newsal= sal-decrem;
        return newsal;
        //System.out.println("The new salary : "+newsal);
    }





    public static void main(String [] args)
    {

       String  newname=Fullname("Aniket","mali");
       System.out.println("The name is : "+newname);

       salaryincrem(25000,5000);

      double finalamount=salarydecremenr(25000,5000);
      System.out.println("the final amount is : "+finalamount);

    }




}
