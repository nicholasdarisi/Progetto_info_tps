package view;

import controller.Controller;

import java.awt.EventQueue;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class Grafica extends JFrame {

    public JFrame frame;
    private JButton btnNewButton;
    private JButton btnNewButton_2;
    private JButton btnNewButton_1;
    private JButton btnNewButton_3;
    private JButton btnNewButton_4;
    private JButton btnNewButton_5;
    public void addController(Controller a){
        btnNewButton.addActionListener(a);
        btnNewButton_1.addActionListener(a);
        btnNewButton_2.addActionListener(a);
        btnNewButton_3.addActionListener(a);
        btnNewButton_4.addActionListener(a);
        btnNewButton_5.addActionListener(a);
    }
    public Grafica() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 429, 286);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().setLayout(new CardLayout(0, 0));

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, "name_1193192040720394");
        panel.setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(255, 255, 255));
        frame.getContentPane().add(panel_1, "name_1263115913667607");
        panel_1.setLayout(null);

        btnNewButton = new JButton("Classifica");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                panel.setVisible(false);
                panel_1.setVisible(true);

            }
        });
        btnNewButton.setBounds(293, 234, 130, 29);
        panel.add(btnNewButton);

        JLabel lblNewLabel_14 = new JLabel("Classifica");
        lblNewLabel_14.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
        lblNewLabel_14.setForeground(new Color(255, 255, 255));
        lblNewLabel_14.setBackground(new Color(255, 255, 255));
        lblNewLabel_14.setBounds(165, 6, 81, 16);
        panel_1.add(lblNewLabel_14);

        btnNewButton_2 = new JButton("Back");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel_1.setVisible(false);
                panel.setVisible(true);
            }
        });
        btnNewButton_2.setBounds(310, 3, 117, 29);
        panel_1.add(btnNewButton_2);

        JLabel lblNewLabel_15 = new JLabel("Squadra");
        lblNewLabel_15.setForeground(new Color(255, 255, 255));
        lblNewLabel_15.setBounds(25, 43, 61, 16);
        panel_1.add(lblNewLabel_15);

        JLabel lblNewLabel_16 = new JLabel("PG");
        lblNewLabel_16.setForeground(new Color(255, 255, 255));
        lblNewLabel_16.setBounds(124, 43, 16, 16);
        panel_1.add(lblNewLabel_16);

        JLabel lblNewLabel_17 = new JLabel("V");
        lblNewLabel_17.setForeground(new Color(255, 255, 255));
        lblNewLabel_17.setBounds(165, 43, 8, 16);
        panel_1.add(lblNewLabel_17);

        JLabel lblNewLabel_18 = new JLabel("P");
        lblNewLabel_18.setForeground(new Color(255, 255, 255));
        lblNewLabel_18.setBounds(195, 43, 16, 16);
        panel_1.add(lblNewLabel_18);

        JLabel lblNewLabel_19 = new JLabel("S");
        lblNewLabel_19.setForeground(new Color(255, 255, 255));
        lblNewLabel_19.setBounds(223, 43, 16, 16);
        panel_1.add(lblNewLabel_19);

        JLabel lblNewLabel_20 = new JLabel("GF");
        lblNewLabel_20.setForeground(new Color(255, 255, 255));
        lblNewLabel_20.setBounds(251, 43, 23, 16);
        panel_1.add(lblNewLabel_20);

        JLabel lblNewLabel_21 = new JLabel("GS");
        lblNewLabel_21.setForeground(new Color(255, 255, 255));
        lblNewLabel_21.setBounds(286, 43, 23, 16);
        panel_1.add(lblNewLabel_21);

        JLabel lblNewLabel_22 = new JLabel("+/-");
        lblNewLabel_22.setForeground(new Color(255, 255, 255));
        lblNewLabel_22.setBounds(327, 43, 30, 16);
        panel_1.add(lblNewLabel_22);

        JLabel lblNewLabel_23 = new JLabel("Punti");
        lblNewLabel_23.setForeground(new Color(255, 255, 255));
        lblNewLabel_23.setBounds(366, 43, 61, 16);
        panel_1.add(lblNewLabel_23);

        Icon imgIcon = new ImageIcon(this.getClass().getResource("/Resource/coriandoli.gif"));
        
        JLabel lblNewLabel_3 = new JLabel("New label");
        lblNewLabel_3.setIcon(new ImageIcon(Grafica.class.getResource("/Resource/coriandoli.gif")));
        lblNewLabel_3.setBounds(25, 71, 386, 179);
        panel_1.add(lblNewLabel_3);
        
        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(25, 71, 386, 179);
        panel_1.add(scrollPane_1);
        
        JList list_1 = new JList();
        list_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
        list_1.setModel(new AbstractListModel() {
        	String[] values = new String[] {"ciao \t\t15 \t\t12\t\t12"};
        	public int getSize() {
        		return values.length;
        	}
        	public Object getElementAt(int index) {
        		return values[index];
        	}
        });
        list_1.setToolTipText("ciao");
        list_1.setBackground(new Color(255, 255, 255));
        scrollPane_1.setViewportView(list_1);
        JLabel lblNewLabel_1 = new JLabel(new ImageIcon(Grafica.class.getResource("/Resource/2.jpeg")));
        lblNewLabel_1.setBounds(0, 0, 444, 272);
        panel_1.add(lblNewLabel_1);

        JPanel panel_2 = new JPanel();
        frame.getContentPane().add(panel_2, "name_1263126193526326");
        panel_2.setLayout(null);


        JLabel lblNewLabel_26 = new JLabel("Simulazione partite");
        lblNewLabel_26.setForeground(new Color(255, 255, 255));
        lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_26.setBounds(146, 6, 143, 16);
        panel_2.add(lblNewLabel_26);

        btnNewButton_1 = new JButton("Simula incontri");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                panel_2.setVisible(true);
            }
        });
        btnNewButton_1.setBounds(6, 234, 130, 29);
        panel.add(btnNewButton_1);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(Grafica.class.getResource("/Resource/1.jpeg")));
        lblNewLabel.setBounds(0, 0, 438, 266);
        panel.add(lblNewLabel);


        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(89, 47, 251, 194);
        panel_2.add(scrollPane);
        scrollPane.getViewport().setOpaque(false);

        JList list1 = new JList();
        list1.setModel(new AbstractListModel() {
            String[] values = new String[]{"ciao1"};

            public int getSize() {
                return values.length;
            }

            public Object getElementAt(int index) {
                return values[index];
            }
        });


        btnNewButton_3 = new JButton("<--");
        btnNewButton_3.setBounds(6, 121, 71, 29);
        panel_2.add(btnNewButton_3);

        btnNewButton_4 = new JButton("-->");
        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                scrollPane.setViewportView(list1);
            }
        });
        btnNewButton_4.setBounds(352, 121, 71, 29);
        panel_2.add(btnNewButton_4);

        btnNewButton_5 = new JButton("Back");
        btnNewButton_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel_2.setVisible(false);
                panel.setVisible(true);
            }
        });
        btnNewButton_5.setBounds(313, 1, 117, 29);
        panel_2.add(btnNewButton_5);
        
        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon(Grafica.class.getResource("/Resource/2.jpeg")));
        lblNewLabel_2.setBounds(0, 0, 430, 264);
        panel_2.add(lblNewLabel_2);
        
                JList list = new JList();
                list.setBounds(110, 34, 226, 207);
                panel_2.add(list);
                list.setModel(new AbstractListModel() {
                    String[] values = new String[]{"ciao"};

                    public int getSize() {
                        return values.length;
                    }

                    public Object getElementAt(int index) {
                        return values[index];
                    }
                });


    }
}
