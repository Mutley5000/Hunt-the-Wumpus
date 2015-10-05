/*
 * 
 * For educational purposes only.
 * 
 */
package Model;

import java.sql.Date;

/**
 *
 * @author rolley
 */
public class Session {
    
    Date createdDate;
    long playerID;
    long wumpusID;
    long parrotID;
    long treasureID;
    
    public Session(long playerID, long wumpusID, long parrotID, long treasureID) {
        this.playerID = playerID;
        this.wumpusID = wumpusID;
        this.parrotID = parrotID;
        this.treasureID = treasureID;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate() {
        java.util.Date utilDate = new java.util.Date();
        this.createdDate = new java.sql.Date(utilDate.getTime());
    }

    public long getPlayerID() {
        return playerID;
    }

    public void setPlayerID(long playerID) {
        this.playerID = playerID;
    }

    public long getWumpusID() {
        return wumpusID;
    }

    public void setWumpusID(long wumpusID) {
        this.wumpusID = wumpusID;
    }

    public long getParrotID() {
        return parrotID;
    }

    public void setParrotID(long parrotID) {
        this.parrotID = parrotID;
    }

    public long getTreasureID() {
        return treasureID;
    }

    public void setTreasureID(long treasureID) {
        this.treasureID = treasureID;
    }
}