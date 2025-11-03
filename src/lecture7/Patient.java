package lecture7;

public class Patient {
    private String name;
    private int treatPlane;
    private Doctor doctor;

    public Patient(String name, int treatPlane) {
        this.name = name;
        this.treatPlane= treatPlane;


    }
    public String getName() { return name; }
    public int getTreatPlane(){
        return treatPlane;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    public Doctor getDoctor(){
        return doctor;
    }
}
