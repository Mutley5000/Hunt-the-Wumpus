/*
 * 
 * For educational purposes only.
 * 
 */
package CustomView;

import CustomController.Controller;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author rolley
 */
public class GameScreen extends JPanel {

    private BufferedImage backgroundImage;
    
    //private final JButton start;
    
    Controller controller;

    // Some code to initialize the background image.
    // Here, we use the constructor to load the image.
    public GameScreen(Controller c) {
        try {
            backgroundImage = ImageIO.read(GameScreen.class.getResource("/Resources/Backgrounds/Room background.png"));
        } catch (IOException ex) {
            Logger.getLogger(GameScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /*setLayout(new BorderLayout());
        JPanel southPanel = new JPanel();
        start = new JButton("Start Game");
        start.setAlignmentX(Component.CENTER_ALIGNMENT);
        start.addActionListener((java.awt.event.ActionEvent evt) -> {
            controller.startButtonAction();
        });
        
        southPanel.add(start);
        add(southPanel, BorderLayout.PAGE_END);
        southPanel.setOpaque(false);
        southPanel.setBorder(BorderFactory.createEmptyBorder(0,0,120,0));*/
    }

    @Override
    public Dimension getPreferredSize() {
        return backgroundImage == null ? new Dimension(400, 300) : new Dimension(backgroundImage.getWidth(), backgroundImage.getHeight());
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the background image.
        g.drawImage(backgroundImage, 0, 0, this);
    }
}