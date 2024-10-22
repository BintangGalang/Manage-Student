public class Teacher extends Person {
    private String nip;
    private double salary;

    // Constructor
    public Teacher(String nip, String name, int age, double salary) {
        super(nip, name, age);
        this.nip = nip;
        this.salary = salary;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Override toString to print teacher details
    @Override
    public String toString() {
        return "Teacher Name: " + name + ", NIP: " + nip + ", Salary: " + salary;
    }
}
