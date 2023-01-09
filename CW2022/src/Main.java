import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        WestminsterSkinConsultationManager SkinCon = new WestminsterSkinConsultationManager();
        Scanner input = new Scanner(System.in);
        String optionmenu;
        System.out.println("\n\n");
        System.out.println("\t\t\tWestminster Skin Consultation Center");
        System.out.println("\t\t\t\t\t\tsystem menu\n");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("[A] Add a new doctor               [D] Delete a doctor");
        System.out.println("[S] Store program data into file   [L] Load program data from file");
        System.out.println("[V] Print the list of the doctors  [x] Exit system ");
        System.out.println("[G] Load the GUI");
        System.out.println("--------------------------------------------------------------------");

        System.out.print("\nEnter a menu selection:: ");
        optionmenu = input.next().toUpperCase();   //select menu option from the user
        while (!optionmenu.equals("X")) {  //checking menu option is valid or not.
            if (optionmenu.equals("A")) {
                SkinCon.addDoctor();
            } else if (optionmenu.equals("D")) {
                SkinCon.deleteDoctor();
            } else if (optionmenu.equals("V")) {
                SkinCon.viewdoctorlist();
            } else if (optionmenu.equals("S")) {
                SkinCon.SaveData();
            } else if (optionmenu.equals("L")) {
                SkinCon.loadData();
            } else if (optionmenu.equals("G")) {
                SkinCon.gui();}

            System.out.println("\n\n");
                System.out.println("\t\t\tWestminster Skin Consultation Center");
                System.out.println("\t\t\t\t\t\tsystem menu\n");
                System.out.println("--------------------------------------------------------------------");
                System.out.println("[A] Add a new doctor               [D] Delete a doctor");
                System.out.println("[S] Store program data into file   [L] Load program data from file");
                System.out.println("[V] Print the list of the doctors  [x] Exit system ");
                System.out.println("[G] Load the GUI");
                System.out.println("--------------------------------------------------------------------");

                System.out.print("\nEnter a menu selection:: ");
                optionmenu = input.next().toUpperCase();


            }


        }
    }
