import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UniversityAdministrationLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UniversityAdministrationLogin frame = new UniversityAdministrationLogin();
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
	public UniversityAdministrationLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 808, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUniversityAdministrationLogin = new JLabel("Enter your password:");
		lblUniversityAdministrationLogin.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblUniversityAdministrationLogin.setBounds(47, 38, 657, 84);
		contentPane.add(lblUniversityAdministrationLogin);

		JLabel lblVAT = new JLabel("Password");
		lblVAT.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblVAT.setBounds(101, 192, 105, 53);
		contentPane.add(lblVAT);

		textField = new JTextField();
		textField.setBounds(216, 192, 496, 53);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnUniversityAdministrationLogin = new JButton("Login");
		btnUniversityAdministrationLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String code = textField.getText();

				if (code.equals("29072001")) {
					JOptionPane.showMessageDialog(contentPane, "You are successfully logined.");
					UniversityAdministrationMenu uniadminmenu = new UniversityAdministrationMenu();
					uniadminmenu.setVisible(true);

				}
			}
		});
		btnUniversityAdministrationLogin.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnUniversityAdministrationLogin.setBounds(507, 294, 205, 65);
		contentPane.add(btnUniversityAdministrationLogin);

		JButton btnBackButton = new JButton("Back");
		btnBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				MainMenu mainmenu = new MainMenu();
				mainmenu.setVisible(true);
			}
		});
		btnBackButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnBackButton.setBounds(47, 294, 205, 65);
		contentPane.add(btnBackButton);


	}

}
