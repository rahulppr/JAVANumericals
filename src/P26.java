import java.util.Scanner;

public class P26 {
    public static void main(String[] args) {

    //To check the digit count is even or odd in it

        System.out.println("Enter the No to check");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int odd_count=0;
        int even_count = 0;
        while(num>0){
           int rem = num%10;
              num = num/10;
            if(rem%2==0){
                even_count++;
            } else{
                odd_count++;
            }
        }
        System.out.println("The no.of count for even is "+even_count);
        System.out.println("The no.of count for odd is "+odd_count);
    }
}
