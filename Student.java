import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Student extends AuebMember {
	
	@Override
	public void iWantMyStat(int AM) {
		String result = giveMyStatus(AM);
		if (result.equals("p")) {
			System.out.println("...");
		}
		else if (result.equals("n")) {
			System.out.println("...");
		}
		
		
	}

	@Override
	public void iWantMyCloseCont(int AM) {
		// TODO Auto-generated method stub
		
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
            
        	} 
        	else {
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
            
        	} 
        	else {
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
