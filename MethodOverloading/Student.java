package MethodOverloading;

public class Student {

    String Studentname="Kumar";
    int StudentRollno=25;



    //Method Overload1
    void searchStudent(String name)
    {

        if(name.equalsIgnoreCase(Studentname))
        {
            System.out.println("Student name : "+Studentname);
            System.out.println("Student roll no : "+StudentRollno);
        }

        else
        {
            System.out.println("Invalid choice ");


        }
    }

    //Method Overload2

    void searchStudent(int rollno)
    {

        if(rollno==StudentRollno)
        {

            System.out.println("Student name : "+Studentname);
            System.out.println("Student roll no : "+StudentRollno);

        }
        else {

            System.out.println("Invalid choice");
        }
    }










}
