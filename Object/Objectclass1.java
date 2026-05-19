package Object;

public class Objectclass1 {


    public static void main(String[] args) {

        //State
        String Mobilename = "Samsung 731";
        String Mobilecolour = "Grey";
        //String processor = "Snapdargon";
        int ram = 8;
        double price = 25000;
        String model = "2025";

        System.out.println(Mobilename);
        System.out.println(Mobilecolour);
       // System.out.println(processor);
        System.out.println(ram);
        System.out.println(price);
        System.out.println(model);


        Objectclass1 obj=new Objectclass1();
        obj.messaging();
        obj.camera();
        obj.playmusic();

        Objectclass1 obj1=new Objectclass1();
        obj1.messaging();
        obj1.camera();
        obj1.playmusic();





    }
        //behaviour
        void messaging()
        {

            System.out.println("messaging fuctionality");
        }

        void camera()
        {

            System.out.println("The camer pixel is 64mb");
        }

        void playmusic()
        {
            System.out.println("This playmusic");
        }















}
