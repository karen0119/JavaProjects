package project1;

public class Task5 {
    public static void main(String[] args) {
      /*
        Write a program to swap 2 numbers without a
        temporary variable?
       */
        int x = 20;
        int y = 22;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x= " + x); // prints 22
        System.out.println("y= " + y); // prints 20
    }
}
