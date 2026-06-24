package Abstraction;

public class MainClass {


    public static void main(String[] args) {

        //Create Reference of Interface and create object of class


        Switch obj;


               obj=new Tv();
               obj.SwitchOn();
               obj.SwitchOff();


               System.out.println("-------------------------------------");


               obj=new Ac();
               obj.SwitchOn();
               obj.SwitchOff();


    }
}
