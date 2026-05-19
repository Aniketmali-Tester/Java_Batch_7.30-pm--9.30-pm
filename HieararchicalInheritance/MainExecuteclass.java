package HieararchicalInheritance;

public class MainExecuteclass {


    public static void main(String[] args) {



        Mobile m=new Mobile();
        m.mobileInfo("Samsung");
        m.sellproduct(5,25000);

        System.out.println("=================================");


        Laptop l=new Laptop();
        l.laptopinfo("Dell");
        l.sellproduct(5,50000);

        System.out.println("=================================");

        Aircondition A=new Aircondition();
        A.Airconinfo("Voltas");
        A.sellproduct(5,100000);

        System.out.println("=================================");
    }
}
