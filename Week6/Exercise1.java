public class Exercise1 {
    public static void main(String[] args) {

        for (int i = 0; i <= 3; i += 1) { // time complexity O(n)
            for (int k = 0; k < i; ++k) { // time complexity O(n)
                for (int j = 0; j < i; j++) { // time complexity O(n)
                    System.out.print('#');
                }
                System.out.println();
            }
        }
    }
}



/* OUTPUT

#
##
##
###
###
###

*/
