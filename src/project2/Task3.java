package project2;

public class Task3 {
    /*
    Count the Number of Words in a String: Write a function to count the
    number of words in a given string. Words are separated by spaces or
    punctuation. For example, the input "Hello, world!" should return 2.
     */
    public static int numberOfWords (String sentence) {
        String[] split = sentence.split(" ");
        int count=0;
        for (int i = 0; i < split.length; i++) {

            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(numberOfWords("Hi my name is Karen.")); //5
    }
}
