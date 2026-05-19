package JavaScanner;

public class Scanner2 {



    //Write a program to:
    //calculate area of a circle using a static method
    //print result using a non-static method

    //External method

    public static double calculate(double radius)
    {

        double areavalue = 3.14 * radius * radius;//3.14*r*r;
        return areavalue;
    }

    public void display(double area)
    {

        System.out.println("The Area Value is : "+ area );
    }

   //Main method

    public static void main(String[] args)
    {

        double result = calculate(40);  //calling Static Method

        Scanner2 sc=new Scanner2();      //object creation for non non -static method
        sc.display(result);              //Calling non-static method





    }











}
