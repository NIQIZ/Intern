import java.util.List;

public class OfficeApp {
    public static void main(String[] args) {
        Office o = new Office("Shaw HQ", "1 Scotts Road, #13-00, Singapore 228208\n\n");

        /* */
        // Information
        System.out.println("Name: " + o.getName());
        System.out.println("Address: " + o.getAddress());

        // Employee Enum Type
        Employee.EmploymentType intern = Employee.EmploymentType.INTERN;
        Employee.EmploymentType permanent = Employee.EmploymentType.PERMANENT;

        /* */
        // ADD employee
        Employee new1 = o.addEmployee(permanent, "Employee 1");
        Employee new2 = o.addEmployee(intern, "Employee 2");
        Employee new3 = o.addEmployee(intern, "Employee 3");
        Employee new4 = o.addEmployee(intern, "Employee 4");
        Employee new5 = o.addEmployee(intern, "Employee 5");

        // System.out.println(o.employees.toString()); // Used for checking Map

        /* */
        // // GET employee
        Employee employee = o.getEmployee(3); // Specify which employee here
        System.out.println(employee.toString());

        /* */
        // GET employeesssss
        List<Employee> employeeList = o.getEmployees();

        for (Employee e : employeeList) {
            System.out.println(e.getEmployeeNumber() + ": " + e.getFullName() + " " + e.getStatus());
        }

        /* */
        // ADD meeting room
        MeetingRoom room1 = o.addMeetingRoom("F01", "Foxy Room");
        MeetingRoom room2 = o.addMeetingRoom("F02", "Empire Room");
        MeetingRoom room3 = o.addMeetingRoom("F03", "Royal Room");

        // room1.print();

        /* */
        // // GET facility
        Facility facility = o.getFacility("F02");
        if (facility != null) {
            System.out.println("\n\n");
            facility.print();
        }

        /* */
        // // GET facilities
        List<Facility> facilityList = o.getFacilities();
        for (Facility f : facilityList) {
            f.print();
        }

        /* */
        // // GET the bookings
        // o.doBooking();
    }
}
