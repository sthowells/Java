import java.util.Scanner;

public class Lab3 {
	public static void main(String[] args) {
		
		// creates an object of Scanner
		Scanner sc = new Scanner(System.in);
		
		// prompt user to enter name and age from keyboard
		System.out.println("Enter your name: ");
		System.out.println("Guess Age: ");
		
		// takes input from keyboard
		String name = sc.nextLine();
		int ageGuess = sc.nextInt();
		
		// prints ageGuess input and close scanner
		System.out.println("Your name is " + name + " and you are " + ageGuess + " years old");
		sc.close();
	}
}
