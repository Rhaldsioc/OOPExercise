package exercise10_Student;

public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student("Alice", "Grade 10");
        s.addCourse("Math");
        s.addCourse("Science");
        s.addCourse("English");

        s.showCourses();

        s.removeCourse("Math");
        System.out.println("After removing a course: - StudentMain.java:13");
        s.showCourses();
    }
}
