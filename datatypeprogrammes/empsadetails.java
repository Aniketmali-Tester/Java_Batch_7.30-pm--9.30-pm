package datatypeprogrammes;

public class empsadetails {


    public void main (String[] args)
    {

        //Write a program to store employee name,basic salary and pf amount.
        //calculate net employeesalary.
        //After calculation increment basic salary by 15% and finally employee salary with and without Incrementation


             //decleration
                  String employeName;
                  double basicSalary;
                  double PfAmount;

              //intilization
                employeName="Aniket";
                basicSalary=27000.95;
                PfAmount=2450;

                //Calculate net employeesalary
                 double netslary = basicSalary - PfAmount;


              //After calculation increment basic salary by 15% and finally employee salary
               // with and without Incrementation


              double IncBasicsal = basicSalary*0.15;
              double finalSal=  basicSalary+IncBasicsal;


              System.out.println("The basic salary : " +basicSalary);
              System.out.println("The net salary  : " +netslary);
              System.out.println("After 15% increment basicsalary : "+IncBasicsal);
              System.out.println("The final salary of the employee is : "+finalSal);


    }




}
