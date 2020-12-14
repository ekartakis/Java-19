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

public class StaffLightSymptoms extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffLightSymptoms frame = new StaffLightSymptoms();
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
	public StaffLightSymptoms() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Did you have any of these light symptoms?");
		lblNewLabel.setBounds(12, 13, 367, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("- Headache");
		lblNewLabel_1.setBounds(12, 42, 103, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("- Chills");
		lblNewLabel_2.setBounds(12, 59, 56, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("- Myalgias");
		lblNewLabel_3.setBounds(12, 77, 103, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("- Exhaustion");
		lblNewLabel_4.setBounds(12, 93, 103, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("- Nausea");
		lblNewLabel_5.setBounds(12, 113, 56, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("- Vomiting");
		lblNewLabel_6.setBounds(12, 133, 103, 16);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("- Dysphagia");
		lblNewLabel_7.setBounds(12, 153, 103, 16);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("- Abdominal pain");
		lblNewLabel_8.setBounds(12, 173, 171, 16);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("- Diarrhea");
		lblNewLabel_9.setBounds(12, 191, 85, 16);
		contentPane.add(lblNewLabel_9);
		
		JButton btnNewButton = new JButton("Yes");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				StaffOnlyLight ol = new StaffOnlyLight();
				ol.setVisible(true);
			}
		});
		btnNewButton.setBounds(186, 149, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("No");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				StaffNoSymptoms ns = new StaffNoSymptoms();
				ns.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(186, 173, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				StaffCloseCon scc = new StaffCloseCon();
				scc.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setBounds(18, 215, 97, 25);
		contentPane.add(btnNewButton_2);
	}

}