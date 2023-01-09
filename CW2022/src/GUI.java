import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {

    void terminal(){
        setTitle("Westminster Skin Consultation Manager");
        setSize(1280,768);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

//View all Doctor in grid
        JButton showDocGridBtn = new JButton("View All Doctor ["+ WestminsterSkinConsultationManager.Dlist.size() + "] Doctors are Available");
        showDocGridBtn.setBounds(515,200,300,50);
        showDocGridBtn.setBackground(Color.decode("#2dbe6c"));
        showDocGridBtn.setForeground(Color.decode("#ffffff"));

//Consult a Doctor Button
        JButton addconsulclickBtn = new JButton( "Click to Consult a Doctor");
        addconsulclickBtn.setBounds(515,100+100+100,300,50);
        addconsulclickBtn.setBackground(Color.decode("#2dbe6c"));
        addconsulclickBtn.setForeground(Color.decode("#ffffff"));

//Show Past Consultation Button
        JButton pastConsultViewBtn = new JButton( "Click to Show Past Consultation");
        pastConsultViewBtn.setBounds(515,100+100+100+100,300,50);
        pastConsultViewBtn.setBackground(Color.decode("#2dbe6c"));
        pastConsultViewBtn.setForeground(Color.decode("#ffffff"));

//Back Button
        JButton menuExit = new JButton("Click here to Exit the menu ");
        menuExit.setBounds(515,500,300,50);
        menuExit.setBackground(Color.decode("#2dbe6c"));
        menuExit.setForeground(Color.decode("#ffffff"));

        add(showDocGridBtn);
        add(addconsulclickBtn);
        add(pastConsultViewBtn);
        add(menuExit);

        showDocGridBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DoctorTableGUI Viewtable = new DoctorTableGUI();
                Viewtable.DoctorGrid();
                Viewtable.setVisible(true);
                setVisible(false);

            }
        });

        addconsulclickBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConsultationGUI addconsul = new ConsultationGUI();
                addconsul.GUIConsultPanel();
                addconsul.setVisible(true);
                setVisible(false);


            }
        });

        pastConsultViewBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PastConsultationGUI consulpst = new PastConsultationGUI();
                consulpst.ConsultPastViewPanel();
                consulpst.setVisible(true);
                setVisible(false);

            }
        });

        menuExit.addActionListener(e -> System.exit(0));
        setVisible(true);








    }
}





