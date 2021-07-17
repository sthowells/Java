import java.util.Scanner;

public class Lab4 {
	public static void main(String[] args) {
		
		// creates an object of Scanner
		Scanner sc = new Scanner(System.in);
		
		// prompt user to enter number of seconds
		System.out.println("Enter number of seconds: ");
		
		// take input from user
		int seconds = sc.nextInt();
		
		// calculate seconds conversion using remainder operator
		int remainderSeconds = seconds % 60;
		int minutes = seconds / 60;
		int remainderMinutes = minutes % 60;
		int hours = minutes / 60;

		// print seconds conversion results in the form of Hours, Minutes, Seconds
		System.out.println(seconds + " seconds is equal to: ");
		System.out.println(hours + " hours " + remainderMinutes + " minutes and " + remainderSeconds + " seconds.");

		// close scanner
		sc.close();
		
	}
}
