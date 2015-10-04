/*
 * 
 * For educational purposes only.
 * 
 */
package Model;

/**
 *
 * @author rolley
 */
public class Player extends Entity {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Player(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }
}
