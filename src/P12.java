import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
//If-else

        int obtainedMarks,passingMarks;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the passing marks");
        passingMarks = sc.nextInt();
        System.out.println("Enter the Obtained marks");
        obtainedMarks = sc.nextInt();
        if(obtainedMarks>=passingMarks){
            System.out.println("You passed the Exam");
        }else{
            System.out.println("You failed the exam");
        }
    }
}
