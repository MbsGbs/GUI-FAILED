
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbconnector {
  
 private Connection connect; 
    
    public dbconnector(){
    try {
        // Ensure the URL, username, and password are correct
        connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/medc", "root", "");
        System.out.println("Connected to the database.");
    } catch (SQLException ex) {
        System.out.println("Failed to connect to the database:");
        ex.printStackTrace();
    }
}
    
    // Function to retrieve data
    public ResultSet getData(String sql) throws SQLException {
        Statement stmt = connect.createStatement();
        ResultSet rst = stmt.executeQuery(sql);
        return rst;
    }
    
    // Getter for the connection object
    public Connection getConnection() {
        return connect;
    }
    
  // Function to save data using PreparedStatement
public boolean insertData(String sql, String... params) {
    try {
        PreparedStatement pst = connect.prepareStatement(sql);
        for (int i = 0; i < params.length; i++) {
            pst.setString(i + 1, params[i]);
        }
        pst.executeUpdate();
        System.out.println("Inserted Successfully!");
        pst.close();
        return true;
    } catch (SQLException ex) {
        System.out.println("Connection Error: " + ex);
        return false;
    }
}

// Function to check if an email or username already exists
public boolean isDuplicate(String email, String username) {
    System.out.println("Checking for duplicate email: " + email + " and username: " + username);
    // Database query here...
    return false;  // For debugging purposes
}

    
}
