package daythree;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Stack<Integer> stack = new Stack<>();

	        // Pushing elements onto the stack
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);

	        // Popping elements from the stack
	        System.out.println("Popped element: " + stack.pop()); // Removes and returns the top element
	        System.out.println("Popped element: " + stack.pop());
	    }
	
	}


