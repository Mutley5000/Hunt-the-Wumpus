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
public interface IQueries {
    public void close();
    public void updatePlayerLocation(Long id, String room);
    public Player getPlayer();
    public Wumpus getWumpus();
    public Parrot getParrot();
    public Treasure getTreasure();
    public void hideTreasure(long id);
    public void addItemToPlayerInventory(Long id, Item item);
    public void saveSession(Session session);
    
    public void resetPlayer(long id);
    public void resetTreasure(long id);
    public void resetInventory();
}
