package Unaryoperator;

public class postIncrement {


    public static void main(String[] args)
    {


        int a=10;


        System.out.println("The a Value is : "+a);//10

        int b=a++;
        System.out.println("The value of A After post Increment : "+a);//11
        System.out.println("The value of b After post Increment : "+b);


        ++a;
        System.out.println("The value of A After pre  Increment : "+a);//12

    }


}
