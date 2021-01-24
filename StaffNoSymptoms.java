import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class StaffNoSymptoms extends JFrame {

  private JPanel contentPane;

  /**
  * Launch the application.
  */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          StaffNoSymptoms frame = new StaffNoSymptoms();
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
  //In this case the staff member is a close contact but has no symptoms.
  public StaffNoSymptoms() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(0, 0, 1280, 730);
    contentPane = new JPanel();
    contentPane.setBackground(Color.WHITE);
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    //Creating and displaying all the labels to write the text.
    JLabel lblNewLabel = new JLabel("Stay in quarantine for 7 days " 
        + StaffCloseCon.dateclosecont);
    lblNewLabel.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel.setBounds(28, 38, 893, 47);
    contentPane.add(lblNewLabel);

    JLabel lblNewLabel1 = new JLabel("and if you have any of the above "
            + "symptoms do the covid-19 test!");
    lblNewLabel1.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel1.setBounds(28, 96, 919, 47);
    contentPane.add(lblNewLabel1);
    //Creating and displaying the back button.
    // The back button returns to the GeneralStaffMenu.
    JButton btnBackButton = new JButton("Back");
    btnBackButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        setVisible(false);
        GeneralStaffMenu gstaffmenu = new GeneralStaffMenu();
        gstaffmenu.setVisible(true);
      }
    });
    btnBackButton.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
    btnBackButton.setBounds(28, 568, 164, 57);
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

    JLabel lblImage14 = new JLabel("");
    Image img14 = new ImageIcon(this.getClass().getResource(
            "/Pics/stay-home.png")).getImage();
    lblImage14.setIcon(new ImageIcon(img14));
    lblImage14.setBounds(560, 265, 128, 128);
    contentPane.add(lblImage14);
  }

}