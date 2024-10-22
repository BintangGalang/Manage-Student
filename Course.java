public class Course {
    private String code;
    private String name;

    // Constructor
    public Course(String code, String name) {
        this.code = code;
        this.name = name;
    }

    // Getter and Setter methods
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Update method to change the name of the course
    public void update(String newName) {
        this.name = newName;
    }

    // Override toString to print course details
    @Override
    public String toString() {
        return "Course Code: " + code + ", Course Name: " + name;
    }
}
