import java.util.Scanner;

public class P32 {
    public static void main(String[] args) {

        //Sum of Array based on user input of elements and on no. of elements

        System.out.println("Insert the no. of elements in Array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        System.out.println("Insert all the elements into array");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        int sum=0;
        for(int i=0;i<a.length-1;i++){
            sum = sum + a[i];
        }
        System.out.println("The sum of array is "+ sum);
    }
}

