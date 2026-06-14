package ConstructorChaining;

public class Mobile {


    //2.Declare instance variables brand, price, and ram.

             String brand;
             double price;
             int ram;



             /* 3.Create four overloaded constructors:

       *)Default constructor
      *)Constructor with brand
      *)Constructor with brand and price
      *)Constructor with brand, price, and RAM*/


    public Mobile()
    {
        this("samsung");

    }

    public Mobile(String brand)
    {

        this(brand,25000);
        //System.out.println("Brand : "+brand);

    }

    public  Mobile (String brand,double price)
    {
         this(brand,price,8);
       // System.out.println("price : "+price);

    }

    public  Mobile (String brand,double price,int ram)
    {

        System.out.println("Mobile Registration start");
         // this.brand=brand;
          //this.price=price;
         // this.ram=ram;

          System.out.println("Mobile Details");
          System.out.println("Brand : "+brand);
          System.out.println("Price : "+price);
          System.out.println("Ram : "+ram);
    }


    public static void main(String[] args) {

        Mobile obj=new Mobile();

    }














}
