import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextField;

import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.SystemColor;

public class GeneralStaffLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public static String AFM;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GeneralStaffLogin frame = new GeneralStaffLogin();
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
	public GeneralStaffLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,1280,730);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		contentPane.setLayout(null);
		textField = new JTextField();
		textField.setFont(new Font("Bookman Old Style", Font.PLAIN, 25));
		textField.setBackground(SystemColor.menu);
		textField.setBounds(664, 257, 554, 86);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblVAT = new JLabel("TIN");
		lblVAT.setHorizontalAlignment(SwingConstants.LEFT);
		lblVAT.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
		lblVAT.setBounds(579, 254, 75, 86);
		contentPane.add(lblVAT);
		
		JButton btnGeneralStaffLogin = new JButton("Login");
		btnGeneralStaffLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tempAfm = 0;
				String result = " ";
				int pointer = 0;
				do {
				    try {
                        AFM = textField.getText();
				        tempAfm = Integer.parseInt(AFM);
				    } catch(Exception exc) {
					    pointer = 1 ;
					    JOptionPane.showMessageDialog(contentPane, "You have inserted a wrong ID.");
				    }
				} while (result != " ");
				result = UpdateTheRecords.checkIfAFMExist(tempAfm);
				if (pointer == 0) {
				    if (result.equals("true")) {
					    JOptionPane.showMessageDialog(contentPane, "You are successfully logged in.");
					    setVisible(false);
					    GeneralStaffMenu staffmenu = new GeneralStaffMenu();
					    staffmenu.setVisible(true);

				    }else if (result.equals("false")) {
					    JOptionPane.showMessageDialog(contentPane, "You have inserted a wrong ID.");
				    }
				}

			}
		});
		btnGeneralStaffLogin.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
		btnGeneralStaffLogin.setBounds(1041, 529, 215, 71);
		contentPane.add(btnGeneralStaffLogin);
		
		JLabel lblGeneralStaffLogin = new JLabel("Enter your TIN:");
		lblGeneralStaffLogin.setFont(new Font("Bookman Old Style", Font.PLAIN, 30));
		lblGeneralStaffLogin.setBounds(432, 66, 626, 86);
		contentPane.add(lblGeneralStaffLogin);
		
		JButton btnBackButton = new JButton("Back");
		btnBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				MainMenu mainmenu = new MainMenu();
				mainmenu.setVisible(true);
			}
		});
		btnBackButton.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnBackButton.setBounds(425, 529, 215, 71);
		contentPane.add(btnBackButton);
		
		Image img3 = new ImageIcon(this.getClass().getResource("/Pics/ok.png")).getImage();
		btnGeneralStaffLogin.setIcon(new ImageIcon(img3));
		btnGeneralStaffLogin.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(btnGeneralStaffLogin);
		
		Image img4 = new ImageIcon(this.getClass().getResource("/Pics/left-arrow (1).png")).getImage();
		btnBackButton.setIcon(new ImageIcon(img4));
		btnBackButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(btnBackButton);
		
		JLabel lblImage1 = new JLabel("");
		lblImage1.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
		Image img1 = new ImageIcon(this.getClass().getResource("/Pics/java-19.png")).getImage();
		lblImage1.setIcon(new ImageIcon(img1));
		lblImage1.setBounds(0, 0, 415, 693);
		contentPane.add(lblImage1);
		
		JLabel lblImage14 = new JLabel("");
		Image img14 = new ImageIcon(this.getClass().getResource("/Pics/lock.png")).getImage();
		lblImage14.setIcon(new ImageIcon(img14));
		lblImage14.setBounds(880, 371, 138, 141);
		contentPane.add(lblImage14);
	}
	
}