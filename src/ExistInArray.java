import java.util.Scanner;

public class ExistInArray {
    public static void main(String[] args) {
        //creates and initialises an integer array numbers with a size of 5.
        int[] numbers = {2, 4, 6, 8, 10};
        // initializes a boolean variable inArray to false,
        // which will be used to keep track of whether the value entered by the user is inArray not found.
        boolean inArray = false;

//using the Scanner class to ask the user to enter an integer value to search
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter an integer value to search for: ");
        int value = Integer.parseInt(reader.nextLine());
//for loop to iterate over the elements in the numbers array,
// checking each element to see if it matches the value entered by the user.
// If a match is found, the program sets inArray as true.
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                inArray = true;

            }
        }
//After all elements have been checked,
// print outputs whether the value entered by the user was found in the array.
        if (inArray) {
            System.out.println("Value " + value + " found in array");
        }
        // else print outputs Sorry value was not found in array
        else {
            System.out.println("Sorry value was not found in array");
        }
    }
}







