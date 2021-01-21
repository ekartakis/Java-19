
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class UpdateTheRecords {

  /**Return the current date */
  public static String giveMeTheDate() {    
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDateTime now = LocalDateTime.now();
    return dtf.format(now);
  }    
  
  /**Return the current date and time */
  public static String dateTime() {  
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();  
    return dtf.format(now);  
  }    
  
  /**return false if the inserted id does not exist and true if it does */
  public static String checkIfAmExist(int AM) {
    String result = "false";
    String url = "jdbc:sqlite:Thefinaldb.db"; //the location of database
    String quer = "SELECT AM FROM Student WHERE AM = " + AM;
    try {
      Connection conn = DriverManager.getConnection(url);
      Statement firststmt = conn.createStatement();
      ResultSet firstrs = firststmt.executeQuery(quer);
      if (firstrs.next() == true) {
        result = "true";
        try {
          conn.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      } else {
        result = "false";
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
    return result;
  }
  
  /**change the status of student or staff depending of the string "who" 
   * to positive or negative depending of the string "stat"
   * int id: insert the id of the student or staff
   * String stat: insert the as string the letter "p" to positive
   *   or "n" to negative
   * String who: insert as string "student" or "staff"*/
  public static void changeTheStatus(int id, String stat, String who) {
    /**SQL queries */
    String sqlstfn = "UPDATE Staff SET Status = 'n' WHERE AFM =" + id;
    String sqlstf = "UPDATE Staff SET Status = 'p' WHERE AFM =" + id;
    String sql = "UPDATE Student SET Status = 'p' WHERE AM =" + id;
    String sqln = "UPDATE Student SET Status = 'n' WHERE AM =" + id;
    String sql2 = "SELECT AM FROM Student WHERE AM = " + id;
    String sql3 = "SELECT name FROM Student WHERE AM = " + id;
    String sql4 = "SELECT surname FROM Student WHERE AM = " + id;
    String sql6 = "SELECT AFM FROM Staff WHERE AFM = " + id;
    String sql7 = "SELECT name FROM Staff WHERE AFM = " + id;
    String sql8 = "SELECT surname FROM Staff WHERE AFM = " + id;
    String quer2 = "SELECT AFM FROM Staff WHERE AFM = " + id;
    String url = "jdbc:sqlite:Thefinaldb.db"; //the location of database
    String quer = "SELECT AM FROM Student WHERE AM = " + id;
    String date = giveMeTheDate();
    String nl = null;
    String sql10 = "UPDATE Student SET DatePos ='"
            + date + "' WHERE AM = " + id;
    String sql11 = "UPDATE Student SET DatePos ='" + nl + "' WHERE AM = " + id;
    String sql12 = "UPDATE Staff SET DatePos ='" + date + "' WHERE AFM = " + id;
    String sql13 = "UPDATE Staff SET DatePos ='" + nl + "' WHERE AFM = " + id;
    try {
      /** Database Connectivity */
      Connection conn = DriverManager.getConnection(url);
      Statement firststmt = conn.createStatement();
      if (who.equals("student")) {
        ResultSet firstrs = firststmt.executeQuery(quer);
        if (firstrs.next() == true) {
          if (stat.equals("p")) {
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
            Statement stmt40 = conn.createStatement();
            stmt40.execute(sql10);
            Statement stmt2 = conn.createStatement();
            stmt2.execute(sql2);
            Statement stmt3 = conn.createStatement();
            stmt3.execute(sql3);
            Statement stmt4 = conn.createStatement();
            stmt4.execute(sql4);
          } else if (stat.equals("n")) {
            Statement stmt60 = conn.createStatement();
            stmt60.execute(sqln);
            Statement stmt41 = conn.createStatement();
            stmt41.execute(sql11);
            Statement stmt6 = conn.createStatement();
            stmt6.execute(sql2);
            Statement stmt7 = conn.createStatement();
            stmt7.execute(sql3);
            Statement stmt8 = conn.createStatement();
            stmt8.execute(sql4);
          }
        }
      } else if (who.equals("staff")) {
        Statement firststmt2 = conn.createStatement();
        ResultSet firstrs2 = firststmt2.executeQuery(quer2);
        if (firstrs2.next() == true) {
          if (stat.equals("p")) {
            Statement stmt150 = conn.createStatement();
            stmt150.execute(sqlstf);
            Statement stmt42 = conn.createStatement();
            stmt42.execute(sql12);
            Statement stmt10 = conn.createStatement();
            stmt10.execute(sql6);
            Statement stmt11 = conn.createStatement();
            stmt11.execute(sql7);
            Statement stmt12 = conn.createStatement();
            stmt12.execute(sql8);
          } else if (stat.equals("n")) {
            Statement stmt30 = conn.createStatement();
            stmt30.execute(sqlstfn);
            Statement stmt43 = conn.createStatement();
            stmt43.execute(sql13);
            Statement stmt14 = conn.createStatement();
            stmt14.execute(sql6);
            Statement stmt15 = conn.createStatement();
            stmt15.execute(sql7);
            Statement stmt16 = conn.createStatement();
            stmt16.execute(sql8);
          }
        }
      }
      try {
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }        
  }
 
  /**Make someone close contact or remove a close contact  */
  public static void changeCloseCont(int id, String stat, String who) {
    /**SQL queries */
    String sqlstfn = "UPDATE Staff SET CloseContact = 'false' WHERE AFM =" + id;
    String sqlstf = "UPDATE Staff SET CloseContact = 'true' WHERE AFM =" + id;
    String sql = "UPDATE Student SET CloseContact = 'true' WHERE AM =" + id;
    String sqln = "UPDATE Student SET CloseContact = 'false' WHERE AM =" + id;
    String sql2 = "SELECT AM FROM Student WHERE AM = " + id;
    String sql3 = "SELECT name FROM Student WHERE AM = " + id;
    String sql4 = "SELECT surname FROM Student WHERE AM = " + id;
    String sql6 = "SELECT AFM FROM Staff WHERE AFM = " + id;
    String sql7 = "SELECT name FROM Staff WHERE AFM = " + id;
    String sql8 = "SELECT surname FROM Staff WHERE AFM = " + id;
    String quer2 = "SELECT AFM FROM Staff WHERE AFM = " + id;
    String url = "jdbc:sqlite:Thefinaldb.db"; //the location of database
    String quer = "SELECT AM FROM Student WHERE AM = " + id;
    String date = giveMeTheDate();
    String nl = null;
    String sql10 = "UPDATE Student SET DateClose ='" 
        + date + "' WHERE AM = " + id;
    String sql11 = "UPDATE Student SET DateClose ='" 
        + nl + "' WHERE AM = " + id;
    String sql12 = "UPDATE Staff SET DateClose ='"
        + date + "' WHERE AFM = " + id;
    String sql13 = "UPDATE Staff SET DateClose ='" 
        + nl + "' WHERE AFM = " + id;
    try {
      //Database Connectivity
      Connection conn = DriverManager.getConnection(url);
      Statement firststmt = conn.createStatement();
      if (who.equals("student")) {
        ResultSet firstrs = firststmt.executeQuery(quer);
        if (firstrs.next() == true) {
          if (stat.equals("true")) {
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
            Statement stmt45 = conn.createStatement();
            stmt45.execute(sql10);
            Statement stmt2 = conn.createStatement();
            stmt2.execute(sql2);
            Statement stmt3 = conn.createStatement();
            stmt3.execute(sql3);
            Statement stmt4 = conn.createStatement();
            stmt4.execute(sql4);
          } else if (stat.equals("false")) {
            Statement stmt60 = conn.createStatement();
            stmt60.execute(sqln);
            Statement stmt46 = conn.createStatement();
            stmt46.execute(sql11);
            Statement stmt6 = conn.createStatement();
            stmt6.execute(sql2);
            Statement stmt7 = conn.createStatement();
            stmt7.execute(sql3);
            Statement stmt8 = conn.createStatement();
            stmt8.execute(sql4);
          }
        }
      } else if (who.equals("staff")) {
        Statement firststmt2 = conn.createStatement();
        ResultSet firstrs2 = firststmt2.executeQuery(quer2);
        if (firstrs2.next() == true) {
          if (stat.equals("true")) {
            Statement stmt150 = conn.createStatement();
            stmt150.execute(sqlstf);
            Statement stmt47 = conn.createStatement();
            stmt47.execute(sql12);
            Statement stmt10 = conn.createStatement();
            stmt10.execute(sql6);
            Statement stmt11 = conn.createStatement();
            stmt11.execute(sql7);
            Statement stmt12 = conn.createStatement();
            stmt12.execute(sql8);
          } else if (stat.equals("false")) {
            Statement stmt30 = conn.createStatement();
            stmt30.execute(sqlstfn);
            Statement stmt48 = conn.createStatement();
            stmt48.execute(sql13);
            Statement stmt14 = conn.createStatement();
            stmt14.execute(sql6);
            Statement stmt15 = conn.createStatement();
            stmt15.execute(sql7);
            Statement stmt16 = conn.createStatement();
            stmt16.execute(sql8);
          }
        }
      }
      try {
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }        
  }

  /**Return the total positive cases */
  public static int totalPositiveNumber() {
    int counter = 0;
    String sql = "SELECT AM FROM Student WHERE Status = 'p'";
    String sql2 = "SELECT AFM FROM Staff WHERE Status = 'p'";
    String url = "jdbc:sqlite:Thefinaldb.db"; 
    try {
      //Database Connectivity
      Connection conn = DriverManager.getConnection(url);
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(sql);
      Statement stmt2 = conn.createStatement();
      ResultSet rs2 = stmt2.executeQuery(sql2);
      while (rs.next()) {  
        counter++;
      }
      while (rs2.next()) {  
        counter++;
      }
      try {
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
    return counter;
  }
  
  /**Return the total positive student cases*/
  public static int totalPositiveNumberofStudent() {
    int counter = 0;
    String sql = "SELECT AM FROM Student WHERE Status = 'p'";
    String url = "jdbc:sqlite:Thefinaldb.db";
    try {
      //Database Connectivity
      Connection conn = DriverManager.getConnection(url);
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(sql);
      while (rs.next()) {  
        counter++;
      }
      try {
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
    return counter;
  }
  
  /**Return the total positive staff cases*/
  public static int totalPositiveNumberofStaff() {
    int counter = 0;
    /**SQL query*/
    String sql2 = "SELECT AFM FROM Staff WHERE Status = 'p'";
    String url = "jdbc:sqlite:Thefinaldb.db"; //the location of database
    try {
      //Database Connectivity
      Connection conn = DriverManager.getConnection(url);
      Statement stmt2 = conn.createStatement();
      ResultSet rs2 = stmt2.executeQuery(sql2);
      while (rs2.next()) {  
        counter++;
      }
      try {
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
    return counter;
  }

  /**Return the total close contacts*/
  public static int totalCloseContNumber() {
    int counter = 0;
    /**SQL queries*/
    String sql = "SELECT AM FROM Student WHERE CloseContact = 'true'";
    String sql2 = "SELECT AFM FROM Staff WHERE CloseContact = 'true'";
    String url = "jdbc:sqlite:Thefinaldb.db"; //the location of database
    try {
      //Database Connectivity
      Connection conn = DriverManager.getConnection(url);
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(sql);
      Statement stmt2 = conn.createStatement();
      ResultSet rs2 = stmt2.executeQuery(sql2);
      while (rs.next()) {  
        counter++;
      }
      while (rs2.next()) {  
        counter++;
      }
      try {
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
    return counter;
  }

  /**Return the total student close contacts*/
  public static int totalCloseContNumberofStudent() {
    int counter = 0;
    /**SQL query*/
    String sql = "SELECT AM FROM Student WHERE CloseContact = 'true'";
    String url = "jdbc:sqlite:Thefinaldb.db"; //the location of database
    try {
      //Database Connectivity
      Connection conn = DriverManager.getConnection(url);
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(sql);
      while (rs.next()) {  
        counter++;
      }
      try {
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
    return counter;
  }

  /**Return the total staff close contacts*/
  public static int totalCloseContNumberofStaff() {
    int counter = 0;
    /**SQL query*/
    String sql2 = "SELECT AFM FROM Staff WHERE CloseContact = 'true'";
    String url = "jdbc:sqlite:Thefinaldb.db"; //the location of database
    try {
      //Database Connectivity
      Connection conn = DriverManager.getConnection(url);
      Statement stmt2 = conn.createStatement();
      ResultSet rs2 = stmt2.executeQuery(sql2);
      while (rs2.next()) {  
        counter++;
      }
      try {
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
    return counter;
  }
  
  /**Return false if the id does not exist or true if it does (as string)*/
  public static String checkIfAFMExist (int AFM) {
    String result = "false";
    String url = "jdbc:sqlite:Thefinaldb.db"; //the location of database
    /**SQL query*/
    String quer = "SELECT AFM FROM Staff WHERE AFM = " + AFM;
    try {
      //Database Connectivity
      Connection conn = DriverManager.getConnection(url);
      Statement firststmt = conn.createStatement();
      ResultSet firstrs = firststmt.executeQuery(quer);
      if (firstrs.next() == true) {
        result = "true";
      } else {
        result = "false";
      }
      try {
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
    return result;
  }
 
  public static String sendEmailToStudent(int am) {
    String sql = "SELECT Email FROM Student WHERE AM =" + am;
    String url = "jdbc:sqlite:Thefinaldb.db";
    String quer = "SELECT AM FROM Student WHERE AM = " + am;
    String result = "";
    try {
      Connection conn = DriverManager.getConnection(url);
      Statement firststmt = conn.createStatement();
      ResultSet firstrs = firststmt.executeQuery(quer);
      if (firstrs.next() == true) {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        result = rs.getString("Email");
      } else {
        System.out.println("\nYou inserted a wrong AM");
      }
      try {
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }   
    return result;
  }

  public static String sendEmailToStaff (int AFM) {
    String sql = "SELECT Email FROM Staff WHERE AFM =" + AFM;
    String url = "jdbc:sqlite:Thefinaldb.db";
    String quer = "SELECT AFM FROM Staff WHERE AFM = " + AFM;
    String result = "";
    try {
      Connection conn = DriverManager.getConnection(url);
      Statement firststmt = conn.createStatement();
      ResultSet firstrs = firststmt.executeQuery(quer);
      if (firstrs.next() == true) {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        result = rs.getString("Email");
      } else {
        System.out.println("\nYou inserted a wrong AFM");
      }
      try {
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    } 
    return result;
  }

  /**Return the name of staff */
  public static String giveMeTheNameOfStaff(int AFM) {
    String result = "You inserted a wrong AFM";
    String sql = "SELECT Name FROM Staff WHERE AFM =" + AFM;
    String url = "jdbc:sqlite:Thefinaldb.db";
    String quer = "SELECT AFM FROM Staff WHERE AFM = " + AFM;
    String sql2 = "SELECT Surname FROM Staff WHERE AFM =" + AFM;
    try {
      Connection conn = DriverManager.getConnection(url);
      Statement firststmt = conn.createStatement();
      ResultSet firstrs = firststmt.executeQuery(quer);
      if (firstrs.next() == true) {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        Statement stmt2 = conn.createStatement();
        ResultSet rs2 = stmt2.executeQuery(sql2);
        result = rs.getString("Name") + " " + rs2.getString("Surname");
      } else {
        result = "\nYou inserted a wrong AFM";
      }
      try {
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    } 
    return result;
  }

  /**Return the name of student */
  public static String giveMeTheNameOfStudent(int AM) {
    String result = "You inserted a wrong AM";
    String url = "jdbc:sqlite:Thefinaldb.db";
    String quer = "SELECT AM FROM Student WHERE AM = " + AM;
    String sql = "SELECT Name FROM Student WHERE AM = " + AM;
    String sql2 = "SELECT Surname FROM Student WHERE AM = " + AM;
    try {
      Connection conn = DriverManager.getConnection(url);
      Statement firststmt = conn.createStatement();
      ResultSet firstrs = firststmt.executeQuery(quer);
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(sql);
      Statement stmt2 = conn.createStatement();
      ResultSet rs2 = stmt2.executeQuery(sql2);
      if (firstrs.next() == true) {
        result = rs.getString("Name") + " " + rs2.getString("Surname");
      } else {
        result = "\nYou inserted a wrong AM";
      }
      try {
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
    return result;
  }

}
