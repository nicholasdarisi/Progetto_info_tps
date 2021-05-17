package view;

import controller.Controller;

import java.awt.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;

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
    private JList list;
    private JTable table;
    private DefaultListModel<String> model;
    private DefaultTableModel model1;
    private JScrollPane scrollPane;
    private JScrollPane scrollPane1;
    private JLabel lblNewLabel_4;

    /**
     * Aggiunta dell ' ActionListener ai bottoni
     * @param a
     */
    public void addController(Controller a) {
        btnNewButton.addActionListener(a);
        btnNewButton_1.addActionListener(a);
        btnNewButton_2.addActionListener(a);
        btnNewButton_3.addActionListener(a);
        btnNewButton_4.addActionListener(a);
        btnNewButton_5.addActionListener(a);
    }

    /**
     * Restituisce un specifico bottone
     * @param type
     * @return JButton
     */
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

    /**
     * Serve per settare lo stato di Giorno in corso
     * @param g
     */
    public void setGiorno(String g){
        lblNewLabel_4.setText(g);
    }

    /**
     * Serve per cambiare pannelli
     * @param type
     */
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

    /**
     * Serve per rinserire gli elementi aggiornati nella list nel Simulazione Partita
     * @param a
     */
    public void switchGiorni(String[] a) {
        model.clear();
        for (String b : a) {
            model.addElement(b);
        }
        list.setModel(model);
        list.updateUI();
    }


    /**
     * Serve per aggiungere righe nella tabella Classifica
     * @param a
     */
    public void addRow(String a[][]){
        for(int i = 0 ,max = model1.getRowCount(); i< max ;i++){
            model1.removeRow(0);
        }
        for(String b[] : a){
            model1.addRow(b);
        }

        table.updateUI();
    }
    public Grafica() {
        initialize();
    }

    private void initialize() {
        String collum[] = {"Squadra","PG","V","P","S","GF","PUNTI"};
        model = new DefaultListModel<String>();
        model1 = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table = new JTable();
        for(String a : collum)
        model1.addColumn(a);
        frame = new JFrame();
        frame.setBounds(100, 100, 430, 286);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new CardLayout(0, 0));
        frame.setResizable(false);
        panel = new JPanel();
        frame.getContentPane().add(panel, "name_1193192040720394");
        panel.setLayout(null);
        panel_1 = new JPanel();
        panel_1.setBackground(new Color(255, 255, 255));
        panel_1 = new JPanel();
        frame.getContentPane().add(panel_1, "name_1263115913667607");
        panel_1.setLayout(null);
        btnNewButton = new JButton("Classifica");
        btnNewButton.setBounds(211, 179, 92, 29);
        panel.add(btnNewButton);

        JLabel lblNewLabel_14 = new JLabel("Classifica");
        lblNewLabel_14.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
        lblNewLabel_14.setForeground(new Color(255, 255, 255));
        lblNewLabel_14.setBackground(new Color(255, 255, 255));
        lblNewLabel_14.setBounds(165, 6, 81, 16);
        panel_1.add(lblNewLabel_14);
        btnNewButton_2 = new JButton("Back");
        btnNewButton_2.setBounds(310, 3, 117, 29);
        panel_1.add(btnNewButton_2);



        JLabel lblNewLabel_3 = new JLabel("New label");
        lblNewLabel_3.setIcon(new ImageIcon(Grafica.class.getResource("/Resource/coriandoli.gif")));
        lblNewLabel_3.setBounds(25, 71, 386, 179);
        panel_1.add(lblNewLabel_3);
        
        scrollPane1 = new JScrollPane(table);
        scrollPane1.setBounds(15, 50, 386, 179);
        panel_1.add(scrollPane1);
        table.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
        table.setBackground(new Color(255, 255, 255));
        table.setPreferredScrollableViewportSize(new Dimension(450,64));
        table.setFillsViewportHeight(true);
        table.setModel(model1);
        scrollPane1.setViewportView(table);
        JLabel lblNewLabel_1 = new JLabel(new ImageIcon(Grafica.class.getResource("/Resource/2.jpeg")));
        lblNewLabel_1.setBounds(0, 0, 444, 272);
        panel_1.add(lblNewLabel_1);
        panel_2 = new JPanel();
        frame.getContentPane().add(panel_2, "name_1263126193526326");
        panel_2.setLayout(null);


        JLabel lblNewLabel_26 = new JLabel("Simulazione partite");
        lblNewLabel_26.setForeground(new Color(255, 255, 255));
        lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_26.setBounds(146, 6, 135, 16);
        panel_2.add(lblNewLabel_26);

        btnNewButton_1 = new JButton("Simula");

        btnNewButton_1.setBounds(136, 179, 72, 29);

        panel.add(btnNewButton_1);

        JLabel lblNewLabel = new JLabel();
        lblNewLabel.setIcon(new ImageIcon(Grafica.class.getResource("/Resource/1.jpeg")));
        lblNewLabel.setBounds(0, 0, 438, 266);
        panel.add(lblNewLabel);


        scrollPane = new JScrollPane();
        scrollPane.setBounds(89, 47, 251, 194);
        panel_2.add(scrollPane);
        scrollPane.getViewport().setOpaque(false);

        list = new JList();
        list.setModel(model);
        scrollPane.setViewportView(list);


        btnNewButton_3 = new JButton("<--");
        btnNewButton_3.setBounds(6, 121, 71, 29);
        panel_2.add(btnNewButton_3);

        btnNewButton_4 = new JButton("-->");
        btnNewButton_4.setBounds(352, 121, 71, 29);
        panel_2.add(btnNewButton_4);

        btnNewButton_5 = new JButton("Back");
        btnNewButton_5.setBounds(301, 1, 122, 29);
        panel_2.add(btnNewButton_5);
        
        JLabel lblNewLabel_5 = new JLabel("Giornata in corso:\n");
        lblNewLabel_5.setForeground(new Color(255, 255, 255));
        lblNewLabel_5.setBounds(106, 34, 117, 16);
        panel_2.add(lblNewLabel_5);



        lblNewLabel_4 = new JLabel();
        lblNewLabel_4.setForeground(new Color(255, 255, 255));
        lblNewLabel_4.setBounds(224, 34, 47, 16);
        panel_2.add(lblNewLabel_4);
        
        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon(Grafica.class.getResource("/Resource/2.jpeg")));
        lblNewLabel_2.setBounds(0, 0, 430, 264);
        panel_2.add(lblNewLabel_2);
        



    }
}
