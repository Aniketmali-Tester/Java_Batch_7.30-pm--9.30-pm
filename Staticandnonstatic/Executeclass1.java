package Staticandnonstatic;

public class Executeclass1 {


    public static void main(String[] args) {

        NonStatic n=new NonStatic();
        n.mobilename();
        n.price();
        n.colour();
        n.ram();
        n.Processor();


        System.out.println("==============================================");


        //Call Non -static data members
        System.out.println("The mobile name is : "+n.mobilename);
        System.out.println("The mobile price is : "+n.price);
        System.out.println("The mobile processor is : "+n.Processor);
        System.out.println("The mobile color is : "+n.colour);
        System.out.println("The mobile ram is : "+n.ram);





    }
}
