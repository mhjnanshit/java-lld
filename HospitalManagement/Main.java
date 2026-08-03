package HospitalManagement;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Hospital hospital = new Hospital();

        // Doctors
        Doctor doctor1 = new Doctor("D101", "Dr. Sharma", "Cardiologist");
        Doctor doctor2 = new Doctor("D102", "Dr. Mehta", "Dermatologist");

        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        // Patients
        Patient patient1 = new Patient("P101", "Anshit", 22);
        Patient patient2 = new Patient("P102", "Rahul", 24);

        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        LocalDateTime slot1 = LocalDateTime.of(2026, 8, 5, 10, 0);
        LocalDateTime slot2 = LocalDateTime.of(2026, 8, 5, 10, 15);
        LocalDateTime slot3 = LocalDateTime.of(2026, 8, 5, 11, 0);

        System.out.println("Booking Appointment A1 : "
                + hospital.bookAppointment("A1", doctor1, patient1, slot1));

        // Should fail because it overlaps with A1
        System.out.println("Booking Appointment A2 : "
                + hospital.bookAppointment("A2", doctor1, patient2, slot2));

        // Should succeed
        System.out.println("Booking Appointment A3 : "
                + hospital.bookAppointment("A3", doctor1, patient2, slot3));

        System.out.println("\nDoctors:");
        hospital.displayAllDoctors();

        System.out.println("\nPatients:");
        hospital.displayAllPatients();

        System.out.println("\nAppointments:");
        hospital.displayAllAppointments();

        // -------------------------------------------------------
        // Since your Hospital API accepts Appointment objects
        // and doesn't expose stored appointments, we'll create
        // one only to demonstrate the API.
        // (This is why I suggested redesigning this method.)
        // -------------------------------------------------------

        Appointment appointment =
                new Appointment("A100", doctor2, patient1,
                        LocalDateTime.of(2026, 8, 6, 9, 0));

        System.out.println("\nComplete Appointment:");
        System.out.println(hospital.completeAppointment(appointment));

        System.out.println("\nCancel Appointment:");
        System.out.println(hospital.cancelAppointment(appointment));
    }
}
