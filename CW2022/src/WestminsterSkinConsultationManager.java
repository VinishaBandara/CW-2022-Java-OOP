import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class WestminsterSkinConsultationManager implements SkinConsultationManager ,Serializable{
    public static ArrayList<Doctor> Dlist = new ArrayList();


    @Override
    public void addDoctor() {
        Scanner input = new Scanner(System.in);
        boolean maxdoctors = (Dlist.size() == 3) ? false : true;

        if (maxdoctors) {
            String Fname, Lname, DOB, MobileNum,Speciality;
            System.out.println("\n\n");
            System.out.println("\t\t\t\t\t\t\tAdd a new doctor");
            System.out.println("--------------------------------------------------------------------");
            System.out.print("Enter the doctor's First name: ");
            Fname = input.next();
            System.out.print("Enter the doctor's Last name: ");
            Lname = input.next();
            DOB = InputValidatorForConsole.getValidDOB();
            System.out.print("Enter the doctor's Mobile Number: ");
            MobileNum = input.next();
            int MediLicenceNum = InputValidatorForConsole.validatorMediLicenceNumber();
            System.out.print("Enter the doctor's speciality: ");
            Speciality = input.next();
            Dlist.add(new Doctor(Fname, Lname, DOB, MobileNum, MediLicenceNum, Speciality));
            System.out.println("\n\n");
            System.out.println("\t\t\t\t\t\t\tAdd a new doctor");
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Doctor added successfully");
            System.out.println("--------------------------------------------------------------------");
        }else {
            System.out.println("\nMaximum limit reached");
        }
    }

    public void deleteDoctor() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n");
        System.out.println("\t\t\t\t\t\t\tDelete a doctor from List");
        System.out.println("--------------------------------------------------------------------");
        System.out.print("Enter the doctor's Medical License Number: ");
        int MediLicenceNum = Integer.parseInt(input.next());
        boolean found = false;

        for (int i = 0; i < Dlist.size(); ++i) {
            if (Objects.equals(((Doctor) Dlist.get(i)).getMediLicenceNum(), MediLicenceNum)) {
                Dlist.remove(i);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("\n\n");
            System.out.println("\t\t\t\t\t\t\tDelete a doctor");
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Doctor deleted successfully");
            System.out.println("--------------------------------------------------------------------");
        } else {
            System.out.println("\n\n");
            System.out.println("\t\t\t\t\t\t\tDelete a doctor");
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Doctor not found");
            System.out.println("--------------------------------------------------------------------");
        }

    }


    public void viewdoctorlist() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\t\t\t\tView doctor list");
        System.out.println("--------------------------------------------------------------------");

        if (Dlist.size() == -1) {
            System.out.println("No doctors to display");
            System.out.println("--------------------------------------------------------------------");
        } else {
            Dlist.sort(Comparator.comparing(Person::getLname));
            for (int i = 0; i < Dlist.size(); ++i) {
                System.out.println("Doctor " + (i + 1));
                System.out.println("First Name: " + ((Doctor) Dlist.get(i)).getFname());
                System.out.println("Last Name: " + ((Doctor) Dlist.get(i)).getLname());
                System.out.println("Date of Birth: " + ((Doctor) Dlist.get(i)).getDOB());
                System.out.println("Mobile Number: " + ((Doctor) Dlist.get(i)).getMobileNum());
                System.out.println("Medical License Number: " + ((Doctor) Dlist.get(i)).getMediLicenceNum());
                System.out.println("Speciality: " + ((Doctor) Dlist.get(i)).getSpeciality());
                System.out.println("--------------------------------------------------------------------");
            }
        }
    }
            public void SaveData(){
                try {
                    FileWriter fw = new FileWriter("Doctors.txt");
                    PrintWriter pw = new PrintWriter(fw);
                    pw.println("Doctor's List");
                    pw.println("--------------------------------------------------------------------");
                    for (int i = 0; i < Dlist.size(); ++i) {
                        pw.println("Doctor " + (i + 1));
                        pw.println("First Name: " + ((Doctor) Dlist.get(i)).getFname());
                        pw.println("Last Name: " + ((Doctor) Dlist.get(i)).getLname());
                        pw.println("Date of Birth: " + ((Doctor) Dlist.get(i)).getDOB());
                        pw.println("Mobile Number: " + ((Doctor) Dlist.get(i)).getMobileNum());
                        pw.println("Medical License Number: " + ((Doctor) Dlist.get(i)).getMediLicenceNum());
                        pw.println("Speciality: " + ((Doctor) Dlist.get(i)).getSpeciality());
                        pw.println("--------------------------------------------------------------------");
                    }
                    pw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            public void loadData(){
                try {
                    Scanner s = new Scanner(new File("Doctors.txt"));
                    while (s.hasNextLine()) {
                        System.out.println(s.nextLine());
                    }
                    s.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }

            public void gui(){
                GUI gui = new GUI();
                gui.terminal();
            }
            public static ArrayList<Doctor> DocTransfer(){
            return Dlist;
    }






        }
























