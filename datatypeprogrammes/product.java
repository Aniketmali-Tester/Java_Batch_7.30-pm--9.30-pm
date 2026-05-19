package datatypeprogrammes;

public class product {


    public static void main(String[] args) {


        //Five products
        //Add five products
        //Apply 10% discount

        //Five products

        double firstproduct = 24000.56;
        double secondproduct = 24530.56;
        double thirdproduct = 25000.56;
        double fourthproduct = 26000.56;
        double fifthproduct = 24000.56;

        //Add five products
        double amount = firstproduct + secondproduct + thirdproduct + fourthproduct + fifthproduct;
        System.out.println("The Total amount is : " + amount);

        //Apply 10% discount
        double Totalamount = amount - amount * 0.1;
        System.out.println("After 10% discount amount is : " + Totalamount);


    }

}
