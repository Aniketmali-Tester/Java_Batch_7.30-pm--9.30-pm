package VariableTypes;

public class InstanceVariables {


    String Bikemodel="FZ";
    String Bikecompany="Yamaha";
    String colour="grey";
    int mileage=50;
    double price=150000;
    boolean Avaible=true;

    public static void main(String[] args) {

         InstanceVariables Iv=new InstanceVariables();
        System.out.println(Iv.Bikemodel);
        System.out.println(Iv.Bikecompany);
        System.out.println(Iv.colour);
        System.out.println(Iv.mileage);
        System.out.println(Iv.price);
        System.out.println(Iv.Avaible);


    }


}





class exceuteclass
{
    public static void main(String[] args) {

        InstanceVariables Iv=new InstanceVariables();
        System.out.println(Iv.Bikemodel);
        System.out.println(Iv.Bikecompany);
        System.out.println(Iv.colour);
        System.out.println(Iv.mileage);
        System.out.println(Iv.price);
        System.out.println(Iv.Avaible);


    }
}


