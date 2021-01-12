import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

public class StudentNoCloseCon extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentNoCloseCon frame = new StudentNoCloseCon();
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
	public StudentNoCloseCon() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,1280,730);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("You are not a close contact.");
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
		lblNewLabel.setBounds(12, 30, 437, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Stay safe!");
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
		lblNewLabel_1.setBounds(12, 91, 227, 50);
		contentPane.add(lblNewLabel_1);
		
		JButton btnBackButton = new JButton("Back");
		btnBackButton.setBackground(new Color(240, 240, 240));
		btnBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				CollStudentMenu collstmenu = new CollStudentMenu();
				collstmenu.setVisible(true);
			}
		});
		btnBackButton.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
		btnBackButton.setBounds(47, 529, 215, 71);
		contentPane.add(btnBackButton);
		
		JLabel lblImage14 = new JLabel("");
		Image img14 = new ImageIcon(this.getClass().getResource("/Pics/social.png")).getImage();
		lblImage14.setIcon(new ImageIcon(img14));
		lblImage14.setBounds(966, 419, 163, 139);
		contentPane.add(lblImage14);
		
		JLabel lblImage13 = new JLabel("");
		Image img13 = new ImageIcon(this.getClass().getResource("/Pics/patient.png")).getImage();
		lblImage13.setIcon(new ImageIcon(img13));
		lblImage13.setBounds(998, 305, 62, 77);
		contentPane.add(lblImage13);
		
		JLabel lblImage10 = new JLabel("");
		Image img10 = new ImageIcon(this.getClass().getResource("/Pics/135464593_1077636602678989_8400056473973577538_n.png")).getImage();
		lblImage10.setIcon(new ImageIcon(img10));
		lblImage10.setBounds(981, 0, 285, 233);
		contentPane.add(lblImage10);
		
		JLabel lblNewLabel_2 = new JLabel("Please follow the instructions of the National Public Health Agency!");
		lblNewLabel_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
		lblNewLabel_2.setBounds(12, 152, 916, 50);
		contentPane.add(lblNewLabel_2);
		
		Image img4 = new ImageIcon(this.getClass().getResource("/Pics/left-arrow (1).png")).getImage();
		btnBackButton.setIcon(new ImageIcon(img4));
		btnBackButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(btnBackButton);
	}
}