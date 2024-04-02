package bill;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;
import javax.swing.JScrollPane;
import java.awt.event.InputMethodListener;
import java.text.DecimalFormat;
import java.awt.event.InputMethodEvent;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTextPane;
public class Bill_G extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JLabel bill_tot;
	private JLabel Total;
	private JLabel Tax;
	private JTextPane textPane;
	
		public void addTable(String Item, String Qty,double Price ) {
		 
		
		Double tqty = Double.valueOf(Qty);
		Double tot_prc = Price * tqty;
		
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.addRow(new Object[] {Item , Qty, tot_prc} );
		
	}
	

	
	public void cart_total() {
		int numofrow = table.getRowCount();
		double total = 0;
		for (int i = 0; i<numofrow; i++) {
			double value = Double.valueOf(table.getValueAt(i, 2).toString());
			total += value;
		}
		DecimalFormat df = new DecimalFormat("000.00");
		String d1 = df.format(total);
		bill_tot.setText(d1);
		
		// total and tax
		
	//	double tx = Double.valueOf(Tax.getText());
		double all_tot = total * 0.05;
		double all_total = total + all_tot;
		Total.setText(String.valueOf(all_total));
	}
	
	
	public void drwbill() {
		textPane.setText("                       \t  The Seraphina\n");
		textPane.setText(textPane.getText()+("                             \t568/Green street,\n"));
		textPane.setText(textPane.getText()+("                                 \t   Siolim\n"));
		textPane.setText(textPane.getText()+"  ----------------------------------------------------------------------------------------------------\n");
		textPane.setText(textPane.getText()+("         Item  \t\t  Qty  \t\t  Price \n"));
		textPane.setText(textPane.getText()+"  ----------------------------------------------------------------------------------------------------\n");
		
		// add table
		
		DefaultTableModel dt = (DefaultTableModel) table.getModel();
		for (int i = 0; i < table.getRowCount(); i++) {
			String itm = dt.getValueAt(i, 0).toString();   // Item Name
			String qt = dt.getValueAt(i, 1).toString();		// Qty
			String prc = dt.getValueAt(i, 2).toString();	// Price
			
			textPane.setText(textPane.getText() +"    " +itm +"\t  " + qt + "\t\t" + prc + "\n");
				
		}
		// end of table
		
		textPane.setText(textPane.getText()+"  -----------------------------------------------------------------------------------------------------\n");
		textPane.setText(textPane.getText()+"   Subtotal :\t\t" + bill_tot.getText() + "\n");
		textPane.setText(textPane.getText()+"   Tax :\t\t" + "5.0%"+ "\n");
		textPane.setText(textPane.getText()+"   Total :\t\t" + Total.getText() + "\n");
		textPane.setText(textPane.getText()+"  ====================================================================================\n");
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bill_G frame = new Bill_G();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Bill_G() {
		initComponents();
	}
	
	private void initComponents() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1550, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 51, 0));
		panel.setBounds(0, 0, 1544, 716);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("R E S T A U R A N T   M A N A G E M E N T   S Y S T E M");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 27));
		lblNewLabel.setBounds(390, -15, 780, 83);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(10, 76, 454, 630);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 10, 454, 620);
		panel_1.add(tabbedPane);
		
		

		
		JPanel panel_9 = new JPanel();
		tabbedPane.addTab("Menu", null, panel_9, null);
		panel_9.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("MENU");
		lblNewLabel_2.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(180, 24, 93, 46);
		panel_9.add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(62, 78, 301, 2);
		panel_9.add(separator);
		
		JButton btnNewButton = new JButton("MOCKTAIL");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(UIManager.getColor("Button.background"));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnNewButton.setBounds(116, 114, 195, 46);
		panel_9.add(btnNewButton);
		
		JButton btnStarters = new JButton("STARTERS");
		btnStarters.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		btnStarters.setFont(new Font("Arial", Font.PLAIN, 18));
		btnStarters.setBounds(116, 191, 195, 46);
		panel_9.add(btnStarters);
		
		JButton btnMainCourse = new JButton("MAIN COURSE");
		btnMainCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		btnMainCourse.setFont(new Font("Arial", Font.PLAIN, 18));
		btnMainCourse.setBounds(116, 268, 195, 46);
		panel_9.add(btnMainCourse);
		
		JButton btnDessert = new JButton("DESSERT");
		btnDessert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(4);
			}
		});
		btnDessert.setFont(new Font("Arial", Font.PLAIN, 18));
		btnDessert.setBounds(116, 353, 195, 46);
		panel_9.add(btnDessert);
		
		JButton btnBeverages = new JButton("BEVERAGES");
		btnBeverages.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(5);
			}
		});
		btnBeverages.setFont(new Font("Arial", Font.PLAIN, 18));
		btnBeverages.setBounds(116, 435, 195, 46);
		panel_9.add(btnBeverages);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Mocktails", null, panel_6, null);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("M O C K T A I L S");
		lblNewLabel_1_1.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(130, 45, 194, 25);
		panel_6.add(lblNewLabel_1_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(94, 85, 264, 14);
		panel_6.add(separator_1_1);
		//
		
		 
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox.setBounds(289, 157, 133, 25);
		panel_6.add(comboBox);
		
		//
		
		JButton lblNewLabel_3 = new JButton("Blue Moon");
		lblNewLabel_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Qty = (String) comboBox.getSelectedItem();
				addTable("Blue Moon     ", Qty, 210.00);
				
			}});
		
	
		
		lblNewLabel_3.setFont(new Font("Berlin Sans FB", Font.PLAIN, 22));
		lblNewLabel_3.setBounds(27, 147, 207, 36);
		panel_6.add(lblNewLabel_3);
		
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_1.setBounds(289, 241, 133, 25);
		panel_6.add(comboBox_1);
		
		JButton lblNewLabel_3_1 = new JButton("Chilli Guava");
		lblNewLabel_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Qty = (String) comboBox_1.getSelectedItem();
				addTable("Chilli Guava     ", Qty, 210.00);
			}
		});
		lblNewLabel_3_1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 22));
		lblNewLabel_3_1.setBounds(27, 231, 207, 36);
		panel_6.add(lblNewLabel_3_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_1_1.setBounds(289, 328, 133, 25);
		panel_6.add(comboBox_1_1);
		
		JButton lblNewLabel_3_1_1 = new JButton("Mint Mojito");
		lblNewLabel_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Qty = (String) comboBox_1_1.getSelectedItem();
				addTable("Mint Mojito     ", Qty, 235.00);
			}
		});
		lblNewLabel_3_1_1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 22));
		lblNewLabel_3_1_1.setBounds(27, 319, 207, 36);
		panel_6.add(lblNewLabel_3_1_1);
		
		JComboBox comboBox_1_2 = new JComboBox();
		comboBox_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_1_2.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_1_2.setBounds(289, 422, 133, 25);
		panel_6.add(comboBox_1_2);
		
		JButton lblNewLabel_3_1_2 = new JButton("Cranberry Mix");
		lblNewLabel_3_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Qty = (String) comboBox_1_2.getSelectedItem();
				addTable("Cranberry Mix ", Qty, 275.00);
			}
		});
		lblNewLabel_3_1_2.setFont(new Font("Berlin Sans FB", Font.PLAIN, 22));
		lblNewLabel_3_1_2.setBounds(27, 408, 207, 47);
		panel_6.add(lblNewLabel_3_1_2);
		
	
		
		
		
		
		
		JPanel panel_10 = new JPanel();
		tabbedPane.addTab("Starters", null, panel_10, null);
		panel_10.setLayout(null);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("S T A R T E R S");
		lblNewLabel_1_1_1.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(136, 55, 194, 25);
		panel_10.add(lblNewLabel_1_1_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(81, 90, 280, 39);
		panel_10.add(separator_2);
		
		
		JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_2_1.setBounds(293, 217, 133, 25);
		panel_10.add(comboBox_2_1);
		
	    JButton lblNewLabel_3_3 = new JButton("Harabhara Kebab");
	    lblNewLabel_3_3.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String Qty = (String) comboBox_2_1.getSelectedItem();
				addTable("Harabhara Kebab", Qty, 325.00);
	    	}
	    });
		lblNewLabel_3_3.setFont(new Font("Berlin Sans FB", Font.PLAIN, 22));
		lblNewLabel_3_3.setBounds(32, 205, 212, 36);
		panel_10.add(lblNewLabel_3_3);
		
		JComboBox comboBox_2_2 = new JComboBox();
		comboBox_2_2.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_2_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_2_2.setBounds(293, 292, 133, 25);
		panel_10.add(comboBox_2_2);
		
		JButton lblNewLabel_3_4 = new JButton("Manchurian Dry");
		lblNewLabel_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Qty = (String) comboBox_2_2.getSelectedItem();
				addTable("Manchurian Dry", Qty, 325.00);
			}
		});
		lblNewLabel_3_4.setFont(new Font("Berlin Sans FB", Font.PLAIN, 22));
		lblNewLabel_3_4.setBounds(31, 280, 212, 36);
		panel_10.add(lblNewLabel_3_4);
		
		JComboBox comboBox_2_3 = new JComboBox();
		comboBox_2_3.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_2_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_2_3.setBounds(293, 371, 133, 25);
		panel_10.add(comboBox_2_3);
		
		JButton lblNewLabel_3_5 = new JButton("Mexican Volcano");
		lblNewLabel_3_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Qty = (String) comboBox_2_3.getSelectedItem();
				addTable("Mexican Volcano", Qty, 315.00);
			}
		});
		lblNewLabel_3_5.setFont(new Font("Berlin Sans FB", Font.PLAIN, 22));
		lblNewLabel_3_5.setBounds(36, 359, 204, 36);
		panel_10.add(lblNewLabel_3_5);
		
		JComboBox comboBox_2_4 = new JComboBox();
		comboBox_2_4.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_2_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_2_4.setBounds(293, 447, 133, 25);
		panel_10.add(comboBox_2_4);
		
		JButton lblNewLabel_3_6 = new JButton("French Fries");
		lblNewLabel_3_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Qty = (String) comboBox_2_4.getSelectedItem();
				addTable("French Fries", Qty, 165.00);
			}
		});
		lblNewLabel_3_6.setFont(new Font("Berlin Sans FB", Font.PLAIN, 22));
		lblNewLabel_3_6.setBounds(37, 435, 203, 36);
		panel_10.add(lblNewLabel_3_6);
		

		JComboBox comboBox_2_5 = new JComboBox();
		comboBox_2_5.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_2_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_2_5.setBounds(293, 520, 133, 25);
		panel_10.add(comboBox_2_5);
		
		JButton lblNewLabel_3_7 = new JButton("Simply Nachos");
		lblNewLabel_3_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Qty = (String) comboBox_2_5.getSelectedItem();
				addTable("Simply Nachos", Qty, 275.00);
			}
		});
		lblNewLabel_3_7.setFont(new Font("Berlin Sans FB", Font.PLAIN, 22));
		lblNewLabel_3_7.setBounds(37, 508, 200, 36);
		panel_10.add(lblNewLabel_3_7);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_2.setBounds(293, 151, 133, 25);
		panel_10.add(comboBox_2);
		
		JButton lblNewLabel_3_2 = new JButton("Tandoori Platter");
		lblNewLabel_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Qty = (String) comboBox_2.getSelectedItem();
				addTable("Tandoori Platter", Qty, 495.00);
				
			}
		});
		lblNewLabel_3_2.setFont(new Font("Berlin Sans FB", Font.PLAIN, 22));
		lblNewLabel_3_2.setBounds(31, 139, 210, 36);
		panel_10.add(lblNewLabel_3_2);
		
		
		
		
		JPanel panel_11 = new JPanel();
		tabbedPane.addTab("Main Course", null, panel_11, null);
		panel_11.setLayout(null);
		
