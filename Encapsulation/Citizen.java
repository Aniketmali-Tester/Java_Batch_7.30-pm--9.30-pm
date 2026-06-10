package Encapsulation;

public class Citizen {


    private  String Citizenname;
    private long Adharcardno;



    //Setter method

     public void SetCitizenname(String Citizenname )
     {
         this.Citizenname=Citizenname;


     }


     public void Setadharno(long  Adharcardno)
     {


         this.Adharcardno=Adharcardno;
     }


     //getter method

    public String getcitizenname()
    {

        return Citizenname;
    }


    public long getAdharcardno()
    {
        return  Adharcardno;
    }











}
