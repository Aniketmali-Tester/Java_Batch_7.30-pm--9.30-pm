package JavaMethods;

public class Method5 {


    //double d1=25.6;

    //Internal Method
    public static void main(String[] args)
    {


        System.out.println("This is method");
        add(23.5,24.5,26.5);
        name("sathish","raj","Aafiya");
    }

    //External Method
    public static void add(double d1,double d2,double d3)
    {

        System.out.println("The value is"+(d1+d2+d3));
    }

    //External Method
    public static  void name(String s1,String s2,String s3)
    {

        System.out.print("The name is "+s1+s2+s3);
    }









}
