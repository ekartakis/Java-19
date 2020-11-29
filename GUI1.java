
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GUI1 {
	JFrame window;
	Container con;
	JPanel titleNamePanel, startButtonPanel, mainTextPanel, 
	choiceButtonPanel, choice1ButtonPanel, choice2ButtonPanel, 
	choice3ButtonPanel, choice4ButtonPanel;
	JLabel titleNameLabel;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 60);
	Font normalFont = new Font("Times New Roman",Font.PLAIN, 30);
	JButton startButton, choice1, choice2, choice3, choice4;
	JTextArea mainTextArea;
	String position;
	
	TitleScreenHandler jHandler = new TitleScreenHandler();
	ChoiceHandler choiseHandler = new ChoiceHandler();
	
	public static void main(String[] args) {
			
		new GUI1();
	}
		
	public GUI1() {
		window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		window.setVisible(true);
		con = window.getContentPane();
			
		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(100, 100, 600, 150);
		titleNamePanel.setBackground(Color.black);
		titleNameLabel = new JLabel("COVID-19 TRACKER");
		titleNameLabel.setForeground(Color.yellow);
		titleNameLabel.setFont(titleFont);
			
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300, 400, 200, 100);
		startButtonPanel.setBackground(Color.black);
			
		startButton = new JButton("START");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
	    startButton.setFont(normalFont);
		startButton.addActionListener(jHandler);
		startButton.setFocusPainted(false);
			
		titleNamePanel.add(titleNameLabel);
		startButtonPanel.add(startButton);
			
		con.add(titleNamePanel);
		con.add(startButtonPanel);

	}
		
	public void createMenuScreen() {
			
		titleNamePanel.setVisible(false);
		startButtonPanel.setVisible(false);
			
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(100, 100, 600, 250);
		mainTextPanel.setBackground(Color.black);
		con.add(mainTextPanel);
		
		mainTextArea = new JTextArea("Where do you want to sign in?");
		mainTextArea.setBounds(100, 100, 600, 250);
		mainTextArea.setBackground(Color.black);
		mainTextArea.setForeground(Color.white);
		mainTextArea.setFont(normalFont);
		mainTextArea.setLineWrap(true);
		mainTextPanel.add(mainTextArea);	
		
		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(250, 350, 300, 150);
		choiceButtonPanel.setBackground(Color.black);
		choiceButtonPanel.setLayout(new GridLayout(4,1));
		con.add(choiceButtonPanel);
			
		choice1 = new JButton("Choice 1");
		choice1.setBackground(Color.black);
		choice1.setForeground(Color.white);
		choice1.setFont(normalFont);
		choice1.addActionListener(choiseHandler);
		choice1.setActionCommand("Command 1");
		choiceButtonPanel.add(choice1);
		choice2 = new JButton("Choice 2");
		choice2.setBackground(Color.black);
		choice2.setForeground(Color.white);
		choice2.setFont(normalFont);
		choice2.addActionListener(choiseHandler);
		choice2.setActionCommand("Command 2");
		choiceButtonPanel.add(choice2);
		choice3 = new JButton("Choice 3");
		choice3.setBackground(Color.black);
		choice3.setForeground(Color.white);
		choice3.setFont(normalFont);
		choice3.addActionListener(choiseHandler);
		choice3.setActionCommand("Command 3");
		choiceButtonPanel.add(choice3);
		choice4 = new JButton("Choice 4");
		choice4.setBackground(Color.black);
		choice4.setForeground(Color.white);
		choice4.setFont(normalFont);
		choice4.addActionListener(choiseHandler);
		choice4.setActionCommand("Command 4");
		choiceButtonPanel.add(choice4);
		
		userChoice();
		}
		
	public void userChoice() {
		position = "userChoice";
		mainTextArea.setText("Sign in as:");
		choice1.setText("University \nadministration");
		choice2.setText("General staff");
		choice3.setText("College student");
		choice4.setText("Exit");
		
	}
	
	public void universityAdministration() {
		position = "universityAdministration";
		mainTextArea.setText("Please enter username and password");
		choice1.setText(">");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	public class TitleScreenHandler implements ActionListener {
			
		public void actionPerformed(ActionEvent event) {
				
			createMenuScreen();
		}
		
	}
	
	public class ChoiceHandler implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
			
			String yourChoice = event.getActionCommand();
			
			if(yourChoice.equals("Command 1")) {
				universityAdministration();
			}
		}
	}

}
