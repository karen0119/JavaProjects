package project1;

public class Task3 {
    public static void main(String[] args) {
        /*
        Create a 2D array or integer type where you will store
        odd and even numbers. Develop a program which will
        identify/print the even numbers only.
         */
        int[][]array={{0,2,3,4,6},
                {11,15,8,9,20} };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int num=array[i][j];
                if (num%2==0) {
                    System.out.print(num + " ");

                    // prints: 0 2 4 6 8 20
                }
            }
        }
    }
}
