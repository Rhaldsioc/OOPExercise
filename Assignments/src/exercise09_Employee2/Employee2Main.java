package exercise09_Employee2;

import java.time.LocalDate;

public class Employee2Main {
    public static void main(String[] args) {
        Employee2 emp = new Employee2("Bob", 60000, LocalDate.of(2018, 5, 10));
        emp.showInfo();
    }
}
