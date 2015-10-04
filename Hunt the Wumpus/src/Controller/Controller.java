/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    
    public void saveButtonAction() {
        
    }
    
    public void quitButtonAction() {
        gui.returnToStartScreen();
    }
    
    public void returnButtonAction() {
        gui.hideOptionsMenu();
    }

    public void searchButtonAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mapButtonAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void leftButtonAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void backButtonAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void rightButtonAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void attackButtonAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void optionsButtonAction() {
        gui.showOptionsMenu();
    }

    public void startButtonAction() {
        gui.startGame();
    }
    
    
    
}
