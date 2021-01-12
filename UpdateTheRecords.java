
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class UpdateTheRecords {

	public static String giveMeTheDate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime now = LocalDateTime.now();
		return dtf.format(now);
	}    

	public static String dateTime() {  
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		return dtf.format(now);  
	}    



	public static String checkIfAmExist (int AM) {

		String result = "false";
		String url = "jdbc:sqlite:Thefinaldb.db";
		String quer = "SELECT AM FROM Student WHERE AM = " + AM;
		;
		try {Connection conn = DriverManager.getConnection(url);

		Statement firststmt  = conn.createStatement();
		ResultSet firstrs    = firststmt.executeQuery(quer);
		if(firstrs.next() == true) {

			result="true";
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		else {result = "false";}
		} catch (SQLException e) {
			//System.out.println(e.getMessage());
		}

		return result;
	}



	public static void changeTheStatus (int id, String stat, String who) {

		String sqlstfn =  "UPDATE Staff SET Status = 'n' WHERE AFM =" + id;
		String sqlstf =  "UPDATE Staff SET Status = 'p' WHERE AFM =" + id;
		String sql =  "UPDATE Student SET Status = 'p' WHERE AM =" + id;
		String sqln =  "UPDATE Student SET Status = 'n' WHERE AM =" + id;
		String sql2 = "SELECT AM FROM Student WHERE AM = " + id;
		String sql3 = "SELECT name FROM Student WHERE AM = " + id;
		String sql4 = "SELECT surname FROM Student WHERE AM = " + id;
		String sql6 = "SELECT AFM FROM Staff WHERE AFM = " + id;
		String sql7 = "SELECT name FROM Staff WHERE AFM = " + id;
		String sql8 = "SELECT surname FROM Staff WHERE AFM = " + id;
		String quer2 = "SELECT AFM FROM Staff WHERE AFM = " + id;
		String url = "jdbc:sqlite:Thefinaldb.db";
		String quer = "SELECT AM FROM Student WHERE AM = " + id;
		String date = giveMeTheDate();
		String nl = null;
		String sql10 = "UPDATE Student SET DatePos ='" + date + "' WHERE AM = " + id;
		String sql11 = "UPDATE Student SET DatePos ='" + nl + "' WHERE AM = " + id;
		String sql12 = "UPDATE Staff SET DatePos ='" + date + "' WHERE AFM = " + id;
		String sql13 = "UPDATE Staff SET DatePos ='" + nl + "' WHERE AFM = " + id;

		try {Connection conn = DriverManager.getConnection(url);

		Statement firststmt  = conn.createStatement();
		if (who.equals("student")) {
			ResultSet firstrs    = firststmt.executeQuery(quer);
			if(firstrs.next() == true) {
				if(stat.equals("p")) {
					Statement stmt  = conn.createStatement();
					stmt.execute(sql);
					Statement stmt40  = conn.createStatement();
					stmt40.execute(sql10);

					Statement stmt2  = conn.createStatement();
					ResultSet rs2    = stmt2.executeQuery(sql2);
					Statement stmt3  = conn.createStatement();
					ResultSet rs3    = stmt3.executeQuery(sql3);
					Statement stmt4  = conn.createStatement();
					ResultSet rs4    = stmt4.executeQuery(sql4);
				//	System.out.println("\n\nThe Student's status was updated\n"+ "Date of update: " + dateTime() + "\nStudent details: " + rs3.getString("name") +" "+ rs4.getString("surname") + " AM: " + rs2.getInt("AM")+ "\nThe updated status is: Positive" );
				}
				else if(stat.equals("n")) {
					Statement stmt60  = conn.createStatement();
					stmt60.execute(sqln);
					Statement stmt41  = conn.createStatement();
					stmt41.execute(sql11);

					Statement stmt6  = conn.createStatement();
					ResultSet rs6    = stmt6.executeQuery(sql2);
					Statement stmt7  = conn.createStatement();
					ResultSet rs7    = stmt7.executeQuery(sql3);
					Statement stmt8  = conn.createStatement();
					ResultSet rs8    = stmt8.executeQuery(sql4);
					//System.out.println("\n\nThe Student's status was updated\n"+ "Date of update: " + dateTime() + "\nStudent details: " + rs7.getString("name") +" "+ rs8.getString("surname") + " AM: " + rs6.getInt("AM")+ "\nThe updated status is: Negative" );
				}
			}
			//else {System.out.println("\nYou inserted a wrong AM");}
		} else if (who.equals("staff")) {
			Statement firststmt2  = conn.createStatement();
			ResultSet firstrs2    = firststmt2.executeQuery(quer2);
			if(firstrs2.next() == true) {
				if (stat.equals("p")) {
					Statement stmt150  = conn.createStatement();
					stmt150.execute(sqlstf);
					Statement stmt42  = conn.createStatement();
					stmt42.execute(sql12);
					Statement stmt10  = conn.createStatement();
					ResultSet rs10    = stmt10.executeQuery(sql6);
					Statement stmt11  = conn.createStatement();
					ResultSet rs11    = stmt11.executeQuery(sql7);
					Statement stmt12  = conn.createStatement();
					ResultSet rs12    = stmt12.executeQuery(sql8);
				//	System.out.println("\n\nThe Staff's status was updated\n" +"Date of update: " + dateTime() + "\nStaff details: " +rs11.getString("name") + " " + rs12.getString("surname") + " AFM: " + rs10.getInt("AFM")+ "\nThe updated status is: Positive" );
				}
				else if (stat.equals("n")) {
					Statement stmt30  = conn.createStatement();
					stmt30.execute(sqlstfn);
					Statement stmt43  = conn.createStatement();
					stmt43.execute(sql13);
					Statement stmt14  = conn.createStatement();
					ResultSet rs10    = stmt14.executeQuery(sql6);
					Statement stmt15  = conn.createStatement();
					ResultSet rs11   = stmt15.executeQuery(sql7);
					Statement stmt16  = conn.createStatement();
					ResultSet rs12    = stmt16.executeQuery(sql8);
					//System.out.println("\n\nThe Staff's status was updated\n"+ "Date of update " + dateTime() + "\nStaff details: " + rs11.getString("name") +" "+ rs12.getString("surname") + " AFM: " + rs10.getInt("AFM")+ "\nThe updated status is: Negative" );
				}
			}
		//	else {System.out.println("\nYou inserted a wrong AFM");}

		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		} catch (SQLException e) {
		//	System.out.println(e.getMessage());
		}        
	}

	public static void changeCloseCont (int id, String stat, String who) {

		String sqlstfn =  "UPDATE Staff SET CloseContact = 'false' WHERE AFM =" + id;
		String sqlstf =  "UPDATE Staff SET CloseContact = 'true' WHERE AFM =" + id;
		String sql =  "UPDATE Student SET CloseContact = 'true' WHERE AM =" + id;
		String sqln =  "UPDATE Student SET CloseContact = 'false' WHERE AM =" + id;
		String sql2 = "SELECT AM FROM Student WHERE AM = " + id;
		String sql3 = "SELECT name FROM Student WHERE AM = " + id;
		String sql4 = "SELECT surname FROM Student WHERE AM = " + id;
		String sql6 = "SELECT AFM FROM Staff WHERE AFM = " + id;
		String sql7 = "SELECT name FROM Staff WHERE AFM = " + id;
		String sql8 = "SELECT surname FROM Staff WHERE AFM = " + id;
		String quer2 = "SELECT AFM FROM Staff WHERE AFM = " + id;
		String url = "jdbc:sqlite:Thefinaldb.db";
		String quer = "SELECT AM FROM Student WHERE AM = " + id;
		String date = giveMeTheDate();
		String nl = null;
		String sql10 = "UPDATE Student SET DateClose ='" + date + "' WHERE AM = " + id;
		String sql11 = "UPDATE Student SET DateClose ='" + nl + "' WHERE AM = " + id;
		String sql12 = "UPDATE Staff SET DateClose ='" + date + "' WHERE AFM = " + id;
		String sql13 = "UPDATE Staff SET DateClose ='" + nl + "' WHERE AFM = " + id;

		try {Connection conn = DriverManager.getConnection(url);

		Statement firststmt  = conn.createStatement();
		if (who.equals("student")) {
			ResultSet firstrs    = firststmt.executeQuery(quer);
			if(firstrs.next() == true) {
				if(stat.equals("true")) {
					Statement stmt  = conn.createStatement();
					stmt.execute(sql);
					Statement stmt45  = conn.createStatement();
					stmt45.execute(sql10);

					Statement stmt2  = conn.createStatement();
					ResultSet rs2    = stmt2.executeQuery(sql2);
					Statement stmt3  = conn.createStatement();
					ResultSet rs3    = stmt3.executeQuery(sql3);
					Statement stmt4  = conn.createStatement();
					ResultSet rs4    = stmt4.executeQuery(sql4);
				//	System.out.println("\n\nThe Student's status was updated\n"+ "Date of update: " + dateTime() + "\nStudent details: " + rs3.getString("name") +" "+ rs4.getString("surname") + " AM: " + rs2.getInt("AM")+ "\nThe Student is a closed contact with a positive person" );
				}
				else if(stat.equals("false")) {
					Statement stmt60  = conn.createStatement();
					stmt60.execute(sqln);
					Statement stmt46  = conn.createStatement();
					stmt46.execute(sql11);

					Statement stmt6  = conn.createStatement();
					ResultSet rs6    = stmt6.executeQuery(sql2);
					Statement stmt7  = conn.createStatement();
					ResultSet rs7    = stmt7.executeQuery(sql3);
					Statement stmt8  = conn.createStatement();
					ResultSet rs8    = stmt8.executeQuery(sql4);
				//	System.out.println("\n\nThe Student's status was updated\n"+ "Date of update: " + dateTime() + "\nStudent details: " + rs7.getString("name") +" "+ rs8.getString("surname") + " AM: " + rs6.getInt("AM")+ "\nThe is not a close contact after this update" );
				}
			}
		//	else {System.out.println("\nYou inserted a wrong AM");}
		} else if (who.equals("staff")) {
			Statement firststmt2  = conn.createStatement();
			ResultSet firstrs2    = firststmt2.executeQuery(quer2);
			if(firstrs2.next() == true) {
				if (stat.equals("true")) {
					Statement stmt150  = conn.createStatement();
					stmt150.execute(sqlstf);
					Statement stmt47  = conn.createStatement();
					stmt47.execute(sql12);

					Statement stmt10  = conn.createStatement();
					ResultSet rs10    = stmt10.executeQuery(sql6);
					Statement stmt11  = conn.createStatement();
					ResultSet rs11    = stmt11.executeQuery(sql7);
					Statement stmt12  = conn.createStatement();
					ResultSet rs12    = stmt12.executeQuery(sql8);
				//	System.out.println("\n\nThe Staff's status was updated\n"+ "Date of update: " + dateTime() + "\nStaff details: " + rs11.getString("name") +" "+ rs12.getString("surname") + " AFM: " + rs10.getInt("AFM")+ "\nThe staff is a closed contact with a positive person" );
				}
				else if (stat.equals("false")) {
					Statement stmt30  = conn.createStatement();
					stmt30.execute(sqlstfn);
					Statement stmt48  = conn.createStatement();
					stmt48.execute(sql13);

					Statement stmt14  = conn.createStatement();
					ResultSet rs10    = stmt14.executeQuery(sql6);
					Statement stmt15  = conn.createStatement();
					ResultSet rs11   = stmt15.executeQuery(sql7);
					Statement stmt16  = conn.createStatement();
					ResultSet rs12    = stmt16.executeQuery(sql8);
				//	System.out.println("\n\nThe Staff's status was updated\n"+ "Date of update: " + dateTime() + "\nStaff details: " + rs11.getString("name") +" "+ rs12.getString("surname") + " AFM: " + rs10.getInt("AFM")+ "\nThe staff in not a closed contact after this update" );
				}
			}
	//		else {System.out.println("\nYou inserted a wrong AFM");}

		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		} catch (SQLException e) {
		//	System.out.println(e.getMessage());
		}        
	}


	public static int  totalPositiveNumber () {
		int counter = 0;
		String sql =  "SELECT AM FROM Student WHERE Status = 'p'";
		String sql2 =  "SELECT AFM FROM Staff WHERE Status = 'p'";
		String url = "jdbc:sqlite:Thefinaldb.db";


		try {Connection conn = DriverManager.getConnection(url);

		Statement stmt  = conn.createStatement();
		ResultSet rs    = stmt.executeQuery(sql);
		Statement stmt2  = conn.createStatement();
		ResultSet rs2    = stmt2.executeQuery(sql2);
		while(rs.next()) {  
			counter++;
		}
		while(rs2.next()) {  
			counter++;
		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch (SQLException e) {
		//	System.out.println(e.getMessage());
		}
		return counter;

	}
	public static int  totalPositiveNumberofStudent () {
		int counter = 0;
		String sql =  "SELECT AM FROM Student WHERE Status = 'p'";
		String url = "jdbc:sqlite:Thefinaldb.db";


		try {Connection conn = DriverManager.getConnection(url);

		Statement stmt  = conn.createStatement();
		ResultSet rs    = stmt.executeQuery(sql);
		while(rs.next()) {  
			counter++;
		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch (SQLException e) {
		//	System.out.println(e.getMessage());
		}
		return counter;

	}
	
	public static int  totalPositiveNumberofStaff () {
		int counter = 0;
		
		String sql2 =  "SELECT AFM FROM Staff WHERE Status = 'p'";
		String url = "jdbc:sqlite:Thefinaldb.db";


		try {Connection conn = DriverManager.getConnection(url);
		Statement stmt2  = conn.createStatement();
		ResultSet rs2    = stmt2.executeQuery(sql2);
		while(rs2.next()) {  
			counter++;
		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch (SQLException e) {
		//	System.out.println(e.getMessage());
		}
		return counter;

	}

	public static int  totalCloseContNumber () {
		int counter = 0;
		String sql =  "SELECT AM FROM Student WHERE CloseContact = 'true'";
		String sql2 =  "SELECT AFM FROM Staff WHERE CloseContact = 'true'";
		String url = "jdbc:sqlite:Thefinaldb.db";


		try {Connection conn = DriverManager.getConnection(url);

		Statement stmt  = conn.createStatement();
		ResultSet rs    = stmt.executeQuery(sql);
		Statement stmt2  = conn.createStatement();
		ResultSet rs2    = stmt2.executeQuery(sql2);
		while(rs.next()) {  
			counter++;
		}
		while(rs2.next()) {  
			counter++;
		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch (SQLException e) {
		//	System.out.println(e.getMessage());
		}
		return counter;

	}
	
	public static int  totalCloseContNumberofStudent () {
		int counter = 0;
		String sql =  "SELECT AM FROM Student WHERE CloseContact = 'true'";
		String url = "jdbc:sqlite:Thefinaldb.db";


		try {Connection conn = DriverManager.getConnection(url);

		Statement stmt  = conn.createStatement();
		ResultSet rs    = stmt.executeQuery(sql);
		while(rs.next()) {  
			counter++;
		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch (SQLException e) {
			//System.out.println(e.getMessage());
		}
		return counter;

	}
	
	public static int  totalCloseContNumberofStaff () {
		int counter = 0;
		String sql2 =  "SELECT AFM FROM Staff WHERE CloseContact = 'true'";
		String url = "jdbc:sqlite:Thefinaldb.db";


		try {Connection conn = DriverManager.getConnection(url);
		Statement stmt2  = conn.createStatement();
		ResultSet rs2    = stmt2.executeQuery(sql2);
		while(rs2.next()) {  
			counter++;
		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch (SQLException e) {
			//System.out.println(e.getMessage());
		}
		return counter;

	}



	public static String checkIfAFMExist (int AFM) {

		String result = "false";
		String url = "jdbc:sqlite:Thefinaldb.db";
		String quer = "SELECT AFM FROM Staff WHERE AFM = " + AFM;
		;
		try {Connection conn = DriverManager.getConnection(url);

		Statement firststmt  = conn.createStatement();
		ResultSet firstrs    = firststmt.executeQuery(quer);
		if(firstrs.next() == true) {

			result="true";
		} 
		else {result = "false";}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		} catch (SQLException e) {
		//	System.out.println(e.getMessage());
		}

		return result;
	}

	public static String sendEmailToStudent (int am) {

		String sql =  "SELECT Email FROM Student WHERE AM =" + am ;
		String url = "jdbc:sqlite:Thefinaldb.db";
		String quer = "SELECT AM FROM Student WHERE AM = " + am;
		String result = "";
		
		try {Connection conn = DriverManager.getConnection(url);
		Statement firststmt  = conn.createStatement();
		ResultSet firstrs    = firststmt.executeQuery(quer);
		if(firstrs.next() == true) {
			Statement stmt  = conn.createStatement();
			ResultSet rs    = stmt.executeQuery(sql);
			result = rs.getString("Email");
		//	System.out.println("\n\nThe Student with AM: " + firstrs.getInt("AM") + " has been informed\nAn email has been sent at: " + rs.getString("Email"));


		} 
		else {
		//	System.out.println("\nYou inserted a wrong AM");

		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch (SQLException e) {
	//		System.out.println(e.getMessage());
		}   
		return result;
	}

	public static String sendEmailToStaff (int AFM) {

		String sql =  "SELECT Email FROM Staff WHERE AFM =" + AFM ;
		String url = "jdbc:sqlite:Thefinaldb.db";
		String quer = "SELECT AFM FROM Staff WHERE AFM = " + AFM;
		String result = "";
		
		try {Connection conn = DriverManager.getConnection(url);
		Statement firststmt  = conn.createStatement();
		ResultSet firstrs    = firststmt.executeQuery(quer);
		if(firstrs.next() == true) {
			Statement stmt  = conn.createStatement();
			ResultSet rs    = stmt.executeQuery(sql);
			result = rs.getString("Email");
			
	//		System.out.println("\n\nThe Staff with AFM: " + firstrs.getInt("AFM") + " has been informed\nAn email has been sent at: " + rs.getString("Email"));


		} 
		else {
	//		System.out.println("\nYou inserted a wrong AFM");

		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch (SQLException e) {
	//		System.out.println(e.getMessage());
		} 
		return result;
	}

	public static String giveMeTheNameOfStaff (int AFM) {

		String result = "You inserted a wrong AFM";
		String sql =  "SELECT Name FROM Staff WHERE AFM =" + AFM ;
		String url = "jdbc:sqlite:Thefinaldb.db";
		String quer = "SELECT AFM FROM Staff WHERE AFM = " + AFM;
		String sql2 =  "SELECT Surname FROM Staff WHERE AFM =" + AFM ;

		try {Connection conn = DriverManager.getConnection(url);
		Statement firststmt  = conn.createStatement();
		ResultSet firstrs    = firststmt.executeQuery(quer);
		if(firstrs.next() == true) {
			Statement stmt  = conn.createStatement();
			ResultSet rs    = stmt.executeQuery(sql);
			Statement stmt2  = conn.createStatement();
			ResultSet rs2    = stmt2.executeQuery(sql2);

			result = rs.getString("Name") + " " + rs2.getString("Surname");


		} 
		else {
			result = "\nYou inserted a wrong AFM";

		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch (SQLException e) {
		//	System.out.println(e.getMessage());
		} 

		return result;
	}

	public static String giveMeTheNameOfStudent (int AM) {

		String result = "You inserted a wrong AM";
		String url = "jdbc:sqlite:Thefinaldb.db";
		String quer = "SELECT AM FROM Student WHERE AM = " + AM;
		String sql = "SELECT Name FROM Student WHERE AM = " + AM;
		String sql2 = "SELECT Surname FROM Student WHERE AM = " + AM;
		;
		try {Connection conn = DriverManager.getConnection(url);

		Statement firststmt  = conn.createStatement();
		ResultSet firstrs    = firststmt.executeQuery(quer);
		Statement stmt  = conn.createStatement();
		ResultSet rs    = stmt.executeQuery(sql);
		Statement stmt2  = conn.createStatement();
		ResultSet rs2    = stmt2.executeQuery(sql2);
		if(firstrs.next() == true) {

			result = rs.getString("Name") + " " + rs2.getString("Surname");
		} 
		else {result = "\nYou inserted a wrong AM";}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch (SQLException e) {
	//		System.out.println(e.getMessage());
		}
		return result;
	}

}
