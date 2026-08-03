package HospitalManagement;

public class Doctor {
    private String doctorId;
    private String name;
    private String specialization;

    public Doctor(String doctorId, String name, String specialization){
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
    }

    public String getDoctorId(){
        return this.doctorId;
    }

    public String getDoctorName(){
        return this.name;
    }

    public String getDoctorSpecialization(){
        return this.specialization;
    }

    @Override
    public String toString(){
        return "DoctorId: " + this.doctorId + " Name: " + this.name + " Specialization: " + this.specialization + "\n"; 
    }


}
