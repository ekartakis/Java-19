import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 764, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblMainMenu = new JLabel("Main Menu");
		lblMainMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMainMenu.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblMainMenu.setBounds(247, 27, 230, 58);
		contentPane.add(lblMainMenu);

		JButton btnExitButton1 = new JButton("Exit");
		btnExitButton1.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnExitButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
		btnExitButton1.setBounds(51, 360, 115, 52);
		contentPane.add(btnExitButton1);

		JButton btnCollStudent = new JButton("College Student");
		btnCollStudent.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnCollStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CollStudentLogin collstudentlogin = new CollStudentLogin();
				collstudentlogin.setVisible(true);
			}
		});
		btnCollStudent.setBounds(85, 165, 348, 45);
		contentPane.add(btnCollStudent);

		JButton btnGenStaff = new JButton("General Staff");
		btnGenStaff.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnGenStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				GeneralStaffLogin generalstafflogin = new GeneralStaffLogin();
				generalstafflogin.setVisible(true);
			}
		});
		btnGenStaff.setBounds(85, 221, 348, 45);
		contentPane.add(btnGenStaff);

		JLabel lblNewLabel = new JLabel("Sign in as:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(51, 90, 393, 52);
		contentPane.add(lblNewLabel);

		JButton btnUniversityAdministrationButton = new JButton("University Administration");
		btnUniversityAdministrationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UniversityAdministrationLogin universityadministrationlogin = new UniversityAdministrationLogin();
				universityadministrationlogin.setVisible(true);

			}
		});
		btnUniversityAdministrationButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnUniversityAdministrationButton.setBounds(85, 277, 348, 45);
		contentPane.add(btnUniversityAdministrationButton);



	}
}
