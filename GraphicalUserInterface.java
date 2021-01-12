import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;

public class GraphicalUserInterface {

	public static JFrame frame;
	private JLabel lblCovid19Tracker;
	private JButton btnSoundButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GraphicalUserInterface window = new GraphicalUserInterface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GraphicalUserInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(0,0,1280,730);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnNewButton.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCovid19Tracker.setText("Sign in as: ");
				btnNewButton.setVisible(false);
				frame.dispose();
				MainMenu mainmenu = new MainMenu();
				mainmenu.setVisible(true);
			}
		});
		btnNewButton.setBounds(723, 528, 207, 78);
		frame.getContentPane().add(btnNewButton);
		
		lblCovid19Tracker = new JLabel("COVID-19 TRACKER");
		lblCovid19Tracker.setHorizontalAlignment(SwingConstants.CENTER);
		lblCovid19Tracker.setBackground(new Color(240, 240, 240));
		lblCovid19Tracker.setFont(new Font("Bookman Old Style", Font.BOLD, 40));
		lblCovid19Tracker.setBounds(600, 46, 432, 84);
		frame.getContentPane().add(lblCovid19Tracker);
		

		JLabel lblImage1 = new JLabel("");
		lblImage1.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
		Image img1 = new ImageIcon(this.getClass().getResource("/Pics/java-19.png")).getImage();
		lblImage1.setIcon(new ImageIcon(img1));
		lblImage1.setBounds(0, 0, 415, 693);
		frame.getContentPane().add(lblImage1);
		
		JLabel lblImage2 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/Pics/mask (2).png")).getImage();
		lblImage2.setIcon(new ImageIcon(img2));
		lblImage2.setBounds(765, 286, 222, 222);
		frame.getContentPane().add(lblImage2);
		
		JLabel lblImage4 = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/Pics/viruss.png")).getImage();
		lblImage4.setIcon(new ImageIcon(img4));
		lblImage4.setBounds(760, 129, 136, 148);
		frame.getContentPane().add(lblImage4);
		
		JLabel lblImage5 = new JLabel("");
		Image img5 = new ImageIcon(this.getClass().getResource("/Pics/viruss.png")).getImage();
		lblImage5.setIcon(new ImageIcon(img5));
		lblImage5.setBounds(996, 359, 165, 148);
		frame.getContentPane().add(lblImage5);
		
		JLabel lblImage6 = new JLabel("");
		Image img6 = new ImageIcon(this.getClass().getResource("/Pics/viruss.png")).getImage();
		lblImage6.setIcon(new ImageIcon(img6));
		lblImage6.setBounds(555, 359, 176, 148);
		frame.getContentPane().add(lblImage6);
		
	}
}