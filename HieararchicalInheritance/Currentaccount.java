package HieararchicalInheritance;

public class Currentaccount extends Bank{



    void Checkoverdraft(boolean status)

    {

        System.out.println("Current Account");

        if(status==true)
        {


            System.out.println("overdraft facility Available");
        }

        else
        {

            System.out.println("Overdraft Facility  not Available");
        }
    }



}
