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

public class StaffHeavySymptoms extends JFrame {

  private JPanel contentPane;
  
  /**
  * Launch the application.
  */
  
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          StaffHeavySymptoms frame = new StaffHeavySymptoms();
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
	
  public StaffHeavySymptoms() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(0, 0, 1280, 730);
    contentPane = new JPanel();
    contentPane.setBackground(Color.WHITE);
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
		
    JLabel lblNewLabel = new JLabel(
    		"You should stay in Quarantine for 14 days from " 
        + StaffCloseCon.dateclosecont);
    lblNewLabel.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel.setBounds(12, 53, 891, 55);
    contentPane.add(lblNewLabel);
		
    JLabel lblNewLabel_1 = new JLabel("and do the covid-19 test!");
    lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel_1.setBounds(12, 119, 428, 55);
    contentPane.add(lblNewLabel_1);
		
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
    		"/Pics/135464593_1077636602678989_8400056473973577538_n.png"
    		)).getImage();
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
