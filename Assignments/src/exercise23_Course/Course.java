package exercise23_Course;

public class Course {
    protected String courseName;
    protected String instructor;
    protected int credits;

    public Course(String courseName, String instructor, int credits) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.credits = credits;
    }

    public void displayDetails() {
        System.out.println("Course: - Course.java:15" + courseName + ", Instructor: " + instructor + ", Credits: " + credits);
    }
}
