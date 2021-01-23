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
  public StudentStat() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(0, 0, 1280, 730);
    contentPane = new JPanel();
    contentPane.setBackground(Color.WHITE);
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    JLabel lblNewLabel = new JLabel("AUEB Statistics");
    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
    lblNewLabel.setBounds(456, 91, 354, 58);
    contentPane.add(lblNewLabel);
    int totalcases = UpdateTheRecords.totalPositiveNumber();
    double percent = totalcases / 2550.0 * 100;
    String percent1 = String.format("%.2f", percent);
    JLabel lblNewLabel1 = new JLabel(
        "Total positive cases: " + totalcases + " ( " + percent1 + "% )");
    lblNewLabel1.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel1.setBounds(87, 251, 533, 41);
    contentPane.add(lblNewLabel1);

    int studentcases = UpdateTheRecords.totalPositiveNumberofStudent();
    double percent22 = studentcases / 2500.0 * 100;
    String percent2 = String.format("%.2f", percent22);
    JLabel lblNewLabel_2 = new JLabel(
        "Student positive cases : " + studentcases + " ( " + percent2 + "% )");
    lblNewLabel_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel_2.setBounds(87, 335, 533, 41);
    contentPane.add(lblNewLabel_2);

    int staffcases = UpdateTheRecords.totalPositiveNumberofStaff();
    double percent33 = staffcases / 50.0 * 100;
    String percent3 = String.format("%.2f", percent33);
    JLabel lblNewLabel_3 = new JLabel(
        "Staff positive cases : " + staffcases + " ( " + percent3 + "% )");
    lblNewLabel_3.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel_3.setBounds(87, 413, 533, 41);
    contentPane.add(lblNewLabel_3);

    int totalclosecontacts = UpdateTheRecords.totalCloseContNumber();
    double percent44 = totalclosecontacts / 2550.0 * 100;
    String percent4 = String.format("%.2f", percent44);
    JLabel lblNewLabel4 = new JLabel(
        "Total close contacts : " 
        + totalclosecontacts + " ( " + percent4 + "% )");
    lblNewLabel4.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel4.setBounds(629, 251, 533, 41);
    contentPane.add(lblNewLabel4);

    int studentclosecontacts =
        UpdateTheRecords.totalCloseContNumberofStudent();
    double percent55 = studentclosecontacts / 2500.0 * 100;
    String percent5 = String.format("%.2f", percent55);
    JLabel lblNewLabel_5 = new JLabel(
        "Close contacts (students): " 
        + studentclosecontacts + " ( " + percent5 + "% )");
    lblNewLabel_5.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel_5.setBounds(630, 335, 533, 41);
    contentPane.add(lblNewLabel_5);

    int staffclosecontacts =
        UpdateTheRecords.totalCloseContNumberofStaff();
    double percent66 = staffclosecontacts / 50.0 * 100;
    String percent6 = String.format("%.2f", percent66);
    JLabel lblNewLabel_6 = new JLabel(
        "Close contacts (staff): " 
        + staffclosecontacts + " ( " + percent6 + "% )");
    lblNewLabel_6.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel_6.setBounds(627, 417, 533, 41);
    contentPane.add(lblNewLabel_6);

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
