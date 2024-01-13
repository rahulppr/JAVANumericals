import java.util.Scanner;

public class P42 {
    public static void main(String[] args) {

        //How to remove Junk and special characters in a String

        System.out.println("Enter the characters to remove junk");

        Scanner sc = new Scanner(System.in);
        String s3= sc.next();
        String removedjunk = s3.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(removedjunk);



        String s= "@string#$%&()King?/test";

        String s1 = "@#$h#@el*&^lo>:{-#@&%";

        s =  s.replaceAll("[^a-zA-Z0-9]","");

        s1 = s1.replaceAll("[^a-zA-Z0-9]","");
        //System.out.println(s);

        //System.out.println(s1);
    }
}

