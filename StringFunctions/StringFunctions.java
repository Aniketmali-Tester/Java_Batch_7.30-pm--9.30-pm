package StringFunctions;

public class StringFunctions {


    public static void main(String[] args) {


        String Value="      Java Programming language"    ;
        String Value1="JAVA PROGRAMMING";

        //length()
       // System.out.println(Value.length());//16

        //CharAt()

       // System.out.println(Value.charAt(3));//a


        //indexof()
       // System.out.println(Value.indexOf('a'));//10


        //lastidex()
       // System.out.println(Value.lastIndexOf('a'));

       //Contains()
        //System.out.println(Value.contains("r"));//True

        //System.out.println(Value.contains("Programming"));//true


        //Startwith() and Endwith()
       // System.out.println(Value.startsWith("a"));//False

      //  System.out.println(Value.endsWith("g"));//true

         //Substring()
       // System.out.println(Value.substring(5));

       // System.out.println(Value.substring(5,10));

        //touppercase and lowercase()
        //System.out.println(Value.toUpperCase());

        //System.out.println(Value1.toLowerCase());


        //tochararray
        /*char [] charvalue=Value.toCharArray();
        System.out.println(charvalue[5]);


        for(int i=0;i<charvalue.length;i++)
        {
            System.out.print(charvalue[i]);

        }*/


        //SplitFunction()

       /*String [] Array=Value.split(" ");

       System.out.println(Array[2]);*/


        //isempty()

       // System.out.print(Value.isEmpty());


        //Trim()
        //System.out.println("Before Trim: "+Value);

       // System.out.println("After Trim: "+Value.trim());


        //Replace()

        System.out.println("Before Replace : "+Value);

        System.out.println("After Replace : "+Value.replace("Java","Python"));


    }
}
