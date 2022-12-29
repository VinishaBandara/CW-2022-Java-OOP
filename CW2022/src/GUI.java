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


        JButton showDocGridBtn = new JButton("View All Doctor ["+ WestminsterSkinConsultationManager.Dlist.size() + "] Doctors are Available");
        showDocGridBtn.setBounds(1250/2-125,100+100,300,50);
        showDocGridBtn.setBackground(Color.decode("#F88379"));
        showDocGridBtn.setForeground(Color.decode("#ffffff"));


        JButton addconsulclickBtn = new JButton( "Click to Consult a Doctor");
        addconsulclickBtn.setBounds(1280/2-125,100+100,250,50);
        addconsulclickBtn.setBackground(Color.decode("#F88379"));

        JButton pastConsultViewBtn = new JButton("Click to see Past Consultation");
        pastConsultViewBtn.setBounds(1280/2-125,100+100,250,50);
        pastConsultViewBtn.setBackground(Color.decode("#F88379"));


        JButton menuExit = new JButton("Click here to Exit the menu ");
        menuExit.setBounds(1280/2-125,100+100,250,50);
        menuExit.setBackground(Color.decode("#F88379"));

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

        setVisible(true);








    }
}





