
package HospitalManagementSystem;

import java.util.Scanner;

public class Main {
    
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hospital name: ");
        String hospitalName = input.nextLine();

        Hospital hospital = new Hospital(hospitalName);

        // Add 2 staff manually for simplicity
        hospital.addStaff(new Staff("Dr. Rahman", "Doctor"));
        hospital.addStaff(new Staff("Nurse Salma", "Nurse"));

        System.out.print("Enter patient name: ");
        String patientName = input.nextLine();

        System.out.print("Enter patient age: ");
        int patientAge = input.nextInt();
        input.nextLine(); // clear buffer

        Patient patient = new Patient(patientName, patientAge);
        hospital.addPatient(patient);

        System.out.print("Enter treatment name: ");
        String treatmentName = input.nextLine();

        // Assign first doctor found
        Staff doctor = null;
        for (Staff s : hospital.staffList) {
            if (s.role.equalsIgnoreCase("Doctor")) {
                doctor = s;
                break;
            }
        }

        if (doctor == null) {
            System.out.println("No doctor available.");
            input.close();
            return;
        }

        Treatment treatment = new Treatment(treatmentName, doctor);

        System.out.println("\nHospital: " + hospital.name);
        System.out.println("Patient: " + patient.name + ", Age: " + patient.age);
        System.out.println("Treatment: " + treatment.treatmentName + " by Dr. " + treatment.doctor.name);

        input.close();
    }
        
}
