package exercise09_Employee2;

import java.time.LocalDate;
import java.time.Period;

public class Employee2 {
    private String name;
    private double salary;
    private LocalDate hireDate;

    public Employee2(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public int getYearsOfService() {
        LocalDate now = LocalDate.now();
        return Period.between(hireDate, now).getYears();
    }

    public void showInfo() {
        System.out.println(name + "| Salary: - Employee2.java:23" + salary + " | Years of Service: " + getYearsOfService());
    }
}
