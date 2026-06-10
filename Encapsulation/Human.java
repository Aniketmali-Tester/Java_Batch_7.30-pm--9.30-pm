package Encapsulation;

public class Human {


    //Variables
    private String name;
    private int age=25;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


//getter Method

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   /* public String  getname()
    {
        return name;
    }

    public int  getage()
    {
        return age;
    }


    //Setter Method

    public void setName(String name)
    {
        this.name=name;
    }


    public void setage(int age)
    {

        this.age=age;
    }*/










    /*String Name="Navin";
    int Age=25;


    void display()
    {


        System.out.println("Private name variable :  "+name);
        System.out.println("Private age  variable :  "+age);
        System.out.println("===============================");

        System.out.println("instance name  variable : "+Name);
        System.out.println("Instance  age variable :  "+Age);



    }*/


   public  static void main(String[] args) {

        Human obj=new Human();
       System.out.println(obj.name);
       System.out.println(obj.age);

       // String name=obj.getname();
       // int  age =obj.getage();



       // System.out.println("Name : "+name );
       //System.out.println("Age  : "+age );



    }






}
