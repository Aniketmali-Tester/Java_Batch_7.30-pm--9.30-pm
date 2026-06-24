package Interface;

public class MainFlightServiceProvider {


    public static void main(String[] args) {


        Goibgo provider;


        provider=new Airindia();
        provider.getserviceinfo();
        provider.calculateamount(5);


        System.out.println("=======================================");

        provider=new Indigo();
        provider.getserviceinfo();
        provider.calculateamount(6);





    }
}
