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

public class StaffCloseCon extends JFrame {

  private JPanel contentPane;
  
  public static String dateclosecont;
	
  /**
	 * Launch the application.
	 */
	
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          StaffCloseCon frame = new StaffCloseCon();
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
  public StaffCloseCon() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(0, 0, 1280, 730);
    contentPane = new JPanel();
    contentPane.setBackground(Color.WHITE);
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
		
    JLabel lblNewLabel = new JLabel("You are a close contact!");
    lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 27));
    lblNewLabel.setBounds(12, 13, 663, 43);
    contentPane.add(lblNewLabel);
		
    Staff i = new Staff();
    int tempAfm = Integer.parseInt(GeneralStaffLogin.AFM);
    dateclosecont = i.giveTheDateOfCloseCont(tempAfm);
    JLabel lblNewLabel_1 = new JLabel(
    		"Have you had any of the following symptoms?");
    lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel_1.setBounds(12, 78, 663, 43);
    contentPane.add(lblNewLabel_1);
		
    JLabel lblNewLabel_2 = new JLabel("- Fever");
    lblNewLabel_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel_2.setBounds(12, 132, 126, 43);
    contentPane.add(lblNewLabel_2);
		
    JLabel lblNewLabel_3 = new JLabel("- Cough");
    lblNewLabel_3.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel_3.setBounds(12, 186, 170, 43);
    contentPane.add(lblNewLabel_3);
		
    JLabel lblNewLabel_4 = new JLabel("- Shortness of breath");
    lblNewLabel_4.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel_4.setBounds(12, 240, 336, 43);
    contentPane.add(lblNewLabel_4);
		
    JLabel lblNewLabel_5 = new JLabel("- Sudden onset of anemia");
    lblNewLabel_5.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel_5.setBounds(12, 294, 377, 43);
    contentPane.add(lblNewLabel_5);
		
    JLabel lblNewLabel_6 = new JLabel("- Tastelessness");
    lblNewLabel_6.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel_6.setBounds(12, 354, 234, 43);
    contentPane.add(lblNewLabel_6);
		
    JButton btnNewButton = new JButton("Yes");
    btnNewButton.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
    btnNewButton.addActionListener(new ActionListener() {
  	public void actionPerformed(ActionEvent e) {
        setVisible(false);
        StaffHeavySymptoms hs = new StaffHeavySymptoms();
        hs.setVisible(true);
	}
    });
    btnNewButton.setBounds(470, 275, 139, 55);
    contentPane.add(btnNewButton);
		
    JButton btnNewButton_1 = new JButton("No");
    btnNewButton_1.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
    btnNewButton_1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        setVisible(false);
        StaffLightSymptoms ls = new StaffLightSymptoms();
        ls.setVisible(true);
	}
	});
    btnNewButton_1.setBounds(470, 350, 139, 55);
    contentPane.add(btnNewButton_1);
		
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
		
    JLabel lblImage11 = new JLabel("");
    Image img11 = new ImageIcon(this.getClass().getResource(
    		"/Pics/fever (1).png")).getImage();
    lblImage11.setIcon(new ImageIcon(img11));
    lblImage11.setBounds(148, 116, 64, 64);
    contentPane.add(lblImage11);
		
    JLabel lblImage13 = new JLabel("");
    Image img13 = new ImageIcon(this.getClass().getResource(
    		"/Pics/breathing (2).png")).getImage();
    lblImage13.setIcon(new ImageIcon(img13));
    lblImage13.setBounds(295, 225, 64, 64);
    contentPane.add(lblImage13);
		
    JLabel lblImage9 = new JLabel("");
    Image img9 = new ImageIcon(this.getClass().getResource(
    		"/Pics/cough.png")).getImage();
    lblImage9.setIcon(new ImageIcon(img9));
    lblImage9.setBounds(148, 185, 64, 64);
    contentPane.add(lblImage9);
		
    JLabel lblImage20 = new JLabel("");
    Image img20 = new ImageIcon(this.getClass().getResource(
    		"/Pics/dizziness.png")).getImage();
    lblImage20.setIcon(new ImageIcon(img20));
    lblImage20.setBounds(360, 287, 64, 64);
    contentPane.add(lblImage20);
		
    JLabel lblImage14 = new JLabel("");
    Image img14 = new ImageIcon(this.getClass().getResource(
    		"/Pics/loss-of-sense-of-taste.png")).getImage();
    lblImage14.setIcon(new ImageIcon(img14));
    lblImage14.setBounds(256, 336, 64, 64);
    contentPane.add(lblImage14);
		
  }
}