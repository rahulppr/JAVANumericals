import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
    int x,y,temp;
        System.out.println("Enter the value of x and y ");
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("Before Swapping the value of x is " +x +" for y is " +y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("After swapping the value of x is " +x + " for y is "+y );

    }
}
