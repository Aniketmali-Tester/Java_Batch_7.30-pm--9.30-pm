package ControlStatements;

public class Nestedifelse1 {

    public static void main(String[] args)
    {
        String name="Aniket";
        String password="12345";

        if(name.equals("Aniket3"))
        {

            if(password.equals("123435"))
            {

                System.out.println("Login Succesfully");
            }
            else
            {
                System.out.println("Invalid Password");

            }
        }
        else
        {
            System.out.println("Please provide valid username");
        }
    }




}
