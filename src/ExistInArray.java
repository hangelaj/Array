import java.util.Scanner;

public class ExistInArray {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        boolean inArray = false;

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter an integer value to search for: ");
        int value = Integer.parseInt(reader.nextLine());

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                inArray = true;

            }
        }

        if (inArray) {
            System.out.println("Value " + value + " found in array");
        } else {
            System.out.println("Value was not found in array");
        }
    }
}







