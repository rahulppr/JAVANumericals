import java.util.Scanner;

public class P18 {
    public static void main(String[] args) {

        int n,rows,noOfStars;
        System.out.println("Enter the no. of rows");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (rows=1;rows<=n;rows++){
            for (noOfStars=1;noOfStars<=rows;noOfStars++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}



