import java.util.Scanner;

public class P20 {
    public static void main(String[] args) {

        //Enter the no. of Stars based on the columns

        int row,noOfStars;
        int n;
        System.out.println("Enter the columns");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for (row=1;row<=n;row++){
            for (noOfStars=1;noOfStars<=row;noOfStars++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}


