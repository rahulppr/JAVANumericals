import java.util.Scanner;

public class P25 {
    public static void main(String[] args) {

        //The no. of digits to count

        System.out.println("Enter the digit to count");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count=0;

        while(num>0){
            num = num/10;
            count++;
        }
        System.out.println("The no. of  digit is " + count);

    }
}


