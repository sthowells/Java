package Exercise2;

//Lab 08
//Exercise 1
public class Driver {
	public static void main(String args[]) {
		
				LinkedQueue obj2 = new LinkedQueue();
				System.out.println();
				System.out.println("LinkedQueue: 1,7,3,4,9,2");
					obj2.enqueue(1);
					obj2.enqueue(7);
					obj2.enqueue(3);
					obj2.enqueue(4);
					obj2.enqueue(9);
					obj2.enqueue(2);
				System.out.println("After enqueue, the size of LinkedQueue is " + obj2.size());
				System.out.println(obj2);
				
				//Middle removal
				System.out.println();
				System.out.println("Remove middle");
				obj2.removeMiddle();
				System.out.println("Queue with middle removed: " + obj2);
	}
}