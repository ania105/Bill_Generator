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
		
		JButton btnNewButton = new JButton("MOCKTAIL");
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
		btnStarters.setBounds(116, 193, 195, 46);
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
		
		JPanel panel_11 = new JPanel();
		tabbedPane.addTab("Main Course", null, panel_11, null);
		panel_11.setLayout(null);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("M A I N  C O U R S E");
		lblNewLabel_1_1_1_1.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1.setBounds(129, 56, 194, 25);
		panel_11.add(lblNewLabel_1_1_1_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(89, 91, 275, 25);
		panel_11.add(separator_3);
		
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
