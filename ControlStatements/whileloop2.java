package ControlStatements;

public class whileloop2 {

   //write a  java progr to deduct 1000 rs repeatly until become it 0.


    public static void main(String[] args) {

        int balance=1000;

        while (balance>=0)
        {

            System.out.println("The Amount balance is :" +balance);
            //balance-=100;
            balance=balance-100;
        }

        System.out.println("Amount finished");


    }
}
