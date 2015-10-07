/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Model;
import Model.Parrot;
import Model.Room;
import Model.Treasure;
import Model.Wumpus;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author rolley
 */
public class View implements Observer {
    
    IGUI gui;
    
    public View(Model m) {
        m.addObserver(this);
    }
    
    public void setGUI(IGUI ig) {
        gui = ig;
    }

    @Override
    public void update(Observable obs, Object obj) {
        if (obj instanceof ArrayList) {
            ArrayList<Room> rooms = (ArrayList) obj;
            gui.setRoomLables(rooms.get(0).label, rooms.get(2).label);
        }
        
        if (obj instanceof Parrot) {
            Parrot parrot = (Parrot)obj;
            gui.showParrot("You are "+parrot.getDistance()+" rooms away from the Wumpus.");
        }
        
        if (obj instanceof Wumpus) {
            Wumpus wumpus = (Wumpus)obj;
            gui.showWumpus(wumpus.getSendOff());
        }
        
        if (obj instanceof Treasure) {
            Treasure treasure = (Treasure)obj;
            gui.showTreasure();
        }
    }
    
}
