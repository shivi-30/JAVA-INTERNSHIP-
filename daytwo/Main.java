package daytwo;
import java.util.Scanner;

// Class Area to calculate the area of a rectangle
class Area {
    // Data members to store length and breadth of rectangle
    private double length;
    private double breadth;

    // Method to set dimensions of the rectangle
    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and return the area of the rectangle
    public double getArea() {
        return length * breadth;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an object of Area class
        Area rectangle = new Area();

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Setting dimensions of the rectangle
        rectangle.setDim(length, breadth);

        // Calculating and printing the area of the rectangle
        System.out.println("Area of the rectangle: " + rectangle.getArea());

        scanner.close();
    }
}
