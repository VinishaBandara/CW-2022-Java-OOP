import java.io.Serializable;

public class Consultation implements Serializable {

    private int doctorID;
    private String Identity;
    private String date;
    private String startTime;
    private String endTime;
    private double price;
    private String notes;

    private String consultID;



    public Consultation(String date, double price, String notes, String startTime, String endTime, int doctorID, String Identity, String consultationId) {

        this.doctorID = doctorID;
        this.consultID = consultationId;
        this.date = date;
        this.price = price;
        this.notes = notes;
        this.startTime = startTime;
        this.endTime = endTime;
        this.Identity = Identity;


    }



    public Consultation(String date, String startTime, String endTime, int doctorID) {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.doctorID = doctorID;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public String getIdentity() {
        return Identity;
    }

    public void setIdentity(String identity) {
        Identity = identity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getConsultID() {
        return consultID;
    }

    public void setConsultID(String consultID) {
        this.consultID = consultID;
    }
}
