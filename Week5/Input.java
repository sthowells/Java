package Week5;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) throws FileNotFoundException, NumberFormatException {
        String[] array; // to store row items
        int count = 1;
        int maxInt = Integer.MIN_VALUE;
        int numIndex;


        Scanner fileScan = new Scanner(new File("input.csv"));

        System.out.println("Maximum Values:");

        while (fileScan.hasNextLine()) {
            array = fileScan.nextLine().split(","); // comma delimiter 
            for (int i = 0; i < array.length; i++) {
                numIndex = Integer.parseInt(array[i]); // convert string to integers 
                // check for max integer
                if (numIndex > maxInt) {
                    maxInt = numIndex;
                }
            }
            System.out.println("Row " + count + ": " + maxInt);
            maxInt = Integer.MIN_VALUE;
            count++;
        }

    }

}
