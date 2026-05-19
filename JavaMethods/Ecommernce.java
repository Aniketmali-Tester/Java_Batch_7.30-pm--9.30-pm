package JavaMethods;

public class Ecommernce {

    //Internal Method
    public static void main(String[] args){

        System.out.println("Create a account");
        register();
        System.out.println("Main method end");

    }

    //External Method

    public static void register()
    {
        //System.out.println("The value is"+(a+b));
        System.out.println("Your Register Complete Succesfully");
        login();
    }


    public static void login()
    {
        System.out.println("Your login Succesfully done");
        homepage();
    }


    public static void homepage()
    {
        System.out.println("Your landed homepage succesfully");
        logout();
    }


    public static void logout()
    {
        System.out.println("logout succesfully");
    }




}
