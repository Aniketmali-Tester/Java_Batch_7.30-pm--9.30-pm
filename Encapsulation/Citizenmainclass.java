package Encapsulation;

public class Citizenmainclass {


    public static void main(String[] args) {


        Citizen obj=new Citizen();
        obj.SetCitizenname("Varun");
        obj.Setadharno(23456789023456L);


        System.out.println("Citizen number : "+obj.getcitizenname());
        System.out.println("Adharcard no : "+ obj.getAdharcardno());
    }
}
