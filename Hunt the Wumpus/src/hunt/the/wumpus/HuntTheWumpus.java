/*
 * 
 * For educational purposes only.
 * 
 */
package hunt.the.wumpus;

//import Controller.Controller;
import CustomController.Controller;
import Model.Model;
import Model.Queries;
//import View.GUI;
//import View.View;
import CustomView.GUI;
import CustomView.View;

/**
 *
 * @author rolley
 */
/*public class HuntTheWumpus {

    public static void main(String[] args) {
       Queries q = new Queries();
       Model m = new Model(q);
       Controller c = new Controller(m);
       View v = new View(m);
       GUI g = new GUI(c);
       c.setGUI(g);
       v.setGUI(g);
    }
}*/

public class HuntTheWumpus {

    public static void main(String[] args) {
       Queries q = new Queries();
       Model m = new Model(q);
       Controller c = new Controller(m);
       View v = new View(m);
       GUI g = new GUI(c);
       c.setGUI(g);
       v.setGUI(g);
    }
}