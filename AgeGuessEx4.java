import java.util.Random;
import java.util.Scanner;

public class AgeGuessEx4 {
public static void main(String[] args) {
		
		// creates an object of Scanner
		Scanner sc = new Scanner(System.in);
		
		// prompt user to enter name and age from keyboard
		// takes input from keyboard
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Enter number to guess age: ");
		int ageGuess = sc.nextInt();
		
		// close scanner
		sc.close();
		
		// generates random number between 0 and 100 inclusive
		int minnumber = 0;
	 	int maxnumber= 100;
	 	Random gen = new Random();
	 	int age = minnumber + gen.nextInt(maxnumber-minnumber);

		// part a
		// prints ageGuess input and close scanner
	 	System.out.println();
		System.out.println("Your name is " + name + " and you guessed the age of " 
	 	+ ageGuess + " years old. The correct age was " + age + ".");
		
		if (ageGuess != age)
		{
			System.out.println("You guessed wrong!");
			System.out.println();
		}
		
		// part b
		// output older or younger based on ageGuess and age
		if (ageGuess < age)
		{
			System.out.println("older");
		}
		
		if (ageGuess > age)
		{
			System.out.println("younger");
		}
	}
}
