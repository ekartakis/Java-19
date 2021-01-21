import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class TheConn {
  /**Database Connection */
  public static Connection connect() {
    String url = "jdbc:sqlite:Thefinaldb.db"; // Database location
    Connection conn = null;
    try {
      conn = DriverManager.getConnection(url);
      System.out.println("Connect with the data base");
    } catch (SQLException e) {
      System.out.println("No data base with that name");
    }
    return conn;
  }
}
