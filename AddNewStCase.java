import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddNewStCase extends JFrame {

	private JPanel contentPane;
	public static String AM2;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddNewStCase frame = new AddNewStCase();
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
	public AddNewStCase() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(54, 95, 372, 52);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Please insert the academic id:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(10, 27, 387, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID:");
		lblNewLabel_1.setBounds(20, 85, 70, 43);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tempAm = 0;
				String result = " ";
				int pointer = 0;
				do {
				    try {
                        AM2 = textField.getText();
				        tempAm = Integer.parseInt(AM2);
				    } catch(Exception exc) {
					    pointer = 1 ;
					    JOptionPane.showMessageDialog(contentPane, "You have inserted a wrong ID.");
					    
				    }
				} while (result != " ");
				result = UpdateTheRecords.checkIfAmExist(tempAm);
				if (pointer == 0) {
				    if (result.equals("true")) {
				    	UpdateTheRecords.changeTheStatus(tempAm, "p", "student");
				    	JOptionPane.showMessageDialog(contentPane, "The student has been added successfully as a positive case.");
					    setVisible(false);
					    NewPosStCaseMenu o = new NewPosStCaseMenu();
					    o.setVisible(true);
				    }else if (result.equals("false")) {
					    JOptionPane.showMessageDialog(contentPane, "You have inserted a wrong ID.");
				    }
				}

			}
		});
		btnNewButton.setBounds(10, 186, 121, 32);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				UniversityAdministrationMenu uniadmenu = new UniversityAdministrationMenu();
				uniadmenu.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(283, 186, 89, 32);
		contentPane.add(btnNewButton_1);
	}
}
