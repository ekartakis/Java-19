import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class NewPosStaffCaseMenu extends JFrame {

	private JPanel contentPane;
	private JButton btnBackButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewPosStaffCaseMenu frame = new NewPosStaffCaseMenu();
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
	public NewPosStaffCaseMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,1280,730);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Add a staff member as a close\n"
				+ " contact of the positive case");
		btnNewButton.setFont(new Font("Bookman Old Style", Font.PLAIN, 23));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				AddNewCloseContofStaffMemberPosCase g = new AddNewCloseContofStaffMemberPosCase();
				g.setVisible(true);
			}
		});
		btnNewButton.setBounds(35, 187, 693, 46);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add a student as a close contact of the positive case");
		btnNewButton_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 23));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				AddNewCloseContofStPosCase h = new AddNewCloseContofStPosCase();
				h.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(35, 117, 693, 46);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Choose:");
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
		lblNewLabel.setBounds(37, 28, 722, 86);
		contentPane.add(lblNewLabel);
		
		JButton btnBackButton;
		btnBackButton = new JButton("Back");
		btnBackButton.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
		btnBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				UniversityAdministrationMenu uniadmenu = new UniversityAdministrationMenu();
				uniadmenu.setVisible(true);
			}
		});
		btnBackButton.setBounds(47, 529, 215, 71);
		contentPane.add(btnBackButton);
		
		JLabel lblImage10 = new JLabel("");
		Image img10 = new ImageIcon(this.getClass().getResource("/Pics/135464593_1077636602678989_8400056473973577538_n.png")).getImage();
		lblImage10.setIcon(new ImageIcon(img10));
		lblImage10.setBounds(981, 0, 285, 233);
		contentPane.add(lblImage10);
		
		Image img4 = new ImageIcon(this.getClass().getResource("/Pics/left-arrow (1).png")).getImage();
		btnBackButton.setIcon(new ImageIcon(img4));
		btnBackButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(btnBackButton);
		
		JLabel lblImage14 = new JLabel("");
		Image img14 = new ImageIcon(this.getClass().getResource("/Pics/covid-19.png")).getImage();
		lblImage14.setIcon(new ImageIcon(img14));
		lblImage14.setBounds(932, 297, 96, 96);
		contentPane.add(lblImage14);
		
		JLabel lblImage2 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/Pics/covid-19.png")).getImage();
		lblImage2.setIcon(new ImageIcon(img2));
		lblImage2.setBounds(810, 392, 96, 96);
		contentPane.add(lblImage2);
		
		JLabel lblImage5 = new JLabel("");
		Image img5 = new ImageIcon(this.getClass().getResource("/Pics/covid-19.png")).getImage();
		lblImage5.setIcon(new ImageIcon(img5));
		lblImage5.setBounds(1015, 440, 96, 96);
		contentPane.add(lblImage5);
	}
}
