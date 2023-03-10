public class Employee extends Person {
    int employeeNumber;
    EmploymentType type;

    enum EmploymentType {
        PERMANENT, INTERN
    }

    public Employee(int employeeNumber, EmploymentType type, String fullName) {
        super(fullName);
        this.employeeNumber = employeeNumber;
        this.type = type;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public EmploymentType getStatus() {
        switch (type) {
        case INTERN:
            System.out.println("Intern");
            break;
        case PERMANENT:
            System.out.println("Permanent");;
            break;
        }
        return type;
    }

    @Override
    public String toString() {
        return getEmployeeNumber() + ": " + " " + getFullName() + " " + type;
    }
}