package daythree;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Queue<String> queue = new LinkedList<>();

	        // Adding elements to the queue
	        queue.add("Apple");
	        queue.add("Banana");
	        queue.add("Orange");

	        // Removing elements from the queue
	        System.out.println("Removed element: " + queue.remove()); // Removes and returns the front element
	        System.out.println("Removed element: " + queue.remove());
	    }
	
	}