//-----------------------------------------------------------------------------------------------
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("M A I N  C O U R S E");
		lblNewLabel_1_1_1_1.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1.setBounds(129, 56, 194, 25);
		panel_11.add(lblNewLabel_1_1_1_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(89, 91, 275, 25);
		panel_11.add(separator_3);
		
		JComboBox comboBox_2_6 = new JComboBox();
		comboBox_2_6.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_2_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_2_6.setBounds(285, 147, 133, 25);
		panel_11.add(comboBox_2_6);
		
		JButton lblNewLabel_3_2_1 = new JButton("Shahi Panner");
		lblNewLabel_3_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Qty = (String) comboBox_2_6.getSelectedItem();
				addTable("Shahi Panner", Qty, 395.00);
				
			}
		});
		lblNewLabel_3_2_1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 22));
		lblNewLabel_3_2_1.setBounds(20, 136, 210, 36);
		panel_11.add(lblNewLabel_3_2_1);
		
		JComboBox comboBox_2_7 = new JComboBox();
		comboBox_2_7.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_2_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_2_7.setBounds(285, 227, 133, 25);
		panel_11.add(comboBox_2_7);
		
		JButton lblNewLabel_3_2_2 = new JButton("Kaju Masala");
		lblNewLabel_3_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Qty = (String) comboBox_2_7.getSelectedItem();
				addTable("Kaju Masala    ", Qty, 395.00);
			
			}
		});
		lblNewLabel_3_2_2.setFont(new Font("Berlin Sans FB", Font.PLAIN, 22));
		lblNewLabel_3_2_2.setBounds(20, 215, 210, 36);
		panel_11.add(lblNewLabel_3_2_2);
		
		
		JComboBox comboBox_2_8 = new JComboBox();
		comboBox_2_8.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_2_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_2_8.setBounds(285, 308, 133, 25);
		panel_11.add(comboBox_2_8);
		
		JButton lblNewLabel_3_2_3 = new JButton("Veg. Korma");
		lblNewLabel_3_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Qty = (String) comboBox_2_8.getSelectedItem();
				addTable("Veg. Korma    ", Qty, 395.00);
			}
		});
		lblNewLabel_3_2_3.setFont(new Font("Berlin Sans FB", Font.PLAIN, 22));
		lblNewLabel_3_2_3.setBounds(20, 296, 210, 36);
		panel_11.add(lblNewLabel_3_2_3);
		
		
		JComboBox comboBox_2_9 = new JComboBox();
		comboBox_2_9.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_2_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_2_9.setBounds(285, 384, 133, 25);
		panel_11.add(comboBox_2_9);
		
		JButton lblNewLabel_3_2_4 = new JButton("Tandoori Roti");
		lblNewLabel_3_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Qty = (String) comboBox_2_9.getSelectedItem();
				addTable("Tandoori Roti", Qty, 60.00);
			}
		});
		lblNewLabel_3_2_4.setFont(new Font("Berlin Sans FB", Font.PLAIN, 22));
		lblNewLabel_3_2_4.setBounds(20, 375, 210, 36);
		panel_11.add(lblNewLabel_3_2_4);
		
		
		JComboBox comboBox_2_10 = new JComboBox();
		comboBox_2_10.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_2_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_2_10.setBounds(285, 469, 133, 25);
		panel_11.add(comboBox_2_10);
		
		JButton lblNewLabel_3_2_5 = new JButton("Butter Roti");
		lblNewLabel_3_2_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Qty = (String) comboBox_2_10.getSelectedItem();
				addTable("Butter Roti    ", Qty, 75.00);
			}
		});
		lblNewLabel_3_2_5.setFont(new Font("Berlin Sans FB", Font.PLAIN, 22));
		lblNewLabel_3_2_5.setBounds(20, 457, 210, 36);
		panel_11.add(lblNewLabel_3_2_5);
		
		
	//------------------------------------------------------------------------------------------------------------------------------------	
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Dessert", null, panel_7, null);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("D E S S E R T S");
		lblNewLabel_1.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(150, 36, 154, 25);
		panel_7.add(lblNewLabel_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(92, 84, 252, 2);
		panel_7.add(separator_1);
		
		JComboBox comboBox_2_7_1 = new JComboBox();
		comboBox_2_7_1.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_2_7_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_2_7_1.setBounds(286, 155, 133, 25);
		panel_7.add(comboBox_2_7_1);
		
		JButton lblNewLabel_3_2_1_1 = new JButton("Sizzling Brownie");
		lblNewLabel_3_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Qty = (String) comboBox_2_7_1.getSelectedItem();
				addTable("Sizzling Brownie", Qty, 295.00);
			}
		});
		lblNewLabel_3_2_1_1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 22));
		lblNewLabel_3_2_1_1.setBounds(33, 144, 210, 47);
		panel_7.add(lblNewLabel_3_2_1_1);
		
		JComboBox comboBox_2_7_2 = new JComboBox();
		comboBox_2_7_2.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_2_7_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_2_7_2.setBounds(286, 246, 133, 25);
		panel_7.add(comboBox_2_7_2);
		
		JButton lblNewLabel_3_2_1_2 = new JButton("Gulab Jamun");
		lblNewLabel_3_2_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Qty = (String) comboBox_2_7_2.getSelectedItem();
				addTable("Gulab Jamun", Qty, 145.00);
			}
		});
		lblNewLabel_3_2_1_2.setFont(new Font("Berlin Sans FB", Font.PLAIN, 22));
		lblNewLabel_3_2_1_2.setBounds(33, 232, 210, 47);
		panel_7.add(lblNewLabel_3_2_1_2);
		
		JComboBox comboBox_2_7_3 = new JComboBox();
		comboBox_2_7_3.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_2_7_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_2_7_3.setBounds(286, 332, 133, 25);
		panel_7.add(comboBox_2_7_3);
		
		JButton lblNewLabel_3_2_1_3 = new JButton("Ice cream");
		lblNewLabel_3_2_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Qty = (String) comboBox_2_7_3.getSelectedItem();
				addTable("Ice cream        ", Qty, 90.00);
			}
		});
		lblNewLabel_3_2_1_3.setFont(new Font("Berlin Sans FB", Font.PLAIN, 22));
		lblNewLabel_3_2_1_3.setBounds(33, 320, 210, 47);
		panel_7.add(lblNewLabel_3_2_1_3);
		
		
