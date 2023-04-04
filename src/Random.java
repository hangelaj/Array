
public class Random {
    public static void main(String[] args) {
        //int[] numbers;
        java.util.Random rand = new java.util.Random();
        int num = rand.nextInt(10) + 1;
        System.out.println(num);
    }
}