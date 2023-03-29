public class TestArray_sum {
    public static void main(String[] args) {
        int sum = 0; //initializes an integer variable sum to zero.

        //creates and initialises an integer array numbers with a size of 10.
        int[] numbers = {2, 4, 6, 8, 5, 6, 7, 8, 9, 10};

        //for loop to iterate over the elements in the numbers array, and incrementing i++
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // adding each element to the sum variable.
        }
//calculates the average of the values in the numbers array
        double average = (double) sum / numbers.length;
// printing  outputs the sum and average
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}