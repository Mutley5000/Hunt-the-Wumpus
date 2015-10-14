/*
 * 
 * For educational purposes only.
 * 
 */
package CustomView;

import CustomController.Controller;
import javax.swing.JFrame;

/**
 *
 * @author rolley
 */
public class GUI implements IGUI {
    
    Controller controller;
    
    JFrame frame = new JFrame();
    
    private StartScreen ss;
    private GameScreen gs;
    
    public GUI(Controller c) {
        
        controller = c;
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
  
        displayGUI();
    }
    
    public final void displayGUI() {
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        ss = new StartScreen(controller);
        
        frame.add(ss);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public void startGame() {
        frame.remove(ss);
        
        gs = new GameScreen(controller);
        frame.add(gs);
        frame.revalidate();
        frame.repaint();
    }

    @Override
    public void showOptionsMenu() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void hideOptionsMenu() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void returnToStartScreen() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setRoomLables(String left, String right) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setTextArea(String info) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void showParrot(String message) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void hideParrot() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void showWumpus(String message) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void showTreasure() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void hideTreasure() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
