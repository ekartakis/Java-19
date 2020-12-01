import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Staff extends AuebMember {

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
	public String giveMyStatus(int ΑΦΜ) {
        String sql =  "SELECT Status FROM Staff WHERE ΑΦΜ =" + ΑΦΜ ;
        String url = "jdbc:sqlite:Thefinaldb.db";
        String quer = "SELECT ΑΦΜ FROM Staff WHERE ΑΦΜ = " + ΑΦΜ;
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

	@Override
	public String closeCont(int ΑΦΜ) {
        String sql =  "SELECT CloseContact FROM Staff WHERE ΑΦΜ =" + ΑΦΜ ;
        String url = "jdbc:sqlite:Thefinaldb.db";
        String quer = "SELECT ΑΦΜ FROM Staff WHERE ΑΦΜ = " + ΑΦΜ;
        String result="You inserted a wrong ΑΦΜ";
      
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
