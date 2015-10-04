/*
 * 
 * For educational purposes only.
 * 
 */
package Controller;

import Model.Model;
import View.IGUI;

/**
 *
 * @author rolley
 */
public class Controller {
    
    Model model;
    IGUI gui;
    
    public Controller(Model m) {
        model = m;
    }

    public void setGUI(IGUI ig) {
        gui = ig;
    }
    
    public void startButtonAction() {
        gui.startGame();
        model.createSession();
    }
    
    public void optionsButtonAction() {
        gui.showOptionsMenu();
    }
    
    
    //TODO
    public void saveButtonAction() {
        
    }
    
    
    
    public void returnButtonAction() {
        gui.hideOptionsMenu();
    }
    
    public void quitButtonAction() {
        gui.returnToStartScreen();
    }
    
    
    //TODO
    public void mapButtonAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void searchButtonAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void leftButtonAction() {
        model.goLeft();
    }

    public void backButtonAction() {
        model.goBack();
    }

    public void rightButtonAction() {
        model.goRight();
    }

    public void attackButtonAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
