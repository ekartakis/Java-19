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

public class StudentPositive extends JFrame {

  private JPanel contentPane;

  /**
  * Launch the application.
  */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          StudentPositive frame = new StudentPositive();
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
  public StudentPositive() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(0, 0, 1280, 730);
    contentPane = new JPanel();
    contentPane.setBackground(Color.WHITE);
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    Student o = new Student();
    int tempAM = Integer.parseInt(CollStudentLogin.AM);
    String datepos = o.giveTheDateOfPos(tempAM);

    JLabel lblNewLabel = new JLabel(
        "You tested positive for Covid-19! Follow the instructions below:");
    lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 27));
    lblNewLabel.setBounds(12, 13, 953, 52);
    contentPane.add(lblNewLabel);
    
    JLabel lblNewLabel_1 = new JLabel(
        "- Self-isolate for 14 days from \r\n\t\t\t\t\t" + datepos);
    lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel_1.setBounds(12, 92, 798, 32);
    contentPane.add(lblNewLabel_1);

    JLabel lblNewLabel_2 = new JLabel(
        "- Do not leave your home for any reason \u2013 \t");
    lblNewLabel_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel_2.setBounds(12, 135, 613, 32);
    contentPane.add(lblNewLabel_2);

    JLabel lblNewLabel_3 = new JLabel("- Do not have visitors in your home,"
        + " including friends and family except for essential care.");
    lblNewLabel_3.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel_3.setBounds(12, 264, 1226, 32);
    contentPane.add(lblNewLabel_3);

    JLabel lblNewLabel_4 = new JLabel(
        "- Try to avoid contact with anyone"
        + " you live with as much as possible.\r\n");
    lblNewLabel_4.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel_4.setBounds(12, 307, 953, 32);
    contentPane.add(lblNewLabel_4);

    JLabel lblNewLabel_5 = new JLabel(
        "- People you live with do not"
        + " need to self-isolate if you do not have symptoms.");
    lblNewLabel_5.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel_5.setBounds(12, 350, 1194, 32);
    contentPane.add(lblNewLabel_5);

    JLabel lblNewLabel_6 = new JLabel(
        "- People in your support bubble do"
        + " not need to self-isolate if you do not have symptoms.");
    lblNewLabel_6.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel_6.setBounds(12, 393, 1194, 32);
    contentPane.add(lblNewLabel_6);

    JLabel lblNewLabel_7 = new JLabel(
        "WARNING: If you live with someone at higher risk from coronavirus,");
    lblNewLabel_7.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel_7.setBounds(12, 436, 920, 32);
    contentPane.add(lblNewLabel_7);

    JLabel lblNewLabel_8 = new JLabel(
        " try to arrange for them to stay with friends or family for 14 days.");
    lblNewLabel_8.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel_8.setBounds(12, 479, 920, 32);
    contentPane.add(lblNewLabel_8);

    JLabel lblNewLabel9 = new JLabel(
        "   or ask friends and family to drop it off at your home.\"");
    lblNewLabel9.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel9.setBounds(12, 221, 775, 32);
    contentPane.add(lblNewLabel9);

    JButton btnBackButton = new JButton("Back");
    btnBackButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          setVisible(false);
          CollStudentMenu collstmenu = new CollStudentMenu();
          collstmenu.setVisible(true);
        }
    });
    btnBackButton.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
    btnBackButton.setBounds(47, 529, 215, 71);
    contentPane.add(btnBackButton);
    Image img11 = new ImageIcon(
        this.getClass().getResource("/Pics/stay-home.png")).getImage();

    JLabel lblImage10 = new JLabel("");
    Image img10 = new ImageIcon(this.getClass().getResource(
        "/Pics/135464593_1077636602678989_8400056473973577538_n.png")
     ).getImage();
    lblImage10.setIcon(new ImageIcon(img10));
    lblImage10.setBounds(981, 0, 285, 233);
    contentPane.add(lblImage10);

    JLabel lblNewLabel_10 = new JLabel(
        "   if you need food or medicine, order it online or by phone,");
    lblNewLabel_10.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel_10.setBounds(12, 179, 826, 31);
    contentPane.add(lblNewLabel_10);
    
    Image img4 = new ImageIcon(
        this.getClass().getResource("/Pics/left-arrow (1).png")).getImage();
    btnBackButton.setIcon(new ImageIcon(img4));
    btnBackButton.setFont(new Font("Tahoma", Font.BOLD, 24));
    contentPane.add(btnBackButton);

    JLabel lblImage14 = new JLabel("");
    Image img14 = new ImageIcon(
        this.getClass().getResource("/Pics/stay-home.png")).getImage();
    lblImage14.setIcon(new ImageIcon(img14));
    lblImage14.setBounds(1050, 493, 128, 128);
    contentPane.add(lblImage14);
  }
}
