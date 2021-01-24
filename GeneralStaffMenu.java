import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class GeneralStaffMenu extends JFrame {

  private JPanel contentPane;

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
  //This is the the staff members' menu.
  public GeneralStaffMenu() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(0, 0, 1280, 730);
    contentPane = new JPanel();
    contentPane.setBackground(Color.WHITE);
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    JButton btnNewButton = new JButton("Show my covid status");
    btnNewButton.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    btnNewButton.addActionListener(new ActionListener() {
      /*Checking the status of the staff member.
       * If the staff member is positive call the StaffPositive class,
       * otherwise call the StaffNegative class.
       */
      public void actionPerformed(ActionEvent e) {
        AuebMember member = new Staff();
        String result1 = member.giveMyStatus(
            Integer.parseInt(GeneralStaffLogin.AFM));
        if (result1.equals("p")) {
          setVisible(false);
          StaffPositive spositive = new StaffPositive();
          spositive.setVisible(true);
        } else if (result1.equals("n")) {
          setVisible(false);
          StaffNegative snegative = new StaffNegative();
          snegative.setVisible(true);
        }
      }
    });
    btnNewButton.setBounds(472, 177, 338, 56);
    contentPane.add(btnNewButton);
    JButton btnNewButton1 = new JButton("Am I a close contact?");
    btnNewButton1.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    btnNewButton1.addActionListener(new ActionListener() {
      /*Checking if the staff member is a close contact.
       * If the staff member is a close contact call the StaffCloseCon class.
       * Otherwise call the StaffNoCloseCon class.
       */
      public void actionPerformed(ActionEvent e) {
        AuebMember member9 = new Staff();
        if (member9.closeCont(Integer.parseInt(
            GeneralStaffLogin.AFM)).equals("true")) {
          setVisible(false);
          StaffCloseCon close = new StaffCloseCon();
          close.setVisible(true);
        } else if (member9.closeCont(Integer.parseInt(
            GeneralStaffLogin.AFM)).equals("false")) {
          setVisible(false);
          StaffNoCloseCon noclose = new StaffNoCloseCon();
          noclose.setVisible(true);
        }
      }
    });
    btnNewButton1.setBounds(472, 266, 338, 56);
    contentPane.add(btnNewButton1);

    JButton btnNewButton2 = new JButton("Show statistics");
    btnNewButton2.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    btnNewButton2.addActionListener(new ActionListener() {
      /*Creating the 'show statistics' button.
        The show statistics button calls the Staffstat class.
        */
      public void actionPerformed(ActionEvent arg0) {
        setVisible(false);
        StaffStat stfst = new StaffStat();
        stfst.setVisible(true);
      }
    });
    btnNewButton2.setBounds(472, 361, 338, 56);
    contentPane.add(btnNewButton2);
    JLabel lblNewLabel = new JLabel("Options:");
    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
    lblNewLabel.setBounds(523, 36, 237, 71);
    contentPane.add(lblNewLabel);
    //Creating and displaying the Exit button.
    //The Exit button closes the program.
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
    //Creating and displaying the back button.
    // The back button returns to the MainMenu class.
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
    //Creating and displaying all the images in labels and buttons.
    JLabel lblImage10 = new JLabel("");
    Image img10 = new ImageIcon(this.getClass().getResource(
        "/Pics/135464593_1077636602678989_8400056473973577538_n.png")).
        getImage();
    lblImage10.setIcon(new ImageIcon(img10));
    lblImage10.setBounds(981, 0, 285, 233);
    contentPane.add(lblImage10);
    Image img4 = new ImageIcon(this.getClass().getResource(
        "/Pics/left-arrow (1).png")).getImage();
    btnBackButton.setIcon(new ImageIcon(img4));
    btnBackButton.setFont(new Font("Tahoma", Font.BOLD, 24));
    contentPane.add(btnBackButton);
    Image img3 = new ImageIcon(this.getClass().getResource(
        "/Pics/close (1).png")).getImage();
    btnExitButton.setIcon(new ImageIcon(img3));
    btnExitButton.setFont(new Font("Tahoma", Font.BOLD, 24));
    contentPane.add(btnExitButton);
    JLabel lblImage2 = new JLabel("");
    Image img2 = new ImageIcon(this.getClass().getResource(
        "/Pics/covid19.png")).getImage();
    lblImage2.setIcon(new ImageIcon(img2));
    lblImage2.setBounds(91, 88, 128, 128);
    contentPane.add(lblImage2);
  }
}
