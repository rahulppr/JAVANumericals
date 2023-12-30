import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        //Nested if-else

        int obtainedMarks,passingMarks;
        char grade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks");
        passingMarks = 40;
        obtainedMarks = sc.nextInt();
        if(obtainedMarks>=passingMarks){
            if (obtainedMarks>90){
                grade = 'O';
                System.out.println("You passed the exam and your grade is "+grade);
            } else if (obtainedMarks>80) {
                grade = 'E';
                System.out.println("You passed the exam and your grade is "+grade);
            } else if (obtainedMarks>70) {
                grade = 'A';
                System.out.println("You passed the exam and your grade is "+grade);
            } else if (obtainedMarks>60) {
                grade = 'B';
                System.out.println("You passed the exam and your grade is "+grade);
            } else if (obtainedMarks>50) {
                grade = 'C';
                System.out.println("You passed the exam and your grade is "+grade);
            } else  {
                grade = 'D';
                System.out.println("You passed the exam and your grade is "+grade);
            }
        } else {
            grade = 'F';
            System.out.println("You failed the exam "+grade);
        }
    }
}


