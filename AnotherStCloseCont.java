import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

public class AnotherStCloseCont extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnotherStCloseCont frame = new AnotherStCloseCont();
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
	public AnotherStCloseCont() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,1280,730);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddAnotherStudentCloseContact = new JLabel("Would you like to add another close contact?");
		lblAddAnotherStudentCloseContact.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
		lblAddAnotherStudentCloseContact.setBounds(37, 28, 722, 86);
		contentPane.add(lblAddAnotherStudentCloseContact);
		
		JButton btnYesButton = new JButton("Yes");
		btnYesButton.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
		btnYesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				NewPosStCaseMenu n = new NewPosStCaseMenu();
				n.setVisible(true);
			}
		});
		btnYesButton.setBounds(47, 529, 215, 71);
		contentPane.add(btnYesButton);
		
		JButton btnNoButton = new JButton("No");
		btnNoButton.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
		btnNoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				UniversityAdministrationMenu u = new UniversityAdministrationMenu();
				u.setVisible(true);
			}
		});
		btnNoButton.setBounds(999, 529, 215, 71);
		contentPane.add(btnNoButton);
		
		JLabel lblImage10 = new JLabel("");
		Image img10 = new ImageIcon(this.getClass().getResource("/Pics/135464593_1077636602678989_8400056473973577538_n.png")).getImage();
		lblImage10.setIcon(new ImageIcon(img10));
		lblImage10.setBounds(981, 0, 285, 233);
		contentPane.add(lblImage10);
		
		JLabel lblImage14 = new JLabel("");
		Image img14 = new ImageIcon(this.getClass().getResource("/Pics/Healthcare-Virus-icon.png")).getImage();
		lblImage14.setIcon(new ImageIcon(img14));
		lblImage14.setBounds(321, 156, 96, 96);
		contentPane.add(lblImage14);
		
		JLabel lblImage2 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/Pics/Healthcare-Virus-icon.png")).getImage();
		lblImage2.setIcon(new ImageIcon(img2));
		lblImage2.setBounds(234, 317, 96, 96);
		contentPane.add(lblImage2);
		
		JLabel lblImage4 = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/Pics/Healthcare-Virus-icon.png")).getImage();
		lblImage4.setIcon(new ImageIcon(img4));
		lblImage4.setBounds(104, 215, 96, 96);
		contentPane.add(lblImage4);
	}

}
