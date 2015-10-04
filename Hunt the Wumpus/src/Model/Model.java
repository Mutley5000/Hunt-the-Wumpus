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
    Session currentSession;
    
    Layout layout = new Layout();
    World world = new World(layout);
    
    String previousRoom;
    int moveOption;
    
    
    
    public Model( IQueries iq ) {
        super();
        queries = iq;
        System.out.println(world.location.label);
        
    }
    
    public void createSession() {
        currentPlayer = queries.getPlayer();
        currentWumpus = queries.getWumpus();
        currentParrot = queries.getParrot();
        currentSession = new Session(currentPlayer, currentWumpus, currentParrot);
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
        ArrayList<Room> rooms = world.getRooms();
        world.enter(rooms.get(i));
        System.out.println(world.location.label);
        currentPlayer.location = world.location.label;
        queries.updatePlayerLocation(currentPlayer.id, currentPlayer.location);
        System.out.println("Player location: "+currentSession.player.location);
        // Testing
        /*for (Room r : rooms)
            System.out.println(r.label);
        System.out.println("space");*/
        rooms.clear();
        checkForEntities();
    }
    
    public void checkForEntities(){
        checkForWumpus();
        checkForParrot();
    }
    
    public void checkForWumpus() {
        
        int distance = world.distance(world.getRoom(currentPlayer.location), world.getRoom(currentWumpus.location));
        if (distance == 0) {
            
        }
        
        else {
            
        }
    }
    
    public void checkForParrot() {
        int distance = world.distance(world.getRoom(currentPlayer.location), world.getRoom(currentParrot.location));
        if (distance == 0) {
            
        }
        
        else {
            
        }
    }
}
