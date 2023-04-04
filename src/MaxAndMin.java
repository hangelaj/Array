import java.util.Random;
public class MaxAndMin {
    public static void main(String[] args) {
        // Create and initialize an array with 10 random integers
        int[] array = new int[14];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10) +i; // generate random integer between 0-9
        }

        // Find the maximum and minimum values in the array
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        // Output the maximum and minimum values
        System.out.println("Maximum value in array: " + max);
        System.out.println("Minimum value in array: " + min);
    }
}
