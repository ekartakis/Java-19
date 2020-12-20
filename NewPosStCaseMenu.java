import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class NewPosStCaseMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewPosStCaseMenu frame = new NewPosStCaseMenu();
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
	public NewPosStCaseMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Add a staff member as a close\n"
				+ " contact of the positive case");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				AddNewCloseContofStaffMemberPosCase g = new AddNewCloseContofStaffMemberPosCase();
				g.setVisible(true);
			}
		});
		btnNewButton.setBounds(35, 124, 316, 49);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add a student as a close contact of the positive case:");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				AddNewCloseContofStPosCase h = new AddNewCloseContofStPosCase();
				h.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(35, 64, 316, 49);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Choose:");
		lblNewLabel.setBounds(21, 11, 365, 49);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				UniversityAdministrationMenu uniadmenu = new UniversityAdministrationMenu();
				uniadmenu.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(35, 202, 89, 34);
		contentPane.add(btnNewButton_2);
	}
}
