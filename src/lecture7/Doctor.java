package lecture7;

public class Doctor {
    private String name;
    private String qualification;
    public Doctor( String doctorName, String doctorQualification){
       name = doctorName;
       qualification =  doctorQualification;

    }
    public void treat(Patient patient){
        System.out.println("Доктор\t" + name +"("+qualification+")"+"\tЛечит пациента\t"+patient.getName()
                +patient.getTreatPlane() );
    }
    public void assignDoctor(Patient patient,  Doctor surgeon, Doctor dentist){
        int number = patient.getTreatPlane();
        if (number == 1){
            patient.setDoctor( new Doctor("Bob","Surgeon"));
        }else if (number == 2) {
            patient.setDoctor(new Doctor("Monika","Dentist"));
        }else{
            patient.setDoctor(this);
        }
        patient.getDoctor().treat(patient);
    }

}
