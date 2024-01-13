import java.util.Scanner;

public class P45 {
    public static void main(String[] args) {

        //How to count words in a String
        System.out.println("Enter the words to count ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count=1;

        for(int i=0;i<s.length()-1;i++){
            if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')){
                count = count+1;
            }

        }
        System.out.println("The no. of words in a sentence is "+count);
    }
}
