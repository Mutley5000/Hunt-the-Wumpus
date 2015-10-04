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
public class Session {
    
    Player player;
    Wumpus wumpus;
    
    public Session(Player player, Wumpus wumpus) {
        this.player = player;
        this.wumpus = wumpus;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Wumpus getWumpus() {
        return wumpus;
    }

    public void setWumpus(Wumpus wumpus) {
        this.wumpus = wumpus;
    }
}