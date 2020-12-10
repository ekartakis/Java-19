import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CollStudentLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public static String AM;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CollStudentLogin frame = new CollStudentLogin();
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
	public CollStudentLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);



		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setBounds(305, 178, 372, 52);
		contentPane.add(textField);
		textField.setColumns(10);




		JLabel lblCollStudentUserName = new JLabel("ID");
		lblCollStudentUserName.setHorizontalAlignment(SwingConstants.LEFT);
		lblCollStudentUserName.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblCollStudentUserName.setBounds(85, 178, 189, 52);
		contentPane.add(lblCollStudentUserName);

		JButton btnCollStudentLoginButton = new JButton("Login");
		btnCollStudentLoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AM = textField.getText();

				String result = UpdateTheRecords.checkIfAmExist(Integer.parseInt(AM));
				if (result.equals("true")) {
					JOptionPane.showMessageDialog(contentPane, "You are successfully logged in.");
					setVisible(false);
					CollStudentMenu studentmenu = new CollStudentMenu();
					studentmenu.setVisible(true);

				}else if (result.equals("false")) {
					JOptionPane.showMessageDialog(contentPane, "You have inserted a wrong ID.");
				}

			}
		});
		btnCollStudentLoginButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnCollStudentLoginButton.setBounds(489, 287, 189, 60);
		contentPane.add(btnCollStudentLoginButton);

		JLabel lblLoginCollStudent = new JLabel("Enter your academic ID:");
		lblLoginCollStudent.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblLoginCollStudent.setBounds(63, 30, 614, 60);
		contentPane.add(lblLoginCollStudent);

		JButton btnNewButton = new JButton("Back");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				MainMenu mainmenu = new MainMenu();
				mainmenu.setVisible(true);
			}
		});
		btnNewButton.setBounds(63, 287, 189, 60);
		contentPane.add(btnNewButton);
	}

}