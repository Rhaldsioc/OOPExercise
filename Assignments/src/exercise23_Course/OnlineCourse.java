package exercise23_Course;

public class OnlineCourse extends Course {
    private String platform;
    private int durationWeeks;

    public OnlineCourse(String courseName, String instructor, int credits, String platform, int durationWeeks) {
        super(courseName, instructor, credits);
        this.platform = platform;
        this.durationWeeks = durationWeeks;
    }

    public boolean isEligibleForCertificate() {
        return durationWeeks >= 4;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: - OnlineCourse.java:20" + platform + ", Duration: " + durationWeeks + " weeks");
    }
}
