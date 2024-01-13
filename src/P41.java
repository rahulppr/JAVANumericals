import java.util.Scanner;

public class P41 {
        public static void main(String[] args) {

            //Binary Search

            int[] L = {1,2,3,4,5,6,7,8};

            System.out.print("ENTER TARGET: ");
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();

            int start = 0;
            int end = L.length - 1;

            while (start < end){

                int mid = (start + end) / 2;

                if (L[mid] == n){
                    System.out.println("Found: " + L[mid]);
                    break;
                } else if (L[mid] < n){
                    start = mid + 1;
                } else if (L[mid] > n){
                    end = mid - 1;
                }
            }

            if (n < L[start] || n > L[end]){
                System.out.println("Not found in array.");
            }
            scan.close();
        }
    }

