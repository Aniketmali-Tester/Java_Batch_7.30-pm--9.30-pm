package Array;

public class TwodimensionalArray {


   public  static void main(String[] args) {


       int [] [] numbers=new int[3][2];

       numbers[0][0]=55;
       numbers[0][1]=60;
       numbers[1][0]=65;
       numbers[1][1]=75;
       numbers[2][0]=80;
       numbers[2][1]=85;

       System.out.println("The EmpidArray lenght is : "+numbers.length);//3


       for(int i=0;i< numbers.length;i++)
       {
                        //1
           for(int j=0;j<numbers[i].length;j++)
           {

               System.out.print(numbers[i][j]+" ");
           }

           System.out.println();
       }




    }
}
