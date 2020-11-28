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
	public static void updateTheAmOfStudent (int currentAM, int newAM) {
		
        String sql = "UPDATE Student SET AM = " + newAM + " WHERE AM = " + currentAM;
        String url = "jdbc:sqlite:Thefinaldb.db";
        String quer = "SELECT AM FROM Student WHERE AM = " + currentAM;
        ;
        try {Connection conn = DriverManager.getConnection(url);
        	
        	Statement firststmt  = conn.createStatement();
        	ResultSet firstrs    = firststmt.executeQuery(quer);
        	if(firstrs.next() == true) {
             Statement stmt  = conn.createStatement();
             stmt.execute(sql);
             String sql2 = "SELECT AM FROM Student WHERE AM = " + newAM;
             String sql3 = "SELECT name FROM Student WHERE AM = " + newAM;
             String sql4 = "SELECT surname FROM Student WHERE AM = " + newAM;
             
           
       	    Statement stmt2  = conn.createStatement();
            ResultSet rs2    = stmt2.executeQuery(sql2);
            Statement stmt3  = conn.createStatement();
            ResultSet rs3    = stmt3.executeQuery(sql3);
            Statement stmt4  = conn.createStatement();
            ResultSet rs4    = stmt4.executeQuery(sql4);
            System.out.println("\n\nThe student's AM was updated\n: "+rs3.getString("name") +" "+ rs4.getString("surname") +"\nThe new AM is: " + rs2.getInt("AM"));
        	} 
        	else {System.out.println("\nYou inserted a wrong AM");}
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
	public static void makeTheStudentPositive (int am) {
		
        String sql =  "UPDATE Student SET Status = 'p' WHERE AM =" + am;
        String url = "jdbc:sqlite:Thefinaldb.db";
        String quer = "SELECT AM FROM Student WHERE AM = " + am;
        ;
        try {Connection conn = DriverManager.getConnection(url);
        	
        	Statement firststmt  = conn.createStatement();
        	ResultSet firstrs    = firststmt.executeQuery(quer);
        	if(firstrs.next() == true) {
             Statement stmt  = conn.createStatement();
             stmt.execute(sql);
             String sql2 = "SELECT AM FROM Student WHERE AM = " + am;
             String sql3 = "SELECT name FROM Student WHERE AM = " + am;
             String sql4 = "SELECT surname FROM Student WHERE AM = " + am;
             String sql5 = "SELECT Status FROM Student WHERE AM = " + am;
             
           
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
        	else {System.out.println("\nYou inserted a wrong AM");}
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
	
	public static void makeTheStudentNegative (int am) {
		
        String sql =  "UPDATE Student SET Status = 'n' WHERE AM =" + am;
        String url = "jdbc:sqlite:Thefinaldb.db";
        String quer = "SELECT AM FROM Student WHERE AM = " + am;
        ;
        try {Connection conn = DriverManager.getConnection(url);
        	
        	Statement firststmt  = conn.createStatement();
        	ResultSet firstrs    = firststmt.executeQuery(quer);
        	if(firstrs.next() == true) {
             Statement stmt  = conn.createStatement();
             stmt.execute(sql);
             String sql2 = "SELECT AM FROM Student WHERE AM = " + am;
             String sql3 = "SELECT name FROM Student WHERE AM = " + am;
             String sql4 = "SELECT surname FROM Student WHERE AM = " + am;
             String sql5 = "SELECT Status FROM Student WHERE AM = " + am;
             
           
       	    Statement stmt2  = conn.createStatement();
            ResultSet rs2    = stmt2.executeQuery(sql2);
            Statement stmt3  = conn.createStatement();
            ResultSet rs3    = stmt3.executeQuery(sql3);
            Statement stmt4  = conn.createStatement();
            ResultSet rs4    = stmt4.executeQuery(sql4);
            Statement stmt5  = conn.createStatement();
            ResultSet rs5    = stmt5.executeQuery(sql5);
            System.out.println("\n\nThe Student's status was updated\n"+rs3.getString("name") +" "+ rs4.getString("surname") + " " + rs2.getInt("AM")+ "\nThe updated status is: Negative" );
        	} 
        	else {System.out.println("\nYou inserted a wrong AM");}
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
	public static void makeTheStudentCloseContact (int am) {
		
        String sql =  "UPDATE Student SET CloseContact = 'true' WHERE AM =" + am;
        String url = "jdbc:sqlite:Thefinaldb.db";
        String quer = "SELECT AM FROM Student WHERE AM = " + am;
        ;
        try {Connection conn = DriverManager.getConnection(url);
        	
        	Statement firststmt  = conn.createStatement();
        	ResultSet firstrs    = firststmt.executeQuery(quer);
        	if(firstrs.next() == true) {
             Statement stmt  = conn.createStatement();
             stmt.execute(sql);
             
             String sql2 = "SELECT AM FROM Student WHERE AM = " + am;
             String sql3 = "SELECT name FROM Student WHERE AM = " + am;
             String sql4 = "SELECT surname FROM Student WHERE AM = " + am;
            
       	    Statement stmt2  = conn.createStatement();
            ResultSet rs2    = stmt2.executeQuery(sql2);
            Statement stmt3  = conn.createStatement();
            ResultSet rs3    = stmt3.executeQuery(sql3);
            Statement stmt4  = conn.createStatement();
            ResultSet rs4    = stmt4.executeQuery(sql4);
       
            System.out.println("\n\nThe Student's status was updated\n"+rs3.getString("name") +" "+ rs4.getString("surname") + " " + rs2.getInt("AM")+ "\nThe student is a closed contact with a positive person" );
        	} 
        	else {System.out.println("\nYou inserted a wrong AM");}
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
	
	public static void removeTheStudentFromCloseContact (int am) {
		
        String sql =  "UPDATE Student SET CloseContact = 'false' WHERE AM =" + am;
        String url = "jdbc:sqlite:Thefinaldb.db";
        String quer = "SELECT AM FROM Student WHERE AM = " + am;
        ;
        try {Connection conn = DriverManager.getConnection(url);
        	
        	Statement firststmt  = conn.createStatement();
        	ResultSet firstrs    = firststmt.executeQuery(quer);
        	if(firstrs.next() == true) {
             Statement stmt  = conn.createStatement();
             stmt.execute(sql);
             
             String sql2 = "SELECT AM FROM Student WHERE AM = " + am;
             String sql3 = "SELECT name FROM Student WHERE AM = " + am;
             String sql4 = "SELECT surname FROM Student WHERE AM = " + am;
            
       	    Statement stmt2  = conn.createStatement();
            ResultSet rs2    = stmt2.executeQuery(sql2);
            Statement stmt3  = conn.createStatement();
            ResultSet rs3    = stmt3.executeQuery(sql3);
            Statement stmt4  = conn.createStatement();
            ResultSet rs4    = stmt4.executeQuery(sql4);
       
            System.out.println("\n\nThe Student's status was updated\n"+rs3.getString("name") +" "+ rs4.getString("surname") + " " + rs2.getInt("AM")+ "\nThe Student is not a close contact after this update " );
        	} 
        	else {System.out.println("\nYou inserted a wrong AM");}
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
	
	public static String giveMeTheStatusOfStudent (int am) {
		
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
	
	public static String giveMeCloseContOfStudent (int am) {
		
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
	
	public static void makeTheStaffPositive (int ΑΦΜ) {
		
        String sql =  "UPDATE Staff SET Status = 'p' WHERE ΑΦΜ =" + ΑΦΜ;
        String url = "jdbc:sqlite:Thefinaldb.db";
        String quer = "SELECT ΑΦΜ FROM Staff WHERE ΑΦΜ = " + ΑΦΜ;
        ;
        try {Connection conn = DriverManager.getConnection(url);
        	
        	Statement firststmt  = conn.createStatement();
        	ResultSet firstrs    = firststmt.executeQuery(quer);
        	if(firstrs.next() == true) {
             Statement stmt  = conn.createStatement();
             stmt.execute(sql);
             String sql2 = "SELECT ΑΦΜ FROM Staff WHERE ΑΦΜ = " + ΑΦΜ;
             String sql3 = "SELECT name FROM Staff WHERE ΑΦΜ = " + ΑΦΜ;
             String sql4 = "SELECT surname FROM Staff WHERE ΑΦΜ = " + ΑΦΜ;
             String sql5 = "SELECT Status FROM Staff WHERE ΑΦΜ = " + ΑΦΜ;
             
           
       	    Statement stmt2  = conn.createStatement();
            ResultSet rs2    = stmt2.executeQuery(sql2);
            Statement stmt3  = conn.createStatement();
            ResultSet rs3    = stmt3.executeQuery(sql3);
            Statement stmt4  = conn.createStatement();
            ResultSet rs4    = stmt4.executeQuery(sql4);
            Statement stmt5  = conn.createStatement();
            ResultSet rs5    = stmt5.executeQuery(sql5);
            System.out.println("\n\nThe Staff's status was updated\n"+rs3.getString("name") +" "+ rs4.getString("surname") + " " + rs2.getInt("ΑΦΜ")+ "\nThe updated status is: Positive" );
        	} 
        	else {System.out.println("\nYou inserted a wrong ΑΦΜ");}
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
	
	public static void makeTheStaffNegative (int ΑΦΜ) {
		
        String sql =  "UPDATE Staff SET Status = 'n' WHERE ΑΦΜ =" + ΑΦΜ;
        String url = "jdbc:sqlite:Thefinaldb.db";
        String quer = "SELECT ΑΦΜ FROM Staff WHERE ΑΦΜ = " + ΑΦΜ;
        ;
        try {Connection conn = DriverManager.getConnection(url);
        	
        	Statement firststmt  = conn.createStatement();
        	ResultSet firstrs    = firststmt.executeQuery(quer);
        	if(firstrs.next() == true) {
             Statement stmt  = conn.createStatement();
             stmt.execute(sql);
             String sql2 = "SELECT ΑΦΜ FROM Staff WHERE ΑΦΜ = " + ΑΦΜ;
             String sql3 = "SELECT name FROM Staff WHERE ΑΦΜ = " + ΑΦΜ;
             String sql4 = "SELECT surname FROM Staff WHERE ΑΦΜ = " + ΑΦΜ;
             String sql5 = "SELECT Status FROM Staff WHERE ΑΦΜ = " + ΑΦΜ;
             
           
       	    Statement stmt2  = conn.createStatement();
            ResultSet rs2    = stmt2.executeQuery(sql2);
            Statement stmt3  = conn.createStatement();
            ResultSet rs3    = stmt3.executeQuery(sql3);
            Statement stmt4  = conn.createStatement();
            ResultSet rs4    = stmt4.executeQuery(sql4);
            Statement stmt5  = conn.createStatement();
            ResultSet rs5    = stmt5.executeQuery(sql5);
            System.out.println("\n\nThe Staff's status was updated\n"+rs3.getString("name") +" "+ rs4.getString("surname") + " " + rs2.getInt("ΑΦΜ")+ "\nThe updated status is: Negative" );
        	} 
        	else {System.out.println("\nYou inserted a wrong ΑΦΜ");}
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
	
	public static void makeTheStaffCloseContact (int ΑΦΜ) {
		
        String sql =  "UPDATE Staff SET CloseContact = 'true' WHERE ΑΦΜ =" + ΑΦΜ;
        String url = "jdbc:sqlite:Thefinaldb.db";
        String quer = "SELECT ΑΦΜ FROM Staff WHERE ΑΦΜ = " + ΑΦΜ;
        ;
        try {Connection conn = DriverManager.getConnection(url);
        	
        	Statement firststmt  = conn.createStatement();
        	ResultSet firstrs    = firststmt.executeQuery(quer);
        	if(firstrs.next() == true) {
             Statement stmt  = conn.createStatement();
             stmt.execute(sql);
             
             String sql2 = "SELECT ΑΦΜ FROM Staff WHERE ΑΦΜ = " + ΑΦΜ;
             String sql3 = "SELECT name FROM Staff WHERE ΑΦΜ = " + ΑΦΜ;
             String sql4 = "SELECT surname FROM Staff WHERE ΑΦΜ = " + ΑΦΜ;
            
       	    Statement stmt2  = conn.createStatement();
            ResultSet rs2    = stmt2.executeQuery(sql2);
            Statement stmt3  = conn.createStatement();
            ResultSet rs3    = stmt3.executeQuery(sql3);
            Statement stmt4  = conn.createStatement();
            ResultSet rs4    = stmt4.executeQuery(sql4);
       
            System.out.println("\n\nThe Staff's status was updated\n"+rs3.getString("name") +" "+ rs4.getString("surname") + " " + rs2.getInt("ΑΦΜ")+ "\nThe staff is a closed contact with a positive person" );
        	} 
        	else {System.out.println("\nYou inserted a wrong ΑΦΜ");}
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
	
	public static void removeTheStaffFromCloseContact (int ΑΦΜ) {
		
        String sql =  "UPDATE Staff SET CloseContact = 'false' WHERE ΑΦΜ =" + ΑΦΜ;
        String url = "jdbc:sqlite:Thefinaldb.db";
        String quer = "SELECT ΑΦΜ FROM Staff WHERE ΑΦΜ = " + ΑΦΜ;
        ;
        try {Connection conn = DriverManager.getConnection(url);
        	
        	Statement firststmt  = conn.createStatement();
        	ResultSet firstrs    = firststmt.executeQuery(quer);
        	if(firstrs.next() == true) {
             Statement stmt  = conn.createStatement();
             stmt.execute(sql);
             
             String sql2 = "SELECT ΑΦΜ FROM Staff WHERE ΑΦΜ = " + ΑΦΜ;
             String sql3 = "SELECT name FROM Staff WHERE ΑΦΜ = " + ΑΦΜ;
             String sql4 = "SELECT surname FROM Staff WHERE ΑΦΜ = " + ΑΦΜ;
            
       	    Statement stmt2  = conn.createStatement();
            ResultSet rs2    = stmt2.executeQuery(sql2);
            Statement stmt3  = conn.createStatement();
            ResultSet rs3    = stmt3.executeQuery(sql3);
            Statement stmt4  = conn.createStatement();
            ResultSet rs4    = stmt4.executeQuery(sql4);
       
            System.out.println("\n\nThe Staff's status was updated\n"+rs3.getString("name") +" "+ rs4.getString("surname") + " " + rs2.getInt("ΑΦΜ")+ "\nThe staff is not a close contact after this update " );
        	} 
        	else {System.out.println("\nYou inserted a wrong ΑΦΜ");}
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
	
	public static String giveMeTheStatusOfSaff (int ΑΦΜ) {
		
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
	public static String giveMeCloseContOfStaff (int ΑΦΜ) {
		
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
	
public static String checkIfSecretariat (int ΑΦΜ) {
	
    String result = "false";
    String url = "jdbc:sqlite:Thefinaldb.db";
    String quer = "SELECT ΑΦΜ FROM Staff WHERE ΑΦΜ = " + ΑΦΜ;
    ;
    try {Connection conn = DriverManager.getConnection(url);
    	
    	Statement firststmt  = conn.createStatement();
    	ResultSet firstrs    = firststmt.executeQuery(quer);
    	if(firstrs.next() == true) {
         if(firstrs.getInt("ΑΦΜ") == 363970 || firstrs.getInt("ΑΦΜ") == 301877 || firstrs.getInt("ΑΦΜ") == 913878) {
        	 result = "true";
         }
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
