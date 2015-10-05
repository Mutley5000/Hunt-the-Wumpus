/*
 * 
 * For educational purposes only.
 * 
 */
package Model;

import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author rolley
 */
public class Model extends Observable {

    IQueries queries;
    Player currentPlayer;
    Wumpus currentWumpus;
    Parrot currentParrot;
    Treasure treasure;
    Session currentSession;

    Layout layout = new Layout();
    World world = new World(layout);

    String previousRoom;
    int moveOption;
    ArrayList<Room> rooms;

    public Model(IQueries iq) {
        super();
        queries = iq;
        //System.out.println(world.location.label);

    }

    public void createSession() {
        // Hard coded ATM
        currentPlayer = queries.getPlayer();
        currentWumpus = queries.getWumpus();
        currentParrot = queries.getParrot();
        treasure = queries.getTreasure();

        // TODO -   
        //          Randomise parrot, treasure and wumpus location at start of game.
        //          Player profile creation.
        //          Save session to DB.
        //          Load session from DB.
        currentSession = new Session(currentPlayer.id, currentWumpus.id, currentParrot.id, treasure.id);
        getRooms();
        setChanged();
        notifyObservers(rooms);
    }

    public ArrayList<Room> getRooms() {
        world.setLocation(currentPlayer.location);
        rooms = world.getRooms();
        return rooms;
    }

    public void goLeft() {
        moveOption = 0;
        move(moveOption);
    }

    public void goBack() {
        moveOption = 1;
        move(moveOption);
    }

    public void goRight() {
        moveOption = 2;
        move(moveOption);
    }

    public void move(int i) {
        getRooms();
        world.enter(rooms.get(i));
        System.out.println(world.location.label);
        currentPlayer.location = world.location.label;
        queries.updatePlayerLocation(currentPlayer.id, currentPlayer.location);
        System.out.println("Player location: " + currentPlayer.location);
        // Testing
        /*for (Room r : rooms)
         System.out.println(r.label);
         System.out.println("space");*/
        rooms.clear();
        getRooms();
        checkRoomContents();
        setChanged();
        notifyObservers(rooms);
        rooms.clear();
    }

    public void checkRoomContents() {
        checkForWumpus();
        checkForParrot();
        checkForTreasure();
    }

    public void checkForWumpus() {

        int distance = world.distance(world.getRoom(currentPlayer.location), world.getRoom(currentWumpus.location));
        if (distance == 0) {
            // Show the Wumpus then end screen.
        }
    }

    public void checkForParrot() {
        int distance = world.distance(world.getRoom(currentPlayer.location), world.getRoom(currentParrot.location));
        if (distance == 0) {
            // Show the parrot

            // If clicked show distance to Wumpus
            // After showing distance randomise its location and update table
        }
    }

    public void checkForTreasure() {
        if (Integer.parseInt(treasure.location) != 0) {
            int distance = world.distance(world.getRoom(currentPlayer.location), world.getRoom(treasure.location));
            if (distance == 0) {
            // Collect treasure
                // Add to player inventory
                queries.addItemToPlayerInventory(currentPlayer.inventoryID, treasure);

                // Hide from map - set location to 0
                queries.hideTreasure(treasure.id);
            }
        }
    }

    public void saveSession() {
        currentSession.setCreatedDate();
        queries.saveSession(currentSession);
        System.out.println("Here");
    }
    
    public String sendMessage() {
        String message = "You are in room " + currentPlayer.location;
        return message;
    }
}
