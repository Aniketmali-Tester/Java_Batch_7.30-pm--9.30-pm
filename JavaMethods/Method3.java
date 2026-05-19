package JavaMethods;

public class Method3 {


    public static void main(String[] args)
    {

        System.out.println("This method  --");
        System.out.println("not println");
        add();


    }



    public static void add()
    {

        int a=10;
        int b=20;

        System.out.println("The Addtional value is : " +(a+b));
        sub();
    }

    public static void sub()
    {

        int a=10;
        int b=20;

        System.out.println("The Subraction value is : " +(a-b));
        div();
    }


    public static void div()
    {

        int a=10;
        int b=20;

        System.out.println("The Multiplication value is : " +a*b);
    }




}
