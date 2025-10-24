package exercise14_School;

public class SchoolMain {
    public static void main(String[] args) {
        School school = new School();
        school.addStudent("Alice");
        school.addStudent("Bob");
        school.addTeacher("Mr. Smith");
        school.addClass("Math 101");

        school.showInfo();

        school.removeStudent("Alice");
        System.out.println("\nAfter removing one student: - SchoolMain.java:14");
        school.showInfo();
    }
}
