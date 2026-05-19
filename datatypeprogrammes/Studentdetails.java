package datatypeprogrammes;

public class Studentdetails {

    public static void main(String[] args)
    {
        //Write a program to store your name, age, and marks and display them.

        String name="Aniket";
        int age =22;
        int tam=80;
        int eng=75;
        int math=100;
        int sci=85;
        int soc=50;

        int totalmarks=tam+eng+math+sci+soc;
        float percentage=totalmarks/5;

        System.out.println("The name of the Student is \t:"+name);
        System.out.println("The age is \t:"+age);
        System.out.println("The totalmarks is \t"+totalmarks);
        System.out.println("The percentage is \t"+percentage);

    }
}
