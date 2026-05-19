package HieararchicalInheritance;

public class LoanAccount extends Bank{


    void CheckLoanEligibilty(int sal)
    {
        System.out.println("Loan Account");

        if(sal>=100000)
        {

            System.out.println("Loan Eligible");
        }

        else {

            System.out.println("Loan  Not Eligible");

        }
    }





}
