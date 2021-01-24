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
  //This is the university administration menu.
  public UniversityAdministrationMenu() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(0, 0, 1280, 730);
    contentPane = new JPanel();
    contentPane.setBackground(Color.WHITE);
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    JLabel lblNewLabel = new JLabel("Options:");
    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
    lblNewLabel.setBounds(523, 36, 237, 71);
    contentPane.add(lblNewLabel);
    //Creating and displaying the back button.
    // The back button returns to the MainMenu class.
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
    //Creating and displaying the Exit button.
    //The Exit button closes the program.
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
    //Creating and displaying the Add a new student case button.
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
    //Creating and displaying the Add a new staff case button.
    JButton btnNewButton1 = new JButton("Add a new staff case");
    btnNewButton1.setFont(new Font("Bookman Old Style", Font.PLAIN, 25));
    btnNewButton1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        setVisible(false);
        AddNewStaffCase addnewstaffcase = new AddNewStaffCase();
        addnewstaffcase.setVisible(true);
      }
    });
    btnNewButton1.setBounds(663, 244, 527, 46);
    contentPane.add(btnNewButton1);
    //Creating and displaying the Remove a student case button.
    JButton btnRemoveStudentCase = new JButton("Remove a student case");
    btnRemoveStudentCase.setFont(new Font("Bookman Old Style", Font.PLAIN, 25));
    btnRemoveStudentCase.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        setVisible(false);
        RemoveStudentCase o = new RemoveStudentCase();
        o.setVisible(true);
        }
      });
    btnRemoveStudentCase.setBounds(106, 330, 527, 46);
    contentPane.add(btnRemoveStudentCase);
    //Creating and displaying the Remove a staff case button.
    JButton btnRemoveStaffCase = new JButton("Remove a staff case");
    btnRemoveStaffCase.setFont(new Font("Bookman Old Style", Font.PLAIN, 25));
    btnRemoveStaffCase.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        setVisible(false);
        RemoveStaffCase stcase = new RemoveStaffCase();
        stcase.setVisible(true);
        }
      });
    btnRemoveStaffCase.setBounds(663, 329, 527, 46);
    contentPane.add(btnRemoveStaffCase);
    //Creating and displaying the Remove a student from close contact button.
    JButton btnRemoveStudentfromclosecont = new 
        JButton("Remove a student from close contact");
    btnRemoveStudentfromclosecont.setFont(new Font
        ("Bookman Old Style", Font.PLAIN, 25));
    btnRemoveStudentfromclosecont.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        setVisible(false);
        RemoveStudentCloseContact n = new RemoveStudentCloseContact();
        n.setVisible(true);
      }
    });
    btnRemoveStudentfromclosecont.setBounds(106, 411, 527, 46);
    contentPane.add(btnRemoveStudentfromclosecont);
    /*Creating and displaying the Remove a 
     staff member from close contact button.*/
    JButton btnRemoveStafffromclosecont = new JButton(
        "Remove a staff member from close contact");
    btnRemoveStafffromclosecont.setFont(new Font
        ("Bookman Old Style", Font.PLAIN, 23));
    btnRemoveStafffromclosecont.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        setVisible(false);
        RemoveStaffCloseContacts stfcl = new RemoveStaffCloseContacts();
        stfcl.setVisible(true);
      }
    });
    btnRemoveStafffromclosecont.setBounds(663, 411, 527, 45);
    contentPane.add(btnRemoveStafffromclosecont);
    //Creating and displaying all the images in labels and buttons.
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
