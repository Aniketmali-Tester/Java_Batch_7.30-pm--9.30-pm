package Unaryoperator;

public class Unaryoperator2 {


    public static void main(String[] args)
    {


        int p=10;
        int q;


        q=++p + p;

        System.out.println("The First Time Q value is : "+q);//22

        q=++p + p++;

        System.out.println("The Second  Time Q value is : "+q);//24
        System.out.println("The p value is : "+p);


        //1+13 + 14+1 + 1-15 + 14
        //14+14+14+14
        q=++p + p++ + --p + p;
        System.out.println("The Third  Time Q value is : "+q);//57


      if(--p<5)
      {

          p--;
          q++;
          System.out.println("The Final  Q value is : "+q);//57
          System.out.println("The final   p value is : "+p);//57




      }
      else {

          p++;
          q--;

          System.out.println("The Final1  Q value is : "+q);//55
          System.out.println("The final2   p value is : "+p);//14
      }

    }




}

