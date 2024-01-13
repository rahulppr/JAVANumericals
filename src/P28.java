import java.util.Scanner;

public class P28 {
    public static void main(String[] args) {
        //Check largest no. by using ternary operator

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no.");
        int a = sc.nextInt();
        System.out.println("Enter second no.");
        int b = sc.nextInt();
        System.out.println("Enter third no.");
        int c = sc.nextInt();


        int largest = c>(a>b?a:b)?c:(a>b?a:b);

        System.out.println("the largest no. is "+largest);

    }
}
