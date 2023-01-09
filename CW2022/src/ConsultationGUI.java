import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ConsultationGUI extends JFrame {

    public void GUIConsultPanel() {
        setTitle("Westminster Consultation For Doctor");
        setSize(1280, 860);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);




//  ----------------------------------------------</Patient Details\>---------------------------------------------------

        JPanel GetpatientDetailspanel = new JPanel();
        GetpatientDetailspanel.setBackground(Color.decode("#ABE5C4"));
        GetpatientDetailspanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(),
                "[Patient Details]", TitledBorder.CENTER, TitledBorder.TOP,
                Font.getFont("Arial"), Color.black));
        GetpatientDetailspanel.setLayout(null);
        GetpatientDetailspanel.setBounds(95,70,500,400);
        this.add(GetpatientDetailspanel);


//  --------First name Text Field---------
        JLabel FirstName = new JLabel("Fist Name");
        FirstName.setBounds(30,50,100,50);
        GetpatientDetailspanel.add(FirstName);

        JTextField FirstNameField = new JTextField();
        FirstNameField.setBounds(250,63,200,30);
        GetpatientDetailspanel.add(FirstNameField);

        JLabel nameLabelError = new JLabel("Enter the First Name Correctly");
        nameLabelError.setFont(new Font("Arial", Font.PLAIN, 10));
        nameLabelError.setVisible(false);
        nameLabelError.setForeground(Color.RED);
        nameLabelError.setBounds(250,125/2+23,200,30);
        GetpatientDetailspanel.add(nameLabelError);


//  --------Last name Text Field---------

        JLabel LastName = new JLabel("Last Name");
        LastName.setBounds(30,100,100,50);
        GetpatientDetailspanel.add(LastName);

        JTextField LastNameField = new JTextField();
        LastNameField.setBounds(250,113,200,30);
        GetpatientDetailspanel.add(LastNameField);


        JLabel surnameLabelError = new JLabel("Enter the Last Name Correctly");
        surnameLabelError.setFont(new Font("Arial", Font.PLAIN, 10));
        surnameLabelError.setVisible(false);
        surnameLabelError.setForeground(Color.RED);
        surnameLabelError.setBounds(250,125/2+50+23,200,30);
        GetpatientDetailspanel.add(surnameLabelError);


//  --------DOB Text Field---------

        JLabel DOBLable = new JLabel("Date Of Birth");
        DOBLable.setBounds(30,150,100,50);
        GetpatientDetailspanel.add(DOBLable);

        JTextField DOBTextField = new JTextField();
        DOBTextField.setBounds(250,163,200,30);
        GetpatientDetailspanel.add(DOBTextField);

        JLabel dobError = new JLabel("Correct Format YYYY-MM-DD");
        dobError.setFont(new Font("Arial", Font.PLAIN, 10));
        dobError.setVisible(false);
        dobError.setForeground(Color.RED);
        dobError.setBounds(250,125/2+100+23,200,30);
        GetpatientDetailspanel.add(dobError);


//  --------Mobile Number Text Field---------
        JLabel MobileLable = new JLabel("Mobile Number");
        MobileLable.setBounds(30,200,100,50);
        GetpatientDetailspanel.add(MobileLable);

        JTextField MobileTextField = new JTextField();
        MobileTextField.setBounds(250,213,200,30);
        GetpatientDetailspanel.add(MobileTextField);

        JLabel mobileNumberError = new JLabel("Enter the 10 Digit Number");
        mobileNumberError.setFont(new Font("Century Gothic", Font.PLAIN, 10));
        mobileNumberError.setVisible(false);
        mobileNumberError.setForeground(Color.RED);
        mobileNumberError.setBounds(250,125/2+150+23,200,30);
        GetpatientDetailspanel.add(mobileNumberError);




