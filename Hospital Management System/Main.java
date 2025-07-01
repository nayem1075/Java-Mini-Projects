package HospitalManagementSystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hospital name: ");
        String hospitalName = input.nextLine();

        Hospital hospital = new Hospital(hospitalName);

        // 3 Doctor with different roles
        hospital.addStaff(new Staff("Dr. Rahman", "General Doctor"));
        hospital.addStaff(new Staff("Dr. Karim", "Specialist Doctor"));
        hospital.addStaff(new Staff("Dr. Laila", "Gynecologist"));

        System.out.print("Enter patient name: ");
        String patientName = input.nextLine();

        System.out.print("Enter patient age: ");
        int patientAge = input.nextInt();
        input.nextLine(); // buffer clear

        Patient patient = new Patient(patientName, patientAge);
        hospital.addPatient(patient);

        System.out.print("Enter treatment name: ");
        String treatmentName = input.nextLine();

        // Doctor selection logic based on treatment name
        String requiredDoctorRole = "";

        if (treatmentName.equalsIgnoreCase("Normal Checkup") || treatmentName.equalsIgnoreCase("Fever") || treatmentName.equalsIgnoreCase("Cold")) {
            requiredDoctorRole = "General Doctor";
        } else if (treatmentName.equalsIgnoreCase("X Ray") || treatmentName.equalsIgnoreCase("Surgery") || treatmentName.equalsIgnoreCase("Blood Test")) {
            requiredDoctorRole = "Specialist Doctor";
        } else if (treatmentName.equalsIgnoreCase("Pregnancy") || treatmentName.equalsIgnoreCase("Maternity Checkup")) {
            requiredDoctorRole = "Gynecologist";
        } else {
            System.out.println("Invalid treatment name. Cannot assign doctor.");
            input.close();
            return;
        }

        // Find doctor by role
        Staff doctor = null;
        for (Staff s : hospital.getStaffList()) {
            if (s.getRole().equalsIgnoreCase(requiredDoctorRole)) {
                doctor = s;
                break;
            }
        }

        if (doctor == null) {
            System.out.println("No doctor available for this treatment.");
            input.close();
            return;
        }

        Treatment treatment = new Treatment(treatmentName, doctor);

        // Output
        System.out.println("\nHospital: " + hospital.getName());
        System.out.println("Patient: " + patient.getName() + ", Age: " + patient.getAge());
        System.out.println("Treatment: " + treatment.getTreatmentName() + " by Dr. " + treatment.getDoctor().getName());

        input.close();
    }
}
