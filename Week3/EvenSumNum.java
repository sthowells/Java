import java.util.Scanner;

public class EvenNumSum {
    public static void main(String[] args) {
        // creates an object of Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        
        // get input from keyboard
        int num = sc.nextInt();
        int sum = 0;
     
        // end program if number less than 3
        if (num <= 2) {
            System.out.println("Try again. Enter a number greater than 2.");
            System.exit(0);
        }

        for (int counter = 2; counter <= num; counter += 2) {
            sum = sum + counter;
        }

        System.out.println("\nThe sum of even numbers between 2 and " + num + " is eqaul to: \n" + sum);
        sc.close();
    }
}
