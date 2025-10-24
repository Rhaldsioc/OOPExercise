package exercise23_Course;

public class CourseMain {
    public static void main(String[] args) {
        OnlineCourse oc = new OnlineCourse("Java Programming", "Mr. Dela Cruz", 3, "Udemy", 6);
        oc.displayDetails();
        System.out.println("Eligible for Certificate: - CourseMain.java:7" + oc.isEligibleForCertificate());
    }
}



 