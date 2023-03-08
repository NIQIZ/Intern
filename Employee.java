public class Employee {
    int employeeNumber = 0;

    enum EmploymentType {
        PERMANENT, INTERN
    }

    public Employee(int employeeNumber) {
        this.employeeNumber = employeeNumber += 1;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void getStatus() {
        EmploymentType type1 = EmploymentType.PERMANENT;
        EmploymentType type2 = EmploymentType.INTERN;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(0);

    }
}
