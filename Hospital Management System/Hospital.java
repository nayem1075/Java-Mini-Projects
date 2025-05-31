
package HospitalManagementSystem;

import java.util.ArrayList;

public class Hospital {
    
    String name;
    ArrayList<Patient> patients = new ArrayList<>();
    ArrayList<Staff> staffList = new ArrayList<>();

    public Hospital(String name) {
        this.name = name;
    }

    public void addPatient(Patient p) {
        patients.add(p);
    }

    public void addStaff(Staff s) {
        staffList.add(s);
    }
    
}
