package suchen.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Db {
    private Connection connection;
    private static String dbURL = "jdbc:derby:AppDb;create=true";
  
    public void createDb() throws SQLException{
        
            try
            {
                Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
                //Get a connection
                connection = DriverManager.getConnection(dbURL); 
            }
            catch (Exception except)
            {
                except.printStackTrace();
            }
    }
}
