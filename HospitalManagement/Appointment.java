package HospitalManagement;

import java.time.LocalDateTime;

public class Appointment {
    private String appointmentId;
    private Doctor doctor;
    private Patient patient;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private AppointmentStatus status;

    public Appointment(String appointmentId, Doctor doctor, Patient patient, LocalDateTime startTime){
        this.appointmentId = appointmentId;
        this.doctor = doctor;
        this.patient = patient;
        this.startTime = startTime;
        this.endTime = this.startTime.plusMinutes(30);
        this.status = AppointmentStatus.SCHEDULED;
    }

    public boolean completeAppointment(){
        if(status != AppointmentStatus.SCHEDULED) return false;
        this.status = AppointmentStatus.COMPLETED;
        return true;
    }

    public boolean cancelAppointment(){
        if(status != AppointmentStatus.SCHEDULED) return false;
        this.status = AppointmentStatus.CANCELLED;
        return true;
    }

    public AppointmentStatus getStatus(){
        return this.status;
    }

    @Override
    public String toString(){
        return "AppointmentId: " + this.appointmentId + "  Doctor: " + this.doctor.getDoctorName() + "  Patient: " + this.patient.getPatientName() + "  Start Time: " + this.startTime.getHour() + "  End Time: " + this.endTime.getHour() + "  Status: " + this.status;
    }

    public Doctor getDoctor(){
        return this.doctor;
    }

    public Patient getPatient(){
        return this.patient;
    }

    public String getAppointmentId(){
        return this.appointmentId;
    }

    public LocalDateTime getStartTime(){
        return this.startTime;
    }
    public LocalDateTime getEndTime(){
        return this.endTime;
    }
}
