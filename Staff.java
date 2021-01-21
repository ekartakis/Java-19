import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Staff extends AuebMember {

  @Override
  /**Return the date that the staff tested as positive */
  public String giveTheDateOfPos(int AFM) {
    String result = "You inserted a wrong AFM";
    String url = "jdbc:sqlite:Thefinaldb.db"; //Database location
    /**SQL query */
    String quer = "SELECT AFM FROM Staff WHERE AFM = " + AFM;
    String sql = "SELECT DatePos FROM Staff WHERE AFM = " + AFM;
    try {
      //Database connection
      Connection conn = DriverManager.getConnection(url);
      Statement firststmt = conn.createStatement();
      ResultSet firstrs = firststmt.executeQuery(quer);
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(sql);
      if (firstrs.next() == true) {
        result = rs.getString("DatePos");
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
  
  @Override
  /**Return the date that the staff became close contact */
  public String giveTheDateOfCloseCont(int AFM) {
    String result = "You inserted a wrong AFM";
    String url = "jdbc:sqlite:Thefinaldb.db"; //Database location
    /**SQL query */
    String quer = "SELECT AFM FROM Staff WHERE AFM = " + AFM;
    String sql = "SELECT DateClose FROM Staff WHERE AFM = " + AFM;
    try {
      //Database connection
      Connection conn = DriverManager.getConnection(url);
      Statement firststmt = conn.createStatement();
      ResultSet firstrs = firststmt.executeQuery(quer);
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(sql);
      if (firstrs.next() == true) {
        result = rs.getString("DateClose");
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
	
  @Override
  /**Return the status of student "p" for positive
   * and "n" to negative (as string) */
  public String giveMyStatus(int AFM) {
    /**SQL queries */
    String sql = "SELECT Status FROM Staff WHERE AFM =" + AFM;
    String url = "jdbc:sqlite:Thefinaldb.db"; //Database location
    String quer = "SELECT AFM FROM Staff WHERE AFM = " + AFM;
    String result = "n";
    try {
      //Database connection
      Connection conn = DriverManager.getConnection(url);
      Statement firststmt = conn.createStatement();
      ResultSet firstrs = firststmt.executeQuery(quer);
      if (firstrs.next() == true) {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        result = rs.getString("Status");
      } else {
        System.out.println("\nYou inserted a wrong AFM");
        result = "err";
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

  @Override
  /**Return "true" id staff is close contact 
   * or "false" if staff is not a close contact (as string)*/
  public String closeCont(int AFM) {
    /**SQL queries */
    String sql = "SELECT CloseContact FROM Staff WHERE AFM =" + AFM;
    String url = "jdbc:sqlite:Thefinaldb.db"; //Database location
    String quer = "SELECT AFM FROM Staff WHERE AFM = " + AFM;
    String result = "You inserted a wrong AFM";
    try {
      //Database connection
      Connection conn = DriverManager.getConnection(url);
      Statement firststmt = conn.createStatement();
      ResultSet firstrs = firststmt.executeQuery(quer);
      if (firstrs.next() == true) {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        result = rs.getString("CloseContact");
      } else {
        System.out.println("\nYou inserted a wrong ΑΦΜ");
        result = "err";
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