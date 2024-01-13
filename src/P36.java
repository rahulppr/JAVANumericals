import java.util.Scanner;

public class P36 {
    public static void main(String[] args) {

        //To check the max from array

        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];

        System.out.println("Enter the elements into array");

        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }

        int  max = a[0];

        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
        }

        System.out.println("The max no. from array is "+max);
    }
}
