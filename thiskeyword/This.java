package thiskeyword;

public class This {



    String name;
    int age;
    String Des;
    double sal;



    public  void details(String name,int age,String Des,double sal){

      this. name=name;
      this. age=age;
       this.Des=Des;
        this.sal=sal;


      /* System.out.println("name : "+name);
        System.out.println("age" +age);
        System.out.println("Des : "+Des);
        System.out.println("sal : "+sal);*/

    }


    public static void main(String[] args) {


      //details("Arun",27,"Tester",55000);

        This t=new This();
        t.details("Arun",27,"Tester",55000);
        System.out.println("name : "+t.name);
        System.out.println("age" +t.age);
        System.out.println("Des : "+t.Des);
        System.out.println("sal : "+t.sal);
    }

    }