//---------------------------------------------------------------------------------------------------------------------------------------------------------
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Beverages", null, panel_5, null);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("B E V E R A G E S");
		lblNewLabel_1_2.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(133, 47, 177, 25);
		panel_5.add(lblNewLabel_1_2);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(91, 82, 235, 19);
		panel_5.add(separator_4);
		
		JComboBox comboBox_2_7_1_1 = new JComboBox();
		comboBox_2_7_1_1.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_2_7_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_2_7_1_1.setBounds(289, 125, 133, 25);
		panel_5.add(comboBox_2_7_1_1);
		
		JButton lblNewLabel_3_2_1_1_1 = new JButton("Mineral Water");
		lblNewLabel_3_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Qty = (String) comboBox_2_7_1_1.getSelectedItem();
				addTable("Mineral Water", Qty, 30.00);
			}
		});
		lblNewLabel_3_2_1_1_1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 22));
		lblNewLabel_3_2_1_1_1.setBounds(26, 111, 210, 47);
		panel_5.add(lblNewLabel_3_2_1_1_1);
		
		JComboBox comboBox_2_7_1_2 = new JComboBox();
		comboBox_2_7_1_2.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_2_7_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_2_7_1_2.setBounds(289, 221, 133, 25);
		panel_5.add(comboBox_2_7_1_2);
		
		
		JButton lblNewLabel_3_2_1_1_1_1 = new JButton("Masala Soda");
		lblNewLabel_3_2_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Qty = (String) comboBox_2_7_1_2.getSelectedItem();
				addTable("Masala Soda", Qty, 100.00);
			}
		});
		lblNewLabel_3_2_1_1_1_1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 22));
		lblNewLabel_3_2_1_1_1_1.setBounds(26, 207, 210, 47);
		panel_5.add(lblNewLabel_3_2_1_1_1_1);
		

		JComboBox comboBox_2_7_1_3 = new JComboBox();
		comboBox_2_7_1_3.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_2_7_1_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_2_7_1_3.setBounds(289, 317, 133, 25);
		panel_5.add(comboBox_2_7_1_3);
		
		JButton lblNewLabel_3_2_1_1_1_2 = new JButton("Rose Lassi");
		lblNewLabel_3_2_1_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Qty = (String) comboBox_2_7_1_3.getSelectedItem();
				addTable("Rose Lassi    ", Qty, 130.00);
				
			}
		});
		lblNewLabel_3_2_1_1_1_2.setFont(new Font("Berlin Sans FB", Font.PLAIN, 22));
		lblNewLabel_3_2_1_1_1_2.setBounds(26, 303, 210, 47);
		panel_5.add(lblNewLabel_3_2_1_1_1_2);
		
		JComboBox comboBox_2_7_1_4 = new JComboBox();
		comboBox_2_7_1_4.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_2_7_1_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_2_7_1_4.setBounds(289, 413, 133, 25);
		panel_5.add(comboBox_2_7_1_4);
		
		
		JButton lblNewLabel_3_2_1_1_1_3 = new JButton("Dry Fruit Lassi");
		lblNewLabel_3_2_1_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Qty = (String) comboBox_2_7_1_4.getSelectedItem();
			addTable("Dry Fruit Lassi", Qty, 180.00);
			}
		});
		lblNewLabel_3_2_1_1_1_3.setFont(new Font("Berlin Sans FB", Font.PLAIN, 22));
		lblNewLabel_3_2_1_1_1_3.setBounds(26, 399, 210, 47);
		panel_5.add(lblNewLabel_3_2_1_1_1_3);
		
	
		JComboBox comboBox_2_7_1_4_1 = new JComboBox();
		comboBox_2_7_1_4_1.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_2_7_1_4_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_2_7_1_4_1.setBounds(289, 506, 133, 25);
		panel_5.add(comboBox_2_7_1_4_1);
	
		JButton lblNewLabel_3_2_1_1_1_3_1 = new JButton("Buttermilk");
		lblNewLabel_3_2_1_1_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Qty = (String) comboBox_2_7_1_4_1.getSelectedItem();
				addTable("Buttermilk    ", Qty, 90.00);
			}
		});
		lblNewLabel_3_2_1_1_1_3_1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 22));
		lblNewLabel_3_2_1_1_1_3_1.setBounds(26, 492, 210, 47);
		panel_5.add(lblNewLabel_3_2_1_1_1_3_1);
		
