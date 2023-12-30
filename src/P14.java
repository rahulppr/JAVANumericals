import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. to check even or not?");
        n = sc.nextInt();
        if (n%2==0){
            System.out.println("The no. is even");
        } else {
            System.out.println("Odd no.");
        }
    }
}
