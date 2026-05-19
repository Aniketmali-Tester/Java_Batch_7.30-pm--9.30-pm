package VariableTypes;

public class Foodorder {


    //instance variables
    String customername;
    String fooditemname;


    //External Method and non static method and parameterized

    public void placeorder(String name,String item)
    {
               customername=name;
               fooditemname=item;

        System.out.println("The customer name : "+customername);
        System.out.println("The food item name : "+fooditemname);
    }

    public void placeorder1(String name,String item)
    {
        customername=name;
        fooditemname=item;

        System.out.println("The customer name : "+customername);
        System.out.println("The food item name : "+fooditemname);
    }


    //Main method
    public static void main(String[] args) {

        Foodorder f=new Foodorder();
        f.placeorder("Ravi","piza");
        f.placeorder1("Ramu","cake");
    }



}
