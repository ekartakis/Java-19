package Methods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTheRecords {
	
	
	
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
            System.out.println(e.getMessage());
        }
 
        return result;
	}

	public static void changeTheStatus (int id, String stat, String who) {
		
		String sqlstfn =  "UPDATE Staff SET Status = 'n' WHERE ΑΦΜ =" + id;
		String sqlstf =  "UPDATE Staff SET Status = 'p' WHERE ΑΦΜ =" + id;
        String sql =  "UPDATE Student SET Status = 'p' WHERE AM =" + id;
        String sqln =  "UPDATE Student SET Status = 'n' WHERE AM =" + id;
        String sql2 = "SELECT AM FROM Student WHERE AM = " + id;
        String sql3 = "SELECT name FROM Student WHERE AM = " + id;
        String sql4 = "SELECT surname FROM Student WHERE AM = " + id;
        String sql5 = "SELECT Status FROM Student WHERE AM = " + id;
        String sql6 = "SELECT ΑΦΜ FROM Staff WHERE ΑΦΜ = " + id;
        String sql7 = "SELECT name FROM Staff WHERE ΑΦΜ = " + id;
        String sql8 = "SELECT surname FROM Staff WHERE ΑΦΜ = " + id;
        String sql9 = "SELECT Status FROM Staff WHERE ΑΦΜ = " + id;
        String quer2 = "SELECT ΑΦΜ FROM Staff WHERE ΑΦΜ = " + id;
        String url = "jdbc:sqlite:Thefinaldb.db";
        String quer = "SELECT AM FROM Student WHERE AM = " + id;
        
        try {Connection conn = DriverManager.getConnection(url);
       
        	Statement firststmt  = conn.createStatement();
        		if (who.equals("student")) {
        			ResultSet firstrs    = firststmt.executeQuery(quer);
        				if(firstrs.next() == true) {
        					if(stat.equals("p")) {
        						Statement stmt  = conn.createStatement();
        						stmt.execute(sql);
     
        						Statement stmt2  = conn.createStatement();
        						ResultSet rs2    = stmt2.executeQuery(sql2);
        						Statement stmt3  = conn.createStatement();
        						ResultSet rs3    = stmt3.executeQuery(sql3);
        						Statement stmt4  = conn.createStatement();
        						ResultSet rs4    = stmt4.executeQuery(sql4);
        						Statement stmt5  = conn.createStatement();
        						ResultSet rs5    = stmt5.executeQuery(sql5);
        						System.out.println("\n\nThe Student's status was updated\n"+rs3.getString("name") +" "+ rs4.getString("surname") + " " + rs2.getInt("AM")+ "\nThe updated status is: Positive" );
        					}
        					else if(stat.equals("n")) {
        						Statement stmt60  = conn.createStatement();
        						stmt60.execute(sqln);
            
        						Statement stmt6  = conn.createStatement();
        						ResultSet rs6    = stmt6.executeQuery(sql2);
        						Statement stmt7  = conn.createStatement();
        						ResultSet rs7    = stmt7.executeQuery(sql3);
        						Statement stmt8  = conn.createStatement();
        						ResultSet rs8    = stmt8.executeQuery(sql4);
        						Statement stmt9  = conn.createStatement();
        						ResultSet rs9    = stmt9.executeQuery(sql5);
        						System.out.println("\n\nThe Student's status was updated\n"+rs7.getString("name") +" "+ rs8.getString("surname") + " " + rs6.getInt("AM")+ "\nThe updated status is: Negative" );
        					}
        				}
        				else {System.out.println("\nYou inserted a wrong AM");}
        		} else if (who.equals("staff")) {
        			Statement firststmt2  = conn.createStatement();
        			ResultSet firstrs2    = firststmt2.executeQuery(quer2);
        			if(firstrs2.next() == true) {
        				if (stat.equals("p")) {
        					Statement stmt150  = conn.createStatement();
        					stmt150.execute(sqlstf);
        					Statement stmt10  = conn.createStatement();
        					ResultSet rs10    = stmt10.executeQuery(sql6);
        					Statement stmt11  = conn.createStatement();
        					ResultSet rs11    = stmt11.executeQuery(sql7);
        					Statement stmt12  = conn.createStatement();
        					ResultSet rs12    = stmt12.executeQuery(sql8);
        					Statement stmt13  = conn.createStatement();
        					ResultSet rs13    = stmt13.executeQuery(sql9);
        					System.out.println("\n\nThe Staff's status was updated\n"+rs11.getString("name") +" "+ rs12.getString("surname") + " " + rs10.getInt("ΑΦΜ")+ "\nThe updated status is: Positive" );
        				}
        				else if (stat.equals("n")) {
        					Statement stmt30  = conn.createStatement();
        					stmt30.execute(sqlstfn);
        					Statement stmt14  = conn.createStatement();
        					ResultSet rs10    = stmt14.executeQuery(sql6);
        					Statement stmt15  = conn.createStatement();
        					ResultSet rs11   = stmt15.executeQuery(sql7);
        					Statement stmt16  = conn.createStatement();
        					ResultSet rs12    = stmt16.executeQuery(sql8);
        					System.out.println("\n\nThe Staff's status was updated\n"+rs11.getString("name") +" "+ rs12.getString("surname") + " " + rs10.getInt("ΑΦΜ")+ "\nThe updated status is: Negative" );
        				}
        			}
        			else {System.out.println("\nYou inserted a wrong ΑΦΜ");}
        	
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
	}
	
	public static void changeCloseCont (int id, String stat, String who) {
		
		String sqlstfn =  "UPDATE Staff SET CloseContact = 'false' WHERE ΑΦΜ =" + id;
		String sqlstf =  "UPDATE Staff SET CloseContact = 'true' WHERE ΑΦΜ =" + id;
        String sql =  "UPDATE Student SET CloseContact = 'true' WHERE AM =" + id;
        String sqln =  "UPDATE Student SET CloseContact = 'false' WHERE AM =" + id;
        String sql2 = "SELECT AM FROM Student WHERE AM = " + id;
        String sql3 = "SELECT name FROM Student WHERE AM = " + id;
        String sql4 = "SELECT surname FROM Student WHERE AM = " + id;
        String sql5 = "SELECT Status FROM Student WHERE AM = " + id;
        String sql6 = "SELECT ΑΦΜ FROM Staff WHERE ΑΦΜ = " + id;
        String sql7 = "SELECT name FROM Staff WHERE ΑΦΜ = " + id;
        String sql8 = "SELECT surname FROM Staff WHERE ΑΦΜ = " + id;
        String sql9 = "SELECT Status FROM Staff WHERE ΑΦΜ = " + id;
        String quer2 = "SELECT ΑΦΜ FROM Staff WHERE ΑΦΜ = " + id;
        String url = "jdbc:sqlite:Thefinaldb.db";
        String quer = "SELECT AM FROM Student WHERE AM = " + id;
        
        try {Connection conn = DriverManager.getConnection(url);
       
        	Statement firststmt  = conn.createStatement();
        		if (who.equals("student")) {
        			ResultSet firstrs    = firststmt.executeQuery(quer);
        				if(firstrs.next() == true) {
        					if(stat.equals("true")) {
        						Statement stmt  = conn.createStatement();
        						stmt.execute(sql);
     
        						Statement stmt2  = conn.createStatement();
        						ResultSet rs2    = stmt2.executeQuery(sql2);
        						Statement stmt3  = conn.createStatement();
        						ResultSet rs3    = stmt3.executeQuery(sql3);
        						Statement stmt4  = conn.createStatement();
        						ResultSet rs4    = stmt4.executeQuery(sql4);
        						Statement stmt5  = conn.createStatement();
        						ResultSet rs5    = stmt5.executeQuery(sql5);
        						System.out.println("\n\nThe Student's status was updated\n"+rs3.getString("name") +" "+ rs4.getString("surname") + " " + rs2.getInt("AM")+ "\nThe Student is a closed contact with a positive person" );
        					}
        					else if(stat.equals("false")) {
        						Statement stmt60  = conn.createStatement();
        						stmt60.execute(sqln);
            
        						Statement stmt6  = conn.createStatement();
        						ResultSet rs6    = stmt6.executeQuery(sql2);
        						Statement stmt7  = conn.createStatement();
        						ResultSet rs7    = stmt7.executeQuery(sql3);
        						Statement stmt8  = conn.createStatement();
        						ResultSet rs8    = stmt8.executeQuery(sql4);
        						Statement stmt9  = conn.createStatement();
        						ResultSet rs9    = stmt9.executeQuery(sql5);
        						System.out.println("\n\nThe Student's status was updated\n"+rs7.getString("name") +" "+ rs8.getString("surname") + " " + rs6.getInt("AM")+ "\nThe is not a close contact after this update" );
        					}
        				}
        				else {System.out.println("\nYou inserted a wrong AM");}
        		} else if (who.equals("staff")) {
        			Statement firststmt2  = conn.createStatement();
        			ResultSet firstrs2    = firststmt2.executeQuery(quer2);
        			if(firstrs2.next() == true) {
        				if (stat.equals("true")) {
        					Statement stmt150  = conn.createStatement();
        					stmt150.execute(sqlstf);
        					Statement stmt10  = conn.createStatement();
        					ResultSet rs10    = stmt10.executeQuery(sql6);
        					Statement stmt11  = conn.createStatement();
        					ResultSet rs11    = stmt11.executeQuery(sql7);
        					Statement stmt12  = conn.createStatement();
        					ResultSet rs12    = stmt12.executeQuery(sql8);
        					Statement stmt13  = conn.createStatement();
        					ResultSet rs13    = stmt13.executeQuery(sql9);
        					System.out.println("\n\nThe Staff's status was updated\n"+rs11.getString("name") +" "+ rs12.getString("surname") + " " + rs10.getInt("ΑΦΜ")+ "\nThe staff is a closed contact with a positive person" );
        				}
        				else if (stat.equals("false")) {
        					Statement stmt30  = conn.createStatement();
        					stmt30.execute(sqlstfn);
        					Statement stmt14  = conn.createStatement();
        					ResultSet rs10    = stmt14.executeQuery(sql6);
        					Statement stmt15  = conn.createStatement();
        					ResultSet rs11   = stmt15.executeQuery(sql7);
        					Statement stmt16  = conn.createStatement();
        					ResultSet rs12    = stmt16.executeQuery(sql8);
        					System.out.println("\n\nThe Staff's status was updated\n"+rs11.getString("name") +" "+ rs12.getString("surname") + " " + rs10.getInt("ΑΦΜ")+ "\nThe staff in not a closed contact after this update" );
        				}
        			}
        			else {System.out.println("\nYou inserted a wrong ΑΦΜ");}
        	
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
	}
		
	
	public static void  giveMeAllPositiveStudents () {
		int counter = 0;
        String sql =  "SELECT AM FROM Student WHERE Status = 'p'";
        String url = "jdbc:sqlite:Thefinaldb.db";
        
      
        try {Connection conn = DriverManager.getConnection(url);
        	
        	Statement stmt  = conn.createStatement();
            ResultSet rs    = stmt.executeQuery(sql);
            System.out.println("Here is the list with the AM of all the positive Students:\n\n");
          while(rs.next()) {  
            System.out.println(rs.getString("AM"));
            counter++;
          }
          if (counter==0) {
        	  System.out.println("\nThere is not positive student");
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
           
	}
	
	
				
	public static void  giveMeAllPositiveStaffs () {
		int counter = 0;
        String sql =  "SELECT ΑΦΜ FROM Staff WHERE Status = 'p'";
        String url = "jdbc:sqlite:Thefinaldb.db";
        
      
        try {Connection conn = DriverManager.getConnection(url);
        	
        	Statement stmt  = conn.createStatement();
            ResultSet rs    = stmt.executeQuery(sql);
            System.out.println("Here is the list with the ΑΦΜ of all the postive Staffs:\n\n");
          while(rs.next()) {  
            System.out.println(rs.getString("ΑΦΜ"));
            counter++;
          }
          if (counter==0) {
        	  System.out.println("\nThere is not positive staff");
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
           
	}

	
public static String checkIfΑΦΜExist (int ΑΦΜ) {
		
        String result = "false";
        String url = "jdbc:sqlite:Thefinaldb.db";
        String quer = "SELECT ΑΦΜ FROM Staff WHERE ΑΦΜ = " + ΑΦΜ;
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
            System.out.println(e.getMessage());
        }

        return result;
	}
	
public static void sendEmailToStudent (int am) {
	
    String sql =  "SELECT Email FROM Student WHERE AM =" + am ;
    String url = "jdbc:sqlite:Thefinaldb.db";
    String quer = "SELECT AM FROM Student WHERE AM = " + am;
    
    try {Connection conn = DriverManager.getConnection(url);
    	Statement firststmt  = conn.createStatement();
    	ResultSet firstrs    = firststmt.executeQuery(quer);
    	if(firstrs.next() == true) {
    	Statement stmt  = conn.createStatement();
        ResultSet rs    = stmt.executeQuery(sql);
        
        System.out.println("\n\nThe Student with AM: " + firstrs.getInt("AM") + " has been informed\nAn email has been sent at: " + rs.getString("Email"));
    	
        
    	} 
    	else {
    		System.out.println("\nYou inserted a wrong AM");
    		
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
}

public static void sendEmailToStaff (int ΑΦΜ) {
	
    String sql =  "SELECT Email FROM Staff WHERE ΑΦΜ =" + ΑΦΜ ;
    String url = "jdbc:sqlite:Thefinaldb.db";
    String quer = "SELECT ΑΦΜ FROM Staff WHERE ΑΦΜ = " + ΑΦΜ;
    
    try {Connection conn = DriverManager.getConnection(url);
    	Statement firststmt  = conn.createStatement();
    	ResultSet firstrs    = firststmt.executeQuery(quer);
    	if(firstrs.next() == true) {
    	Statement stmt  = conn.createStatement();
        ResultSet rs    = stmt.executeQuery(sql);
        
        System.out.println("\n\nThe Staff with ΑΦΜ: " + firstrs.getInt("ΑΦΜ") + " has been informed\nAn email has been sent at: " + rs.getString("Email"));
    	
        
    	} 
    	else {
    		System.out.println("\nYou inserted a wrong ΑΦΜ");
    		
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
}

public static String giveMeTheNameOfStaff (int ΑΦΜ) {
	
	String result = "You inserted a wrong ΑΦΜ";
    String sql =  "SELECT Name FROM Staff WHERE ΑΦΜ =" + ΑΦΜ ;
    String url = "jdbc:sqlite:Thefinaldb.db";
    String quer = "SELECT ΑΦΜ FROM Staff WHERE ΑΦΜ = " + ΑΦΜ;
    String sql2 =  "SELECT Surname FROM Staff WHERE ΑΦΜ =" + ΑΦΜ ;
    
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
    		result = "\nYou inserted a wrong ΑΦΜ";
    		
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
        System.out.println(e.getMessage());
    }
    return result;
}

}
