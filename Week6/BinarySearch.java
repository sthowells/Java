public class BinarySearch {
	private static int [] list = new int [] {1, 14, 15, 24, 55, 59, 73, 90, 94, 99};	
	
    public static void main(String[] args) {

    	// print found once search finds target
        if (binSearch(list, 73)) {
            System.out.println("Found 73"); {

            }
        }
    }


    public static boolean binSearch(final int[] array, final int target) {

        int left = 0; // first in list
        int right = array.length - 1; // last in list
        int middle = (left + right) / 2;

        // initialize binary search to one side
        while (left <= right) {
            if (array[middle] < target) {
                left = middle + 1; // set new "left" if target not found
                System.out.println("The left index is: " + left);
            } else if (array[middle] == target) {
                return true;
            } else {
                right = middle - 1; // set new "right" if target not found
                System.out.println("The right index is: " + right);
            }
            middle = (left + right) / 2; // find new middle
            System.out.println("The middle index is: " + middle);
        }
        return false;
    }
}




