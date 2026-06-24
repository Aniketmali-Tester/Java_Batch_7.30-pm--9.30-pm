package Array;

public class TwoDimensionalArray1 {


    public static void main(String[] args) {


        int [] [] values=new int[3][2];

        values [0][0]=10;
        values [0][1]=11;

        values [1][0]=12;
        values [1][1]=13;

        values [2][0]=14;
        values [2][1]=15;

      //*  System.out.println(values[2][1]);

      //*  System.out.println("Array length is : "+values.length);//3

                     //0<=3
        for(int i=0;i< values.length;i++)
        {
                         //0<=2;i++
            for(int j=0;j<values[i].length;j++)
            {
                     System.out.print(values[i][j]+" ");//10 ,11


            }
            System.out.println();
        }

    }


    int [] [] value1={
            {10,20,30},
            {20,30,40},
            {50,60,70}
    };
}
