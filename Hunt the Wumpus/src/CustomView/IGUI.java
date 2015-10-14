/*
 * 
 * For educational purposes only.
 * 
 */
package CustomView;

/**
 *
 * @author rolley
 */
public interface IGUI {

    public void startGame();
    public void showOptionsMenu();
    public void hideOptionsMenu();
    public void returnToStartScreen();
    public void setRoomLables(String left, String right);
    public void setTextArea(String info);
    public void showParrot(String message);
    public void hideParrot();
    public void showWumpus(String message);
    public void showTreasure();
    public void hideTreasure();
}
