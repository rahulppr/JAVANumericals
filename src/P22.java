import java.util.Scanner;

public class P22 {
    public static void main(String[] args) {

        //To check the String is Palindrome or Not

        System.out.println("Enter the word to check");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int strl = str.length();
        String revStr = "";
        for (int i= (strl-1);i>=0;i--){
            revStr = revStr  + str.charAt(i);
        }

        if (str.toLowerCase().equals(revStr.toLowerCase())){
            System.out.println(str + " is a Palindrome String");
        } else{
            System.out.println("Not a Palindrome String");
        }
    }
}


