package JavaMethods;

public class Parameterized {


    public static void main(String args[])
    {

         info();
         persondetails("John",27,"QA tester","Axess",3000.69);

         //object creation
        //Classname var=new Classname
        //var.methodname()

        Parameterized p=new Parameterized();
        p.add();
        p.add1(10,25);

    }


    //External Method + Static Method +Non-Parametrized method
    public static  void info()
    {

        System.out.println("Show the person details");
    }

    //External method + Static Method + Parametrized Method
    public static void persondetails(String username,int age,String designation,String companyname,double sal)
    {
         System.out.println("The person name is : "+username);
        System.out.println("The  person age is : "+age);
        System.out.println("The  person designation is : "+designation);
        System.out.println("The  company name is  : "+companyname);
        System.out.println("The  person sal is : "+sal);


    }

    //External Method + Non Static + Non paramerterized
    public void add()
    {
        int a=89;
        int b=98;

        System.out.println("The additional value is : "+(a+b));
    }



    //External Method +non static Method+ parameterized
    public void add1(int a,int b)
    {
        System.out.println("The additional second value is : "+(a+b));
    }




}
