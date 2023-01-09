import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.Calendar;

public class PastConsultationGUI extends JFrame {

    void ConsultPastViewPanel(){
        setTitle("Past Consultation");
        setSize(1280,820);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);


        TextField searchbyidField = new TextField("Search by Consultation ID");
        searchbyidField.setBounds(750,50,300,30);
        add(searchbyidField);

        JButton srchBtn = new JButton("Search");
        srchBtn.setBounds(1100,50,100,30);
        srchBtn.setBackground(Color.white);
        add(srchBtn);



//        Get Patient Details

//        Get Patient Details Panel
        JPanel patientDetailspanel = new JPanel();
        patientDetailspanel.setBackground(Color.decode("#ABE5C4"));
        patientDetailspanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(),
                "Patient Details", TitledBorder.CENTER, TitledBorder.TOP,
                Font.getFont("Arial"), Color.black));
        patientDetailspanel.setLayout(null);
        patientDetailspanel.setBounds(110,100,500,330);
        this.add(patientDetailspanel);

        //        Set Patient Details Inputs

        JLabel Setnamelabe = new JLabel("Name");
        Setnamelabe.setBounds(30, 50, 50,50);
        patientDetailspanel.add(Setnamelabe);

        JLabel name = new JLabel("");
        name.setBounds(150,50,150,50);
        patientDetailspanel.add(name);

        JLabel dobLabel = new JLabel("DOB");
        dobLabel.setBounds(30,125/2+50-25/2,150,50);
        patientDetailspanel.add(dobLabel);

        JLabel dob = new JLabel("");
        dob.setBounds(150,125/2+50-25/2,200,50);
        patientDetailspanel.add(dob);

        JLabel mobileLabel = new JLabel("Mobile Number:");
        mobileLabel.setBounds(30,125/2+100-25/2,150,50);
        patientDetailspanel.add(mobileLabel);

        JLabel mobile = new JLabel("");
        mobile.setBounds(150,125/2+100-25/2,200,50);
        patientDetailspanel.add(mobile);

        JLabel idLabel = new JLabel("ID Number:");
        idLabel.setBounds(30,125/2+150-25/2,150,50);
        patientDetailspanel.add(idLabel);

        JLabel id = new JLabel("");
        id.setBounds(150,125/2+150-25/2,200,50);
        patientDetailspanel.add(id);

        JLabel notesLabel = new JLabel("Notes:");
        notesLabel.setBounds(30,125/2+200-25/2,150,50);
        patientDetailspanel.add(notesLabel);

        JLabel notes = new JLabel("");
        notes.setBounds(250,125/2+200,200,50);
        patientDetailspanel.add(notes);

        JButton goBack = new JButton("Back");
        goBack.setBounds(10,10,80,30);
        goBack.setBackground(Color.decode("#e8d8ff"));
        add(goBack);

        goBack.addActionListener(e -> {
            GUI main = new GUI();
            main.terminal();
            main.setVisible(true);
            setVisible(false);

        });


//      Get  Consutation Details

        JPanel consultationpanel = new JPanel();
        consultationpanel.setBackground(Color.decode("#ABE5C4"));
        consultationpanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEmptyBorder(),
                "Appointment", TitledBorder.CENTER,TitledBorder.BELOW_TOP,
                Font.getFont("Arial"), Color.black));
        consultationpanel.setLayout(null);
        consultationpanel.setBounds(650,100,500,330);
        this.add(consultationpanel);


        JLabel doctorLabel = new JLabel("Doctor:");
        doctorLabel.setBounds(50,70,200,30);
        consultationpanel.add(doctorLabel);

        JLabel doctor = new JLabel("");
        doctor.setBounds(100,70,200,30);
        consultationpanel.add(doctor);

        JLabel startTimeLabel = new JLabel("Time :");
        startTimeLabel.setBounds(50,120,150,30);
        consultationpanel.add(startTimeLabel);

        JLabel startTime = new JLabel("");
        startTime.setBounds(100,120,150,30);
        consultationpanel.add(startTime);

        JLabel dateLabel = new JLabel("Date :");
        dateLabel.setBounds(50,170,140,30);
        consultationpanel.add(dateLabel);

        JLabel date = new JLabel("");
        date.setBounds(100,170,140,30);
        consultationpanel.add(date);


        JLabel priceLabel = new JLabel("Price :");
        priceLabel.setBounds(50,220,140,30);
        consultationpanel.add(priceLabel);

        JLabel price = new JLabel("");
        price.setBounds(100,220,140,30);
        consultationpanel.add(price);





        JPanel files = new JPanel();
        files.setBackground(Color.decode("#ABE5C4"));
        files.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEmptyBorder(),
                "Files", TitledBorder.CENTER, TitledBorder.TOP,
                Font.getFont("Arial"), Color.black));
        files.setLayout(null);
        files.setBounds(110,450,1040,250);
        this.add(files);




//        Search Function


        srchBtn.addActionListener(e -> {
            if (searchbyidField.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please enter the valid ID");


            }else{

                for (int i = 0; i < GUIConsultationManager.GetConsultationArray.size(); i++) {
                    if (GUIConsultationManager.GetConsultationArray.get(i).getConsultID().equals(searchbyidField.getText())){
                        price.setText("£"+GUIConsultationManager.GetConsultationArray.get(i).getPrice());
                        for (int j = 0; j < GUIConsultationManager.GetPatientsDetailsArray.size(); j++) {
                            if (GUIConsultationManager.GetPatientsDetailsArray.get(j).getIdentity().equals(GUIConsultationManager.GetConsultationArray.get(i).getIdentity())){
                                name.setText(GUIConsultationManager.GetPatientsDetailsArray.get(j).getFname()+" "+GUIConsultationManager.GetPatientsDetailsArray.get(j).getLname());
                                dob.setText(GUIConsultationManager.GetPatientsDetailsArray.get(j).getDOB());
                                mobile.setText(GUIConsultationManager.GetPatientsDetailsArray.get(j).getMobileNum());
                                id.setText(GUIConsultationManager.GetPatientsDetailsArray.get(j).getIdentity());
                                startTime.setText(GUIConsultationManager.GetConsultationArray.get(i).getStartTime()+" - "+GUIConsultationManager.GetConsultationArray.get(i).getEndTime());
                                date.setText(GUIConsultationManager.GetConsultationArray.get(i).getDate());
                                price.setText(String.valueOf(GUIConsultationManager.GetConsultationArray.get(i).getPrice()));

                            }

                        }
                        for (int j = 0; j < WestminsterSkinConsultationManager.DocTransfer().size(); j++) {
                            if (WestminsterSkinConsultationManager.DocTransfer().get(j).getMediLicenceNum() == (GUIConsultationManager.GetConsultationArray.get(i).getDoctorID())){
                                doctor.setText(WestminsterSkinConsultationManager.Dlist.get(j).getFname()+" "+WestminsterSkinConsultationManager.Dlist.get(j).getLname());
                            }
                            
                        }
                    }else {
                        JOptionPane.showMessageDialog(null,"ID Not Found");
                    }

                    
                }

            }
        });








    }
}
