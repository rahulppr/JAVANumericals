import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        //.How to get  value giving input using Scanner
        //Program in java

        int a;
        float b;
        String s;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        s = sc.nextLine();
        System.out.println("You entered String " + s);

        b = sc.nextFloat();
        System.out.println("You entered Float " + b);

        a = sc.nextInt();
        System.out.println("You entered Integer " +a);

    }
}
