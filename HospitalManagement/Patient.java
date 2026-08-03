package HospitalManagement;

public class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age){
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getpatientId(){
        return this.patientId;
    }

    public String getPatientName(){
        return this.name;
    }

    public int getPatientAge(){
        return this.age;
    }

    @Override
    public String toString(){
        return "PatientId: " + this.patientId + " Name: " + this.name + " Age: " + this.age; 
    }
}
