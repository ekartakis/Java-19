




import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

public class StaffNegative extends JFrame {

  private JPanel contentPane;

  /**
  * Launch the application.
  */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          StaffNegative frame = new StaffNegative();
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
  public StaffNegative() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(0, 0, 1280, 730);
    contentPane = new JPanel();
    contentPane.setBackground(Color.WHITE);
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    JLabel lblNewLabel = new JLabel("You tested negative for Covid-19! "
          + "Stay safe!");
    lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 27));
    lblNewLabel.setBounds(12, 29, 698, 70);
    contentPane.add(lblNewLabel);

    JLabel lblNewLabel_1 = new JLabel("-You do not need to self-isolate if "
    		+ "your test is negative, as long as:\r\n");
    lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel_1.setBounds(12, 110, 877, 70);
    contentPane.add(lblNewLabel_1);
		
    JLabel lblNewLabel_2 = new JLabel("- Everyone you live with who has "
    		+ "symptoms tests negative.\r\n");
    lblNewLabel_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel_2.setBounds(12, 191, 827, 70);
    contentPane.add(lblNewLabel_2);
		
    JLabel lblNewLabel_3 = new JLabel("- Everyone in your support bubble "
    		+ "who has symptoms tests negative.\r\n\t\t\t\t\t");
    lblNewLabel_3.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel_3.setBounds(10, 272, 966, 70);
    contentPane.add(lblNewLabel_3);
		
    JLabel lblNewLabel_4 = new JLabel("- You feel well if you feel "
    		+ "unwell, stay at home until you are feeling better.");
    lblNewLabel_4.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel_4.setBounds(10, 353, 1011, 70);
    contentPane.add(lblNewLabel_4);
		
    JButton btnBackButton = new JButton("Back");
    btnBackButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        setVisible(false);
        GeneralStaffMenu gstaffmenu = new GeneralStaffMenu();
        gstaffmenu.setVisible(true);
      }
    });
    btnBackButton.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
    btnBackButton.setBounds(47, 529, 215, 71);
    contentPane.add(btnBackButton);
		
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
		
    JLabel lblImage13 = new JLabel("");
    Image img13 = new ImageIcon(this.getClass().getResource(
    		"/Pics/patient.png")).getImage();
    lblImage13.setIcon(new ImageIcon(img13));
    lblImage13.setBounds(998, 305, 62, 77);
    contentPane.add(lblImage13);
		
    JLabel lblImage14 = new JLabel("");
    Image img14 = new ImageIcon(this.getClass().getResource(
    		"/Pics/social.png")).getImage();
    lblImage14.setIcon(new ImageIcon(img14));
    lblImage14.setBounds(966, 419, 163, 139);
    contentPane.add(lblImage14);
  }

}