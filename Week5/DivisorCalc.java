package Week5;
import java.util.Scanner;

public class DivisorCalc {

    public static void main(String[] args) {

        int num1;
        int num2;

        Scanner scan = new Scanner(System.in);

        // get under integer input
        System.out.println("Please enter your first number: ");
        num1 = scan.nextInt();
        System.out.println("Please enter your second number: ");
        num2 = scan.nextInt();

        System.out.println("Your greatest common divisor is " + gcd(num1, num2)); //prints gcd method

        scan.close(); // close scanner
    }

    // create greatest common divisor method
    public static int gcd(int num1, int num2) {
        //by zero
        if ((num2 <= num1) && (num1 % num2 == 0))
            return num2;

        if (num1 < num2) return gcd(num2, num1);
        else return gcd(num2, num1 % num2);
    }
}

//    OUTPUT
//    Please enter your first number: 100
//    Please enter your second number: 12
//    Your greatest common divisor is 4
