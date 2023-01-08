import java.time.LocalTime;
import java.util.ArrayList;

public class GUIConsultationManager {

    public static ArrayList<Patient> GetPatientsDetailsArray = new ArrayList<>();

    public static ArrayList<Consultation> GetConsultationArray = new ArrayList<>();



    public static void docArrange(String cFirstName, String cLastname, String cDob, String cMobileNum, String identify, int docId, String date, String startTime, String endTime, String notes){

        for (Patient patient : GetPatientsDetailsArray) {
            int GetNic = Integer.parseInt(identify);
            String consultID = ConsultationNumberGenerator();
            if (Integer.parseInt(patient.getIdentity()) == GetNic){
                double totalPrice = ConsultationPriceCalculator(startTime, endTime, identify);
                GetConsultationArray.add(new Consultation(date, Math.round(totalPrice * 100.00) / 100.00, notes, startTime, endTime, docId, identify, consultID));
                return;

            }

        }
        GetPatientsDetailsArray.add(new Patient(cFirstName,cLastname,cDob,cMobileNum,10,identify));
        double totalPrice = ConsultationPriceCalculator(startTime,endTime,identify);
        String consultID = ConsultationNumberGenerator();
        GetConsultationArray.add(new Consultation(date, Math.round(totalPrice * 100.00) / 100.00, notes, startTime, endTime, docId, identify, consultID));



    }
public static String ConsultationNumberGenerator(){
        String number = String.valueOf(GetConsultationArray.size());
        return "WSCM-"+number;
}

    public static double ConsultationPriceCalculator(String startTime, String endTime, String identify) {
        int hours = Integer.parseInt(endTime.substring(0, 2)) - Integer.parseInt(startTime.substring(0, 2));

        double totalTPrice;
        int pricePerHour = 15;
        double totalTime = hours;
        for (Patient patient : GetPatientsDetailsArray) {
            if (patient.getIdentity().equals(identify)) {
                pricePerHour = 25;
                break;
            }
        }
        totalTPrice = pricePerHour * totalTime;
        return totalTPrice;

    }



    public boolean checkDoctorFreeTime(int docId,String date ,String startTime, String endTime){
        LocalTime Start = LocalTime.parse(startTime,java.time.format.DateTimeFormatter.ofPattern("HH:mm"));
        LocalTime end = LocalTime.parse(endTime,java.time.format.DateTimeFormatter.ofPattern("HH:mm"));

        for (Consultation consultation : GetConsultationArray) {
            if (consultation.getDoctorID() == WestminsterSkinConsultationManager.DocTransfer().get(docId).getMediLicenceNum() && consultation.getDate().equals(date)){
                if (Start.isBefore(LocalTime.parse(consultation.getEndTime())) && end.isAfter(LocalTime.parse(consultation.getStartTime()))){
                    return false;
                }
            }
        }
        return true;
    }








}
