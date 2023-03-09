import Employee.EmploymentType;

public class OfficeApp {
    public static void main(String[] args) {
        Office o = new Office("Shaw HQ", "1 Scotts Road, #13-00, Singapore 228208");

        // Information
        System.out.println("Name: " + o.getName());
        System.out.println("Address: " + o.getAddress());

        // Employee List
        Employee employee1 = new Employee(Employee.EmploymentType.PERMANENT);
        Employee employee2 = new Employee(Employee.EmploymentType.INTERN);
        System.out.println("Employee " + employee1.getEmployeeNumber());

    }
}
