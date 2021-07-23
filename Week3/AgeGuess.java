import java.util.Scanner;

public class AgeGuess {
    public static void main(String[] args) {

        int ageGuess;
        int age;

        // creates an object of Scanner
        Scanner sc = new Scanner(System.in);

        // generates random number between 0 and 100 inclusive
        age = (int)(Math.random() * 100) + 0;

        // loop through hints until correct age entered
        do {
            System.out.println("Enter a number between 0 and 100 to guess age: ");
            ageGuess = sc.nextInt();

            // end program if correct
            if (ageGuess == age) {
                System.out.println("\nYou are correct");
                System.exit(0);
            }
            // provide hint if guessed lower
            else if (ageGuess < age) {
                System.out.println("\nYou guessed lower than the correct age. \nTry again. \n ");
            }
            // provide hint if guessed higher
            else {
                System.out.println("\nYou guessed higher than the correct age. \nTry again. \n ");
            }
        }
        while (ageGuess != age);

        // close scanner
        sc.close();
    }
}
