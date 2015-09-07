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
public abstract class Monster extends Entity {
    String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
}
