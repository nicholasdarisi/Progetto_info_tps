package view;

import controller.Controller;

import java.awt.EventQueue;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

import java.awt.CardLayout;

public class Grafica extends JFrame {

    public JFrame frame;
    private JButton btnNewButton;
    private JButton btnNewButton_2;
    private JButton btnNewButton_1;
    private JButton btnNewButton_3;
    private JButton btnNewButton_4;
    private JButton btnNewButton_5;
    private JPanel panel;
    private JPanel panel_1;
    private JPanel panel_2;
    private JList list1;
    private JList list;
    private DefaultListModel<String> model;

    public void addController(Controller a) {
        btnNewButton.addActionListener(a);
        btnNewButton_1.addActionListener(a);
        btnNewButton_2.addActionListener(a);
        btnNewButton_3.addActionListener(a);
        btnNewButton_4.addActionListener(a);
        btnNewButton_5.addActionListener(a);
    }

    public JButton getButton(int type) {
        switch (type) {
            case 0:
                return btnNewButton;
            case 1:
                return btnNewButton_1;
            case 2:
                return btnNewButton_2;
            case 3:
                return btnNewButton_3;
            case 4:
                return btnNewButton_4;
            case 5:
                return btnNewButton_5;
        }
        return null;
    }

    public void switchPanel(int type) {
        switch (type) {
            case 0:
                panel.setVisible(false);
                panel_1.setVisible(true);
                break;
            case 1:
                panel_1.setVisible(false);
                panel.setVisible(true);
                break;
            case 2:
                panel.setVisible(false);
                panel_2.setVisible(true);
                break;
            case 3:
                panel_2.setVisible(false);
                panel.setVisible(true);
        }
    }

    public void switchGiorni(String[] a){
            model.clear();
            for(String b : a)
            model.addElement(b);
    }

    public Grafica() {
        initialize();
    }

    private void initialize() {
        model = new DefaultListModel<String>();
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().setLayout(new CardLayout(0, 0));
        frame.setResizable(false);
        panel = new JPanel();
        frame.getContentPane().add(panel, "name_1193192040720394");
        panel.setLayout(null);

        panel_1 = new JPanel();
        frame.getContentPane().add(panel_1, "name_1263115913667607");
        panel_1.setLayout(null);

        btnNewButton = new JButton("Classifica");

        btnNewButton.setBounds(249, 230, 130, 29);
        panel.add(btnNewButton);

        JLabel lblNewLabel_14 = new JLabel("Classifica");
        lblNewLabel_14.setBounds(185, 6, 61, 16);
        panel_1.add(lblNewLabel_14);

        btnNewButton_2 = new JButton("Back");

        btnNewButton_2.setBounds(327, 6, 117, 29);
        panel_1.add(btnNewButton_2);

        JLabel lblNewLabel_15 = new JLabel("Squadra");
        lblNewLabel_15.setBounds(25, 43, 61, 16);
        panel_1.add(lblNewLabel_15);

        JLabel lblNewLabel_16 = new JLabel("PG");
        lblNewLabel_16.setBounds(124, 43, 16, 16);
        panel_1.add(lblNewLabel_16);

        JLabel lblNewLabel_17 = new JLabel("V");
        lblNewLabel_17.setBounds(165, 43, 8, 16);
        panel_1.add(lblNewLabel_17);

        JLabel lblNewLabel_18 = new JLabel("P");
        lblNewLabel_18.setBounds(195, 43, 16, 16);
        panel_1.add(lblNewLabel_18);

        JLabel lblNewLabel_19 = new JLabel("S");
        lblNewLabel_19.setBounds(223, 43, 16, 16);
        panel_1.add(lblNewLabel_19);

        JLabel lblNewLabel_20 = new JLabel("GF");
        lblNewLabel_20.setBounds(251, 43, 23, 16);
        panel_1.add(lblNewLabel_20);

        JLabel lblNewLabel_21 = new JLabel("GS");
        lblNewLabel_21.setBounds(286, 43, 23, 16);
        panel_1.add(lblNewLabel_21);

        JLabel lblNewLabel_22 = new JLabel("+/-");
        lblNewLabel_22.setBounds(327, 43, 30, 16);
        panel_1.add(lblNewLabel_22);

        JLabel lblNewLabel_23 = new JLabel("Punti");
        lblNewLabel_23.setBounds(366, 43, 61, 16);
        panel_1.add(lblNewLabel_23);

        Icon imgIcon = new ImageIcon(this.getClass().getResource("/Resource/coriandoli.gif"));
        JLabel lblNewLabel_1 = new JLabel(imgIcon);
        lblNewLabel_1.setBounds(0, 0, 438, 266);
        panel_1.add(lblNewLabel_1);

        panel_2 = new JPanel();
        frame.getContentPane().add(panel_2, "name_1263126193526326");
        panel_2.setLayout(null);


        JLabel lblNewLabel_26 = new JLabel("Simulazione partite");
        lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_26.setBounds(146, 6, 143, 16);
        panel_2.add(lblNewLabel_26);

        btnNewButton_1 = new JButton("Simula incontri");

        btnNewButton_1.setBounds(249, 206, 130, 29);
        panel.add(btnNewButton_1);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(this.getClass().getResource("/Resource/sup.jpg")));
        lblNewLabel.setBounds(0, 0, 438, 266);
        panel.add(lblNewLabel);


        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(110, 48, 230, 211);
        panel_2.add(scrollPane);
        scrollPane.getViewport().setOpaque(false);

        list = new JList();
        list.setModel(model);
        scrollPane.setViewportView(list);

        list1 = new JList();
        list1.setModel(new DefaultListModel() {
            String[] values = new String[]{"ciao1"};

            public int getSize() {
                return values.length;
            }

            public Object getElementAt(int index) {
                return values[index];
            }
        });


        btnNewButton_3 = new JButton("<--");
        btnNewButton_3.setBounds(6, 121, 92, 29);
        panel_2.add(btnNewButton_3);

        btnNewButton_4 = new JButton("-->");
        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                scrollPane.setViewportView(list1);
            }
        });
        btnNewButton_4.setBounds(352, 121, 92, 29);
        panel_2.add(btnNewButton_4);

        btnNewButton_5 = new JButton("Back");

        btnNewButton_5.setBounds(327, 7, 117, 29);
        panel_2.add(btnNewButton_5);


    }
}
