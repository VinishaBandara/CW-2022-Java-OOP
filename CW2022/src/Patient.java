import java.time.LocalDate;

public class Patient extends Person {
    private String Fname;
    private String Lname;
    private String DOB;
    private String MobileNum;

    public Patient(){
        this.Fname = Fname;
        this.Lname = Lname;
        this.DOB = DOB;
        this.MobileNum = MobileNum;
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
}
