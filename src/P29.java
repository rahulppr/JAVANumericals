import java.util.Scanner;

public class P29 {
    public static void main(String[] args) {

        //Generate a fibonacci series
        System.out.println("Enter the no. of series you want");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int n1=0;int n2=1 ;int sum=0;
        System.out.print(n1 +" "+n2+" ");
        for (int i=2;i<=n;i++){
            sum = n1+n2;
            System.out.print(sum+" ");
            n1=n2;
            n2=sum;
        }

    }
}
