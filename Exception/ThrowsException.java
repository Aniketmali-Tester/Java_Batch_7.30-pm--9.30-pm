package Exception;

public class ThrowsException {



    public static void bookingticket(int avaiseats,int requiredseats) throws Exception
    {
        if(requiredseats>avaiseats)
        {
            throw new Exception("Seats are not availabel");

        }

        else
        {

            System.out.println("Ticket Booked Succefully");
            System.out.println("Booked Seats : "+requiredseats);
            System.out.println("Remaining seats : "+(avaiseats-requiredseats));
        }

    }


    public static void main(String[] args)  {

        try{
            bookingticket(5,7);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }




}
