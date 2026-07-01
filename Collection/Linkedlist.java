package Collection;

import java.util.LinkedList;

public class Linkedlist {


    public static void main(String[] args) {

         LinkedList<Integer> value=new LinkedList();
         value.add(10);
         value.add(20);
         value.add(30);
         value.add(40);
         value.add(50);


         //Enhance For Loop

        for(int a:value)
        {
            System.out.println(a);
        }

    }
}
