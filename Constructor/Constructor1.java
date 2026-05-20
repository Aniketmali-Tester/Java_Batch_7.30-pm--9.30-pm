package Constructor;

public class Constructor1 {



    //Declare constructor


    public Constructor1() {
        int age=12;


    }

    //Parameterized constructor
    Constructor1(String name,int age)
    {
        System.out.println("Parameterized Constructor");

        System.out.println("The name is :"+name);
        System.out.println("Age is :"+age);


    }

    Constructor1(int age,String name)
    {
        System.out.println("The name is :"+name);
        System.out.println("Age is :"+age);


    }




    public void info()
    {


        System.out.println("Normal Method");

    }




    public static void main(String[] args) {

        Constructor1 c=new Constructor1("Arun",27);
        System.out.println("==========================================");
        Constructor1 c2=new Constructor1();
        System.out.println("==========================================");
        c.info();
        System.out.println("==========================================");
        //Constructor1 c3=new Constructor1(27,"arun");

    }



}
