import javax.swing.*;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;

public class DoctorTableGUI extends JFrame {

    public void DoctorGrid() {
        setTitle("Table of Doctors");
        setSize(1280, 768);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);


        String[][] DlistArr = Doctors2dArr();

        String[] Colnames = {"Name", "Surname", "Birthday", "MoblieNumber", "Specialisation", "Medical Licence Number"};

        JTable table = new JTable(DlistArr, Colnames);

        JButton sortbyBtn = new JButton("Sort by Last Name");
        sortbyBtn.setBounds(25, 620, 150, 35);
        sortbyBtn.setBackground(Color.BLACK);
        sortbyBtn.setForeground(Color.decode("#ffffff"));

        JButton consulDBtn = new JButton("Consult a Doctor");
        consulDBtn.setBounds(1000, 620, 200, 50);
        consulDBtn.setBackground(Color.BLACK);
        consulDBtn.setForeground(Color.decode("#ffffff"));

        JButton BackBtn = new JButton("Back");
        BackBtn.setBounds(770, 620, 200, 50);
        BackBtn.setBackground(Color.BLACK);
        BackBtn.setForeground(Color.decode("#ffffff"));

        JScrollPane scrlpane = new JScrollPane(table);
        scrlpane.setBounds(10, 10, 1200, 600);
        add(sortbyBtn);
        add(consulDBtn);
        add(BackBtn);
        add(scrlpane);
        setVisible(true);


        sortbyBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TableModel model = table.getModel();
                TableRowSorter<TableModel> sorter = new TableRowSorter<>(model);
                table.setRowSorter(sorter);

                sorter.setSortKeys(Collections.singletonList(new RowSorter.SortKey(1,SortOrder.ASCENDING)));
                sorter.sort();
            }
        });

        BackBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI main = new GUI();
                main.terminal();
                main.setVisible(true);
                setVisible(false);

            }
        });

        consulDBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConsultationGUI consultaion = new ConsultationGUI();
                consultaion.GUIConsultPanel();
                consultaion.setVisible(true);
                setVisible(false);
            }
        });

    }

        private String[][] Doctors2dArr () {
            String[][] DocArr = new String[WestminsterSkinConsultationManager.Dlist.size()][6];
            for (int i = 0; i < WestminsterSkinConsultationManager.Dlist.size(); i++) {
                DocArr[i][0] = WestminsterSkinConsultationManager.Dlist.get(i).getFname();
                DocArr[i][1] = WestminsterSkinConsultationManager.Dlist.get(i).getLname();
                DocArr[i][2] = WestminsterSkinConsultationManager.Dlist.get(i).getDOB();
                DocArr[i][3] = WestminsterSkinConsultationManager.Dlist.get(i).getMobileNum();
                DocArr[i][4] = WestminsterSkinConsultationManager.Dlist.get(i).getSpeciality();
                DocArr[i][5] = String.valueOf(WestminsterSkinConsultationManager.Dlist.get(i).getMediLicenceNum());
            }
            return DocArr;
        }


}
