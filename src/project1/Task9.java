package project1;

public class Task9 {
    public static void main(String[] args) {
    /*
    Write a java program to find the second largest
    number in the array?

    */
        int []number = { 0, 10, 20, 25, 30, 1 };
        int  large1= 0;
        int  large2=0;
        for(int i=0;i<number.length;i++) {
            if (number[i] > large1) {
                large2 = large1;
                large1 = number[i];
            } else if (number[i] > large2) {
                large2 = number[i];
            }


        }
        System.out.println("The second largest element in the array is: " + large2);
        // Prints: The second largest element in the array is: 25
    }
}
