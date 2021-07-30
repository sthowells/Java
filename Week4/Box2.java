public class Box2 {
	int size = 0; // instance variable

    public void Box() {}

    public static void main(String[] args) {
        Box2 newBox = new Box2(); // box created
        newBox.size = 5; // change size to 5 using dot operator
        newBox.printBox('c');
    }

    // Method with void return type
    // Nested for-loop to build table for rows and columns
    public void printBox() {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
            	System.out.print("*");
            }
            System.out.println();
        }
    }
    
    // Method overload to print box with 'c' signature instead of '*'
 	public void printBox(char c) {
 		for (int row = 1; row <= size; row++) {
 			for (int col = 1; col <= size; col++) {
 				System.out.print(c);
 			}
 			System.out.println();
 		}
 	}
}