//  --------Identify Number Field---------

        JLabel IdentifyLabel = new JLabel("Identify Number");
        IdentifyLabel.setBounds(30,250,100,50);
        GetpatientDetailspanel.add(IdentifyLabel);

        JTextField IdentifyField = new JTextField();
        IdentifyField.setBounds(250,263,200,30);
        GetpatientDetailspanel.add(IdentifyField);

        JLabel idNumberError = new JLabel("Enter ID Number Correctly");
        idNumberError.setFont(new Font("Century Gothic", Font.PLAIN, 10));
        idNumberError.setVisible(false);
        idNumberError.setForeground(Color.RED);
        idNumberError.setBounds(250,125/2+200+23,200,30);
        GetpatientDetailspanel.add(idNumberError);



        JLabel notesLabel = new JLabel("Notes:");
        notesLabel.setBounds(30,125/2+250-25/2,150,50);
        GetpatientDetailspanel.add(notesLabel);

        JTextArea notesArea = new JTextArea();
        notesArea.setBounds(250,125/2+250,200,60);
        notesArea.setBorder(BorderFactory.createLineBorder(Color.gray));
        GetpatientDetailspanel.add(notesArea);



//  --------Save Details Button---------

        JButton SaveBTN = new JButton("Save Details");
        SaveBTN.setBounds(50,350,150,40);
        SaveBTN.setBackground(Color.decode("#2dbe6c"));
        SaveBTN.setForeground(Color.white);
        GetpatientDetailspanel.add(SaveBTN);


//  --------Go Back Button---------

        JButton BackBTN = new JButton("Go Back");
        BackBTN.setBounds(10,10,90,30);
        BackBTN.setBackground(Color.decode("#2dbe6c"));
        BackBTN.setForeground(Color.white);
        this.add(BackBTN);


//  ----------------------------------------------</Add Consultation\>---------------------------------------------------

        JPanel getconsultationpanel = new JPanel();
        getconsultationpanel.setBackground(Color.decode("#ABE5C4"));
        getconsultationpanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEmptyBorder(),
                "Add Appointment", TitledBorder.CENTER, TitledBorder.TOP,
                Font.getFont("Century Gothic"), Color.BLACK));
        getconsultationpanel.setLayout(null);
        getconsultationpanel.setBounds(670,70,500,400);
        this.add(getconsultationpanel);



//  --------Select Doctor With ComboBox---------
        JLabel SlctDoctorLabel = new JLabel("Select Doctor");
        SlctDoctorLabel.setBounds(40,55,200,30);
        getconsultationpanel.add(SlctDoctorLabel);

       String [] SelectDoclist = SelectDoclist();
       JComboBox <String> SelectDoc = new JComboBox(SelectDoclist);
       SelectDoc.setBounds(200,55,200,30);
       SelectDoc.setBackground(Color.white);
       SelectDoc.setEnabled(true);
       getconsultationpanel.add(SelectDoc);

//  --------Start Time Text Field---------

        JLabel startTimeLabel = new JLabel("Start time :");
        startTimeLabel.setBounds(50,90,150,30);
        startTimeLabel.setEnabled(false);
        getconsultationpanel.add(startTimeLabel);

        JTextField startTimeField = new JTextField("HH-MM");
        startTimeField.setBounds(200,90,50,30);
        startTimeField.setEnabled(false);
        getconsultationpanel.add(startTimeField);
//
        JLabel startTimeError = new JLabel("Use the Correct Format HH-MM");
        startTimeError.setFont(new Font("Century Gothic", Font.PLAIN, 10));
        startTimeError.setVisible(false);
        startTimeError.setForeground(Color.RED);
        startTimeError.setBounds(200,90+23,200,30);
        getconsultationpanel.add(startTimeError);


