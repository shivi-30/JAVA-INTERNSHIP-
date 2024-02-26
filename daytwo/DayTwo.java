package daytwo;

public class DayTwo {
	   public static void main(String[] args) {
	        // Create an array of 7 numbers
	        int[] numbers = {2, 5, 8, 11, 14, 17, 20};

	        // Initialize a variable to count even numbers
	        int evenCount = 0;

	        // Loop through the array and count even numbers
	        for (int i = 0; i < numbers.length; i++) {
	            if (numbers[i] % 2 == 0) {
	                evenCount++;
	            }
	        }

	        // Print the count of even numbers
	        System.out.println("Number of even numbers: " + evenCount);
	    }
	}

	
