package datatypeprogrammes;

public class Empsalary {

    public static void main(String[] args)
    {

        //Basic salary ,Incentives,pf

        //a) Employee salary
        //b) Increment Basic salaryby 30%
        //c) Increment Pf amt by 5%
        //d) Calculate updated Net salary

        //Emp salary
      double basicsalary=12000;
      double pfsal=1200;
      System.out.println("The basic salary is \t : "+basicsalary);

      //After base slary increment
      double incbasesal =basicsalary+basicsalary * 0.3;
      System.out.println("The After increment  basic salary is \t : "+incbasesal);

      //Increment pf amt by 5%

        System.out.println("The pfsal "+basicsalary);
        double incpfsal = pfsal + pfsal * 0.05;
        System.out.println("After increment Pf amount is \t : "+ incpfsal);


        //calculate updated net salary
        double grosssalary = incbasesal + incpfsal;
         System.out.println("The gross salary is \t : "+grosssalary);

         //calculate net salary
        double netsal = incbasesal - incpfsal;
        System.out.println("The Net salary is \t : "+netsal);


       System.out.println();



    }



}
