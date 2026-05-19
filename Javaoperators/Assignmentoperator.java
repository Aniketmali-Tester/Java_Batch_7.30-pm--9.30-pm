package Javaoperators;

public class Assignmentoperator {

    public static void main(String[] args)
    {

        //= ((Assign value))
        int a=10;
        int b=20;

        System.out.println("The value is  a +b: "+(a+b));//30


        //+= ((Assign value and also add a value))
        a=a+5;
        System.out.println("The value is a after 5 add : "+(a=a+5));//20

        a+=5;
        System.out.println("The value is a after 5 add : "+a);//25


        //-= ((Assign value and also sub a value))
        b=b-5;
        System.out.println("The value is b after 5 sub : "+b);//15
        b-=5;
        System.out.println("The value is b after 5 sub: "+b);//10


        //*= ((Assign value and also mul a value))
        a=a*3;
        System.out.println("The value is a mul with 3 : "+a);//75

        b*=4;
        System.out.println("The value is b mul with 3 : "+b);//40


        // /= ((Assign value and also Division a value))
       a= a/8;
        System.out.println("The value is a div with 8 : "+a);//9

        b/=6;
        System.out.println("The value is b div with 6 : "+b);//6

        // %= ((Assign value and also modulus a value))
        a=a%4;
        System.out.println("The value is a mod with 4 : "+a);//1

        b%=2;
        System.out.println("The value is a mod with 2 : "+a);//1






    }


}
