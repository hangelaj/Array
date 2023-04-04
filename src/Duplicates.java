import java.util.Random;
public class Duplicates {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] array1 = new int[12];
        int[] array2 = new int[12];

        // Populate array1 and array2 with random values between 1 and 20
        for (int i = 0; i < 12; i++) {
            array1[i] = rand.nextInt(20) + 1;
            array2[i] = rand.nextInt(20) + 1;
        }

        // Print array1 and array2
        System.out.println("Array 1:");
        for (int i = 0; i < 12; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        System.out.println("Array 2:");
        for (int i = 0; i < 12; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        // Find duplicates in array1 and array2
        System.out.println("Duplicates:");
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println(array1[i]);

                }
            }
        }
    }
}