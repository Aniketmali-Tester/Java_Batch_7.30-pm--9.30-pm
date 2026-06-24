package Array;

public class OneDimensionalArray1 {


    public static void main(String[] args) {

        //1-d array declare

        String []  product=new String [4];

        product[0]="Mobile";
        product[1]="Laptop";
        product[2]="Macbook";
        product[3]="Fan";

        System.out.println(product[2]);

        System.out.println(product.length);


        for(int i=0;i<= product.length;i++)
        {

            System.out.println(product[i]);
        }











    }
}
