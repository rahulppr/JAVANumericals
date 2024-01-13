public class P43 {
    public static void main(String[] args) {

        //Remove the white spaces from a String

        System.out.println("Enter the string characters");
        String s = "Hello World    checking the code   here  ";
        s = s.replaceAll("\\s","");
        System.out.println(s);

    }
}
