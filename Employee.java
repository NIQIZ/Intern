public class Employee extends Person {
    int employeeNumber;
    EmploymentType employmentType;

    enum EmploymentType {
        PERMANENT, INTERN
    }

    public Employee(int employeeNumber, EmploymentType employmentType, String fullName) {
        super(fullName);
        this.employeeNumber = employeeNumber;
        this.employmentType = employmentType;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void getStatus(EmploymentType employmentType) {
        // Employee.EmploymentType intern = Employee.EmploymentType.INTERN;
        // Employee.EmploymentType permanent = Employee.EmploymentType.PERMANENT;
        switch (employmentType) {
        case INTERN:
            System.out.println("Intern");
            break;
        case PERMANENT:
            System.out.println("Permanent");;
            break;
        }
    }

    @Override
    public String toString() {
        return employeeNumber + ": " + "   Employee Type: " + employmentType + "    Name: " + getFullName();
    }
}