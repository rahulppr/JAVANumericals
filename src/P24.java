import java.util.Scanner;

public class P24 {
    public static void main(String[] args) {

        System.out.println("Enter the word to check");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int strl = str.length();
        String rev = "";

        //Concatenation method
//        for (int i = strl - 1; i >= 0; i--) {
//            rev = rev + str.charAt(i);
//        }
//        System.out.println("The rev word is " + rev);


        //Array method
        char a[] = str.toCharArray();
        int len = a.length;
        int j;
        for (j = len - 1; j>=0;j--){
         rev = rev + a[j];
        }
        System.out.println("rev word is " +rev);
    }


}
