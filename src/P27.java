import java.util.Scanner;

public class P27 {
    public static void main(String[] args) {
        //The sum of digits in a number


        System.out.println("Enter the number to sum");
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while(num>0){
           sum = sum + num%10;
           num = num/10;
        }
        System.out.println("The sum of the digit to sum is "+sum);

    }
}
