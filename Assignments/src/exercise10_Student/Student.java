package exercise10_Student;

import java.util.ArrayList;

public class Student {
    private String name;
    private String grade;
    private ArrayList<String> courses;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    public void showCourses() {
        System.out.println(name + "'s Courses: - Student.java:25" + courses);
    }
}
