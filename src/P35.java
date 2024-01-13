import java.util.Scanner;

public class P35 {
    public static void main(String[] args) {

        //To check the min from array

        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];

        System.out.println("Enter the elements into array");

        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }

        int  min = a[0];

        for(int i=1;i<a.length;i++){
            if(a[i]<min){
                min = a[i];
            }
        }

        System.out.println("The min. no. from array is "+min);
    }
}
