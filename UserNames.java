import java.util.Random;
import java.util.Scanner;

public class UserNames {
	public static void main(String[] args) {
		// creates an object of Scanner
		Scanner sc = new Scanner(System.in);
				
		// prompt user to enter first and last name 
		// read and create strings for first and last name
		System.out.println("Enter your first name: ");
		String firstName = sc.nextLine();
		System.out.println("Enter your last name: ");
		String lastName = sc.nextLine();		
		
		// create substring of first and last name
		String shortFirst = firstName.substring(0,1);
		String shortLast = lastName.substring(0,4);
		
		// creates parameters for random number generation 
		// in a range of 10 to 99
		int minnumber = 10;
		int maxnumber= 99;
		Random gen = new Random();
		int randnum = minnumber + gen.nextInt(maxnumber-minnumber);
			
		// print Username
		System.out.println(shortLast + shortFirst + randnum);
		sc.close();	 // close scanner
	}
}
