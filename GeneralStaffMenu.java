import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class GeneralStaffMenu extends JFrame {

	private JPanel contentPane;
	private JButton btnExitButton;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GeneralStaffMenu frame = new GeneralStaffMenu();
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
	public GeneralStaffMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Show my status.");
		btnNewButton.setBounds(286, 91, 173, 57);
contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Show my close contacts.");
		btnNewButton_1.setBounds(286, 161, 173, 58);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Show statistics.");
		btnNewButton_2.setBounds(286, 230, 173, 57);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Options:");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		lblNewLabel.setBounds(342, 36, 59, 22);
		contentPane.add(lblNewLabel);
		
		JButton btnExitButton;
		btnExitButton = new JButton("Exit");
		btnExitButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnExitButton.setBounds(504, 294, 205, 65);
		contentPane.add(btnExitButton);
	}
}

