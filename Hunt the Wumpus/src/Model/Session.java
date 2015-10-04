/*
 * 
 * For educational purposes only.
 * 
 */
package Model;

import java.util.Date;

/**
 *
 * @author rolley
 */
public class Session {
    
    Date createdDate = new Date();
    Player player;
    Wumpus wumpus;
    Parrot parrot;
    
    public Session(Player player, Wumpus wumpus, Parrot parrot) {
        this.player = player;
        this.wumpus = wumpus;
        this.parrot = parrot;
    }

    public Date getCreatedDate() {
        return createdDate;
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

    public Parrot getParrot() {
        return parrot;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }
}