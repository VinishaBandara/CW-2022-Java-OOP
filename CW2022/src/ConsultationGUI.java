import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConsultationGUI extends JFrame {

    public void GUIConsultPanel() {
        setTitle("Westminster Consultation For Doctor");
        setSize(1280, 768);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

//        First name Text Field
        JLabel FirstName = new JLabel("Fist Name");
        FirstName.setBounds(30,50,100,50);
        this.add(FirstName);

        JTextField FirstNameField = new JTextField();
        FirstNameField.setBounds(250,63,200,30);
        this.add(FirstNameField);

//        name lable error here


//        Last name Text Field

        JLabel LastName = new JLabel("Last Name");
        LastName.setBounds(30,100,100,50);
        this.add(LastName);

        JTextField LastNameField = new JTextField();
        LastNameField.setBounds(250,113,200,30);
        this.add(LastNameField);

//         lable error here


//        First name Text Field

        JLabel DOBLable = new JLabel("Date Of Birth");
        DOBLable.setBounds(30,150,100,50);
        this.add(DOBLable);

        JTextField DOBTextField = new JTextField();
        DOBTextField.setBounds(250,163,200,30);
        this.add(DOBTextField);

//         lable error here


        //        First name Text Field


        JLabel MobileLable = new JLabel("Mobile Number");
        MobileLable.setBounds(30,200,100,50);
        this.add(MobileLable);

        JTextField MobileTextField = new JTextField();
        MobileTextField.setBounds(250,213,200,30);
        this.add(MobileTextField);


//         lable error here



        //        First name Text Field

        JLabel IdentifyLabel = new JLabel("Identify Number");
        IdentifyLabel.setBounds(30,250,100,50);
        this.add(IdentifyLabel);

        JTextField IdentifyField = new JTextField();
        IdentifyField.setBounds(250,263,200,30);
        this.add(IdentifyField);


//         lable error here

        JButton SaveBTN = new JButton("Save Details");
        SaveBTN.setBounds(170,320,150,40);
        SaveBTN.setBackground(Color.BLACK);
        SaveBTN.setForeground(Color.white);
        this.add(SaveBTN);




        JButton BackBTN = new JButton("Go Back");
        BackBTN.setBounds(10,10,90,30);
        BackBTN.setBackground(Color.BLACK);
        BackBTN.setForeground(Color.white);
        this.add(BackBTN);


//---------------------------------------------------Add Consultation------------------------------------------------------


        JLabel SlctDoctorLabel = new JLabel("Select Doctor");
        SlctDoctorLabel.setBounds(700,125/2,200,30);
        this.add(SlctDoctorLabel);


       String [] SelectDoclist = SelectDoclist();
       JComboBox <String> SelectDoc = new JComboBox(SelectDoclist);
       SelectDoc.setBounds(700,125/2+30,200,30);
       SelectDoc.setBackground(Color.white);
       SelectDoc.setEnabled(true);
       this.add(SelectDoc);




//  ----------------------------------------------</Button Function\>----------------------------------------------------


        BackBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI home = new GUI();
                home.terminal();
                home.setVisible(true);
                setVisible(false);
            }
        });



        SaveBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Fname = FirstNameField.getText();

                String Lname = LastNameField.getText();

                String DOB = DOBTextField.getText();

                String MobiNum = MobileTextField.getText();

                String Id = IdentifyField.getText();

            }
        });

    }

    private String[] SelectDoclist() {
        String[] getDocNameList = new String[WestminsterSkinConsultationManager.Dlist.size()];
        for (int i = 0; i < WestminsterSkinConsultationManager.Dlist.size(); i++) {
            getDocNameList[i] = WestminsterSkinConsultationManager.Dlist.get(i).getFname() + " " + WestminsterSkinConsultationManager.Dlist.get(i).getLname();

        }
        return getDocNameList;
    }
}

