package Week5;
import java.util.Scanner;

public class StringReversal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String strInput = " ";

        // make clear to user that all-caps "DONE" ends program
        while (!strInput.equals("DONE")) {
            System.out.print("Enter string to be reversed (type in all caps \"DONE\" to end program): ");
            strInput = scan.nextLine();

            // terminate program once "DONE" is entered
            if (strInput.equals("DONE"))
                System.out.println("Process terminated.");

            else
                System.out.println(reverseStr(strInput));

        }
        scan.close(); // close scanner
    }
    public static String reverseStr(String strInput) {
        // initiate string length to 1 since strInput is empty
        if (strInput.length() == 1) {
            return strInput; // single character will always be the same in reversed

        } else {
            // start of last character (-1) of string and work way back to beginning, (0)
            // stop at once recursion reaches last character again
            return strInput.charAt(strInput.length() - 1) + reverseStr(strInput.substring(0, strInput.length() - 1));
        }

    }
}


//    OUTPUT

//    Enter string to be reversed (type in all caps "DONE" to end program): hello
//      olleh
//    Enter string to be reversed (type in all caps "DONE" to end program): racecar
//      racecar
//    Enter string to be reversed (type in all caps "DONE" to end program): apple
//      elppa
//    Enter string to be reversed (type in all caps "DONE" to end program): DONE
//    Process terminated.
