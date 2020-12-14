import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class StaffNegative extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffNegative frame = new StaffNegative();
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
	public StaffNegative() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("You tested negative for Covid-19! Stay safe!");
		lblNewLabel.setBounds(12, 13, 408, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("You do not need to self-isolate if your test is negative, as long as:\r\n");
		lblNewLabel_1.setBounds(12, 42, 408, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("- Everyone you live with who has symptoms tests negative.\r\n");
		lblNewLabel_2.setBounds(12, 71, 420, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("- Everyone in your support bubble who has symptoms tests negative.\r\n\t\t\t\t\t");
		lblNewLabel_3.setBounds(12, 100, 408, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("- You feel well – if you feel unwell, stay at home until you’re feeling better.");
		lblNewLabel_4.setBounds(12, 129, 408, 16);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				GeneralStaffMenu gsm = new GeneralStaffMenu();
				gsm.setVisible(true);
			}
		});
		btnNewButton.setBounds(12, 215, 97, 25);
		contentPane.add(btnNewButton);
	}

}