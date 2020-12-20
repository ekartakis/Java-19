import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class AddNewCloseContofStPosCase extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public static String AM3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddNewCloseContofStPosCase frame = new AddNewCloseContofStPosCase();
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
	public AddNewCloseContofStPosCase() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(21, 98, 386, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Insert the academic id of the close contact");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(21, 33, 386, 46);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int tempAm = 0;
				String result = " ";
				int pointer = 0;
				do {
				    try {
                        AM3 = textField.getText();
				        tempAm = Integer.parseInt(AM3);
				    } catch(Exception exc) {
					    pointer = 1 ;
					    JOptionPane.showMessageDialog(contentPane, "You have inserted a wrong ID.");
				    }
				} while (result != " ");
				result = UpdateTheRecords.checkIfAmExist(tempAm);
				if (pointer == 0) {
				    if (result.equals("true")) {
				    	UpdateTheRecords.changeCloseCont(tempAm, "true", "student");
				    	setVisible(false);
				    	AnotherStCloseCont kk = new AnotherStCloseCont();
				    	kk.setVisible(true);
				    }else if (result.equals("false")) {
					    JOptionPane.showMessageDialog(contentPane, "You have inserted a wrong ID.");
				    }
				}

			}
		});
		btnNewButton.setBounds(21, 194, 116, 34);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back to menu");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				UniversityAdministrationMenu uniadmenu = new UniversityAdministrationMenu();
				uniadmenu.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(291, 194, 116, 34);
		contentPane.add(btnNewButton_1);
	}
}
