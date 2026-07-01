package MapInterface;

import Interface.MainFlightServiceProvider;

import java.util.HashMap;
import java.util.Map;

public class Employee {


    public static void main(String[] args) {


        //Create Map
        Map<Integer,String> Employees=new HashMap<>();


        //Add Employee records

        Employees.put(101,"Rahul");
        Employees.put(102,"Santhosh");
        Employees.put(103,"Rajesh");
        Employees.put(104,"Kishore");
        Employees.put(104,"Akash");
        Employees.put(105,"Rahul");


        //Display all Employees
        System.out.println(Employees);

        //check key
        System.out.println("Contains Key :  "+Employees.containsKey(103));//true


        //Get Employee by id
        System.out.println("Get by emp id : "+Employees.get(102));

        //check value
        System.out.println("check value exist : "+Employees.containsValue("Akash"));


        //check all the keys
        System.out.println("Check all the keys : "+Employees.keySet());

        //check all the Values
        System.out.println("Check all the values : "+Employees.values());


        //Get all Keys and values
        //System.out.println("Display key and value pair :  "+Employees.keySet());

      for(Map.Entry<Integer,String> entry:Employees.entrySet())
      {
          System.out.println("Emplyee id && employeeName : "+entry.getKey()+"  "+entry.getValue());
         // System.out.println("Employee name : "+);
      }

      //for(String a:data)
     // {
          //System.out.println(a);
      //}







    }
}
