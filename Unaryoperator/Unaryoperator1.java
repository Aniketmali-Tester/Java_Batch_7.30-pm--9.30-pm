package Unaryoperator;

public class Unaryoperator1 {


    public static void main(String[] args)
    {

        int i=7;
        int j;

        j=i++;
        System.out.println("The First Time J Value Is + :"+j);//7
        System.out.println("The i value is ; "+i);//8

        //8+1 + 1+8
        j=i++ + ++i;
        System.out.println("The Second Time J Value Is + :"+j);//18
        System.out.println("The  second i value is : "+i);//10

        //10+1 + 1+11 + 12
        //10 +12+12
        j=i++ + ++i + i;
        System.out.println("The Third  Time J Value Is + :"+j);//34
        System.out.println("The  Third i value is : "+i);//10


        //12+1 + 1+13 + 14 + 1-14
        //12+14+14+13
        j=i++ + ++i + i + --i;
        System.out.println("The Fourth  Time J Value Is + :"+j);//53
        System.out.println("The Fourth time i value is : "+i);




    }



}
