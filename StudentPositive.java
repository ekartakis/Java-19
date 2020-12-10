import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentPositive extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentPositive frame = new StudentPositive();
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
	public StudentPositive() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 846, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("You tested positive for Covid-19!   Follow the instructions below:");
		lblNewLabel.setBounds(12, 13, 374, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("- Self-isolate for 14 days from the day you were last in contact with the person who tested positive for coronavirus – as it can take up to 14 days for symptoms to appear.\r\n\t\t\t\t\t");
		lblNewLabel_1.setBounds(12, 51, 804, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("- Do not leave your home for any reason – if you need food or medicine, order it online or by phone, or ask friends and family to drop it off at your home.\"\r\n\t\t\t");
		lblNewLabel_2.setBounds(12, 96, 804, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("- Do not have visitors in your home, including friends and family – except for essential care.");
		lblNewLabel_3.setBounds(12, 128, 804, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("- Try to avoid contact with anyone you live with as much as possible.\r\n");
		lblNewLabel_4.setBounds(12, 157, 804, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("- People you live with do not need to self-isolate if you do not have symptoms.");
		lblNewLabel_5.setBounds(12, 186, 804, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("- People in your support bubble do not need to self-isolate if you do not have symptoms.");
		lblNewLabel_6.setBounds(12, 215, 804, 16);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("WARNING: If you live with someone at higher risk from coronavirus, try to arrange for them to stay with friends or family for 14 days.");
		lblNewLabel_7.setBounds(12, 244, 804, 16);
		contentPane.add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				CollStudentMenu smenu = new CollStudentMenu();
				smenu.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(12, 370, 97, 25);
		contentPane.add(btnNewButton);
	}
}
