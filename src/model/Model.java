package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Model {

    
    // method to connect to the database
    public static Connection databaseConnection() {
        //String connectionString = "jdbc:sqlserver://localhost:1433;databaseName=InventoryManager;integratedSecurity=true;encrypt=false;trustServerCertificate=false;"; // connection string
        String connectionString = "jdbc:sqlserver://localhost:1433;databaseName=InventoryManager;trustServerCertificate=true;integratedSecurity=true;encrypt=true;user=Jarens_laptop/jaren;password=treefrog";
        try {
            
            Connection connection = DriverManager.getConnection(connectionString); // connection object using driver manager class to access the database
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    // inserts a new user into the database when an account is created. Returns true if insertion happens, otherwise returns false.
    public static boolean createAccount(String username, String password) {
        
        try {
            Connection db = databaseConnection();
            //Statement s = db.createStatement(); // create a statement object
    
            String query = "INSERT INTO Person (username,password_hash) VALUES (?, ?)"; // the query for username and password insertion
            PreparedStatement ps = db.prepareStatement(query);
    
            // insert the user's inputted values into the query
            ps.setString(1,username);
            ps.setString(2,password);
    
            int rows = ps.executeUpdate();
            if (rows > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            return false;
        }
   
    }
}
