import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class InputValidatorForConsole {


    //    Input validator for Medical Licence Number

    static Scanner Input = new Scanner(System.in);

    public static int getValidInt() {
        int integer;
        while (true) {
            try {
                integer = Input.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Please Enter the Input again :");
                Input.next();
            }
        }
        return integer;
    }
    public static int validatorMediLicenceNumber() {
        System.out.println("Enter the doctor's Medical License Number:  ");
        int medNo = getValidInt();

        for (Doctor doctor : WestminsterSkinConsultationManager.DocTransfer()) {
            while ((medNo == doctor.getMediLicenceNum())) {
                System.out.println("""
                                There is a Doctor Registered to this Medical Number
                                Please Enter the Correct Number Again :
                                """);
                medNo = getValidInt();
            }
        }
        return medNo;
    }


    public static String getValidDOB() {
        System.out.print("Enter the date of Birth (yyyy-mm-dd) : ");
        String dateStr = Input.next();

        while (true) {
            try {
                LocalDate.parse(dateStr);
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Enter the date in Correct Format [yyyy-mm-dd]");
                dateStr = Input.nextLine();
            }
        }


        return dateStr;
    }


}
