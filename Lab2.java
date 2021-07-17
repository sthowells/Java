import java.text.NumberFormat;

public class Lab2 {
	public static void main(String[] args) {
		// create 7 double variables
		double quizScore1, quizScore2, quizScore3, testScore1, testScore2, testScore3, quizScoreAvg, testScoreAvg;
		
		// convert doubles into percent format extended to 2 decimals
		NumberFormat defaultFormat = NumberFormat.getPercentInstance();
		defaultFormat.setMinimumFractionDigits(2);
		
		// scores for the 7 variables, divided by 100 for final result % score
		quizScore1 = 82;
		System.out.println("Quiz 1 Score " + defaultFormat.format((quizScore1)/100));
		quizScore2 = 79;
		System.out.println("Quiz 2 Score " + defaultFormat.format((quizScore2)/100));
		quizScore3 = 87;
		System.out.println("Quiz 3 Score " + defaultFormat.format((quizScore3)/100));
		testScore1 = 81;
		System.out.println("Test 1 Score " + defaultFormat.format((testScore1)/100));
		testScore2 = 95;
		System.out.println("Test 2 Score " + defaultFormat.format((testScore2)/100));
		testScore3 = 83;
		System.out.println("Test 3 Score " + defaultFormat.format((testScore3)/100));
		
		// calculate and print average of quizzes and tests
		quizScoreAvg = (quizScore1 + quizScore2 + quizScore3)/3;
		System.out.println("Avg Quiz Score " + defaultFormat.format((quizScoreAvg)/100));
		testScoreAvg = (testScore1 + testScore2 + testScore3)/3;
		System.out.println("Avg Test Score " + defaultFormat.format((testScoreAvg)/100));
		
	}
}
