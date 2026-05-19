package SingleInheritance;

public class Employee {

    /* A company has a general employee class.A developer is also an employee but has additional
        Features like programming

       Question:
       1.Write a java program using single inheritance .
        where::
        ==>Employee contains employee details Developer inherits from Employee Display both
        developer details??

        */

     int empid=101;
     String name="Arun";


    //Non-static method
    void dispalyEmployee()
    {
        System.out.print("Emplyee Id :"+empid);
        System.out.println("Emp Name : "+name);
    }



}
