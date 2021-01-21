import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.SystemColor;

public class RemoveStaffCloseContacts extends JFrame {

  private JPanel contentPane;
  
  private JTextField textField;

  public static String AFM6;
  /**
* Launch the application.
*  */
  
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          RemoveStaffCloseContacts frame = new RemoveStaffCloseContacts();
          frame.setVisible(true);
          } catch (Exception e) {
          e.printStackTrace();
          }
          }
    });
  }

  /**
*  * Create the frame.
 */
  public RemoveStaffCloseContacts() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(0, 0, 1280, 730);
    contentPane = new JPanel();
    contentPane.setBackground(Color.WHITE);
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
	
    JLabel lblNewLabel = 
    		new JLabel("Please insert the member of the staff TIN:");
    lblNewLabel.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel.setBounds(37, 28, 722, 86);
    contentPane.add(lblNewLabel);
	
    textField = new JTextField();
    textField.setFont(new Font("Bookman Old Style", Font.PLAIN, 25));
    textField.setBackground(SystemColor.menu);
    textField.setBounds(295, 247, 657, 84);
    contentPane.add(textField);
    textField.setColumns(10);
	
    JLabel lblNewLabel_1 = new JLabel("TIN");
    lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
    lblNewLabel_1.setBounds(179, 247, 83, 84);
    contentPane.add(lblNewLabel_1);
	
    JButton btnSubmitButton = new JButton("Submit");
    btnSubmitButton.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
    btnSubmitButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
	int tempAfm = 0;
	String result = " ";
	int pointer = 0;
	do {
	    try {
            AFM6 = textField.getText();
	        tempAfm = Integer.parseInt(AFM6);
	    } catch (Exception exc) {
		pointer = 1;
		JOptionPane.showMessageDialog(contentPane,
				"You have inserted a wrong TIN number.");
					    
	  }
	  } while (result != " ");
	  result = UpdateTheRecords.checkIfAFMExist(tempAfm);
	  if (pointer == 0) {
          if (result.equals("true")) {
		UpdateTheRecords.changeCloseCont(tempAfm, "false", "staff");
		JOptionPane.showMessageDialog(contentPane, 
			"The staff member is not a close contact anymore.");
		setVisible(false);
		UniversityAdministrationMenu uniadmenu = 
				new UniversityAdministrationMenu();
		uniadmenu.setVisible(true);
              } else if (result.equals("false")) {
	      JOptionPane.showMessageDialog(contentPane, 
	        		  "You have inserted a wrong ID.");
	    }
	}
      }
	});
    btnSubmitButton.setBounds(999, 529, 215, 71);
    contentPane.add(btnSubmitButton);
		
    JButton btnBackButton = new JButton("Back");
    btnBackButton.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
    btnBackButton.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
        setVisible(false);
        UniversityAdministrationMenu uniadmenu = 
        		new UniversityAdministrationMenu();
        uniadmenu.setVisible(true);
	}
	});
    btnBackButton.setBounds(47, 529, 215, 71);
    contentPane.add(btnBackButton);
		
    JLabel lblImage10 = new JLabel("");
    Image img10 = new ImageIcon(this.getClass().getResource(
    		"/Pics/135464593_1077636602678989_8400056473973577538_n.png")).
        getImage();
    lblImage10.setIcon(new ImageIcon(img10));
    lblImage10.setBounds(981, 0, 285, 233);
    contentPane.add(lblImage10);
		
    Image img4 = new ImageIcon(this.getClass().
    		getResource("/Pics/left-arrow (1).png")).getImage();
    btnBackButton.setIcon(new ImageIcon(img4));
    btnBackButton.setFont(new Font("Tahoma", Font.BOLD, 24));
    contentPane.add(btnBackButton);
		
    JLabel lblImage14 = new JLabel("");
    Image img14 = new ImageIcon(this.getClass().getResource(
			"/Pics/lock.png")).getImage();
    lblImage14.setIcon(new ImageIcon(img14));
    lblImage14.setBounds(564, 387, 138, 141);
    contentPane.add(lblImage14);
		
    Image img3 = new ImageIcon(this.getClass().
    		getResource("/Pics/ok.png")).getImage();
    btnSubmitButton.setIcon(new ImageIcon(img3));
    btnSubmitButton.setFont(new Font("Tahoma", Font.BOLD, 24));
    contentPane.add(btnSubmitButton);
  }

}
