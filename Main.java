public class Main {
    
    public static void main(String[] args) {
        Student studentl = new Student(120, "Victor");
        Student student2 = new Student(111, "Nakeisha Uhuru");
        studentl.printStudentDetails();

        studentl.addCourse("math");
        studentl.addCourse("Science");
        studentl.addCourse("english");

        System.out.println(studentl.name + "'s courses: " + studentl.getCourses());
       
        studentl.removeCourse("Science");
        System.out.println(studentl.name + "'s courses: " + studentl.getCourses());

    

    }
    
}
