package Collection;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {


    public static void main(String[] args) {


      /*  ArrayList data=new ArrayList<>();
        data.add("Java");
        data.add(101);
        data.add(50.5);
        data.add(true);

        System.out.println(data);*/

        /*List <Integer> value=new ArrayList<>();
        value.add("java");
        value.add(10);*/


        ArrayList<String> Employee=new ArrayList<>();

        //add()
        Employee.add("Rohit");
        Employee.add("Suraj");
        Employee.add("Kunal");
        Employee.add("Praveen");

        System.out.println("Add : "+Employee);

        //add(int index,object)
        Employee.add(4,"Rohan");
        System.out.println("add Specific position : "+Employee);

        //remove
        Employee.remove("Rohan");
        System.out.println("Remove : "+Employee);

        //remove(int index)
        Employee.remove(3);
        System.out.println("Remove Specific Position : "+Employee);


        //Set(int index,object)
        Employee.set(1,"Rahul");
        System.out.println("After set value : "+Employee);


        //get()
        System.out.println(Employee.get(2));

        //size()
        System.out.println("Size of Arraylist : "+Employee.size());

       //isEmpty
        System.out.println("is Empty :"+Employee.isEmpty());


        ArrayList <String> newEmployee=new ArrayList<>();
        newEmployee.add("Anwar");
        newEmployee.add("Mahesh");
        newEmployee.add("Dinesh");


        System.out.println("New Employee : "+newEmployee);

        //addall()
        Employee.addAll(newEmployee);

        System.out.println("After Add all : "+Employee);


        //contains()
        System.out.println("Contains  : "+Employee.contains("Kunal"));

        //containsall()
        System.out.println("Contains all : "+Employee.containsAll(newEmployee));

        //removeall
        Employee.removeAll(newEmployee);
        System.out.println("After Remove newemployee : "+Employee);


        //isclear
        Employee.clear();
        System.out.println("After Clear : "+Employee.isEmpty());
    }
}
