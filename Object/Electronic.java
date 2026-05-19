package Object;

public class Electronic {


   static  String Companyname;
    static String Os;
   static  int memory;
   static  String colour;
   static  double price;



    void laptop1(String cn,String OS,int storage,String Colour,double price)

    {

        Companyname=cn;
        String Os=OS;
        memory=storage;
        colour=Colour;
        price=price;

        System.out.println("Welocome to HP  Laptop");
        System.out.println("This laptop company name is :"+Companyname);
        System.out.println("The Operating system ;"+Os);
        System.out.println("The storage is :"+memory);
        System.out.println("This Laptop colour is : "+colour);
        System.out.println("This laptop price "+price);

        System.out.println("======================================================");
    }


    void laptop2(String cn,String OS,int storage,String Colour,double price)

    {


        Companyname=cn;
        String Os=OS;
        memory=storage;
        colour=Colour;
        price=price;

        System.out.println("Welocome to Lenovo  Laptop");
        System.out.println("This laptop company name is :"+Companyname);
        System.out.println("The Operating system ;"+Os);
        System.out.println("The storage is :"+memory);
        System.out.println("This Laptop colour is : "+colour);
        System.out.println("This laptop price "+price);

        System.out.println("======================================================");


    }


    void laptop3(String cn,String OS,int storage,String Colour,double price)

    {


        Companyname=cn;
        String Os=OS;
        memory=storage;
        colour=Colour;
        price=price;

        System.out.println("Welocome to mac  Laptop");
        System.out.println("This laptop company name is :"+Companyname);
        System.out.println("The Operating system ;"+Os);
        System.out.println("The storage is :"+memory);
        System.out.println("This Laptop colour is : "+colour);
        System.out.println("This laptop price "+price);

        System.out.println("======================================================");


    }

    void laptop4(String cn,String OS,int storage,String Colour,double price)

    {


        Companyname=cn;
        String Os=OS;
        memory=storage;
        colour=Colour;
        price=price;

        System.out.println("Welocome to vivo  Laptop");
        System.out.println("This laptop company name is :"+Companyname);
        System.out.println("The Operating system ;"+Os);
        System.out.println("The storage is :"+memory);
        System.out.println("This Laptop colour is : "+colour);
        System.out.println("This laptop price "+price);

        System.out.println("======================================================");


    }

    public void Samasungmobile(String name,String colour)
    {

        Companyname=name;
        colour=colour;

        System.out.println("The Mobile name is :"+Companyname);
        System.out.println("The Mobile name is :"+colour);
        System.out.println("======================================================");

    }

    public void Vivomobile(String name,String colour)
    {

        Companyname=name;
        colour=colour;

        System.out.println("The Mobile name is :"+Companyname);
        System.out.println("The Mobile name is :"+colour);
        System.out.println("======================================================");

    }


    public void oppomobile(String name,String colour)
    {

        Companyname=name;
        colour=colour;

        System.out.println("The Mobile name is :"+Companyname);
        System.out.println("The Mobile name is :"+colour);

    }




    public static void main(String[] args) {

        Electronic Laptop=new Electronic();
        Laptop.laptop1("hp","windows",16,"silver",80000);
        Laptop.laptop2("lenovo","window",32,"metallic black",56000);
        Laptop.laptop3("apple","mac",1,"white",150000);
        Laptop.laptop4("vivo","windows",16,"grey",45000);

        Electronic Mobilephone=new Electronic();
        Mobilephone.Samasungmobile("Samaung","Black");
        Mobilephone.oppomobile("Oppo","White");
        Mobilephone.Vivomobile("Vivo","Grey");






    }



}
