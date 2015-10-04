/*
 * 
 * For educational purposes only.
 * 
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author rolley
 */
public class Queries implements IQueries {
    
    // Declare Variables
    private static final String URL = "jdbc:derby://localhost:1527/HTW_DB";
    private static final String USERNAME = "admin1";
    private static final String PASSWORD = "admin1";
    
    private Connection connection = null;
    
    // Declare SQL statements
    String updatePlayerLocation = "UPDATE PLAYER SET LOCATION = ? WHERE ID = ?";
    String getPlayer = "SELECT * FROM PLAYER WHERE ID = ?";
    
    String insertNewBookingSQL = "INSERT INTO BOOKINGS(LASTNAME, PHONE, DINERS, DAYOFWEEK, TABLEID) VALUES(?,?,?,?,?)";
    String selectAllBookingsSQL =  "SELECT ID, LASTNAME, PHONE, DINERS, DAYOFWEEK, TABLEID " +
                                "FROM BOOKINGS";
    String selectBookingDaySQL =   "SELECT ID, LASTNAME, PHONE, DINERS, DAYOFWEEK, TABLEID FROM BOOKINGS WHERE DAYOFWEEK = ?";
    String selectTotalDinersForDaySQL = "SELECT SUM(DINERS) FROM BOOKINGS WHERE DAYOFWEEK = ?";
    String selectUnoccupiedTablesSQL = "SELECT ID, SEATS FROM TABLES WHERE ID NOT IN (SELECT TABLEID FROM BOOKINGS WHERE DAYOFWEEK = ?)";
    String selectRestaurantCapacitySQL = "SELECT SUM(SEATS) FROM TABLES WHERE ID NOT IN (SELECT TABLEID FROM BOOKINGS WHERE DAYOFWEEK = ?)"; 
    
    // Create prepared statement
    PreparedStatement ps;
    
    // Constructor
    public Queries() {
    
        // Try to create connection with the database
        try {
            connection = DriverManager.getConnection( URL, USERNAME, PASSWORD );
            System.out.println("Database accessed.");
        }
    
        // If a connection can not be made display message and close
        catch ( SQLException err ) {
            System.out.println( err.getMessage( ) );
            
            // Create resourses for error message
            JPanel errorPanel = new  JPanel();
            JLabel errorMessage = new JLabel("There is no connection to the 'HTW_DB'"  
                                            + " database. Please connect and try again.");
            errorPanel.add(errorMessage);
            Object[] errorOptions = {"OK"};
            
            // Display error message
            JOptionPane.showOptionDialog(	null,
                                                errorPanel,
	                   			"No connection to database",
	                   			JOptionPane.PLAIN_MESSAGE,
	                   			JOptionPane.PLAIN_MESSAGE,
	                   			null,
	                   			errorOptions,
	                   			errorOptions[0]);
            
            // Close 
            close();
        }
    }
    
    // Close database connection
    @Override
    public void close() {
        
        try {
            connection.close();
            System.out.println("Connection closed.");
        }
        
        catch ( SQLException err ) {
            System.out.println( err.getMessage( ) );
        }
    }

    @Override
    public void updatePlayerLocation(Long id, String room) {
        try {
            ps = connection.prepareStatement(updatePlayerLocation);
            ps.setString(1, room);
            ps.setLong(2, id);
            ps.executeUpdate();
        }
        
        catch ( SQLException err ) {
            System.out.println( err.getMessage( ) );
        }
    }
    
    @Override
    public Player getPlayer() {
        ResultSet rs = null;
        Player player = null;
        
        try {
            ps = connection.prepareStatement(getPlayer);
            ps.setLong(1, 1);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("PLAYERNAME");
                String location = rs.getString("LOCATION");
                
                player = new Player(id, name, location);
            }
        }
        
        catch ( SQLException err ) {
            System.out.println( err.getMessage( ) );
        }
        return player;
    }
}
