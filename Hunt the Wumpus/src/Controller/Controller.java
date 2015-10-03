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
    
}
