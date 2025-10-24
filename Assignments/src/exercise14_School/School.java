package exercise14_School;

import java.util.ArrayList;

public class School {
    private ArrayList<String> students = new ArrayList<>();
    private ArrayList<String> teachers = new ArrayList<>();
    private ArrayList<String> classes = new ArrayList<>();

    public void addStudent(String name) {
        students.add(name);
    }

    public void removeStudent(String name) {
        students.remove(name);
    }

    public void addTeacher(String name) {
        teachers.add(name);
    }

    public void addClass(String className) {
        classes.add(className);
    }

    public void showInfo() {
        System.out.println("Students: - School.java:27" + students);
        System.out.println("Teachers: - School.java:28" + teachers);
        System.out.println("Classes: - School.java:29" + classes);
    }
}
