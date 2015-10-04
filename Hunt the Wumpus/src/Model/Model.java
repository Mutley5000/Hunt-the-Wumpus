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
    
    Layout layout = new Layout();
    World world = new World(layout);
    
    String previousRoom;
    
    
    
    public Model( IQueries iq ) {
        super();
        queries = iq;
        System.out.println(world.location.label);
    }
    
    
    
    public void goLeft() {
        ArrayList<Room> rooms = world.getRooms();
        world.enter(rooms.get(0));
        System.out.println(world.location.label);
        // Testing
        /*for (Room r : rooms)
            System.out.println(r.label);
        System.out.println("space");*/
        rooms.clear();
    }
    
    public void goBack() {
        ArrayList<Room> rooms = world.getRooms();
        world.enter(rooms.get(1));
        System.out.println(world.location.label);
        rooms.clear();
    }
    
    public void goRight() {
        ArrayList<Room> rooms = world.getRooms();
        world.enter(rooms.get(2));
        System.out.println(world.location.label);
        rooms.clear();
    }
}
