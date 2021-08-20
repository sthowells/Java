public class Driver {
   public static void main(String[] args) {

      // create instance of ArrayStack
      ArrayStack stack = new ArrayStack(10);

      System.out.println("Elements Pushed onto Array Stack: 1,7,3,4,9,2");
      System.out.println();
      System.out.println("Elements popped from ArrayStack");

      // push ints to array stack
      stack.push(1);
      stack.push(7);
      stack.push(3);
      stack.push(4);
      stack.push(9);
      stack.push(2);

      // element removed and replaced from top of stack
      stack.pop();
      stack.pop();
      stack.pop();
      stack.pop();
      stack.pop();
      stack.pop();

      // create instance of LinkedStack
      LinkedStack link = new LinkedStack();

      System.out.println();
      System.out.println("Elements Pushed from LinkedStack: 1,7,3,4,9,2");

      link.push(1);
      link.push(7);
      link.push(3);
      link.push(4);
      link.push(9);
      link.push(2);

      System.out.println();
      System.out.println("Elements removed from bottom half");

      // remove bottom half of stack
      link.removeBottomHalf();

      System.out.println();
      System.out.println("Remaining elements from bottom half");

      int value;
      value = link.pop();

      while (value != -999) {
         System.out.println(value);
         value = link.pop();
      }
   }

}

class ArrayStack {

   private int[] arr;
   private int top;
   private int size;

   public ArrayStack(int size) {

      this.size = size; // size of stack
      this.top = -1; // reverse order
      this.arr = new int[size];

   }
   public boolean isFull() {
      return (size - 1 == top);
   }
   public boolean isEmpty() {
      return (top == -1);
   }

   public void push(int num) {

      if (!isFull()) {
         arr[++top] = num;

      } else {
         System.out.println("Full Stack");
      }
   }
   public int pop() {
      if (!isEmpty()) {
         int val = arr[top];
         top--;
         System.out.println(val);
         return val;
      } else {
         System.out.println("Empty Stack");
         return -1;
      }
   }
}

class LinkedStack {

   class Node {

      int data;
      Node next;
      Node(int theData) {
         data = theData;
      }
   }

   private Node top;
   private int n;
   public LinkedStack() {
      top = null;
      n = 0;
   }

   // implements the push operation
   public void push(int newEntry) {

      Node temp = new Node(newEntry);
      temp.next = top;
      top = temp;
      n++;
   }

   public int size() {
      return n;
   }

   // implements isEmpty operation
   public boolean isEmpty() {
      // return false
      return top == null;
   }

   // implements pop operation
   public int pop() {

      if (isEmpty()) {
         return -999;
      }

      int result = top.data;
      top = top.next;
      n--;
      return result;
   }

   // identifies the middle of stack
   public void removeBottomHalf() {
      int middle = n / 2;
      for (int i = 0; i < middle; i++) {
         System.out.println("Removed: " + pop());
      }
   }
}
