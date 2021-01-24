import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class UniversityAdministrationLogin extends JFrame {

  private JPanel contentPane;
  
  private JTextField textField;

  /**
  * Launch the application.
  */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          UniversityAdministrationLogin frame = 
              new UniversityAdministrationLogin();
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
  //The university administration logs in.
  public UniversityAdministrationLogin() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(0, 0, 1280, 730);
    contentPane = new JPanel();
    contentPane.setBackground(Color.WHITE);
    contentPane.setForeground(SystemColor.menu);
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    //Creating and displaying all the labels to write the text.
    JLabel lblUniversityAdministrationLogin = 
        new JLabel("Enter your password:");
    lblUniversityAdministrationLogin.setFont(
        new Font("Bookman Old Style", Font.PLAIN, 30));
    lblUniversityAdministrationLogin.setBounds(432, 66, 626, 86);
    contentPane.add(lblUniversityAdministrationLogin);

    JLabel lblPassword = new JLabel("Password");
    lblPassword.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
    lblPassword.setBounds(491, 257, 163, 86);
    contentPane.add(lblPassword);
    //This is where the university administration inserts the password.
    textField = new JTextField();
    textField.setFont(new Font("Bookman Old Style", Font.PLAIN, 25));
    textField.setBackground(SystemColor.menu);
    textField.setBounds(664, 257, 554, 86);
    contentPane.add(textField);
    textField.setColumns(10);
    //Creating and displaying the Login button.
    JButton btnUniversityAdministrationLogin = new JButton("Login");
    btnUniversityAdministrationLogin.addActionListener(new ActionListener() {
      /*Checking if the password is correct.
       If it is correct, a message is displayed in the screen to warn the user.
       Then the Login button calls the UniversityAdministrationMenu class. 
       If the id is incorrect, a message is displayed in the screen
        to warn the user.*/
      public void actionPerformed(ActionEvent e) {
        String code = textField.getText();
        if (code.equals("123")) {
          JOptionPane.showMessageDialog(
              contentPane, "You are successfully logged in.");
          UniversityAdministrationMenu uniadminmenu =
              new UniversityAdministrationMenu();
          uniadminmenu.setVisible(true);
          setVisible(false);
        } else {
          JOptionPane.showMessageDialog(
              contentPane, "You have inserted a wrong code.");
        }
      }
    });
    btnUniversityAdministrationLogin.setFont(
        new Font("Bookman Old Style", Font.BOLD, 35));
    btnUniversityAdministrationLogin.setBounds(1041, 529, 215, 71);
    contentPane.add(btnUniversityAdministrationLogin);
    //Creating and displaying the back button.
    // The back button returns to the MainMenu.
    JButton btnBackButton = new JButton("Back");
    btnBackButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        setVisible(false);
        MainMenu mainmenu = new MainMenu();
        mainmenu.setVisible(true);
      }
    });
    btnBackButton.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
    btnBackButton.setBounds(425, 529, 215, 71);
    contentPane.add(btnBackButton);
    //Creating and displaying all the images in labels and buttons.
    Image img3 = new ImageIcon(
        this.getClass().getResource("/Pics/ok.png")).getImage();
    btnUniversityAdministrationLogin.setIcon(new ImageIcon(img3));
    btnUniversityAdministrationLogin.setFont(new Font("Tahoma", Font.BOLD, 24));
    contentPane.add(btnUniversityAdministrationLogin);

    Image img4 = new ImageIcon(
        this.getClass().getResource("/Pics/close (1).png")).getImage();
    btnBackButton.setIcon(new ImageIcon(img4));
    btnBackButton.setFont(new Font("Tahoma", Font.BOLD, 24));
    contentPane.add(btnBackButton);

    Image img9 = new ImageIcon(
        this.getClass().getResource("/Pics/left-arrow (1).png")).getImage();
    btnBackButton.setIcon(new ImageIcon(img9));
    btnBackButton.setFont(new Font("Tahoma", Font.BOLD, 24));
    contentPane.add(btnBackButton);

    JLabel lblImage1 = new JLabel("");
    lblImage1.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    Image img1 = new ImageIcon(
        this.getClass().getResource("/Pics/java-19.png")).getImage();
    lblImage1.setIcon(new ImageIcon(img1));
    lblImage1.setBounds(0, 0, 415, 693);
    contentPane.add(lblImage1);

    JLabel lblImage14 = new JLabel("");
    Image img14 = new ImageIcon(
        this.getClass().getResource("/Pics/lock.png")).getImage();
    lblImage14.setIcon(new ImageIcon(img14));
    lblImage14.setBounds(880, 371, 138, 141);
    contentPane.add(lblImage14);
  }
}
