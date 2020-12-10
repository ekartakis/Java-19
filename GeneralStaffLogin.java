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
		setBounds(100, 100, 808, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		contentPane.setLayout(null);
		textField = new JTextField();
		textField.setBounds(305, 178, 372, 52);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblVAT = new JLabel("ID");
		lblVAT.setHorizontalAlignment(SwingConstants.LEFT);
		lblVAT.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblVAT.setBounds(47, 192, 159, 53);
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
		btnGeneralStaffLogin.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnGeneralStaffLogin.setBounds(504, 306, 205, 61);
		contentPane.add(btnGeneralStaffLogin);
		
		JLabel lblGeneralStaffLogin = new JLabel("Enter your TIN identification number:");
		lblGeneralStaffLogin.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblGeneralStaffLogin.setBounds(47, 38, 657, 84);
		contentPane.add(lblGeneralStaffLogin);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				MainMenu mainmenu = new MainMenu();
				mainmenu.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton.setBounds(47, 306, 205, 61);
		contentPane.add(btnNewButton);
		
		
	}
	
}
