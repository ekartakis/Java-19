import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.jdi.event.EventQueue;
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
			public void actionPerformed(ActionEvent arg0) {
				AuebMember member3 = new Staff();
				
				String result = member3.giveMyStatus(Integer.parseInt(GeneralStaffLogin.ΑΦΜ));
				if (result.equals("p")) {
					setVisible(false);
					StaffPositive staffpositive = new StaffPositive();
					staffpositive.setVisible(true);

				} else if (result.equals("n")) {
					setVisible(false);
					StaffNegative staffnegative = new StaffNegative();
					staffnegative.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(286, 91, 173, 57);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Am I a close contact?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AuebMember member4 = new Staff();
				if (member4.closeCont(Integer.parseInt(GeneralStaffLogin.ΑΦΜ)).equals("true")) {
				    setVisible(false);
				    StaffCloseCon staffclosecontact = new StaffCloseCon();
				    staffclosecontact.setVisible(true);
			    } else if (member4.closeCont(Integer.parseInt(GeneralStaffLogin.ΑΦΜ)).equals("false")) {
			    	setVisible(false);
			    	StaffNoCloseCon staffnoclosecontact = new StaffNoCloseCon();
			    	staffnoclosecontact.setVisible(true);
			    }
			}
		});
		btnNewButton_1.setBounds(286, 161, 173, 58);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Show statistics.");
		btnNewButton_2.setBounds(286, 230, 173, 57);
		contentPane.add(btnNewButton_2);

		JLabel lblNewLabel = new JLabel("Options:");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		lblNewLabel.setBounds(342, 36, 59, 22);
		contentPane.add(lblNewLabel);

		JButton btnBackButton;
		btnBackButton = new JButton("Exit");
		btnBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnBackButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnBackButton.setBounds(286, 298, 173, 57);
		contentPane.add(btnBackButton);
		
		JButton btnNewButton_3 = new JButton("Back");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				MainMenu mainmenu = new MainMenu();
				mainmenu.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_3.setBounds(21, 298, 111, 57);
		contentPane.add(btnNewButton_3);
	}
}

