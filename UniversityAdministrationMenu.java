import java.awt.Font;
import java.awt.Image;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class UniversityAdministrationMenu extends JFrame {

  private JPanel contentPane;
  
  private JButton btnExitButton;

  /**
  * Launch the application.
  */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          UniversityAdministrationMenu frame = 
              new UniversityAdministrationMenu();
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
  public UniversityAdministrationMenu() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(0, 0, 1280, 730);
    contentPane = new JPanel();
    contentPane.setBackground(Color.WHITE);
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    JButton btnNewButton = new JButton("Add a new student case");
    btnNewButton.setFont(new Font("Bookman Old Style", Font.PLAIN, 25));
    btnNewButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        setVisible(false);
        AddNewStCase addnewstcase = new AddNewStCase();
        addnewstcase.setVisible(true);
      }
    });
    btnNewButton.setBounds(106, 245, 527, 46);
    contentPane.add(btnNewButton);

    JButton btnNewButton_1 = new JButton("Add a new staff case");
    btnNewButton_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 25));
    btnNewButton_1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        setVisible(false);
        AddNewStaffCase addnewstaffcase = new AddNewStaffCase();
        addnewstaffcase.setVisible(true);
      }
    });
    btnNewButton_1.setBounds(663, 244, 527, 46);
    contentPane.add(btnNewButton_1);

    JLabel lblNewLabel = new JLabel("Options:");
    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
    lblNewLabel.setBounds(523, 36, 237, 71);
    contentPane.add(lblNewLabel);

    JButton btnBackButton;
    btnBackButton = new JButton("Back");
    btnBackButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        setVisible(false);
        MainMenu mainmenu = new MainMenu();
        mainmenu.setVisible(true);
        }
      });
    btnBackButton.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
    btnBackButton.setBounds(47, 529, 215, 71);
    contentPane.add(btnBackButton);

    JButton btnExitButton1 = new JButton("Exit");
    btnExitButton1.setForeground(Color.BLACK);
    btnExitButton1.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
    btnExitButton1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
      });
    btnExitButton1.setBounds(1029, 529, 215, 71);
    contentPane.add(btnExitButton1);

    JButton btnNewButton_3 = new JButton("Remove a student case");
    btnNewButton_3.setFont(new Font("Bookman Old Style", Font.PLAIN, 25));
    btnNewButton_3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        setVisible(false);
        RemoveStudentCase o = new RemoveStudentCase();
        o.setVisible(true);
        }
      });
    btnNewButton_3.setBounds(106, 330, 527, 46);
    contentPane.add(btnNewButton_3);

    JButton btnNewButton_4 = new JButton("Remove a staff case");
    btnNewButton_4.setFont(new Font("Bookman Old Style", Font.PLAIN, 25));
    btnNewButton_4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        setVisible(false);
        RemoveStaffCase stcase = new RemoveStaffCase();
        stcase.setVisible(true);
        }
      });
    btnNewButton_4.setBounds(663, 329, 527, 46);
    contentPane.add(btnNewButton_4);
    JButton btnNewButton_5 = new JButton("Remove a student from close contact");
    btnNewButton_5.setFont(new Font("Bookman Old Style", Font.PLAIN, 25));
    btnNewButton_5.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        setVisible(false);
        RemoveStudentCloseContact n = new RemoveStudentCloseContact();
        n.setVisible(true);
      }
    });
    btnNewButton_5.setBounds(106, 411, 527, 46);
    contentPane.add(btnNewButton_5);

    JButton btnNewButton_6 = new JButton(
        "Remove a staff member from close contact");
    btnNewButton_6.setFont(new Font("Bookman Old Style", Font.PLAIN, 23));
    btnNewButton_6.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        setVisible(false);
        RemoveStaffCloseContacts stfcl = new RemoveStaffCloseContacts();
        stfcl.setVisible(true);
      }
    });
    btnNewButton_6.setBounds(663, 411, 527, 45);
    contentPane.add(btnNewButton_6);

    JLabel lblImage10 = new JLabel("");
    Image img10 = new ImageIcon(this.getClass().getResource(
        "/Pics/135464593_1077636602678989_8400056473973577538_n.png")
        ).getImage();
    lblImage10.setIcon(new ImageIcon(img10));
    lblImage10.setBounds(981, 0, 285, 233);
    contentPane.add(lblImage10);

    Image img9 = new ImageIcon(
        this.getClass().getResource("/Pics/left-arrow (1).png")).getImage();
    btnBackButton.setIcon(new ImageIcon(img9));
    btnBackButton.setFont(new Font(
        "Tahoma", Font.BOLD, 24));
    contentPane.add(btnBackButton);

    Image img3 = new ImageIcon(
        this.getClass().getResource("/Pics/close (1).png")).getImage();
    btnExitButton1.setIcon(new ImageIcon(img3));
    btnExitButton1.setFont(new Font("Tahoma", Font.BOLD, 24));
    contentPane.add(btnExitButton1);

    JLabel lblImage2 = new JLabel("");
    Image img2 = new ImageIcon(
        this.getClass().getResource("/Pics/covid19.png")).getImage();
    lblImage2.setIcon(new ImageIcon(img2));
    lblImage2.setBounds(91, 88, 128, 128);
    contentPane.add(lblImage2);
  }
}
