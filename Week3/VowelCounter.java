import java.util.Scanner;

public class VowelCounter {
	public static void main(String[] args) {
		 // creates an object of Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Tell me a story: ");
        String input = sc.nextLine();
        sc.close();
        
        // keep only letters in string
        String inputStr = input.replaceAll("[^a-zA-Z]", "");
        
        // initialize vowels and consonants
        int vowelA = 0, vowelE = 0, vowelI = 0, vowelO = 0, vowelU = 0;
        int conCount = 0;
        
                
        // for-loop to count number of vowels and consonants
        for (int i = 0; i < inputStr.length(); i++) {
        	if (inputStr.charAt(i) == 'a') {
        		vowelA++;
        	}
        	if (inputStr.charAt(i) == 'e')  {
        		vowelE++;
        	}
        		
        	if (inputStr.charAt(i) == 'i')  {
        		vowelI++;
        	}
        	
        	if (inputStr.charAt(i) == 'o') {
        		vowelO++;
        	}
        		
        	if (inputStr.charAt(i) == 'u')  {
        		vowelU++;
        	}
        		
        	else if (inputStr.charAt(i) >= 'a' && inputStr.charAt(i) <= 'z') {
        		conCount++;        		
        	}
        }
        
        System.out.println(inputStr);
		System.out.println("Number of a vowels: " + vowelA);
		System.out.println("Number of e vowels: " + vowelE);
		System.out.println("Number of i vowels: " + vowelI);
		System.out.println("Number of o vowels: " + vowelO);
		System.out.println("Number of u vowels: " + vowelU);

		// sum of all vowel occurrences 
        int vowCount = vowelA + vowelE + vowelI + vowelO + vowelU; 
        
        System.out.println("Number of vowels: " + vowCount);
        System.out.println("Number of consonants: " + conCount);
	}
}
