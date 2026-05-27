package MethodOverloading;

public class onlinepayment {



    /* In online Payment applications,users can pay using
         *)Cash
         *)Card
         *)UPi
         ==>Same Method name Payment() is used different parameters
     */


    //Method overload
    //cash

    void payment(int cashamount)
    {

        System.out.println("Cash Payment");
        System.out.println("Cash payment : "+cashamount);
    }

    //card
    void payment(int cardno,int expdate,int cvv)
    {
        System.out.println("Card Payment");
        System.out.println("cardno : "+cardno);
        System.out.println("expdate  : "+expdate);
        System.out.println("cvv  : "+cvv);


    }

    //Upi
    void payment(String Upid,int pin)
    {
        System.out.println("UPI Payment");
        System.out.println("upi id : "+Upid);
        System.out.println("upi pin no : "+pin);
    }

    public static void main(String[] args) {

        onlinepayment obj=new onlinepayment();
        obj.payment(5000);
        System.out.println("================================");
        obj.payment(2345,230819,257);
        System.out.println("================================");
        obj.payment("aniket@0kaxis",4567);
        System.out.println("================================");

    }










}
