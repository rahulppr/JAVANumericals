import java.util.Objects;
import java.util.Scanner;

public class P37 {
    public static void main(String[] args) {

        //Find the duplicate element from an Array

        //Approach 1
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the elements in String");
        String [] a = new String[n];


        for(int i=0;i<n;i++){
           a[i] = sc.next();
        }

        boolean flag=false;
        for(int i=0;i<a.length;i++){
          for(int j=i+1;j< a.length;j++){
              if((Objects.equals(a[i], a[j]))){
                  System.out.println("Found duplicate element "+a[i]);
                  flag=true;
              }
          }
        }

       if(!flag){
           System.out.println("No duplicate element Found");
       }
    }
}
//(Objects.equals(a[i], a[j]))
//a[i]==a[j]

// String [] a = {"java","C++","Python","javascript","C","java"};