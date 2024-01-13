import java.util.Scanner;

public class P30 {
    public static void main(String[] args) {

        //To check Prime or not

        //2468 - i/p
        //35711 - o/p


        System.out.println("Enter the no. to check for prime");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        if(num>1){
            for(int i=2;i<=num;i++){
                if((num%i) == 0){
                  count++ ;
                }
            }
        }


        if(count==2){
            System.out.println(" Not a Prime No.");
        } else{
            System.out.println(" Prime No.");
        }
    }
}

