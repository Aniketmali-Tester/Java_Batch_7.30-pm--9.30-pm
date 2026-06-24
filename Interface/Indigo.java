package Interface;

public class Indigo implements Goibgo {
    @Override
    public void getserviceinfo() {
        System.out.println("Welcome to IndigoService");
    }

    @Override
    public void calculateamount(int qty) {


            double price=3000;
            double ticketcost=qty*price;
        System.out.println("Your Total Amount is : "+ticketcost);

    }
}
