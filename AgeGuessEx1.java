import java.util.Random;
import java.util.Scanner;

public class AgeGuessEx1 {
public static void main(String[] args) {
		
		// creates an object of Scanner
		Scanner sc = new Scanner(System.in);
		
		// prompt user to enter name and age from keyboard
		// takes input from keyboard
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Enter number to guess age: ");
		int ageGuess = sc.nextInt();
		
		// generates random number between 0 and 100 inclusive
		int minnumber = 0;
	 	int maxnumber= 100;
	 	Random gen = new Random();
	 	int age = gen.nextInt(maxnumber-minnumber);

		
		// prints ageGuess input and close scanner
		System.out.println("Your name is " + name + " and you guessed the age of " + ageGuess + " years old");
		System.out.println("The correct age is " + age);
		sc.close();
	}
}
