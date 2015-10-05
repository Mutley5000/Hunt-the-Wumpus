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
public class Treasure extends Item {
    int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public Treasure(int id, String location, int amount) {
        this.id = id;
        this.location = location;
        this.amount = amount;
    }
    
}
