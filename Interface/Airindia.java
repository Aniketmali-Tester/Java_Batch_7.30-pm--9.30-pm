package Interface;

public class Airindia implements Goibgo {



    @Override
    public void getserviceinfo() {


        System.out.println("Welcome to AirIndia Service");

    }

    @Override
    public void calculateamount(int qty) {


        double ticketprice=2500;
        double amount=ticketprice*qty;
        System.out.println("Your Total Amount is : "+amount);



    }
}
