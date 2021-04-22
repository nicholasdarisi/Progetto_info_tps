package view;

import java.awt.EventQueue;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class Grafica extends JFrame {
	
	private JTextField textField;
	public JFrame frame;
	ArrayList<DefaultListModel> lista = new ArrayList<DefaultListModel>();
	
	
	public Grafica() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "name_1193192040720394");
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Superlega");
		lblNewLabel.setBounds(193, 11, 61, 16);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnNewButton = new JButton("Classifica");
		btnNewButton.setBounds(293, 98, 130, 58);
		panel.add(btnNewButton);
		
		
		JLabel lblNewLabel_1 = new JLabel("Elenco squadre");
		lblNewLabel_1.setBounds(55, 61, 95, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Inter");
		lblNewLabel_2.setBounds(27, 103, 29, 16);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Milan");
		lblNewLabel_3.setBounds(27, 125, 34, 16);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_4 = new JLabel("Juventus");
		lblNewLabel_4.setBounds(27, 149, 54, 16);
		panel.add(lblNewLabel_4);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_5 = new JLabel("Arsenal");
		lblNewLabel_5.setBounds(27, 173, 47, 16);
		panel.add(lblNewLabel_5);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_6 = new JLabel("Atletico Madrid");
		lblNewLabel_6.setBounds(127, 125, 96, 16);
		panel.add(lblNewLabel_6);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_9 = new JLabel("Liverpool");
		lblNewLabel_9.setBounds(27, 226, 58, 16);
		panel.add(lblNewLabel_9);
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_7 = new JLabel("Chelsea");
		lblNewLabel_7.setBounds(27, 198, 49, 16);
		panel.add(lblNewLabel_7);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_8 = new JLabel("Barcellona");
		lblNewLabel_8.setBounds(127, 103, 64, 16);
		panel.add(lblNewLabel_8);
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_10 = new JLabel("Manchester City");
		lblNewLabel_10.setBounds(127, 149, 105, 16);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Manchester Utd");
		lblNewLabel_11.setBounds(127, 173, 105, 16);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Real Madrid");
		lblNewLabel_12.setBounds(127, 198, 79, 16);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Tottenham");
		lblNewLabel_13.setBounds(127, 226, 79, 16);
		panel.add(lblNewLabel_13);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, "name_1263115913667607");
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_14 = new JLabel("Classifica");
		lblNewLabel_14.setBounds(185, 6, 61, 16);
		panel_1.add(lblNewLabel_14);
		
		JButton btnNewButton_2 = new JButton("Back");
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
		
		JLabel lblNewLabel_24 = new JLabel("New label");
		lblNewLabel_24.setBounds(25, 76, 61, 16);
		panel_1.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("New label");
		lblNewLabel_25.setBounds(25, 98, 61, 16);
		panel_1.add(lblNewLabel_25);
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, "name_1263126193526326");
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_26 = new JLabel("Simulazione partite");
		lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_26.setBounds(146, 6, 143, 16);
		panel_2.add(lblNewLabel_26);
		
		JButton btnNewButton_1 = new JButton("Simula incontri");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel_2.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(293, 168, 139, 58);
		panel.add(btnNewButton_1);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(110, 48, 230, 211);
		panel_2.add(scrollPane);
		
		for (int i = 0; i<20; i++ ) {
			lista.get(i) ;
		}
				
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"ciao"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list);
		
		JList list1 = new JList();
		list1.setModel(new AbstractListModel() {
			String[] values = new String[] {"ciao1"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		
		JButton btnNewButton_3 = new JButton("<--");
		btnNewButton_3.setBounds(6, 121, 92, 29);
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("-->");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollPane.setViewportView(list1);
			}
		});
		btnNewButton_4.setBounds(352, 121, 92, 29);
		panel_2.add(btnNewButton_4);
		



		//ciao darisi
	}
}
