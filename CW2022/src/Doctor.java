import java.time.LocalDate;

public class Doctor extends Person{
    private String Fname;
    private String Lname;
    private String DOB;
    private String MobileNum;
    private String MediLicenceNum;
    private String Speciality;

    public Doctor(String Fname, String Lname, String DOB, String MobileNum , String MediLicenceNum, String Speciality){
        this.Fname = Fname;
        this.Lname = Lname;
        this.DOB = DOB;
        this.MobileNum = MobileNum;
        this.MediLicenceNum = MediLicenceNum;
        this.Speciality = Speciality;

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

    public String getMediLicenceNum() {
        return MediLicenceNum;
    }

    public void setMediLicenceNum(String mediLicenceNum) {
        MediLicenceNum = mediLicenceNum;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }




}
