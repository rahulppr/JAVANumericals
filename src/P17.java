import java.util.Scanner;

public class P17 {

    //How to compare the two strings lexicographically
    public static void main(String[] args) {
        String s1,s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        s1 = sc.nextLine();
        System.out.println("Enter the second string");
        s2 = sc.nextLine();
        if(s1.compareTo(s2)>0){
            System.out.println("s1 is greater than s2");
        } else if (s1.compareTo(s2)<0) {
            System.out.println("s2 is greater than s1");
        } else {
            System.out.println("Both are equal ");
        }

    }
}
