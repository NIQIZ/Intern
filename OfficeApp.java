import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OfficeApp {
    public static void main(String[] args) {
        Office o = new Office("Shaw HQ", "1 Scotts Road, #13-00, Singapore 228208\n\n");

        // Information
        System.out.println("Name: " + o.getName());
        System.out.println("Address: " + o.getAddress());

        // Employee Enum Type
        Employee.EmploymentType intern = Employee.EmploymentType.INTERN;
        Employee.EmploymentType permanent = Employee.EmploymentType.PERMANENT;

        // Employee e = new Employee(2, permanent);
        // System.out.println(e.getEmployeeNumber());
        // e.getStatus(intern);
        // e.getStatus(permanent);

        // get employee
        Map<Integer, Employee> employees = new HashMap<>();

        int nextEmpNumber = 1;

        Employee employee1 = new Employee(nextEmpNumber, intern, "Employee 1");
        employees.put(employee1.getEmployeeNumber(), employee1);
        nextEmpNumber++;

        Employee employee2 = new Employee(nextEmpNumber, permanent, "Employee 2");
        employees.put(employee2.getEmployeeNumber(), employee2);
        nextEmpNumber++;

        Employee employee = o.getEmployee(2, employees);
        System.out.println(employee.toString() + "\n\n");

        // get employeesssss
        System.out.println("--Employee List--");
        List<Employee> employeeList = o.getEmployees(employees);
        System.out.println(employeeList);

        // add employee
        Employee newEmployee = o.addEmployee(nextEmpNumber, permanent, "Employee 3");
        employeeList.add(employee);
    }
}
