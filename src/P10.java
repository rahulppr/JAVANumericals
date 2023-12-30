import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        //Find the Largest no.
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of x,y and z");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        if((x>y)&&(x>z)){
            System.out.println("larger is " +x);
        } else if ((y>z)&&(y>x)) {
            System.out.println("Larger is " +y);
        }else {
            System.out.println("z is larger "+z);
        }
    }
}
