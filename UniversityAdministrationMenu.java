import java.awt.Font;
import java.awt.Image;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class UniversityAdministrationMenu extends JFrame {

	private JPanel contentPane;
	private JButton btnExitButton;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UniversityAdministrationMenu frame = new UniversityAdministrationMenu();
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
	public UniversityAdministrationMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Add a new student case.");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				AddNewStCase addnewstcase = new AddNewStCase();
				addnewstcase.setVisible(true);
			}
		});
		btnNewButton.setBounds(286, 91, 173, 57);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Add a new staff case.");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				AddNewStaffCase addnewstaffcase = new AddNewStaffCase();
				addnewstaffcase.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(286, 161, 173, 58);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Process statistics.");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnNewButton_2.setBounds(286, 232, 173, 57);
		contentPane.add(btnNewButton_2);

		JLabel lblNewLabel = new JLabel("Options:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 24));
		lblNewLabel.setBounds(284, 25, 173, 55);
		contentPane.add(lblNewLabel);

		JButton btnBackButton;
		btnBackButton = new JButton("Back");
		btnBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				MainMenu mainmenu = new MainMenu();
				mainmenu.setVisible(true);
			}
		});
		btnBackButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnBackButton.setBounds(10, 322, 144, 37);
		contentPane.add(btnBackButton);
		
		JButton btnExitButton1 = new JButton("Exit");
		btnExitButton1.setForeground(Color.RED);
		btnExitButton1.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnExitButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
		btnExitButton1.setBounds(584, 322, 144, 37);
		contentPane.add(btnExitButton1);
	}
}
