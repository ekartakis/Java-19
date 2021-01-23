
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Student extends AuebMember {
    
  @Override
  /**Return the date that the student tested as positive */
  public String giveTheDateOfPos(int am) {
    String result = "You inserted a wrong AM";
    String url = "jdbc:sqlite:Thefinaldb.db"; //Database location
    /**SQL query */
    String quer = "SELECT AM FROM Student WHERE AM = " + am;
    String sql = "SELECT DatePos FROM Student WHERE AM = " + am;
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
  
  /**Return the date that the student became close contact */
  public String giveTheDateOfCloseCont(int am) {
    String result = "You inserted a wrong AM";
    String url = "jdbc:sqlite:Thefinaldb.db"; //Database location
    /**SQL query */
    String quer = "SELECT AM FROM Student WHERE AM = " + am;
    String sql = "SELECT DateClose FROM Student WHERE AM = " + am;
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

  
  @Override
  /**Return the status of student "p" for positive
   * and "n" to negative (as string) */
  public String giveMyStatus(int am) {
    /**SQL queries */
    String sql = "SELECT Status FROM Student WHERE AM =" + am;
    String url = "jdbc:sqlite:Thefinaldb.db"; //Database location
    String quer = "SELECT AM FROM Student WHERE AM = " + am;
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
        System.out.println("\nYou inserted a wrong AM");
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
  /**Return "true" id student is close contact 
   * or "false" if student is not a close contact (as string)*/
  public String closeCont(int am) {
    /**SQL queries */
    String sql = "SELECT CloseContact FROM Student WHERE AM =" + am;
    String url = "jdbc:sqlite:Thefinaldb.db"; //Database location
    String quer = "SELECT AM FROM Student WHERE AM = " + am;
    String result = "false";
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
        System.out.println("\nYou inserted a wrong AM");
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