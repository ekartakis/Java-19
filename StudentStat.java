import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class StudentStat extends JFrame {

  private JPanel contentPane;

  /**
  * Launch the application.
  */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          StudentStat frame = new StudentStat();
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
  //This is the statistics that the students can watch.
  public StudentStat() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(0, 0, 1280, 730);
    contentPane = new JPanel();
    contentPane.setBackground(Color.WHITE);
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    //Creating and displaying all the labels to write the text.
    JLabel lblNewLabel = new JLabel("AUEB Statistics");
    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
    lblNewLabel.setBounds(456, 91, 354, 58);
    contentPane.add(lblNewLabel);
    //Calculating the total positive cases.
    int totalcases = UpdateTheRecords.totalPositiveNumber();
    double percent = totalcases / 2550.0 * 100;
    String percent1 = String.format("%.2f", percent);
    JLabel lblNewLabel1 = new JLabel(
        "Total positive cases: " + totalcases + " ( " + percent1 + "% )");
    lblNewLabel1.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel1.setBounds(87, 251, 533, 41);
    contentPane.add(lblNewLabel1);
    //Calculating the student total positive cases.
    int studentcases = UpdateTheRecords.totalPositiveNumberofStudent();
    double percent22 = studentcases / 2500.0 * 100;
    String percent2 = String.format("%.2f", percent22);
    JLabel lblNewLabel2 = new JLabel(
        "Student positive cases : " + studentcases + " ( " + percent2 + "% )");
    lblNewLabel2.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel2.setBounds(87, 335, 533, 41);
    contentPane.add(lblNewLabel2);
    //Calculating the staff member total positive cases.
    int staffcases = UpdateTheRecords.totalPositiveNumberofStaff();
    double percent33 = staffcases / 50.0 * 100;
    String percent3 = String.format("%.2f", percent33);
    JLabel lblNewLabel3 = new JLabel(
        "Staff positive cases : " + staffcases + " ( " + percent3 + "% )");
    lblNewLabel3.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel3.setBounds(87, 413, 533, 41);
    contentPane.add(lblNewLabel3);
    //Calculating the total close contacts.
    int totalclosecontacts = UpdateTheRecords.totalCloseContNumber();
    double percent44 = totalclosecontacts / 2550.0 * 100;
    String percent4 = String.format("%.2f", percent44);
    JLabel lblNewLabel4 = new JLabel(
        "Total close contacts : " 
        + totalclosecontacts + " ( " + percent4 + "% )");
    lblNewLabel4.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel4.setBounds(629, 251, 533, 41);
    contentPane.add(lblNewLabel4);
    //Calculating the student total close contacts.
    int studentclosecontacts =
        UpdateTheRecords.totalCloseContNumberofStudent();
    double percent55 = studentclosecontacts / 2500.0 * 100;
    String percent5 = String.format("%.2f", percent55);
    JLabel lblNewLabel5 = new JLabel(
        "Close contacts (students): " 
        + studentclosecontacts + " ( " + percent5 + "% )");
    lblNewLabel5.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel5.setBounds(630, 335, 533, 41);
    contentPane.add(lblNewLabel5);
    //Calculating the staff member total close contacts.
    int staffclosecontacts =
        UpdateTheRecords.totalCloseContNumberofStaff();
    double percent66 = staffclosecontacts / 50.0 * 100;
    String percent6 = String.format("%.2f", percent66);
    JLabel lblNewLabel6 = new JLabel(
        "Close contacts (staff): " 
        + staffclosecontacts + " ( " + percent6 + "% )");
    lblNewLabel6.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel6.setBounds(627, 417, 533, 41);
    contentPane.add(lblNewLabel6);
    //Creating and displaying the back button.
    // The back button returns to the CollegeStudentMenu.
    JButton btnBackButton = new JButton("Back");
    btnBackButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        setVisible(false);
        CollStudentMenu gstmenu = new CollStudentMenu();
        gstmenu.setVisible(true);
        }
      });
    btnBackButton.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
    btnBackButton.setBounds(47, 529, 215, 71);
    contentPane.add(btnBackButton);
    //Creating and displaying all the images in labels and buttons.
    JLabel lblImage4 = new JLabel("");
    Image img4 = new ImageIcon(
        this.getClass().getResource("/Pics/blood-test.png")).getImage();
    lblImage4.setIcon(new ImageIcon(img4));
    lblImage4.setBounds(1136, 529, 76, 103);
    contentPane.add(lblImage4);

    JLabel lblImage10 = new JLabel("");
    Image img10 = new ImageIcon(this.getClass().getResource(
        "/Pics/135464593_1077636602678989_8400056473973577538_n.png")
        ).getImage();
    lblImage10.setIcon(new ImageIcon(img10));
    lblImage10.setBounds(981, 0, 285, 233);
    contentPane.add(lblImage10);

    Image img9 = new ImageIcon(this.getClass().getResource(
        "/Pics/left-arrow (1).png")).getImage();
    btnBackButton.setIcon(new ImageIcon(img9));
    btnBackButton.setFont(new Font("Tahoma", Font.BOLD, 24));
    contentPane.add(btnBackButton);
  }
}