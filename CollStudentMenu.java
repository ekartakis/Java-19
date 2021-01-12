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
import javax.swing.SwingConstants;
import java.awt.Color;


public class CollStudentMenu extends JFrame {

	private JPanel contentPane;
	private JButton btnExitButton;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CollStudentMenu frame = new CollStudentMenu();
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
	public CollStudentMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,1280,730);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Show my covid status");
		btnNewButton.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Student member = new Student();
				String result = member.giveMyStatus(Integer.parseInt(CollStudentLogin.AM));
				if (result.equals("p")) {
					setVisible(false);
					StudentPositive spositive = new StudentPositive();
					spositive.setVisible(true);

				} else if (result.equals("n")) {
					setVisible(false);
					StudentNegative snegative = new StudentNegative();
					snegative.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(472, 177, 338, 56);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Am I a close contact?");
		btnNewButton_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                AuebMember member2 = new Student();
				if (member2.closeCont(Integer.parseInt(CollStudentLogin.AM)).equals("true")) {
				    setVisible(false);
				    StudentCloseCon close = new StudentCloseCon();
				    close.setVisible(true);
			    } else if (member2.closeCont(Integer.parseInt(CollStudentLogin.AM)).equals("false")) {
			    	setVisible(false);
			    	StudentNoCloseCon noclose = new StudentNoCloseCon();
			    	noclose.setVisible(true);
			    }
			}
		});
		btnNewButton_1.setBounds(472, 266, 338, 56);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Show statistics");
		btnNewButton_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				StudentStat sst = new StudentStat();
				sst.setVisible(true);
				
			}
		});
		btnNewButton_2.setBounds(472, 361, 338, 56);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Options:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
		lblNewLabel.setBounds(523, 36, 237, 71);
		contentPane.add(lblNewLabel);
		
		JButton btnExitButton;
		btnExitButton = new JButton("Exit");
		btnExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExitButton.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
		btnExitButton.setBounds(1029, 529, 215, 71);
		contentPane.add(btnExitButton);
		
		JButton btnBackButton = new JButton("Back");
		btnBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				MainMenu mainmenu = new MainMenu();
				mainmenu.setVisible(true);
			}
		});
		btnBackButton.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
		btnBackButton.setBounds(47, 529, 215, 71);
		contentPane.add(btnBackButton);
		
		JLabel lblImage10 = new JLabel("");
		Image img10 = new ImageIcon(this.getClass().getResource("/Pics/135464593_1077636602678989_8400056473973577538_n.png")).getImage();
		lblImage10.setIcon(new ImageIcon(img10));
		lblImage10.setBounds(981, 0, 285, 233);
		contentPane.add(lblImage10);
		
		Image img4 = new ImageIcon(this.getClass().getResource("/Pics/left-arrow (1).png")).getImage();
		btnBackButton.setIcon(new ImageIcon(img4));
		btnBackButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(btnBackButton);
		
		Image img3 = new ImageIcon(this.getClass().getResource("/Pics/close (1).png")).getImage();
		btnExitButton.setIcon(new ImageIcon(img3));
		btnExitButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(btnExitButton);
		
		JLabel lblImage2 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/Pics/covid19.png")).getImage();
		lblImage2.setIcon(new ImageIcon(img2));
		lblImage2.setBounds(91, 88, 128, 128);
		contentPane.add(lblImage2);
	}
}
