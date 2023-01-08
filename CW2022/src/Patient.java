import java.io.Serializable;
import java.time.LocalDate;

public class Patient extends Person implements Serializable {
    private String Fname;
    private String Lname;
    private String DOB;
    private String MobileNum;
    private String Identity;
    private int PatientID;

    public Patient(String Fname, String Lname, String DOB , String MobileNum ,int PatientID , String Identity){
        this.Fname = Fname;
        this.Lname = Lname;
        this.DOB = DOB;
        this.MobileNum = MobileNum;
        this.Identity = Identity;
        this.PatientID = PatientID;
    }

    @Override
    public String getFname() {
        return Fname;
    }

    @Override
    public void setFname(String fname) {
        Fname = fname;
    }

    @Override
    public String getLname() {
        return Lname;
    }

    @Override
    public void setLname(String lname) {
        Lname = lname;
    }

    @Override
    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    @Override
    public String getMobileNum() {
        return MobileNum;
    }

    @Override
    public void setMobileNum(String mobileNum) {
        MobileNum = mobileNum;
    }

    public String getIdentity() {
        return Identity;
    }

    public void setIdentity(String identity) {
        Identity = identity;
    }

    public int getPatientID() {
        return PatientID;
    }

    public void setPatientID(int patientID) {
        PatientID = patientID;
    }
}
