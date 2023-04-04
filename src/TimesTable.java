import java.util.Scanner; //import the Scanner class from the java.util
public class TimesTable {
    public static void main(String[] args) {
        //create a new Scanner to ask the user what times table they would like
        Scanner reader = new Scanner(System.in);
        System.out.println("What times table would you like? : ") ;
        int timesTable = reader.nextInt(); //create int variable timeTable as user input
//for loop to iterate from 1 to 12 and calculate the resul using variable i.
        for (int i = 1; i <= 12; i++)
        {
            int result = timesTable * i; //calculate result = timesTable * i
//printing outputs concatenate the variables and strings using the + operator
            System.out.println(timesTable + " x " + i + " = " + result );
        }


    }
}
