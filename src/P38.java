import java.util.HashSet;
import java.util.Scanner;

public class P38 {
    public static void main(String[] args) {

        //Find the duplicate element from an Array using Hashset

        //String arr[] = {"Java","C","C++","Python","Java"};

        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the elements in String");
        String [] a = new String[n];


        for(int i=0;i<n;i++){
            a[i] = sc.next();
        }
        boolean flag=false;
        HashSet<String> lang = new HashSet();

        for(String l:a)
        {
            if(!lang.add(l)){
                System.out.println("Duplicate element found "+l);
                flag=true;
            }
        }

        if(!flag){
            System.out.println("No duplicate element Found");
        }
//        System.out.println(lang.add("Java"));
//        System.out.println(lang.add("C"));
//        System.out.println(lang.add("C++"));
//        System.out.println(lang.add("Python"));
//        System.out.println(lang.add("Java"));



    }
}
