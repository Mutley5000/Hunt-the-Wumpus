
package Model;

import java.util.ArrayList;
import java.util.Stack;

public class World extends Graph {

    Room wumpus;
    Room location;
    ArrayList <Edge> edges;
    ArrayList <Room> rooms = new ArrayList<>();

    public World( Layout layout ) {
        super( layout.getRooms() );
    }
    
    public Room getRoom( String r) {
        return (Room) getNode( r );
    }

    public boolean enter(Room r) { 
	ArrayList <Edge> ale = location.edges;
	for ( Edge e : ale ) {
            if ( ( r.label).equals( e.to ) ) {
		location = r;
		return true;
            }
	}
	return false;
    }
    
    public ArrayList <Room> getRooms() {
	edges = location.edges;
	for ( Edge e : edges ){
            Room r = getRoom(e.to);
            rooms.add(r);
        }
	return rooms;
    }

    
    
    /*public String describe() {
	String s = location.describe();
	s += "\nThere are exits to:";
	ArrayList <Edge>  ale = location.edges;
	for ( Edge e : ale )
            s += "\n\t"+e.to;
	s += "\nThe wumpus is "+distance( location, wumpus )+" rooms away";
	return s;
    }*/
    
    

    public boolean shoot( Room r ) {
	if ( ( r.label ).equals( wumpus.label ) )
            return true;
	Stack <Edge> sp = findShortestPath( location, r );
	//to do: traverse the path; if it passes through the wumpus room, return true
	return false;
    }

    public String shortestPath( Room to ) {
	Stack <Edge> es = findShortestPath( location, to );
	String path = "";
	while ( !es.empty() ) {
            Edge e = es.pop();
            path += "\t"+e.from+" to "+e.to+"\n";
	}
	return path;
    }
 }