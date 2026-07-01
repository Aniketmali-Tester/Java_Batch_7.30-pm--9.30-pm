package Quene;

import java.util.LinkedList;
import java.util.Queue;

public class Queneclass {

    public static void main(String[] args) {

        //create Queue
        Queue<String> orders=new LinkedList<>();

        //Add orders
        orders.offer("Order:101");
        orders.offer("Order:102");
        orders.offer("Order:103");
        orders.offer("Order:104");
        orders.offer("Order:105");


        //Display Orders
        for (String order:orders)
        {
            System.out.println(order);
        }


        //process first order
        System.out.println("First order: "+orders.poll());

        //Display Next order
        System.out.println("Next order : "+orders.peek());

        System.out.println(orders.poll());


        System.out.println(orders);

        //check order
        System.out.println("Check odrer 103 Available"+orders.contains("Order:103"));

        //queue size
        System.out.println("Pending order : "+orders.size());

        //Display Remaining order
        //Display Orders
        for (String order:orders)
        {
            System.out.println(order);
        }

        //clear queue
        orders.clear();
        System.out.println("Cleared");

        System.out.println("Check queue is empty : "+orders.isEmpty());


        System.out.println("Peek : "+orders.peek());
        //System.out.println("Element : "+orders.element());
        System.out.println("Poll : "+orders.poll());
        System.out.println("Remove : "+orders.remove());





    }
}
