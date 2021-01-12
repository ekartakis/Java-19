import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class TheConn  {
    public static Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:Thefinaldb.db";
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
