package project2;

public class Task1 {
    /*
    Reverse a String: Write a function to reverse a given string. For
    example, given the input "Hello", the output should be "olleH".
     */
    static String reversed(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(reversed("Hello"));
    }
}
