package daytwo;

public class Employee {
    private String employeeName;
    private String designation;
    private String email;

    // Getter for employeeName
    public String getEmployeeName() {
        return employeeName;
    }

    // Setter for employeeName
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    // Getter for designation
    public String getDesignation() {
        return designation;
    }

    // Setter for designation
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    // toString() method to display employee information
    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", designation='" + designation + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp1 = new Employee();

        // Set employee details using setter methods
        emp1.setEmployeeName("shivani hada");
        emp1.setDesignation("web developer");
        emp1.setEmail("shivanihada30@gmail.com");

     
         // Accessing individual attributes using getter methods
        System.out.println("\nEmployee Name: " + emp1.getEmployeeName());
        System.out.println("Designation: " + emp1.getDesignation());
        System.out.println("Email: " + emp1.getEmail());
    }
}
