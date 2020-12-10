import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class StaffNoCloseCon extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffNoCloseCon frame = new StaffNoCloseCon();
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
	public StaffNoCloseCon() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("You are not a close contact!!");
		lblNewLabel.setBounds(12, 13, 420, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Stay healthy!");
		lblNewLabel_1.setBounds(12, 38, 85, 16);
		contentPane.add(lblNewLabel_1);
		
		JButton btnBackButton = new JButton("Back");
		btnBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				CollStudentMenu smenu = new CollStudentMenu();
				smenu.setVisible(true);
			}
		});
		btnBackButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnBackButton.setBounds(12, 204, 152, 36);
		contentPane.add(btnBackButton);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				CollStudentMenu smenu = new CollStudentMenu();
				smenu.setVisible(true);
			}
		});
	}
}