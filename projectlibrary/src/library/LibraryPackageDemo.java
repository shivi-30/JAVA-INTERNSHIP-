package library;

public class LibraryPackageDemo {
	 public static void main(String[] args) {
	        // Creating a book
	        book book1 = new book("Java Programming", "John Doe", "1234567890");

	        // Creating a library user
	        Libraryuser user1 = new Libraryuser("Alice", 1001, 5);
   
	        // Demonstrating usage
	        System.out.println("Book Title: " + book1.getTitle());
	        System.out.println("Book Author: " + book1.getAuthor());
	        System.out.println("Book ISBN: " + book1.getISBN());
	        System.out.println("Book Availability: " + (book1.isAvailable() ? "Available" : "Not Available"));

	        System.out.println("Library User Name: " + user1.getName());
	        System.out.println("Library User ID: " + user1.getID());
	        System.out.println("Number of Books Borrowed by User: " + user1.getNumberOfBooksBorrowed());
	    }
	}

