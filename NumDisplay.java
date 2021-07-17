import java.util.Scanner;

public class NumDisplay {
	public static void main(String[] args) {

		  // creates scanner object
	      Scanner sc = new Scanner (System.in);
	      
	      // prompt user for number 0 to 9
	      System.out.print ("Enter a number (0 to 9): ");
	      int numValue = sc.nextInt();
	      
	      // prompt use that number is out of range and exit program
	      if (numValue < 0 || numValue > 9)
	      {
	    	System.out.println("Please try again and enter a number between 0 and 9, inclusive");
	      	System.exit(0);
	      }
	      
	      // print user input if within range
	      System.out.print ("That number is ");
	      sc.close(); // close scanner
	     	      
	      // creates switch statement to match number with respective string
	      switch (numValue)
	      {
	         case 0:
	        	 System.out.println ("zero.");
	        	 break;
	         case 1:
	        	 System.out.println ("one.");
	        	 break;
	         case 2:
	        	 System.out.println ("two.");
	        	 break;
	         case 3:
	        	 System.out.println ("three.");
	        	 break;
	         case 4:
	        	 System.out.println ("four.");
	        	 break;
	         case 5:
	        	 System.out.println ("five.");
		      	break;
	         case 6:
	        	 System.out.println ("six.");
	        	 break;
	         case 7:
	        	 System.out.println ("seven.");
		         break;
	         case 8:
		         System.out.println ("eight.");
		         break;
	         case 9:
		         System.out.println ("nine.");
		         break;  
	      }

	}
}
