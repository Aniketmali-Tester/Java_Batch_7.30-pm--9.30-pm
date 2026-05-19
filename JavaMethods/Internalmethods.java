package JavaMethods;

public class Internalmethods {

    static void demo()
    {

        System.out.println("This External Method");
    }




    //Internal Method
    public static void main(String[] args)
    {
        System.out.println("This main method");
         demo();
         demo();
         demo();
    }



}
