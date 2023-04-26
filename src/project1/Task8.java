package project1;

public class Task8 {
    public static void main(String[] args) {
        /*
       Maximum and minimum number in the array?
         */
        int array[]= {1, 18, -10, 5};
        int high=array[0];
        int low=array[0];
        for(int i=0; i<array.length; i++) {
            if (array[i] > high) {
                high = array[i];
            }
            if (array[i] < low) {
                low = array[i];
            }
        }
        System.out.println("Maximum is " + high+" and Minimum is "+ low);
        // prints: Maximum is 18 and Minimum is -10
    }
}
