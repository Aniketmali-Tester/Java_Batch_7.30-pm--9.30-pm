package HieararchicalInheritance;

public class SavingAccount extends Bank {



    void Checkbalance(int balance)
    {

        System.out.println("Saving Account");

        if(balance>=3000)
        {

            System.out.println("Minimum balance is maintained");
        }

        else {

            System.out.println("Minimum balance is not maintained");

        }
    }




}