//  --------End Time Text Field---------

        JLabel endTimeLabel = new JLabel("End time :");
        endTimeLabel.setBounds(50,140,150,30);
        endTimeLabel.setEnabled(false);
        getconsultationpanel.add(endTimeLabel);

        JTextField endTimeField = new JTextField("HH-MM");
        endTimeField.setBounds(200,140,50,30);
        endTimeField.setEnabled(false);
        getconsultationpanel.add(endTimeField);

        JLabel endTimeError = new JLabel("Use the Correct Format HH-MM");
        endTimeError.setFont(new Font("Century Gothic", Font.PLAIN, 10));
        endTimeError.setVisible(false);
        endTimeError.setForeground(Color.RED);
        endTimeError.setBounds(200,140+23,200,30);
        getconsultationpanel.add(endTimeError);

//  --------Date Text Field---------

        JLabel dateLabel = new JLabel("Date :");
        dateLabel.setBounds(50,190,140,30);
        dateLabel.setEnabled(false);
        getconsultationpanel.add(dateLabel);

        JTextField dateField = new JTextField("YYYY-MM-DD");
        dateField.setBounds(200,190,80,30);
        dateField.setEnabled(false);
        getconsultationpanel.add(dateField);

        JLabel dateError = new JLabel("Use the Correct Format YYYY-MM-DD");
        dateError.setFont(new Font("Century Gothic", Font.PLAIN, 10));
        dateError.setVisible(false);
        dateError.setForeground(Color.RED);
        dateError.setBounds(200,190+23,200,30);
        getconsultationpanel.add(dateError);




//  --------Check Availability Button---------

        JButton checkAvailability = new JButton("Check Availability");
        checkAvailability.setBounds(175,300,150,40);
        checkAvailability.setBackground(Color.decode("#ABE5C4"));
        checkAvailability.setEnabled(false);
        getconsultationpanel.add(checkAvailability);


//  ----------------------------------------------</Final Details\>----------------------------------------------------
        JPanel Summary  = new JPanel();
        Summary.setBackground(Color.decode("#ABE5C4"));
        Summary.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(),
                "[Patient Details]", TitledBorder.CENTER, TitledBorder.TOP,
                Font.getFont("Century Gothic"), Color.black));
        Summary.setLayout(null);
        Summary.setOpaque(true);
        Summary.setBounds(380,500,500,280);
        this.add(Summary);

//  --------Set Doctor Name Label---------

        JLabel doctorNameLabel = new JLabel("Doctor Name :");
        doctorNameLabel.setBounds(50,40,150,30);
        Summary.add(doctorNameLabel);

        JLabel doctorName = new JLabel("");
        doctorName.setBounds(200,40,150,30);
        Summary.add(doctorName);

//  --------Set Time Label---------

        JLabel timeLabel = new JLabel("Time :");
        timeLabel.setBounds(50,70,150,30);
        Summary.add(timeLabel);

        JLabel time = new JLabel("");
        time.setBounds(200,70,150,30);
        Summary.add(time);


//  --------Set Price Label---------

        JLabel priceLabel = new JLabel("Price :");
        priceLabel.setBounds(50,100,150,30);
        Summary.add(priceLabel);

        JLabel price = new JLabel("");
        price.setBounds(200,100,150,30);
        Summary.add(price);


//  --------Set Patient Name Label---------

        JLabel patientNameLabel = new JLabel("Patient Name :");
        patientNameLabel.setBounds(50,130,150,30);
        Summary.add(patientNameLabel);

        JLabel patientName = new JLabel("");
        patientName.setBounds(200,130,150,30);
        Summary.add(patientName);


//  --------Set Consultation Id Label---------
        JLabel consultationIdLabel = new JLabel("Consultation Id :");
        consultationIdLabel.setBounds(50,160,150,30);
        Summary.add(consultationIdLabel);

        JLabel consultationId = new JLabel("");
        consultationId.setBounds(200,160,150,30);
        Summary.add(consultationId);

//  --------Confirm Consultation Button---------

        JButton confirmConsultation = new JButton("Confirm Consultation");
        confirmConsultation.setBounds(170,220,150,40);
        confirmConsultation.setBackground(Color.decode("#ABE5C4"));
        confirmConsultation.setEnabled(false);
        Summary.add(confirmConsultation);


