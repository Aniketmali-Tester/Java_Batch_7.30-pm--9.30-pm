package Interface;

public class MainInsuranceclass {


    public static void main(String[] args) {



     Insurance obj;


     obj=new LifeInsurance();//Upcasting
     obj.calculatepremium();

     obj=new HealthInsurance();
     obj.calculatepremium();



      //  Insuranceclass obj=new Insuranceclass();
      //  obj.calculatepremium();



}

}
