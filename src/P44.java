public class P44 {
    public static void main(String[] args) {

        //How to count the Occurrences of a character in a String

        String s = "Hello everyone I am here ";
        int totalcount = s.length();
        int count_afterRemove = s.replace("e","").length();

        int count  = totalcount - count_afterRemove;
        System.out.println(count);

    }
}
