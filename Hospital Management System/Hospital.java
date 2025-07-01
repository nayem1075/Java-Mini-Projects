package HospitalManagementSystem;

import java.util.ArrayList;

public class Hospital {

    private String name;
    private ArrayList<Patient> patients = new ArrayList<>();
    private ArrayList<Staff> staffList = new ArrayList<>();

    public Hospital(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public ArrayList<Staff> getStaffList() {
        return staffList;
    }

    public void addPatient(Patient p) {
        patients.add(p);
    }

    public void addStaff(Staff s) {
        staffList.add(s);
    }
}
