import java.util.Scanner;

public class P15 {

    //Factorial of a Number
    public static void main(String[] args) {
        System.out.println("Enter the integer for factorial");
        int n, fact =1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n<0){
            System.out.println("Value should not be Non-negative");
        } else {
            for (int i=1;i<=n;i++){
                fact = fact*i;
            }
        }
        System.out.println("the value of "+n+"!="+ " is "+fact);
    }
}



