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
import java.awt.Color;

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
		setBounds(0,0,1280,730);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblMainMenu = new JLabel("Main Menu");
		lblMainMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMainMenu.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
		lblMainMenu.setBounds(467, 11, 348, 78);
		contentPane.add(lblMainMenu);

		JButton btnExitButton = new JButton("Exit");
		btnExitButton.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
		btnExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
		btnExitButton.setBounds(999, 529, 215, 71);
		contentPane.add(btnExitButton);

		JButton btnCollStudent = new JButton("College Student");
		btnCollStudent.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
		btnCollStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CollStudentLogin collstudentlogin = new CollStudentLogin();
				collstudentlogin.setVisible(true);
				setVisible(false);
			}
		});
		btnCollStudent.setBounds(442, 175, 381, 78);
		contentPane.add(btnCollStudent);

		JButton btnGenStaff = new JButton("General Staff");
		btnGenStaff.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
		btnGenStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				GeneralStaffLogin generalstafflogin = new GeneralStaffLogin();
				generalstafflogin.setVisible(true);
				setVisible(false);
			}
		});
		btnGenStaff.setBounds(442, 272, 381, 78);
		contentPane.add(btnGenStaff);

		JLabel lblNewLabel = new JLabel("Sign in as:");
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(422, 100, 393, 51);
		contentPane.add(lblNewLabel);

		JButton btnUniversityAdministrationButton = new JButton("University Administration");
		btnUniversityAdministrationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UniversityAdministrationLogin universityadministrationlogin = new UniversityAdministrationLogin();
				universityadministrationlogin.setVisible(true);
				setVisible(false);
			}
		});
		btnUniversityAdministrationButton.setFont(new Font("Bookman Old Style", Font.PLAIN, 25));
		btnUniversityAdministrationButton.setBounds(442, 371, 381, 78);
		contentPane.add(btnUniversityAdministrationButton);
		
		JLabel lblImage1 = new JLabel("");
		lblImage1.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
		Image img1 = new ImageIcon(this.getClass().getResource("/Pics/java-19.png")).getImage();
		lblImage1.setIcon(new ImageIcon(img1));
		lblImage1.setBounds(0, 0, 415, 693);
		getContentPane().add(lblImage1);
		
		JLabel lblImage2 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/Pics/corona.png")).getImage();
		lblImage2.setIcon(new ImageIcon(img2));
		lblImage2.setBounds(861, 335, 128, 128);
		contentPane.add(lblImage2);
		
		JLabel lblImage4 = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/Pics/corona.png")).getImage();
		lblImage4.setIcon(new ImageIcon(img4));
		lblImage4.setBounds(915, 99, 128, 128);
		contentPane.add(lblImage4);
		
		JLabel lblImage5 = new JLabel("");
		Image img5 = new ImageIcon(this.getClass().getResource("/Pics/corona.png")).getImage();
		lblImage5.setIcon(new ImageIcon(img5));
		lblImage5.setBounds(1071, 231, 128, 128);
		contentPane.add(lblImage5);
		
		Image img3 = new ImageIcon(this.getClass().getResource("/Pics/close (1).png")).getImage();
		btnExitButton.setIcon(new ImageIcon(img3));
		btnExitButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(btnExitButton);
	}
}
