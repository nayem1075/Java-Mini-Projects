package HospitalManagementSystem;

public class Treatment {

    private String treatmentName;
    private Staff doctor;

    public Treatment(String treatmentName, Staff doctor) {
        this.treatmentName = treatmentName;
        this.doctor = doctor;
    }

    // Getter methods
    public String getTreatmentName() {
        return treatmentName;
    }

    public Staff getDoctor() {
        return doctor;
    }
}
