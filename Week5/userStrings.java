package Week5;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class userStrings {
    public static void main(String[] args) throws IOException {
        String input = "";
        File txtFile = new File("userStrings.txt");

        FileWriter fw = new FileWriter(txtFile);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter outputFile = new PrintWriter(bw);

        Scanner stringScan = new Scanner(System.in);

        // case-sensitive to force user to use CAPS to end program.
        // allow for string that contains "done" in lower-case, but not upper-case
        while (!input.equals("DONE")) {
            System.out.println("Please submit a string. Type \"DONE\" to stop.");
            input = stringScan.nextLine(); // scan user input

            // if input does not contain "done",
            // then write in output file
            if (!input.equals("DONE")) {
                outputFile.println(input);
            } else {
                System.out.println("Submission completed");
                outputFile.close();
            }
        }


        stringScan.close(); // close scanner
        System.out.println("The output file is: " + txtFile); // creates new txt file with user input
    }
}


//    OUTPUT
//    Please submit a string. Type "DONE" to stop.
//    Hello this is my story, it goes like this...
//    Please submit a string. Type "DONE" to stop.
//    DONE
//    Submission completed
//    The output file is: userStrings.txt
