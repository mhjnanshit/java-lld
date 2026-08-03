package HospitalManagement;

import java.util.*;
import java.time.LocalDateTime;

public class Hospital {
    private Map<String,Doctor> doctors = new HashMap<>();
    private Map<String,Patient> patients = new HashMap<>();
    private Map<String,Appointment> appointments = new HashMap<>();

    public void addDoctor(Doctor doctor){
        doctors.put(doctor.getDoctorId(),doctor);
    }

    public void addPatient(Patient patient){
        patients.put(patient.getpatientId(),patient);
    }

    public boolean bookAppointment(String appointmentId, Doctor doctor, Patient patient, LocalDateTime startTime){
        // Additional checks if doctor and patients , both exist
        if(!doctors.containsKey(doctor.getDoctorId())) return false;
        if(!patients.containsKey(patient.getpatientId())) return false;
        // Check if that doctor already has an appointment at that time
        for(Map.Entry<String,Appointment> entry : appointments.entrySet()){
            if(appointmentId.equals(entry.getKey())) return false;
            if(entry.getValue().getDoctor().getDoctorId().equals(doctor.getDoctorId()) && startTime.isBefore(entry.getValue().getEndTime()) && startTime.plusMinutes(30).isAfter(entry.getValue().getStartTime())) return false;
        }

        Appointment newAppointment = new Appointment(appointmentId, doctor, patient, startTime);
        appointments.put(appointmentId,newAppointment);
        return true;
    }


    public boolean cancelAppointment(Appointment appointment){
        for(Map.Entry<String,Appointment> entry : appointments.entrySet()){
            if(entry.getValue().getAppointmentId().equals(appointment.getAppointmentId()) && entry.getValue().getStatus() != AppointmentStatus.SCHEDULED) return false;
        }
        appointment.cancelAppointment();
        return true;
    }

    public boolean completeAppointment(Appointment appointment){
        for(Map.Entry<String,Appointment> entry : appointments.entrySet()){
            if(entry.getValue().getAppointmentId().equals(appointment.getAppointmentId()) && entry.getValue().getStatus() != AppointmentStatus.SCHEDULED) return false;
        }
        appointment.completeAppointment();
        return true;
    }

    public void displayAllDoctors(){
        for(Map.Entry<String,Doctor> entry: doctors.entrySet()){
            entry.getValue().toString();
        }
    }

    public void displayAllPatients(){
        for(Map.Entry<String,Patient> entry : patients.entrySet()){
            entry.getValue().toString();
        }
    }

    public void displayAllAppointments(){
        for(Map.Entry<String,Appointment> entry : appointments.entrySet()){
            entry.getValue().toString();
        }
    }

    public void displayAppointmentsOfParticularDoctor(Doctor doctor){
        for(Map.Entry<String,Appointment> entry : appointments.entrySet()){
            if(entry.getValue().getDoctor().getDoctorId().equals(doctor.getDoctorId())){
                entry.getValue().toString();
            }
            
        }
    }

    public void displayAppointmentsOfParticularPatient(Patient patient){
        for(Map.Entry<String,Appointment> entry : appointments.entrySet()){
            if(entry.getValue().getPatient().getpatientId().equals(patient.getpatientId())){
                entry.getValue().toString();
            }
        }
    }
}
