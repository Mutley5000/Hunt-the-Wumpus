/*
 * 
 * For educational purposes only.
 * 
 */
package Model;

import java.sql.Connection;
import java.sql.Date;
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
    String getWumpus = "SELECT * FROM WUMPUS WHERE ID = ?";
    String getParrot = "SELECT * FROM PARROT WHERE ID = ?";
    String getTreasure = "SELECT * FROM TREASURE WHERE ID = ?";
    String addItemToPlayerInventory = "INSERT INTO INVENTORY VALUES(?,?,?)";
    String hideTreasure = "UPDATE TREASURE SET LOCATION = ? WHERE ID = ?";
    String saveSession = "INSERT INTO SESSION(CREATEDDATE, PLAYERID, WUMPUSID, PARROTID, TREASUREID) VALUES(?,?,?,?,?)";
    
    String resetPlayer = "UPDATE PLAYER SET LOCATION = ? WHERE ID = ?";
    String resetTreasure = "UPDATE TREASURE SET LOCATION = ? WHERE ID = ?";
    String resetInventory = "DELETE FROM INVENTORY";
    
    
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

    // Query methods
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
                int inventoryID = rs.getInt("INVENTORYID");
                
                player = new Player(id, name, location, inventoryID);
            }
        }
        
        catch ( SQLException err ) {
            System.out.println( err.getMessage( ) );
        }
        return player;
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
    public Wumpus getWumpus() {
        ResultSet rs = null;
        Wumpus wumpus = null;
        
        try {
            ps = connection.prepareStatement(getWumpus);
            ps.setLong(1, 1);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                int id = rs.getInt("ID");
                String location = rs.getString("LOCATION");
                String state = rs.getString("WUMPUSSTATE");
                String sendOff = rs.getString("SENDOFF");
                
                wumpus = new Wumpus(id, location, state, sendOff);
            }
        }
        
        catch ( SQLException err ) {
            System.out.println( err.getMessage( ) );
        }
        return wumpus;
    }

    @Override
    public Parrot getParrot() {
        ResultSet rs = null;
        Parrot parrot = null;
        
        try {
            ps = connection.prepareStatement(getParrot);
            ps.setLong(1, 1);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                int id = rs.getInt("ID");
                String location = rs.getString("LOCATION");
                int distance = rs.getInt("DISTANCE");
                
                parrot = new Parrot(id, location, distance);
            }
        }
        
        catch ( SQLException err ) {
            System.out.println( err.getMessage( ) );
        }
        return parrot;
    }

    @Override
    public Treasure getTreasure() {
        ResultSet rs = null;
        Treasure treasure = null;
        
        try {
            ps = connection.prepareStatement(getTreasure);
            ps.setLong(1, 1);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                int id = rs.getInt("ID");
                String location = rs.getString("LOCATION");
                int amount = rs.getInt("AMOUNT");
                
                treasure = new Treasure(id, location, amount);
            }
        }
        
        catch ( SQLException err ) {
            System.out.println( err.getMessage( ) );
        }
        return treasure;
    }
    
    @Override
    public void hideTreasure(long id) {
        try {
            ps = connection.prepareStatement(hideTreasure);
            ps.setString(1, "0");
            ps.setLong(2, id);
            ps.executeUpdate();
        }
        
        catch ( SQLException err ) {
            System.out.println( err.getMessage( ) );
        }
    }
    
    @Override
    public void addItemToPlayerInventory(Long id, Item item) {
        int quantity = 1;
        long itemId = item.id;
        
        try {
            ps = connection.prepareStatement(addItemToPlayerInventory);
            ps.setLong(1, id);
            ps.setInt(2, quantity);
            ps.setLong(3, itemId);
            ps.executeUpdate();
        }
        
        catch ( SQLException err ) {
            System.out.println( err.getMessage( ) );
        }
    }
    
    @Override
    public void saveSession(Session session) {
        try {
            ps = connection.prepareStatement(saveSession);
            ps.setDate(1, (Date) session.createdDate);
            ps.setLong(2, session.playerID);
            ps.setLong(3, session.wumpusID);
            ps.setLong(4, session.parrotID);
            ps.setLong(5, session.treasureID);
            ps.executeUpdate();
        }
        
        catch ( SQLException err ) {
            System.out.println( err.getMessage( ) );
        }
    }
    
    // Reset methods
    
    @Override
    public void resetPlayer(long id) {
        try {
            ps = connection.prepareStatement(resetPlayer);
            ps.setString(1, "1");
            ps.setLong(2, id);
            ps.executeUpdate();
        }
        
        catch ( SQLException err ) {
            System.out.println( err.getMessage( ) );
        }
    }
    
    @Override
    public void resetTreasure(long id) {
        try {
            ps = connection.prepareStatement(resetTreasure);
            ps.setString(1, "4");
            ps.setLong(2, id);
            ps.executeUpdate();
        }
        
        catch ( SQLException err ) {
            System.out.println( err.getMessage( ) );
        }
    }
    
    @Override
    public void resetInventory() {
        try {
            ps = connection.prepareStatement(resetInventory);
            ps.executeUpdate();
        }
        
        catch ( SQLException err ) {
            System.out.println( err.getMessage( ) );
        }
    }
}