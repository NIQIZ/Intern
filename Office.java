import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// import Employee.EmploymentType;

public class Office {
    String name;
    String address;

    int nextEmpNumber = 1; // for incrementing purpose
    public static Map<Integer, Employee> employees;
    public static List<Employee> employeeList; // Without static --> Cannot make a static reference to the non-static
                                               // field employeeList

    Map<String, Facility> facilities;
    public static List<Facility> facilityList;

    public Office(String name, String address) {
        System.out.println("--Information--");
        this.name = name;
        this.address = address;

        employees = new HashMap<>();
        employeeList = new ArrayList<>();

        facilities = new HashMap<>();
        facilityList = new ArrayList<>();
    }

    /* */
    // GET Properties
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    /* */
    // ADD Employee
    public Employee addEmployee(Employee.EmploymentType type, String fullName) {
        Employee employee = new Employee(nextEmpNumber, type, fullName);
        employees.put(nextEmpNumber, employee);
        employeeList.add(employee);
        nextEmpNumber++;
        return employee;

    }

    /* */
    // GET Employee
    public static Employee getEmployee(int employeeNumber) {
        return employees.get(employeeNumber);
    }

    /* */
    // GET Employeessssss
    public static List<Employee> getEmployees() {
        System.out.println("\n\n--Employee List--");
        return new ArrayList<>(employeeList);
    }

    /* */
    // ADD Meeting Room
    public MeetingRoom addMeetingRoom(String code, String name) {
        MeetingRoom room = new MeetingRoom(code, name);
        facilities.put(code, room);
        facilityList.add(room);
        return room;
    }

    /* */
    // GET Facility
    public Facility getFacility(String code) {
        return facilities.get(code);
    }

    /* */
    // GET Facilities
    public static List<Facility> getFacilities() {
        System.out.println("\n\n--Facilities--");
        return new ArrayList<>(facilityList);
    }

    /* */
    // doBookings from BookingRegister
    // public Booking doBooking(){

    // }
}