import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


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
		
		JButton btnNewButton = new JButton("Show my covid status");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AuebMember member = new Staff();
				
				String result = member.giveMyStatus(Integer.parseInt(GeneralStaffLogin.AFM));
				if (result.equals("p")) {
					setVisible(false);
					StaffPositive spositive = new StaffPositive();
					spositive.setVisible(true);

				} else if (result.equals("n")) {
					setVisible(false);
					StaffNegative snegative = new StaffNegative();
					snegative.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(286, 91, 173, 57);
		contentPane.add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("Am I a close contact?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                AuebMember member2 = new Staff();
				if (member2.closeCont(Integer.parseInt(GeneralStaffLogin.AFM)).equals("true")) {
				    setVisible(false);
				   StaffCloseCon close = new StaffCloseCon();
				    close.setVisible(true);
			    } else if (member2.closeCont(Integer.parseInt(GeneralStaffLogin.AFM)).equals("false")) {
			    	setVisible(false);
			    	StaffNoCloseCon noclose = new StaffNoCloseCon();
			    	noclose.setVisible(true);
			    }
			}
		});
		btnNewButton_1.setBounds(286, 161, 173, 58);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Show statistics.");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				StaffStat stfst = new StaffStat();
				stfst.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(286, 232, 173, 57);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Options:");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		lblNewLabel.setBounds(342, 36, 59, 22);
		contentPane.add(lblNewLabel);
		
		JButton btnExitButton;
		btnExitButton = new JButton("Exit");
		btnExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExitButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnExitButton.setBounds(286, 302, 173, 47);
		contentPane.add(btnExitButton);
		
		JButton btnNewButton_3 = new JButton("Back");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				MainMenu mainmenu = new MainMenu();
				mainmenu.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.setBounds(12, 339, 97, 25);
		contentPane.add(btnNewButton_3);
	}
}
