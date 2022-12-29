public class Consultation {
    private Doctor doctor;
    private Patient patient;
    private String date;
    private String time;
    private String description;

    public Consultation(Doctor doctor, Patient patient, String date, String time, String description) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
        this.time = time;
        this.description = description;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
