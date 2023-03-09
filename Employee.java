import java.util.*;

public class Employee {
    int count = 1;

    int employeeNumber;
    EmploymentType employmentType;

    enum EmploymentType {
        PERMANENT, INTERN
    }

    public Employee(int employeeNumber, EmploymentType employmentType) {
        this.employeeNumber = count++;
        this.employmentType = employmentType;

    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public EmploymentType getStatus() {
        return employmentType;
    }
}
