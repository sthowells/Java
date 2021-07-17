import java.text.DecimalFormat;
import java.util.Scanner;

public class DistCalc {
	public static void main(String[] args) {
		
		// creates an object of Scanner
		Scanner sc = new Scanner(System.in);
				
		// prompt user to enter x, y coordinates
		System.out.println("Enter x1: ");
		int x1 = sc.nextInt();
		
		System.out.println("Enter y1: ");
		int y1 = sc.nextInt();
		
		System.out.println("Enter x2: ");
		int x2 = sc.nextInt();
		
		System.out.println("Enter y2: ");
		int y2 = sc.nextInt();
		
		// close scanner
		sc.close();				
		
		// creates squared components of Euclidean distance formula
		double xsquare = (x2 - x1) * (x2 - x1);
		double ysquare = (y2 -y1) * (y2-y1);
				
		// formula of distance equation, result is distance
		double distance = Math.sqrt(xsquare + ysquare);
				
		// set decimal format and display results
		DecimalFormat dformat = new DecimalFormat("#.###");
		String distformat = dformat.format(distance);
		System.out.println();
		System.out.print("The distance is: " + distformat);
					
	}
}
