package Methods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Staff extends AuebMember {
	
	@Override
	public String giveTheDateOfPos(int AFM) {
		String result = "You inserted a wrong AFM";
		String url = "jdbc:sqlite:Thefinaldb.db";
		String quer = "SELECT AFM FROM Staff WHERE AFM = " + AFM;
		String sql = "SELECT DatePos FROM Staff WHERE AFM = " + AFM;
		;
		try {Connection conn = DriverManager.getConnection(url);

		Statement firststmt  = conn.createStatement();
		ResultSet firstrs    = firststmt.executeQuery(quer);
		Statement stmt  = conn.createStatement();
		ResultSet rs    = stmt.executeQuery(sql);
		if(firstrs.next() == true) {

			result = rs.getString("DatePos");
		} 
		else {result = "\nYou inserted a wrong AFM";}
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
	
	public String giveTheDateOfCloseCont(int AFM) {
		String result = "You inserted a wrong AFM";
		String url = "jdbc:sqlite:Thefinaldb.db";
		String quer = "SELECT AFM FROM Staff WHERE AFM = " + AFM;
		String sql = "SELECT DateClose FROM Staff WHERE AFM = " + AFM;
		;
		try {Connection conn = DriverManager.getConnection(url);

		Statement firststmt  = conn.createStatement();
		ResultSet firstrs    = firststmt.executeQuery(quer);
		Statement stmt  = conn.createStatement();
		ResultSet rs    = stmt.executeQuery(sql);
		if(firstrs.next() == true) {

			result = rs.getString("DateClose");
		} 
		else {result = "\nYou inserted a wrong AFM";}
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
	public void iWantMyStat(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void iWantMyCloseCont(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void iWantTheStatistics() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String giveMyStatus(int AFM) {
        String sql =  "SELECT Status FROM Staff WHERE AFM =" + AFM ;
        String url = "jdbc:sqlite:Thefinaldb.db";
        String quer = "SELECT AFM FROM Staff WHERE AFM = " + AFM;
        String result="n";
      
        try {Connection conn = DriverManager.getConnection(url);
        	Statement firststmt  = conn.createStatement();
        	ResultSet firstrs    = firststmt.executeQuery(quer);
        	if(firstrs.next() == true) {
        	Statement stmt  = conn.createStatement();
            ResultSet rs    = stmt.executeQuery(sql);
            
        	result = rs.getString("Status");
            
        	} 
        	else {
        		System.out.println("\nYou inserted a wrong AFM");
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
	public String closeCont(int AFM) {
        String sql =  "SELECT CloseContact FROM Staff WHERE AFM =" + AFM ;
        String url = "jdbc:sqlite:Thefinaldb.db";
        String quer = "SELECT AFM FROM Staff WHERE AFM = " + AFM;
        String result="You inserted a wrong AFM";
      
        try {Connection conn = DriverManager.getConnection(url);
        	Statement firststmt  = conn.createStatement();
        	ResultSet firstrs    = firststmt.executeQuery(quer);
        	if(firstrs.next() == true) {
        	Statement stmt  = conn.createStatement();
            ResultSet rs    = stmt.executeQuery(sql);
            
        	result = rs.getString("CloseContact");
            
        	} 
        	else {
        		System.out.println("\nYou inserted a wrong ΑΦΜ");
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
