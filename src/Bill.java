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

public class Bill {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bill window = new Bill();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Bill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1550, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 153, 255));
		panel.setBounds(10, -10, 1536, 763);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("R E S T A U R A N T   M A N A G E M E N T   S Y S T E M");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 27));
		lblNewLabel.setBounds(346, 10, 780, 83);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 99, 454, 630);
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
		
		JLabel lblNewLabel_3 = new JLabel("MOCKTAILS");
		lblNewLabel_3.setFont(new Font("Bookman Old Style", Font.PLAIN, 19));
		lblNewLabel_3.setBounds(154, 123, 135, 33);
		panel_9.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("STARTERS");
		lblNewLabel_3_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 19));
		lblNewLabel_3_1.setBounds(154, 188, 135, 33);
		panel_9.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("MAIN COURSE");
		lblNewLabel_3_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 19));
		lblNewLabel_3_2.setBounds(138, 252, 150, 33);
		panel_9.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_4 = new JLabel("DESSERT");
		lblNewLabel_3_4.setFont(new Font("Bookman Old Style", Font.PLAIN, 19));
		lblNewLabel_3_4.setBounds(170, 315, 103, 33);
		panel_9.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_4_1 = new JLabel("BEVERAGES");
		lblNewLabel_3_4_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 19));
		lblNewLabel_3_4_1.setBounds(160, 389, 129, 33);
		panel_9.add(lblNewLabel_3_4_1);
		
	
		
		JPanel panel_10 = new JPanel();
		tabbedPane.addTab("Starters", null, panel_10, null);
		panel_10.setLayout(null);
		
		JPanel panel_11 = new JPanel();
		tabbedPane.addTab("Main Course", null, panel_11, null);
		panel_11.setLayout(null);
		
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
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Beverages", null, panel_5, null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(534, 106, 423, 445);
		panel.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(1042, 103, 465, 626);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 10, 465, 616);
		panel_3.add(tabbedPane_1);
		
		JPanel panel_8 = new JPanel();
		tabbedPane_1.addTab("Receipt", null, panel_8, null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(488, 574, 527, 167);
		panel.add(panel_4);
	}
}
