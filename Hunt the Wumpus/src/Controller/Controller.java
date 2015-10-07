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
        gui.setTextArea(model.sendMessage());
    }
    
    public void optionsButtonAction() {
        gui.showOptionsMenu();
    }
    
    
    //TODO
    public void saveButtonAction() {
        model.saveSession();
    }
    
    
    
    public void returnButtonAction() {
        gui.hideOptionsMenu();
    }
    
    public void quitButtonAction() {
        gui.returnToStartScreen();
        model.resetGame();
    }
    
    
    //TODO
    public void mapButtonAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void searchButtonAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void leftButtonAction() {
        gui.hideParrot();
        gui.hideTreasure();
        model.goLeft();
        gui.setTextArea(model.sendMessage());
    }

    public void backButtonAction() {
        gui.hideParrot();
        gui.hideTreasure();
        model.goBack();
        gui.setTextArea(model.sendMessage());
    }

    public void rightButtonAction() {
        gui.hideParrot();
        gui.hideTreasure();
        model.goRight();
        gui.setTextArea(model.sendMessage());
    }

    public void attackButtonAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
