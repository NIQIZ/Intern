import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// import Employee.EmploymentType;

public class Office {
    String name;
    String address;

    Map<Integer, Employee> employees = new HashMap<>();

    Map<String, Facility> facilities = new HashMap<>();

    public Office(String name, String address) {
        System.out.println("--Information--");
        this.name = name;
        this.address = address;
    }

    // GET Properties
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    // GET Employee
    public static Employee getEmployee(int employeeNumber, Map<Integer, Employee> employees) {

        if (employees.containsKey(employeeNumber)) {
            return employees.get(employeeNumber);
        } else {
            return null;
        }
    }

    // GET Employeessssss
    public static List<Employee> getEmployees(Map<Integer, Employee> employees) {
        List<Employee> employeeList = new ArrayList<>(employees.values());
        return employeeList;
    }

    // ADD Employee
    public Employee addEmployee(String fullName, Employee.EmploymentType employmentType) {
        int nextEmpNumber = employees.size() + 1;
        // Employee newEmployee = new Employee(nextEmpNumber,
        // Employee.EmploymentType.INTERN, "Colin");
        employees.put(employeeNumber, employee);
        employeeList.add(newEmployee);
        return newEmployee;

    }

    // public void addMeetingRoom(String code, String name){
    // // MeetingRoom
    // }

    // public String getFacility(String code) {

    // }

    // public String getFacilities() {
    // List<Facility> fList = new ArrayList<Facility>();
    // fList.add();
    // fList.add();
    // }

    // public void doBooking(){

    // }
}