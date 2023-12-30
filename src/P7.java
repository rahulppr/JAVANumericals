import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        //Swapping of two numbers without using the 3rd variable

        int x,y;
        System.out.println("Enter the value of x and y");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("Before swapping \nx is "+x+" \ny is "+y+" " );
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping \nx is "+x+" \ny is "+y+"");

    }
}

