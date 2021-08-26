package Exercise2;

//This class implements a queue using a linked list
//It requires the LinkedNode class to be defined
public class LinkedQueue { //From "Additional Examples"

	LinkedNode front;
	LinkedNode rear;
	int count;
	
	LinkedQueue() {
		front = rear = null;
		count = 0;
	}
	
	void enqueue(int x) {
		LinkedNode newNode = new LinkedNode(x);
		if (rear!=null)			
			rear.next = newNode;
		else 
			front = newNode;
		rear = newNode;
		count++;
	}
	
	int dequeue() {
		if (front==null) {
			return -1;
		}
		
		if (front!=rear) {
			int x = front.x;
			front = front.next;		
			count--;
			return x;
		} else {
			int x = front.x;
			front = null;
			rear = null;
			count --;
			return x;
		}
	}
	
	int first() {
		return front.x;
	}
	
	boolean isEmpty() {
		return count==0;
	}
	
	int size() {
		return count;
	}

// Remove middle from queue 
	void removeMiddle(){
		LinkedNode current = front;
		int length =0;
		LinkedNode middle = front;
		
		int mid = size() / 2-1;
			for (int i = 0; i < mid-1; i++) {
				current = current.next;
			}
			
			current.next = current.next.next;
	}
	
	
// Returns string, adds a space
	public String toString() {
		String str = "";
		LinkedNode cur = front;
		while (cur != null) {
			str += cur.x + " ";
			cur = cur.next;
		}
		return str;
	}
}