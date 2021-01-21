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

public class StaffLightSymptoms extends JFrame {

  private JPanel contentPane;
	

  /**
	 * Launch the application.
	 */
	
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
	  public void run() {
        try {
          StaffLightSymptoms frame = new StaffLightSymptoms();
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
	
  public StaffLightSymptoms() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(0, 0, 1280, 730);
    contentPane = new JPanel();
    contentPane.setBackground(Color.WHITE);
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
		
    Label lblNewLabel = new JLabel("Did you have any of these light symptoms?");
    lblNewLabel.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel.setBounds(12, 13, 696, 35);
    contentPane.add(lblNewLabel);
		
    JLabel lblNewLabel_1 = new JLabel("- Headache");
    lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel_1.setBounds(12, 80, 178, 35);
    contentPane.add(lblNewLabel_1);
		
    JLabel lblNewLabel_2 = new JLabel("- Chills");
    lblNewLabel_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel_2.setBounds(12, 126, 165, 35);
    contentPane.add(lblNewLabel_2);
		
    JLabel lblNewLabel_3 = new JLabel("- Myalgias");
    lblNewLabel_3.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel_3.setBounds(12, 172, 178, 35);
    contentPane.add(lblNewLabel_3);
		
    JLabel lblNewLabel_4 = new JLabel("- Exhaustion");
    lblNewLabel_4.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel_4.setBounds(12, 218, 178, 35);
    contentPane.add(lblNewLabel_4);
		
    JLabel lblNewLabel_5 = new JLabel("- Nausea");
    lblNewLabel_5.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel_5.setBounds(12, 264, 151, 35);
    contentPane.add(lblNewLabel_5);
		
    JLabel lblNewLabel_6 = new JLabel("- Vomiting");
    lblNewLabel_6.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel_6.setBounds(12, 310, 178, 35);
    contentPane.add(lblNewLabel_6);
		
    JLabel lblNewLabel_7 = new JLabel("- Dysphagia");
    lblNewLabel_7.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel_7.setBounds(12, 356, 197, 35);
    contentPane.add(lblNewLabel_7);
		
    JLabel lblNewLabel_8 = new JLabel("- Abdominal pain");
    lblNewLabel_8.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel_8.setBounds(12, 402, 250, 35);
    contentPane.add(lblNewLabel_8);
		
    JLabel lblNewLabel_9 = new JLabel("- Diarrhea");
    lblNewLabel_9.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel_9.setBounds(12, 448, 178, 35);
    contentPane.add(lblNewLabel_9);
		
    JButton btnNewButton = new JButton("Yes");
    btnNewButton.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
    btnNewButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        setVisible(false);
        StaffOnlyLight ol = new StaffOnlyLight();
        ol.setVisible(true);
        }
	});
    btnNewButton.setBounds(470, 275, 139, 55);
    contentPane.add(btnNewButton);
		
    JButton btnNewButton_1 = new JButton("No");
    btnNewButton_1.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
    btnNewButton_1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        setVisible(false);
          StaffNoSymptoms ns = new StaffNoSymptoms();
          ns.setVisible(true);
	}
    });
    btnNewButton_1.setBounds(470, 351, 139, 55);
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
		
    JLabel lblImage12 = new JLabel("");
    Image img12 = new ImageIcon(this.getClass().getResource(
    		"/Pics/headache.png")).getImage();
    lblImage12.setIcon(new ImageIcon(img12));
    lblImage12.setBounds(187, 68, 64, 64);
    contentPane.add(lblImage12);
		
    JLabel lblImage11 = new JLabel("");
    Image img11 = new ImageIcon(this.getClass().getResource(
    		"/Pics/vomiting.png")).getImage();
    lblImage11.setIcon(new ImageIcon(img11));
    lblImage11.setBounds(198, 291, 64, 64);
    contentPane.add(lblImage11);
		
    JLabel lblImage13 = new JLabel("");
    Image img13 = new ImageIcon(this.getClass().getResource(
    		"/Pics/cold.png")).getImage();
    lblImage13.setIcon(new ImageIcon(img13));
    lblImage13.setBounds(187, 143, 64, 64);
    contentPane.add(lblImage13);
		
    JLabel lblImage16 = new JLabel("");
    Image img16 = new ImageIcon(this.getClass().getResource(
    		"/Pics/fatigue.png")).getImage();
    lblImage16.setIcon(new ImageIcon(img16));
    lblImage16.setBounds(198, 216, 64, 64);
    contentPane.add(lblImage16);
		
    JLabel lblImage17 = new JLabel("");
    Image img17 = new ImageIcon(this.getClass().getResource(
    		"/Pics/diarrhea.png")).getImage();
    lblImage17.setIcon(new ImageIcon(img17));
    lblImage17.setBounds(273, 372, 64, 64);
    contentPane.add(lblImage17);
		
    JLabel lblImage8 = new JLabel("");
    Image img8 = new ImageIcon(this.getClass().getResource(
    		"/Pics/diarrhea (1).png")).getImage();
    lblImage8.setIcon(new ImageIcon(img8));
    lblImage8.setBounds(176, 439, 64, 64);
    contentPane.add(lblImage8);
  }

}