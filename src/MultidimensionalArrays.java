public class MultidimensionalArrays {


        public static void main(String[] args) {
            //creates and initialises an integer array numbers with a size of 2 group each with 4 element
            int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
            int x = myNumbers[1][2];
            //print output of array group 1 second element = 7
            System.out.println(x);
        }
}