//  ----------------------------------------------</Button Function\>----------------------------------------------------


        confirmConsultation.addActionListener(e -> {

          GUIConsultationManager.docArrange(FirstNameField.getText(),
                  LastNameField.getText(),
                  DOBTextField.getText(),
                  MobileTextField.getText(),
                  IdentifyField.getText(),
                  WestminsterSkinConsultationManager.DocTransfer().get(SelectDoc.getSelectedIndex()).getMediLicenceNum(),
                  dateField.getText(),
                  startTimeField.getText(),
                  endTimeField.getText(),
                  notesArea.getText());


          JOptionPane.showMessageDialog(null,"Data Saved");
            System.out.println(GUIConsultationManager.GetConsultationArray.size());
            GUI Main = new GUI();
            Main.terminal();
            Main.setVisible(true);
            setVisible(false);
        });

        SaveBTN.addActionListener(e -> {

//            Get Data from First Name Field And Validator
            String name = FirstNameField.getText();
            nameLabelError.setVisible((GUIInputValidator.checkString(name,"name")));
            if (GUIInputValidator.checkString(name,"name")){
                FirstNameField.setBorder(GUIInputValidator.checkString(name,"name") ? BorderFactory.createLineBorder(Color.RED, 1) : BorderFactory.createLineBorder(Color.decode("#8420ff"), 1));
            }else {
                FirstNameField.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
            }
            FirstNameField.setEnabled((GUIInputValidator.checkString(name,"name")));


//           Get Data from Last Name Field And Validator

            String surname = LastNameField.getText();
            surnameLabelError.setVisible((GUIInputValidator.checkString(surname,"name")));
            LastNameField.setEnabled((GUIInputValidator.checkString(surname,"name")));
            if (GUIInputValidator.checkString(surname,"name")) {
                LastNameField.setBorder(GUIInputValidator.checkString(surname, "name") ? BorderFactory.createLineBorder(Color.RED, 1) : BorderFactory.createLineBorder(Color.decode("#8420ff"), 1));
            }else {
                LastNameField.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
            }

//          Get Data from DOB Field And Validator
            String dob = DOBTextField.getText();
            dobError.setVisible((GUIInputValidator.checkDate(dob)));
            DOBTextField.setEnabled((GUIInputValidator.checkDate(dob)));
            if (GUIInputValidator.checkDate(dob)) {
                DOBTextField.setBorder(GUIInputValidator.checkDate(dob) ? BorderFactory.createLineBorder(Color.RED, 1) : BorderFactory.createLineBorder(Color.decode("#8420ff"), 1));
            }else {
                DOBTextField.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
            }
//          Get Data from Mobile Number Field And Validator
            String mobileNo = MobileTextField.getText();
            mobileNumberError.setVisible((GUIInputValidator.checkString(mobileNo,"phone")));
            MobileTextField.setEnabled((GUIInputValidator.checkString(mobileNo,"phone")));
            if (GUIInputValidator.checkString(mobileNo,"phone")) {
                MobileTextField.setBorder(GUIInputValidator.checkString(mobileNo, "phone") ? BorderFactory.createLineBorder(Color.RED, 1) : BorderFactory.createLineBorder(Color.decode("#8420ff"), 1));
            }else {
                MobileTextField.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
            }

//           Get Data from Identify Field And Validator

            String id = IdentifyField.getText();
            idNumberError.setVisible((GUIInputValidator.checkString(id,"id")));
            IdentifyField.setEnabled((GUIInputValidator.checkString(id,"id")));
            if (GUIInputValidator.checkString(id,"id")) {
                IdentifyField.setBorder(GUIInputValidator.checkString(id, "id") ? BorderFactory.createLineBorder(Color.RED, 1) : BorderFactory.createLineBorder(Color.decode("#8420ff"), 1));
            }else {
                IdentifyField.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
            }

//           Get Data from Note Field
            notesArea.setEnabled(false);

            if ((!(GUIInputValidator.checkString(name,"name")) &!(GUIInputValidator.checkString(surname,"name"))&!(GUIInputValidator.checkDate(dob))&!(GUIInputValidator.checkString(mobileNo,"phone"))&!(GUIInputValidator.checkString(id,"id")))){
                SaveBTN.setEnabled(false);
                getconsultationpanel.setEnabled(true);
                SlctDoctorLabel.setEnabled(true);
                SelectDoc.setEnabled(true);
                startTimeLabel.setEnabled(true);
                startTimeField.setEnabled(true);
                endTimeLabel.setEnabled(true);
                endTimeField.setEnabled(true);
                dateLabel.setEnabled(true);
                dateField.setEnabled(true);
                checkAvailability.setEnabled(true);

            }
        });

        checkAvailability.addActionListener(e -> {
            int doctorNumber = (WestminsterSkinConsultationManager.DocTransfer().get(SelectDoc.getSelectedIndex()).getMediLicenceNum());

            String startTime = startTimeField.getText();
            startTimeError.setVisible((GUIInputValidator.checkTime(startTime)));

            String endTime = endTimeField.getText();
            endTimeError.setVisible((GUIInputValidator.checkTime(endTime)));

            String date = dateField.getText();
            dateError.setVisible((GUIInputValidator.checkDateAfterToday(date)));

            ArrayList<Consultation> doctorTemp = new ArrayList<>();

            if (!(GUIInputValidator.checkTime(startTime))&!(GUIInputValidator.checkTime(endTime))&!(GUIInputValidator.checkDateAfterToday(date))){
                checkAvailability.setEnabled(false);

                System.out.println(GUIConsultationManager.GetConsultationArray.size());

                GUIConsultationManager consultationManager = new GUIConsultationManager();

                if (consultationManager.checkDoctorFreeTime(doctorNumber,date,startTime,endTime)){
                    JOptionPane.showMessageDialog(null,"Doctor is Available");
                    doctorTemp.add(new Consultation(date,startTime,endTime,doctorNumber));


                }else{
                    JOptionPane.showMessageDialog(null,"Doctor is not Available");
                    double ranNum = Math.random();
                    int randomDoctor = (int) (ranNum* WestminsterSkinConsultationManager.DocTransfer().size());

                    while (true){
                        if(consultationManager.checkDoctorFreeTime(randomDoctor,date,startTime,endTime)){
                            SelectDoc.setSelectedIndex(randomDoctor);
                            doctorTemp.add(new Consultation(date,startTime,endTime,WestminsterSkinConsultationManager.DocTransfer().get(randomDoctor).getMediLicenceNum()));
                            break;
                        }
                    }

                }

                doctorName.setText(SelectDoclist[SelectDoc.getSelectedIndex()]);
                time.setText(startTime+" - "+endTime);

                double consultationPrice = GUIConsultationManager.ConsultationPriceCalculator(startTime,endTime,IdentifyField.getText());
                String priceString = String.valueOf(Math.round(consultationPrice*100.00)/100.00);
                price.setText("£"+priceString);

                patientName.setText(FirstNameField.getText()+" "+LastNameField.getText());

                consultationId.setText(GUIConsultationManager.ConsultationNumberGenerator());

                confirmConsultation.setEnabled(true);


            }

        });
        BackBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI home = new GUI();
                home.terminal();
                home.setVisible(true);
                setVisible(false);
            }
        });



    }



    private String[] SelectDoclist() {
        String[] getDocNameList = new String[WestminsterSkinConsultationManager.Dlist.size()];
        for (int i = 0; i < WestminsterSkinConsultationManager.Dlist.size(); i++) {
            getDocNameList[i] = WestminsterSkinConsultationManager.Dlist.get(i).getFname() + " " + WestminsterSkinConsultationManager.Dlist.get(i).getLname() +" - DocID "+ WestminsterSkinConsultationManager.Dlist.get(i).getMediLicenceNum();

        }
        return getDocNameList;
    }
}

