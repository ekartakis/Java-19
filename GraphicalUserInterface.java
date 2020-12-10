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

public class GraphicalUserInterface {

	public static JFrame frame;
	private JLabel lblCovid19Tracker;
	private JLabel lblImage1;

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
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 732, 427);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null, "Choose: ");
				lblCovid19Tracker.setText("Sign in as: ");
				btnNewButton.setVisible(false);
				frame.dispose();
				MainMenu mainmenu = new MainMenu();
				mainmenu.setVisible(true);
			}
		});
		btnNewButton.setBounds(295, 284, 122, 61);
		frame.getContentPane().add(btnNewButton);
		
		lblCovid19Tracker = new JLabel("COVID-19 TRACKER");
		lblCovid19Tracker.setHorizontalAlignment(SwingConstants.CENTER);
		lblCovid19Tracker.setBackground(new Color(240, 240, 240));
		lblCovid19Tracker.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblCovid19Tracker.setBounds(228, 44, 238, 84);
		frame.getContentPane().add(lblCovid19Tracker);
		
	}

}
