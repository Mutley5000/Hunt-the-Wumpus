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
public class Wumpus extends Monster {
    String sendOff;

    Wumpus(int id, String location, String state, String sendOff) {
        this.id = id;
        this.location = location;
        this.state = state;
        this.sendOff = sendOff;
    }

    public String getSendOff() {
        return sendOff;
    }

    public void setSendOff(String sendOff) {
        this.sendOff = sendOff;
    }
}