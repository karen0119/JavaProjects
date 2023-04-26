package project1;

public class Task10 {
    public static void main(String[] args) {
        /*
         Write a program to print out duplicate elements from
         an Array of Strings?
         */
        String[] colors = {"Karen", "Moraya", "Danny", "Karen"};
        for (int i = 0; i < colors.length; i++) {
            for (int j = i + 1; j < colors.length; j++) {
                if (colors[i] == colors[j]) {
                    System.out.println("The duplicate element is " + colors[i]);
                    // Prints: The duplicate element is Karen
                }
            }
        }
    }
}