//------------------------------------------------------------------------------------------------------------------------------	
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(496, 78, 518, 522);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 498, 376);
		panel_2.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Item", "Qty", "Price"
			}
		));
		
		JLabel lblNewLabel_4 = new JLabel("Sub Total: ");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_4.setBounds(10, 403, 89, 22);
		panel_2.add(lblNewLabel_4);
		
	    bill_tot = new JLabel("00");
	    bill_tot.setFont(new Font("Tahoma", Font.PLAIN, 16));
		bill_tot.setBackground(new Color(0, 0, 0));
		bill_tot.setBounds(109, 400, 83, 29);
		bill_tot.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.add(bill_tot);
		
		JLabel lblNewLabel_4_1 = new JLabel(" Total  : ");
		lblNewLabel_4_1.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_4_1.setBounds(10, 447, 77, 22);
		panel_2.add(lblNewLabel_4_1);
		
		 Total = new JLabel("00");
		Total.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Total.setBorder(new LineBorder(new Color(0, 0, 0)));
		Total.setBackground(Color.BLACK);
		Total.setBounds(109, 444, 83, 29);
		panel_2.add(Total);
		
		JLabel lblNewLabel_4_2 = new JLabel("Tax  : ");
		lblNewLabel_4_2.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_4_2.setBounds(245, 403, 70, 22);
		panel_2.add(lblNewLabel_4_2);
		
		Tax = new JLabel("5%");
		Tax.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Tax.setBorder(new LineBorder(new Color(0, 0, 0)));
		Tax.setBackground(Color.BLACK);
		Tax.setBounds(309, 396, 83, 29);
		panel_2.add(Tax);
		 
		
        
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(1042, 78, 465, 522);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		textPane = new JTextPane();
		textPane.setBounds(10, 10, 445, 606);
		panel_3.add(textPane);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(496, 612, 1011, 94);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Receipt");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				drwbill();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(278, 21, 158, 47);
		panel_4.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Total");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cart_total();
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_1.setBounds(40, 21, 158, 47);
		panel_4.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Reset");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				((DefaultTableModel)table.getModel()).setNumRows(0);
				
				}
				
			}
		);
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_2.setBounds(510, 21, 158, 47);
		panel_4.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Exit");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_3.setBounds(745, 21, 168, 47);
		panel_4.add(btnNewButton_1_3);
		
		   
		
	}
	}


