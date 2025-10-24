package exercise06_Employee;

public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void updateSalary(double percent) {
        salary += salary * (percent / 100);
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " (" + jobTitle + ") - Salary: " + salary;
    }
}
