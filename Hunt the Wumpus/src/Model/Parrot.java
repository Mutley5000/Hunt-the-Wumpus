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
public class Parrot extends Entity {
    int distance;

    Parrot(int id, String location, int distance) {
        this.id = id;
        this.location = location;
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}