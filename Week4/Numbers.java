public class Numbers {
	public static void main(String[] args) {
		// instance variable array
		int[] array = { 78, 22, 56, 99, 12, 14, 17, 15, 1, 144, 37, 23, 47, 88, 3, 19 };
		Numbers num = new Numbers();
		num.nextLargest(array);
	}
	

    // Method to identify next largest integer
    void nextLargest(int[] array) {
        int nextLargest = 0;
        int length = array.length;
        int minNum = 0;
        int maxNum = Integer.MAX_VALUE;

        // Nested for-loop to compare i integer for each j in array
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (array[i] < array[j]) {
                    minNum = array[j] - array[i]; // get difference if i is less than j
                    if (minNum < maxNum) {
                        maxNum = minNum;
                        nextLargest = array[j];
                    }
                }
            }


            // If no number is larger, then print maximum value
            // Else, print next largest integer in array
            if (maxNum == Integer.MAX_VALUE) {
                System.out.println(array[i] + ": " + Integer.MAX_VALUE);
            } 
            else {
                System.out.println(array[i] + ": " + nextLargest);
                maxNum = Integer.MAX_VALUE;
            }
        }
    }
}
