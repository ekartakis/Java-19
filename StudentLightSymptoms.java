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

public class StudentLightSymptoms extends JFrame {

  private JPanel contentPane;

  /**
 * Launch the application.
 */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          StudentLightSymptoms frame = new StudentLightSymptoms();
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
  //In this case the student has light symptoms.
  //The student is asked about having light symptoms.
  public StudentLightSymptoms() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(0, 0, 1280, 730);
    contentPane = new JPanel();
    contentPane.setBackground(Color.WHITE);
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    ///Creating and displaying all the labels to write the text.
    JLabel lblNewLabel = new JLabel("Have you had any "
        + "of these light symptoms?");
    lblNewLabel.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel.setBounds(12, 13, 696, 35);
    contentPane.add(lblNewLabel);

    JLabel lblNewLabel1 = new JLabel("- Headache");
    lblNewLabel1.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel1.setBounds(12, 80, 178, 35);
    contentPane.add(lblNewLabel1);

    JLabel lblNewLabel2 = new JLabel("- Chills");
    lblNewLabel2.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel2.setBounds(12, 126, 178, 35);
    contentPane.add(lblNewLabel2);

    JLabel lblNewLabel3 = new JLabel("- Myalgias");
    lblNewLabel3.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel3.setBounds(12, 172, 178, 35);
    contentPane.add(lblNewLabel3);

    JLabel lblNewLabel4 = new JLabel("- Exhaustion");
    lblNewLabel4.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel4.setBounds(12, 218, 178, 35);
    contentPane.add(lblNewLabel4);

    JLabel lblNewLabel5 = new JLabel("- Nausea");
    lblNewLabel5.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel5.setBounds(12, 264, 158, 35);
    contentPane.add(lblNewLabel5);

    JLabel lblNewLabel6 = new JLabel("- Vomiting");
    lblNewLabel6.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel6.setBounds(12, 310, 178, 35);
    contentPane.add(lblNewLabel6);

    JLabel lblNewLabel7 = new JLabel("- Dysphagia");
    lblNewLabel7.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel7.setBounds(12, 356, 197, 35);
    contentPane.add(lblNewLabel7);

    JLabel lblNewLabel8 = new JLabel("- Abdominal pain");
    lblNewLabel8.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel8.setBounds(12, 402, 250, 35);
    contentPane.add(lblNewLabel8);

    JLabel lblNewLabel9 = new JLabel("- Diarrhea");
    lblNewLabel9.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
    lblNewLabel9.setBounds(12, 448, 168, 35);
    contentPane.add(lblNewLabel9);
    //Creating and displaying the Yes button.
    //The Yes button calls the StudentOnlyLight class.
    JButton btnNewButton = new JButton("Yes");
    btnNewButton.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
    btnNewButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        setVisible(false);
        StudentOnlyLight ol = new StudentOnlyLight();
        ol.setVisible(true);
      }
    });
    btnNewButton.setBounds(470, 275, 139, 55);
    contentPane.add(btnNewButton);
    //Creating and displaying the No button.
    //The No button calls the StudentNoSymptoms class.
    JButton btnNewButton1 = new JButton("No");
    btnNewButton1.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
    btnNewButton1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          setVisible(false);
          StudentNoSymptoms ns = new StudentNoSymptoms();
          ns.setVisible(true);
        }
    });
    btnNewButton1.setBounds(470, 351, 139, 55);
    contentPane.add(btnNewButton1);
    //Creating and displaying the back button.
    // The back button returns to the CollegeStudentMenu.
    JButton btnBackButton = new JButton("Back");
    btnBackButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        setVisible(false);
        CollStudentMenu scc = new CollStudentMenu();
        scc.setVisible(true);
        }
    });
    btnBackButton.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
    btnBackButton.setBounds(47, 529, 215, 71);
    contentPane.add(btnBackButton);
    //Creating and displaying all the images in labels and buttons.
    JLabel lblImage10 = new JLabel("");
    Image img10 = new ImageIcon(this.getClass().getResource("/Pics/135464593_"
        + "1077636602678989_8400056473973577538_n.png")).getImage();
    lblImage10.setIcon(new ImageIcon(img10));
    lblImage10.setBounds(981, 0, 285, 233);
    contentPane.add(lblImage10);

    Image img4 = new ImageIcon(this.getClass().getResource("/Pics"
        + "/left-arrow (1).png")).getImage();
    btnBackButton.setIcon(new ImageIcon(img4));
    btnBackButton.setFont(new Font("Tahoma", Font.BOLD, 24));
    contentPane.add(btnBackButton);

    JLabel lblImage12 = new JLabel("");
    Image img12 = new ImageIcon(this.getClass().getResource("/Pics/"
        + "headache.png")).getImage();
    lblImage12.setIcon(new ImageIcon(img12));
    lblImage12.setBounds(187, 68, 64, 64);
    contentPane.add(lblImage12);

    JLabel lblImage11 = new JLabel("");
    Image img11 = new ImageIcon(this.getClass().getResource("/Pics"
        + "/vomiting.png")).getImage();
    lblImage11.setIcon(new ImageIcon(img11));
    lblImage11.setBounds(200, 298, 64, 64);
    contentPane.add(lblImage11);

    JLabel lblImage13 = new JLabel("");
    Image img13 = new ImageIcon(this.getClass().getResource("/Pics"
        + "/cold.png")).getImage();
    lblImage13.setIcon(new ImageIcon(img13));
    lblImage13.setBounds(200, 143, 64, 64);
    contentPane.add(lblImage13);

    JLabel lblImage16 = new JLabel("");
    Image img16 = new ImageIcon(this.getClass().getResource("/Pics"
        + "/fatigue.png")).getImage();
    lblImage16.setIcon(new ImageIcon(img16));
    lblImage16.setBounds(198, 224, 64, 64);
    contentPane.add(lblImage16);

    JLabel lblImage17 = new JLabel("");
    Image img17 = new ImageIcon(this.getClass().getResource("/Pics"
        + "/diarrhea.png")).getImage();
    lblImage17.setIcon(new ImageIcon(img17));
    lblImage17.setBounds(249, 373, 64, 64);
    contentPane.add(lblImage17);

    JLabel lblImage8 = new JLabel("");
    Image img8 = new ImageIcon(this.getClass().getResource("/Pics"
        + "/diarrhea (1).png")).getImage();
    lblImage8.setIcon(new ImageIcon(img8));
    lblImage8.setBounds(179, 438, 64, 64);
    contentPane.add(lblImage8);
  }
}
