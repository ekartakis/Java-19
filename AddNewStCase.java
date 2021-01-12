import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

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
		setBounds(0,0,1280,730);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Bookman Old Style", Font.PLAIN, 25));
		textField.setBackground(SystemColor.menu);
		textField.setBounds(295, 247, 657, 84);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblAddNewStudentCase = new JLabel("Please insert the academic id:");
		lblAddNewStudentCase.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
		lblAddNewStudentCase.setBounds(37, 28, 722, 86);
		contentPane.add(lblAddNewStudentCase);
		
		JLabel lblID = new JLabel("ID");
		lblID.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
		lblID.setBounds(179, 247, 83, 84);
		contentPane.add(lblID);
		
		JButton btnSubmitButton = new JButton("Submit");
		btnSubmitButton.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
		btnSubmitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tempAm = 0;
				String result = " ";
				do {
				    try {
                        AM2 = textField.getText();
				        tempAm = Integer.parseInt(AM2);
				    } catch(Exception exc) {
					    JOptionPane.showMessageDialog(contentPane, "You have inserted a wrong ID.");
					    
				    }
				} while (result != " ");
				result = UpdateTheRecords.checkIfAmExist(tempAm);
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
		});
		btnSubmitButton.setBounds(999, 529, 215, 71);
		contentPane.add(btnSubmitButton);
		
		JButton btnBackButton = new JButton("Back");
		btnBackButton.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
		btnBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				UniversityAdministrationMenu uniadmenu = new UniversityAdministrationMenu();
				uniadmenu.setVisible(true);
			}
		});
		btnBackButton.setBounds(47, 529, 215, 71);
		contentPane.add(btnBackButton);
		
		Image img4 = new ImageIcon(this.getClass().getResource("/Pics/left-arrow (1).png")).getImage();
		btnBackButton.setIcon(new ImageIcon(img4));
		btnBackButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(btnBackButton);
		
		JLabel lblImage10 = new JLabel("");
		Image img10 = new ImageIcon(this.getClass().getResource("/Pics/135464593_1077636602678989_8400056473973577538_n.png")).getImage();
		lblImage10.setIcon(new ImageIcon(img10));
		lblImage10.setBounds(981, 0, 285, 233);
		contentPane.add(lblImage10);
		
		JLabel lblImage14 = new JLabel("");
		Image img14 = new ImageIcon(this.getClass().getResource("/Pics/lock.png")).getImage();
		lblImage14.setIcon(new ImageIcon(img14));
		lblImage14.setBounds(564, 387, 138, 141);
		contentPane.add(lblImage14);
		
		Image img3 = new ImageIcon(this.getClass().getResource("/Pics/ok.png")).getImage();
		btnSubmitButton.setIcon(new ImageIcon(img3));
		btnSubmitButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(btnSubmitButton);
	}
}
