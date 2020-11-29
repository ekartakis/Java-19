import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener {
	
	private static JLabel userLabel1;
	private static JTextField userText1;
	private static JLabel passwordLabel1;
	private static JPasswordField passwordText1;
	private static JButton button1;
	private static JLabel success1;
	
	public static void main(String[] args) {
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		panel.setLayout(null);
		
		userLabel1 = new JLabel("User");
		userLabel1.setBounds(10,20,80,25);
		panel.add(userLabel1);
		
		userText1 = new JTextField(20);
		userText1.setBounds(100, 20, 165, 25);
		panel.add(userText1);
		
		passwordLabel1 = new JLabel("Password");
		passwordLabel1.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel1);
		
		passwordText1 = new JPasswordField();
		passwordText1.setBounds(100, 50, 165, 25);
		panel.add(passwordText1);
		
		button1 = new JButton("Login");
		button1.setBounds(10, 80, 80, 25);
		button1.addActionListener(new GUI());
		panel.add(button1);
		
		success1 = new JLabel("");
		success1.setBounds(10, 110, 300, 25);
		panel.add(success1);
		
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userText1.getText();
		@SuppressWarnings("deprecation")
		String password = passwordText1.getText();
		
		if(user.equals("University Administration") && password.equals("187364")) {
			success1.setText("Login successful!");
	}
		JFrame frame2 = new JFrame("Logged in.");
		frame2.setVisible(true);
		frame2.setSize(200, 200);
		JLabel label = new JLabel("You logged in.");
		JPanel panel = new JPanel();
		frame2.add(panel);
		panel.add(label);
	}

}
