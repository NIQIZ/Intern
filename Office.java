import java.util.*;

public class Office {
    String name;
    String address;
    Map<Integer, Employee> employees = new HashMap<>();

    Map<String, Facility> facilities;

    public Office(String name, String address) {
        System.out.println("--Information--");
        this.name = name;
        this.address = address;
    }

    // GET Methods
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void getEmployee(int employeeNumber) {
        employees.put
    }

    // public String getEmployees(){
        
    // }

    // public void addEmployee(String fullName, Enum EmploymentType){
    // // Employee

    // }

    // public void addMeetingRoom(String code, String name){
    // // MeetingRoom
    // }

    public String getFacility(String code) {

    }

    public String getFacilities() {
        // List<Facility> fList = new ArrayList<Facility>();
        // fList.add();
        // fList.add();
    }

    // public void doBooking(){

    // }
}