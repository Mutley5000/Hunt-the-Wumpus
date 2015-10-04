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
}
