package AcessModifiers;

public class Privateclass
{


    //private Access Modifiers variables
    private String name ="Arun";
    private  int amount=5000;


    private void showdetails()
    {


        System.out.println(name);
        System.out.println(amount);

    }

    public static void main(String[] args) {

        Privateclass obj=new Privateclass();
        System.out.println(obj.name);
        System.out.println(obj.amount);
        obj.showdetails();

    }




}
