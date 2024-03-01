package library;

public class Libraryuser {
	    private String name;
	    private int ID;
	    private int numberOfBooksBorrowed;

	    public Libraryuser(String name, int ID, int numberOfBooksBorrowed) {
	        this.name = name;
	        this.ID = ID;
	        this.numberOfBooksBorrowed = numberOfBooksBorrowed; // Initially zero books borrowed
	    }

	    // Getters and setters
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getID() {
	        return ID;
	    }

	    public void setID(int ID) {
	        this.ID = ID;
	    }

	    public int getNumberOfBooksBorrowed() {
	        return numberOfBooksBorrowed;
	    }

	    public void setNumberOfBooksBorrowed(int numberOfBooksBorrowed) {
	        this.numberOfBooksBorrowed = numberOfBooksBorrowed;
	    }
	}


