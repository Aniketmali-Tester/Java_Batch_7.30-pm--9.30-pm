package HieararchicalInheritance;

public class MainBankclass {


    static void main(String[] args) {


        SavingAccount s=new SavingAccount();
        s.Checkbalance(50000);
        s.displaybankinfo();


        System.out.println("======================================================");


        Currentaccount c=new Currentaccount();
        c.Checkoverdraft(false);
       // c.displaybankinfo();

        System.out.println("======================================================");


        LoanAccount l=new LoanAccount();
        l.CheckLoanEligibilty(150000);
    }
}
