package VariableTypes;

public class localvariable {


    int a;
    public void  dispaly()
    {
        a=100;
        System.out.print("The value of a is "+a);
       // return a;

    }

    public static void main(String[] args) {

        localvariable lc=new localvariable();
        //int b=lc.dispaly();
        //lc.dispaly();
        System.out.print("The value of a is "+lc.a);

    }


}
