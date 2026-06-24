package StringFunctions;

public class StringComparsion {


    public static void main(String[] args) {

        //Without Using New Operator to assign a value
        String str1="Java";
        String Str2="SQL";


        //With using new Operator to pass a value
        String s1=new String("Java");
        String s2=new String("J2ee");
        String s3=new String ("Java");
        String s4=new String ("Sql");


        System.out.println(str1==s1);//False
        System.out.println(Str2==str1);//False

        System.out.println(Str2.equals(s4));//false

        System.out.println(Str2.equalsIgnoreCase(s4));//True


    }
}
