import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;

public class GUIInputValidator {
    public static boolean checkString(String input, String function) {

        if (input.matches("[a-zA-Z]+") && function.equals("name")){
            return false;
        } else if ( input.matches("[0-9]+") && (input.length() == 10) && function.equals("phone")) {
            return false;
        }else if ( input.matches("[0-9]+") && (input.length() <= 13) && (input.length() > 9) && function.equals("id")){
            return false;
        }else{
            return true;
        }

    }


    public static boolean checkDate(String dateStr) {
        try {
            LocalDate.parse(dateStr);
        } catch (DateTimeParseException e) {
            return true;
        }
        return false;
    }

    public static boolean checkDateAfterToday(String dateStr) {
        try {
            LocalDate.parse(dateStr);
            LocalDate today = LocalDate.now();
            LocalDate date = LocalDate.parse(dateStr);
            if (date.isAfter(today)) {
                return false;
            }
        } catch (DateTimeParseException e) {
            return true;
        }
        return true;
    }


    public static boolean checkTime(String timeStr) {
        try {
            LocalTime.parse(timeStr);
        } catch (DateTimeParseException e) {
            return true;
        }
        return LocalTime.parse(timeStr).isBefore(LocalTime.parse("08:00")) || LocalTime.parse(timeStr).isAfter(LocalTime.parse("16:00"));
    }





}

