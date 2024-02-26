package daytwo;

public class Changecase {
	public static void main(String[] args) {
	        // Sample string
	        String text = "Hello";

	        // Check if the string is not empty
	        if (!text.isEmpty()) {
	            char firstChar = text.charAt(0); // Get the first character

	            // Check if it is lowercase, then convert to uppercase, else convert to lowercase
	            char changedChar = Character.isLowerCase(firstChar) ? Character.toUpperCase(firstChar) : Character.toLowerCase(firstChar);

	            // Print the changed character
	            System.out.println("Changed first character: " + changedChar);
	        } else {
	            System.out.println("The string is empty.");
	        }
	    }
	}


