package project1;

public class Task4 {
    public static void main(String[] args) {
        /*
        Create a 2D array of integers. Develop a program
        which will calculate the sum of even and odd numbers
        for that array.
         */
        int[][] array = {{1, 3, 5},
                {2, 6, 8}};
        int even = 0;
        int odd = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    even += array[i][j];
                } else {
                    odd += array[i][j];

                }
            }
        }
        System.out.println(even); // prints 16
        System.out.println(odd); // prints 9

    }
}
