import java.util.Scanner;

public class P33 {
    public static void main(String[] args) {

        //Find an Even Odd from Array

        System.out.println("Enter the no. of elements in array");
        Scanner sc = new Scanner(System.in);
        int odd_count = 0;
        int even_count = 0;
        int n = sc.nextInt();
        int [] a = new int[n];
        System.out.println("Enter the elements in array");
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        for(int i=0;i<a.length;i++){
           if(a[i]%2 ==0){
               even_count++;
              // System.out.println("Even no. is "+a[i]);
           }

            if(a[i]%2 !=0){
                odd_count++;
               // System.out.println("Odd no. is "+a[i]);
            }
        }
        System.out.println("Odd count is "+odd_count);
        System.out.println("Even count is "+even_count);
    }
}
