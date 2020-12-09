import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Student extends AuebMember {
	
	 @Override
	 public void interactionWithUser() {
	 Scanner sc = new Scanner(System.in);
	 int choice = menu();
	 	while (choice != 4) {
	 		if (choice == 1) {
	 			System.out.println("Write your AM: ");
	 			int AM = sc.nextInt();
	 			iWantMyStat(AM);
	 			menu();
	 		} else if (choice == 2) {
	 			System.out.println("Write your AM: ");
	 			int AM = sc.nextInt();
	 			iWantMyCloseCont(AM);
	 			menu();
	 		} else {
	 			iWantTheStatistics();
	 			menu();
	 		}
	 	}
	 }
 
	@Override
	 public int menu() {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("\n~~~~~~~~~~ STUDENT MENU ~~~~~~~~~~\n");
	 System.out.println("1. Show my Covid-Status\n");
	 System.out.println("2. Am I a close contact?\n");
	 System.out.println("3. Statistical Data\n");
	 System.out.println("4. Exit\n");
	 System.out.println("Choose between [1-4]: ");
	 int choice = sc.nextInt();
	 	while (choice>4 || choice<1) {
		 System.out.println("\nWrong input.\n");
		 System.out.print("You must choose between [1-4]: ");
		 choice = sc.nextInt();
	 	}
	 return choice;
	 } 
	
	@Override
	public void iWantMyStat(int AM) {
	String result = giveMyStatus(AM);
		if (result.equals("p")) {
			System.out.println("You tested positive for Covid-19!¥n Follow the instructions below:");
			System.out.println("1. Self-isolate for 14 days from the day you were last in contact with the person who tested positive for coronavirus – as it can take up to 14 days for symptoms to appear.¥n" +
					"2. Do not leave your home for any reason – if you need food or medicine, order it online or by phone, or ask friends and family to drop it off at your home.¥n" +
					"3. Do not have visitors in your home, including friends and family – except for essential care.¥n" +
					"4. Try to avoid contact with anyone you live with as much as possible.¥n" +
					"5. People you live with do not need to self-isolate if you do not have symptoms.¥n" +
					"6. People in your support bubble do not need to self-isolate if you do not have symptoms.¥n" +
					"WARNING: If you live with someone at higher risk from coronavirus, try to arrange for them to stay with friends or family for 14 days.¥n");
		}else if (result.equals("n")) {
			System.out.println("You tested negative for Covid-19! Stay safe!¥n");
			System.out.println("You do not need to self-isolate if your test is negative, as long as:¥n" +
					"1. Everyone you live with who has symptoms tests negative.¥n" +
					"2. Everyone in your support bubble who has symptoms tests negative.¥n" +
					"3. You feel well – if you feel unwell, stay at home until you’re feeling better.¥n");
		}
	}
	
	@Override
	public void iWantMyCloseCont(int AM) {
	String hsympt = "fever, cough, shortness of breath, sudden onset of anemia, tastelessness";
	Scanner sc = new Scanner(System.in);
	String ssympt = "headache, chills, myalgias, exhaustion, nausea, vomiting, dysphagia, abdominal pain, diarrhea";
		if (closeCont(AM) == "true") {
			System.out.println("You are a close contact !!!");
			String answer = "n";
			while (answer != "y" || answer != "n") {
				if (answer != "y" || answer != "n") {
					System.out.println("You must press y for yes or n for no!");
				}
				System.out.println("If you had any of the following symptoms press y or else press n : \n" + hsympt);
				try {
					answer = sc.nextLine();
				} catch(Exception e) {
					System.out.println("Your answer was not y or n ");
					answer = "o";
				}
			}
			if (answer == "y") {
				System.out.println("You should stay in Quarantine for 14 days and do the covid-19 test!");	
			} else {
				while (answer != "y" || answer != "n") {
					if (answer != "y" || answer != "n") {
						System.out.println("You must press y for yes or n for no!");
					}
					System.out.println("If you had any of the following symptoms press y or else press n : \n" + ssympt);
					try {
						answer = sc.nextLine();
					} catch(Exception e) {
						System.out.println("Your answer was not y or n ");
						answer = "o";
					}
				}
				if (answer == "y") {
					System.out.println("You should stay in quarantine for 10 days and do the covid-19 test!");
				} else {
					System.out.println("Stay in quarantine for 7 days and if you have any of the above symptoms do the covid-19 test!");
				}
			}
		} else {
			System.out.println("You are not a close contact !!");
		}	
	}
	@Override
	public void iWantTheStatistics() {
		// TODO Auto-generated method stub	
	}
	@Override
	public String giveMyStatus(int am) {
        String sql =  "SELECT Status FROM Student WHERE AM =" + am ;
        String url = "jdbc:sqlite:Thefinaldb.db";
        String quer = "SELECT AM FROM Student WHERE AM = " + am;
        String result="n";
      
        try {Connection conn = DriverManager.getConnection(url);
        	Statement firststmt  = conn.createStatement();
        	ResultSet firstrs    = firststmt.executeQuery(quer);
        	if(firstrs.next() == true) {
        	Statement stmt  = conn.createStatement();
            ResultSet rs    = stmt.executeQuery(sql);           
        	result = rs.getString("Status");           
        	} else {
        		System.out.println("\nYou inserted a wrong AM");
        		result = "err";
        		}
            try {
    			conn.close();
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
               
        return result;		
	}

	@Override
	public String closeCont(int am) {
        String sql =  "SELECT CloseContact FROM Student WHERE AM =" + am ;
        String url = "jdbc:sqlite:Thefinaldb.db";
        String quer = "SELECT AM FROM Student WHERE AM = " + am;
        String result="false";
      
        try {Connection conn = DriverManager.getConnection(url);
        	Statement firststmt  = conn.createStatement();
        	ResultSet firstrs    = firststmt.executeQuery(quer);
        	if(firstrs.next() == true) {
        	Statement stmt  = conn.createStatement();
            ResultSet rs    = stmt.executeQuery(sql);            
        	result = rs.getString("CloseContact");          
        	} else {
        		System.out.println("\nYou inserted a wrong AM");
        		result = "err";
        	}
            try {
    			conn.close();
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
        } catch (SQLException e) {
            System.out.println(e.getMessage());        
        } 
    return result;
	}
}
