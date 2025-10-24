package exercise06_Employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", "Developer", 50000);
        System.out.println("Before raise: - EmployeeMain.java:6" + emp);

        emp.updateSalary(10);
        System.out.println("After 10% raise: - EmployeeMain.java:9" + emp);
    }
}
