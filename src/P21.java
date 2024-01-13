import java.util.Scanner;

public class P21 {
    public static void main(String[] args) {

        int n, reverse = 0;
        System.out.println("Enter the number to reverse");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        while( n != 0 )
        {
         int num = n % 10;
         reverse = reverse * 10 + num;
         n = n/10;
        }
        System.out.println("Reverse of entered number is "+reverse);
    }
}


