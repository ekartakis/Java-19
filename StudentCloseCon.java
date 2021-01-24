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

public class StudentCloseCon extends JFrame {

  private JPanel contentPane;
  
  public static String dateclosecont;
  /**
  * Launch the application.
  */

  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          StudentCloseCon frame = new StudentCloseCon();
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
  //In this case the student is a close contact.
  //The student is asked about having heavy symptoms.
  public StudentCloseCon() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(0, 0, 1280, 730);
    contentPane = new JPanel();
    contentPane.setBackground(Color.WHITE);
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    //Creating and displaying all the labels to write the text.
    JLabel lblNewLabel = new JLabel("You are a close contact!");
    lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 27));
    lblNewLabel.setBounds(12, 13, 663, 43);
    contentPane.add(lblNewLabel);

    Student i = new Student();
    int tempAM = Integer.parseInt(CollStudentLogin.AM);
    dateclosecont = i.giveTheDateOfCloseCont(tempAM);
    JLabel lblNewLabel1 = new JLabel("Have you had"
        + " any of the following symptoms?");
    lblNewLabel1.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel1.setBounds(12, 78, 696, 43);
    contentPane.add(lblNewLabel1);

    JLabel lblNewLabel2 = new JLabel("- Fever");
    lblNewLabel2.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel2.setBounds(12, 132, 170, 43);
    contentPane.add(lblNewLabel2);

    JLabel lblNewLabel3 = new JLabel("- Cough");
    lblNewLabel3.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel3.setBounds(12, 186, 170, 43);
    contentPane.add(lblNewLabel3);

    JLabel lblNewLabel4 = new JLabel("- Shortness of breath");
    lblNewLabel4.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel4.setBounds(12, 240, 336, 43);
    contentPane.add(lblNewLabel4);

    JLabel lblNewLabel5 = new JLabel("- Sudden onset of anemia");
    lblNewLabel5.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel5.setBounds(12, 294, 377, 43);
    contentPane.add(lblNewLabel5);

    JLabel lblNewLabel6 = new JLabel("- Tastelessness");
    lblNewLabel6.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel6.setBounds(12, 354, 285, 43);
    contentPane.add(lblNewLabel6);
    //Creating and displaying the Yes button.
    //The Yes button calls the StudentHeavySymptoms class.
    JButton btnNewButton = new JButton("Yes");
    btnNewButton.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
    btnNewButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        setVisible(false);
        StudentHeavySymptoms hs = new StudentHeavySymptoms();
        hs.setVisible(true);
      }
    });
    btnNewButton.setBounds(470, 275, 139, 55);
    contentPane.add(btnNewButton);
    //Creating and displaying the No button.
    //The No button calls the StudentLightSymptoms class.
    JButton btnNewButton1 = new JButton("No");
    btnNewButton1.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
    btnNewButton1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          setVisible(false);
          StudentLightSymptoms ls = new StudentLightSymptoms();
          ls.setVisible(true);
        }
    });
    btnNewButton1.setBounds(470, 350, 139, 55);
    contentPane.add(btnNewButton1);
    //Creating and displaying the back button.
    // The back button returns to the CollegeStudentMenu class.
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
    //Creating and displaying all the images in labels and buttons.
    JLabel lblImage10 = new JLabel("");
    Image img10 = new ImageIcon(this.getClass().getResource(
        "/Pics/135464593_1077636602678989_8400056473973577538_n.png")
            ).getImage();
    lblImage10.setIcon(new ImageIcon(img10));
    lblImage10.setBounds(981, 0, 285, 233);
    contentPane.add(lblImage10);

    Image img4 = new ImageIcon(this.getClass().getResource(
        "/Pics/left-arrow (1).png")
            ).getImage();
    btnBackButton.setIcon(new ImageIcon(img4));
    btnBackButton.setFont(new Font("Tahoma", Font.BOLD, 24));
    contentPane.add(btnBackButton);

    JLabel lblImage11 = new JLabel("");
    Image img11 = new ImageIcon(
        this.getClass().getResource("/Pics/fever (1).png")).getImage();
    lblImage11.setIcon(new ImageIcon(img11));
    lblImage11.setBounds(148, 116, 64, 64);
    contentPane.add(lblImage11);

    JLabel lblImage13 = new JLabel("");
    Image img13 = new ImageIcon(
        this.getClass().getResource("/Pics/breathing (2).png")).getImage();
    lblImage13.setIcon(new ImageIcon(img13));
    lblImage13.setBounds(295, 225, 64, 64);
    contentPane.add(lblImage13);

    JLabel lblImage9 = new JLabel("");
    Image img9 = new ImageIcon(
        this.getClass().getResource("/Pics/cough.png")).getImage();
    lblImage9.setIcon(new ImageIcon(img9));
    lblImage9.setBounds(148, 185, 64, 64);
    contentPane.add(lblImage9);

    JLabel lblImage20 = new JLabel("");
    Image img20 = new ImageIcon(
        this.getClass().getResource("/Pics/dizziness.png")).getImage();
    lblImage20.setIcon(new ImageIcon(img20));
    lblImage20.setBounds(360, 287, 64, 64);
    contentPane.add(lblImage20);

    JLabel lblImage14 = new JLabel("");
    Image img14 = new ImageIcon(this.getClass().
        getResource("/Pics/loss-of-sense-of-taste.png")).getImage();
    lblImage14.setIcon(new ImageIcon(img14));
    lblImage14.setBounds(256, 336, 64, 64);
    contentPane.add(lblImage14);
  }
}
