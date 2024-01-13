import java.util.Scanner;

public class P39 {
    public static void main(String[] args) {

  //Searching element in array (Linear Search)

        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the elements in Number");
        int [] a = new int[n];

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        boolean flag = false;

        System.out.println("Enter the targeted element");
         int target_element = sc.nextInt();
         for (int i=0;i<a.length;i++){
             if(target_element==a[i]){
                 System.out.println("Element found at "+i+" position");
                 flag=true;
                 break;
             }
         }
        if(!flag){
            System.out.println("Element Not found");
        }
    }
}

