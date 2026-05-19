package ControlStatements;

public class continu



{

    public static void main(String[] args) {


        int i=1;


        while (i<=5)
        {

            switch (i)
            {
                case 1:
                    i++;
                    continue;

                default:
                    System.out.println(i);
            }
        }

    }
}
