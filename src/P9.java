import java.math.BigInteger;
import java.util.Scanner;

public class P9 {

    //Sum of two BigInt number
    public static void main(String[] args) {
        String number1,number2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        number1 = sc.nextLine();
        System.out.println("Enter 2nd number");
        number2 = sc.nextLine();

        BigInteger first = new BigInteger(number1);
        BigInteger second = new BigInteger(number2);
        BigInteger sum;

        sum = first.add(second);
        System.out.println("The sum of two large no. is "+sum );

    }
}



