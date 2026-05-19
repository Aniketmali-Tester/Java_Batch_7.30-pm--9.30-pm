package datatypeprogrammes;

public class Product2 {

    public static void main(String[] args)
    {



           //Quantity
           //price
           // total
           // apply 5%  discount
           // new amount
          // apply 3% gst


        //Quantity
        int quantity=2;

        //price
       int price=100;

        // total
        int amount=quantity*price;

        System.out.println("The quantity and price value is : "+amount);

        // apply 5%  discount
        double  newamount=amount-amount*0.05;
        System.out.println("The newamount is : "+newamount);


        //apply 3% gst
         double finalamount=newamount+newamount*0.03;
         System.out.println("After apply Gst 3% on  amount is : "+finalamount);
    }


}
