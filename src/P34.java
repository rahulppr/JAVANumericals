
import java.util.Scanner;

public class P34 {
    public static void main(String[] args) {

        // Check arrays are equal or Not?
        // Based on user input of size of array and elements

        System.out.println("Enter the size of elements in Array1");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a1 = new int[n];
        System.out.println("Enter the elements in Array1");
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            a1[i] = m;
        }

        System.out.println("Enter the size of elements in Array2");
        int n1 = sc.nextInt();
        int[] a2 = new int[n1];
        System.out.println("Enter the elements in Array2");
        for (int i = 0; i < n1; i++) {
            int p = sc.nextInt();
            a2[i] = p;
        }

        if (a1.length==a2.length) {
            System.out.println("Arrays length are equal");
        } else {
            System.out.println("Arrays length are not equal");
        }

        //To check the elements are equal or not in both the array

        for(int i=0;i<a1.length;i++) {
            if (a1[i] == a2[i]) {
                System.out.println("Elements are same in both arrays");
                break;
            }
            else
            {
                System.out.println("Elements are not same in both arrays");
                break;
            }
        }

    }
}
