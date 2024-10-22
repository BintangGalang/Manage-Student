import java.util.ArrayList;

 public class Student {
    int id;
    String name;
    ArrayList courses;
    ArrayList coursesObj;

  //  public student(String id, String name){

  //  }

  public Student(int id, String name){

    this.id = id;

    this.name = name;

    this.courses = new ArrayList();
  }
    
  public void printStudentDetails() {
    // Print the name of the student
    System.out.println("Id: " + id);
    
    // Print the grade of the student
    System.out.println("Name: " + name);
  }

  public ArrayList getCourses() {
    // Return the courses ArrayList
    return courses;
  }

  // Method to add a course to the student's course list
  public void addCourse(String course) {
    // Add the given course to the courses ArrayList
    courses.add(course);
  }

  public void removeCourse(String course) {
    // Remove the given course from the courses ArrayList
    courses.remove(course);
  }

  /*public void getCoursesObj() {

    coursesObj.add(course);
  }

 
  public void addCourseObj(String course) {
   
   System.out.println("Name: " + name);
   for (Course item : courseObj)
   System.out.println("Code: " + item.code+", Name");
  }
*/


}
