

public abstract class Person {
    private String Fname;
    private String Lname;
    private String DOB;
    private String MobileNum;


    //get field

    abstract public String getFname();

    abstract  public String getLname();

    abstract public String getDOB();

    abstract public String getMobileNum();


    //Set Field
    abstract public void setFname(String fname);

    abstract public void setLname(String lname);

    abstract public void setDOB(String DOB);

    abstract public void setMobileNum(String mobileNum);


}
