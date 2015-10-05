/*
 * 
 * For educational purposes only.
 * 
 */
package View;

import Controller.Controller;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author rolley
 */
public class GUI extends JFrame implements IGUI {
    
    Controller controller;
    
    // Variables declaration - do not modify                     
    private javax.swing.JLabel AngryBackground;
    private javax.swing.JLayeredPane AngryMonstorPanel;
    private javax.swing.JButton Attack;
    private javax.swing.JButton Attack2;
    private javax.swing.JButton Back;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Bird;
    private javax.swing.JLayeredPane BirdPanel;
    private javax.swing.JLabel DeadBackGround;
    private javax.swing.JLayeredPane DeadPanel;
    private javax.swing.JComboBox EquipCombo;
    private javax.swing.JComboBox EquipCombo2;
    private javax.swing.JLabel EquipLbl;
    private javax.swing.JButton Left;
    private javax.swing.JLabel LeftDoor;
    private javax.swing.JLabel LeftDoor1;
    private javax.swing.JButton Map;
    private javax.swing.JLabel Monstor;
    private javax.swing.JCheckBox MuteCheckBox;
    private javax.swing.JButton Options;
    private javax.swing.JLabel OptionsBackground;
    private javax.swing.JLayeredPane OptionsPanel;
    private javax.swing.JButton Quit;
    private javax.swing.JButton Quit1;
    private javax.swing.JButton Quit2;
    private javax.swing.JButton Return;
    private javax.swing.JButton Right;
    private javax.swing.JLabel RightDoor;
    private javax.swing.JLabel RightDoor1;
    private javax.swing.JLayeredPane RoomPanel;
    private javax.swing.JButton RunAway;
    private javax.swing.JButton Save;
    private javax.swing.JButton Search;
    private javax.swing.JLabel SleepMonstor;
    private javax.swing.JLayeredPane SleepMonstorPanel;
    private javax.swing.JButton Start;
    private javax.swing.JButton Start1;
    private javax.swing.JButton Start2;
    private javax.swing.JLabel StartBackground;
    private javax.swing.JLayeredPane StartScreenPanel;
    private javax.swing.JLayeredPane TreasurePanel;
    private javax.swing.JLabel WinBackground;
    private javax.swing.JLayeredPane WinPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea notiforcation;
    // End of variables declaration
    
    public GUI(Controller c) {
        
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
        
        controller = c;
        
        initComponents();
       
          RoomPanel.setVisible(false); 
          StartScreenPanel.setVisible(true);
          OptionsPanel.setVisible(false);
          AngryMonstorPanel.setVisible(false);
          WinPanel.setVisible(false);
          DeadPanel.setVisible(false);
          
          TreasurePanel.setVisible(false);
          BirdPanel.setVisible(false);
          SleepMonstor.setVisible(false);
          setVisible(true);
    }
    
    private void initComponents() {

        OptionsPanel = new javax.swing.JLayeredPane();
        Save = new javax.swing.JButton();
        Quit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        MuteCheckBox = new javax.swing.JCheckBox();
        Return = new javax.swing.JButton();
        OptionsBackground = new javax.swing.JLabel();
        RoomPanel = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        notiforcation = new javax.swing.JTextArea();
        Search = new javax.swing.JButton();
        Map = new javax.swing.JButton();
        Left = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Right = new javax.swing.JButton();
        Attack = new javax.swing.JButton();
        EquipCombo = new javax.swing.JComboBox();
        EquipLbl = new javax.swing.JLabel();
        Options = new javax.swing.JButton();
        LeftDoor = new javax.swing.JLabel();
        RightDoor = new javax.swing.JLabel();
        LeftDoor1 = new javax.swing.JLabel();
        RightDoor1 = new javax.swing.JLabel();
        BirdPanel = new javax.swing.JLayeredPane();
        Bird = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        SleepMonstorPanel = new javax.swing.JLayeredPane();
        SleepMonstor = new javax.swing.JLabel();
        TreasurePanel = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();
        StartScreenPanel = new javax.swing.JLayeredPane();
        Start = new javax.swing.JButton();
        StartBackground = new javax.swing.JLabel();
        AngryMonstorPanel = new javax.swing.JLayeredPane();
        Monstor = new javax.swing.JLabel();
        Attack2 = new javax.swing.JButton();
        RunAway = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        EquipCombo2 = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        AngryBackground = new javax.swing.JLabel();
        WinPanel = new javax.swing.JLayeredPane();
        Quit1 = new javax.swing.JButton();
        Start1 = new javax.swing.JButton();
        WinBackground = new javax.swing.JLabel();
        DeadPanel = new javax.swing.JLayeredPane();
        jLabel4 = new javax.swing.JLabel();
        Quit2 = new javax.swing.JButton();
        Start2 = new javax.swing.JButton();
        DeadBackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1060, 790));
        setMinimumSize(new java.awt.Dimension(1060, 790));
        setPreferredSize(new java.awt.Dimension(1060, 790));
        getContentPane().setLayout(null);

        OptionsPanel.setBackground(new java.awt.Color(255, 255, 255));
        OptionsPanel.setMaximumSize(new java.awt.Dimension(1060, 790));
        OptionsPanel.setMinimumSize(new java.awt.Dimension(1060, 790));
        OptionsPanel.setOpaque(true);

        Save.setBackground(new java.awt.Color(51, 51, 51));
        Save.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Save.setForeground(new java.awt.Color(255, 102, 102));
        Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Save.png"))); // NOI18N
        Save.setText("Save");
        Save.addActionListener((java.awt.event.ActionEvent evt) -> {
            controller.saveButtonAction();
        });
        OptionsPanel.add(Save);
        Save.setBounds(350, 430, 110, 50);

        Quit.setBackground(new java.awt.Color(0, 0, 0));
        Quit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Quit.setForeground(new java.awt.Color(255, 0, 0));
        Quit.setText("Quit");
        Quit.addActionListener((java.awt.event.ActionEvent evt) -> {
            controller.quitButtonAction();
        });
        OptionsPanel.add(Quit);
        Quit.setBounds(640, 430, 110, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/pause.png"))); // NOI18N
        jLabel1.setText("Game Is paused");
        OptionsPanel.add(jLabel1);
        jLabel1.setBounds(100, 60, 230, 100);

        MuteCheckBox.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        MuteCheckBox.setText("  Mute");
        MuteCheckBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        OptionsPanel.add(MuteCheckBox);
        MuteCheckBox.setBounds(110, 160, 110, 50);

        Return.setBackground(new java.awt.Color(51, 51, 51));
        Return.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Return.setForeground(new java.awt.Color(255, 102, 102));
        Return.setText("Return to game");
        Return.addActionListener((java.awt.event.ActionEvent evt) -> {
            controller.returnButtonAction();
        });
        OptionsPanel.add(Return);
        Return.setBounds(480, 430, 130, 50);

        OptionsBackground.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        OptionsBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Backgrounds/Main Menu.png"))); // NOI18N
        OptionsBackground.setMaximumSize(new java.awt.Dimension(1060, 790));
        OptionsBackground.setMinimumSize(new java.awt.Dimension(1060, 790));
        OptionsBackground.setPreferredSize(new java.awt.Dimension(1060, 790));
        OptionsPanel.add(OptionsBackground);
        OptionsBackground.setBounds(10, 0, 1060, 790);

        getContentPane().add(OptionsPanel);
        OptionsPanel.setBounds(0, 0, 1060, 790);

        RoomPanel.setBackground(new java.awt.Color(255, 255, 255));
        RoomPanel.setMaximumSize(new java.awt.Dimension(1060, 790));
        RoomPanel.setMinimumSize(new java.awt.Dimension(1060, 790));
        RoomPanel.setOpaque(true);

        notiforcation.setColumns(20);
        notiforcation.setRows(5);
        jScrollPane1.setViewportView(notiforcation);

        RoomPanel.add(jScrollPane1);
        jScrollPane1.setBounds(250, 680, 557, 84);

        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/search.png"))); // NOI18N
        Search.setText("Search");
        Search.setFocusable(false);
        Search.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Search.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Search.addActionListener((java.awt.event.ActionEvent evt) -> {
            controller.searchButtonAction();
        });
        RoomPanel.add(Search);
        Search.setBounds(270, 570, 80, 94);

        Map.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/map.png"))); // NOI18N
        Map.setText("Map");
        Map.setFocusable(false);
        Map.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Map.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Map.addActionListener((java.awt.event.ActionEvent evt) -> {
            controller.mapButtonAction();
        });
        RoomPanel.add(Map);
        Map.setBounds(170, 570, 80, 94);

        Left.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/left.png"))); // NOI18N
        Left.setToolTipText("Go Left");
        Left.setFocusable(false);
        Left.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Left.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Left.addActionListener((java.awt.event.ActionEvent evt) -> {
            controller.leftButtonAction();
        });
        RoomPanel.add(Left);
        Left.setBounds(400, 570, 89, 76);

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/down.png"))); // NOI18N
        Back.setToolTipText("Go back to previous room");
        Back.setFocusable(false);
        Back.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Back.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Back.addActionListener((java.awt.event.ActionEvent evt) -> {
            controller.backButtonAction();
        });
        RoomPanel.add(Back);
        Back.setBounds(490, 570, 59, 95);

        Right.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/right.png"))); // NOI18N
        Right.setToolTipText("Go right");
        Right.setFocusable(false);
        Right.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Right.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Right.addActionListener((java.awt.event.ActionEvent evt) -> {
            controller.rightButtonAction();
        });
        RoomPanel.add(Right);
        Right.setBounds(560, 570, 87, 76);

        Attack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/sword.png"))); // NOI18N
        Attack.setText("Attack");
        Attack.setFocusable(false);
        Attack.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Attack.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Attack.addActionListener((java.awt.event.ActionEvent evt) -> {
            controller.attackButtonAction();
        });
        RoomPanel.add(Attack);
        Attack.setBounds(680, 570, 80, 94);

        EquipCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sword", "Magic Bow", "Pointy Stick", "Shoe" }));
        RoomPanel.add(EquipCombo);
        EquipCombo.setBounds(810, 640, 130, 27);

        EquipLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Equip.png"))); // NOI18N
        EquipLbl.setToolTipText(" Equip Weapon");
        EquipLbl.setOpaque(true);
        RoomPanel.add(EquipLbl);
        EquipLbl.setBounds(810, 570, 80, 70);

        Options.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/settings.png"))); // NOI18N
        Options.setToolTipText("Options");
        Options.addActionListener((java.awt.event.ActionEvent evt) -> {
            controller.optionsButtonAction();
        });
        RoomPanel.add(Options);
        Options.setBounds(20, 10, 70, 80);

        LeftDoor.setText("Room Number");
        RoomPanel.add(LeftDoor);
        LeftDoor.setBounds(260, 200, 80, 30);

        RightDoor.setText("Room Number");
        RoomPanel.add(RightDoor);
        RightDoor.setBounds(570, 650, 80, 30);

        LeftDoor1.setText("Room Number");
        RoomPanel.add(LeftDoor1);
        LeftDoor1.setBounds(400, 650, 80, 30);

        RightDoor1.setText("Room Number");
        RoomPanel.add(RightDoor1);
        RightDoor1.setBounds(700, 200, 80, 30);

        Bird.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Entities/Parrot.png"))); // NOI18N
        Bird.setText("jLabel2");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout BirdPanelLayout = new javax.swing.GroupLayout(BirdPanel);
        BirdPanel.setLayout(BirdPanelLayout);
        BirdPanelLayout.setHorizontalGroup(
            BirdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BirdPanelLayout.createSequentialGroup()
                .addComponent(Bird, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE))
        );
        BirdPanelLayout.setVerticalGroup(
            BirdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BirdPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(BirdPanelLayout.createSequentialGroup()
                .addComponent(Bird, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
        );
        BirdPanel.setLayer(Bird, javax.swing.JLayeredPane.DEFAULT_LAYER);
        BirdPanel.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        RoomPanel.add(BirdPanel);
        BirdPanel.setBounds(120, 0, 510, 230);

        SleepMonstor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Entities/Sleeping Monster.png"))); // NOI18N
        SleepMonstor.setText("jLabel2");

        javax.swing.GroupLayout SleepMonstorPanelLayout = new javax.swing.GroupLayout(SleepMonstorPanel);
        SleepMonstorPanel.setLayout(SleepMonstorPanelLayout);
        SleepMonstorPanelLayout.setHorizontalGroup(
            SleepMonstorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SleepMonstorPanelLayout.createSequentialGroup()
                .addComponent(SleepMonstor, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        SleepMonstorPanelLayout.setVerticalGroup(
            SleepMonstorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SleepMonstorPanelLayout.createSequentialGroup()
                .addComponent(SleepMonstor, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        SleepMonstorPanel.setLayer(SleepMonstor, javax.swing.JLayeredPane.DEFAULT_LAYER);

        RoomPanel.add(SleepMonstorPanel);
        SleepMonstorPanel.setBounds(430, 280, 210, 240);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Items/Treasure.png"))); // NOI18N

        javax.swing.GroupLayout TreasurePanelLayout = new javax.swing.GroupLayout(TreasurePanel);
        TreasurePanel.setLayout(TreasurePanelLayout);
        TreasurePanelLayout.setHorizontalGroup(
            TreasurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TreasurePanelLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );
        TreasurePanelLayout.setVerticalGroup(
            TreasurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        TreasurePanel.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        RoomPanel.add(TreasurePanel);
        TreasurePanel.setBounds(470, 330, 140, 150);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Backgrounds/Room background.png"))); // NOI18N
        RoomPanel.add(Background);
        Background.setBounds(0, 0, 1060, 790);

        getContentPane().add(RoomPanel);
        RoomPanel.setBounds(0, 0, 1060, 790);

        StartScreenPanel.setBackground(new java.awt.Color(255, 255, 255));
        StartScreenPanel.setMaximumSize(new java.awt.Dimension(1060, 790));
        StartScreenPanel.setMinimumSize(new java.awt.Dimension(1060, 790));
        StartScreenPanel.setOpaque(true);

        Start.setText("Start New Game");
        Start.addActionListener((java.awt.event.ActionEvent evt) -> {
            controller.startButtonAction();
        });
        StartScreenPanel.add(Start);
        Start.setBounds(480, 530, 120, 50);

        StartBackground.setBackground(new java.awt.Color(0, 0, 0));
        StartBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Backgrounds/Start Screen.png"))); // NOI18N
        StartScreenPanel.add(StartBackground);
        StartBackground.setBounds(0, 0, 1060, 790);

        getContentPane().add(StartScreenPanel);
        StartScreenPanel.setBounds(0, 0, 1060, 790);

        AngryMonstorPanel.setBackground(new java.awt.Color(204, 51, 0));
        AngryMonstorPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AngryMonstorPanel.setMaximumSize(new java.awt.Dimension(1060, 790));
        AngryMonstorPanel.setMinimumSize(new java.awt.Dimension(1060, 790));

        Monstor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Entities/Angry Monster.png"))); // NOI18N
        Monstor.setText("jLabel2");
        AngryMonstorPanel.add(Monstor);
        Monstor.setBounds(400, 360, 213, 255);

        Attack2.setBackground(new java.awt.Color(102, 102, 102));
        Attack2.setForeground(new java.awt.Color(51, 51, 51));
        Attack2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/sword.png"))); // NOI18N
        Attack2.setToolTipText("Attack");
        AngryMonstorPanel.add(Attack2);
        Attack2.setBounds(340, 660, 80, 70);

        RunAway.setText("Run Away");
        RunAway.setToolTipText("Run Back to an eairler room");
        AngryMonstorPanel.add(RunAway);
        RunAway.setBounds(450, 660, 105, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Equip.png"))); // NOI18N
        jLabel2.setToolTipText("Select weapon to attack with");
        AngryMonstorPanel.add(jLabel2);
        jLabel2.setBounds(570, 660, 80, 50);

        EquipCombo2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sword", "Magic Bow", "Pointy Stick", "Shoe" }));
        EquipCombo2.setToolTipText("");
        EquipCombo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EquipCombo2ActionPerformed(evt);
            }
        });
        AngryMonstorPanel.add(EquipCombo2);
        EquipCombo2.setBounds(570, 710, 130, 27);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane3.setViewportBorder(new javax.swing.border.MatteBorder(null));

        jTextArea2.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea2.setColumns(4);
        jTextArea2.setFont(new java.awt.Font("Script MT Bold", 1, 48)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 0, 51));
        jTextArea2.setRows(5);
        jTextArea2.setText("\nA very angry monstor with a low sence\n of humor blocks your path.\n What do you do?");
        jScrollPane3.setViewportView(jTextArea2);

        AngryMonstorPanel.add(jScrollPane3);
        jScrollPane3.setBounds(60, 40, 910, 290);

        AngryBackground.setBackground(new java.awt.Color(204, 0, 0));
        AngryBackground.setOpaque(true);
        AngryBackground.setPreferredSize(new java.awt.Dimension(1060, 790));
        AngryMonstorPanel.add(AngryBackground);
        AngryBackground.setBounds(0, 0, 1060, 790);

        getContentPane().add(AngryMonstorPanel);
        AngryMonstorPanel.setBounds(0, 0, 1060, 790);

        WinPanel.setMinimumSize(new java.awt.Dimension(1060, 790));

        Quit1.setBackground(new java.awt.Color(0, 0, 0));
        Quit1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Quit1.setForeground(new java.awt.Color(255, 0, 0));
        Quit1.setText("Quit");
        Quit1.addActionListener((java.awt.event.ActionEvent evt) -> {
            controller.quitButtonAction();
        });
        WinPanel.add(Quit1);
        Quit1.setBounds(660, 460, 110, 50);

        Start1.setText("Start New Game");
        Start1.addActionListener((java.awt.event.ActionEvent evt) -> {
            controller.startButtonAction();
        });
        WinPanel.add(Start1);
        Start1.setBounds(330, 460, 120, 50);

        WinBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Backgrounds/Game Ending Screen.png"))); // NOI18N
        WinPanel.add(WinBackground);
        WinBackground.setBounds(0, 0, 1060, 790);

        getContentPane().add(WinPanel);
        WinPanel.setBounds(350, 650, 1060, 790);

        DeadPanel.setMinimumSize(new java.awt.Dimension(1060, 790));

        jLabel4.setFont(new java.awt.Font("Script MT Bold", 2, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4.setText("Oh Look at that, you died. \n\nDo you dare to try again?");
        DeadPanel.add(jLabel4);
        jLabel4.setBounds(130, 170, 770, 230);

        Quit2.setBackground(new java.awt.Color(0, 0, 0));
        Quit2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Quit2.setForeground(new java.awt.Color(255, 0, 0));
        Quit2.setText("Quit");
        Quit2.addActionListener((java.awt.event.ActionEvent evt) -> {
            controller.quitButtonAction();
        });
        DeadPanel.add(Quit2);
        Quit2.setBounds(760, 600, 110, 50);

        Start2.setText("Start New Game");
        Start2.addActionListener((java.awt.event.ActionEvent evt) -> {
            controller.startButtonAction();
        });
        DeadPanel.add(Start2);
        Start2.setBounds(260, 600, 120, 50);

        DeadBackGround.setBackground(new java.awt.Color(0, 0, 0));
        DeadBackGround.setOpaque(true);
        DeadPanel.add(DeadBackGround);
        DeadBackGround.setBounds(0, 0, 1060, 790);

        getContentPane().add(DeadPanel);
        DeadPanel.setBounds(230, 630, 1060, 790);

        pack();
    }
    
    // To change to run through Controller
    
    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {                                     
      //clipNameDoor.setFramePosition(0);

	//clipNameDoor.start();
        //notiforcation.setText(perform("enter 2"));
    }                                    

    private void MapActionPerformed(java.awt.event.ActionEvent evt) {                                    
    //   printButton.addActionListener(new ActionListener()
{
  
      /*JOptionPane.showMessageDialog((Component)evt.getSource(),
      "",
      "Map",
      JOptionPane.INFORMATION_MESSAGE,
      new ImageIcon(ShowMap.class.getResource("nummap.jpg ")));*/
      
      //Map.setVisible(true);
     

      //clipNameMap.setFramePosition(0);
      
      //clipNameMap.start();
      
  }

/*{
MapSound object = new MapSound();
object.AudioInputStream();  // non static method
object.var = 1;     // non static variable
}*/

    }                                   

    private void AttackActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void LeftActionPerformed(java.awt.event.ActionEvent evt) {                                     
        //clipNameDoor.setFramePosition(0);
	//clipNameDoor.start();
        
        //notiforcation.setText(perform("enter 11"));
    }                                    

    private void RightActionPerformed(java.awt.event.ActionEvent evt) {                                      
    
        
     //clipNameDoor.setFramePosition(0);
     //clipNameDoor.start();
     
     //notiforcation.setText(perform("enter 10"));
    }                                     
    
    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void EquipCombo2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }

    
    
    @Override
    public void startGame() {
        RoomPanel.setVisible(true); 
        StartScreenPanel.setVisible(false);
        OptionsPanel.setVisible(false);
        AngryMonstorPanel.setVisible(false);
        WinPanel.setVisible(false);
        DeadPanel.setVisible(false);
        TreasurePanel.setVisible(false);
    }

    @Override
    public void showOptionsMenu() {
        RoomPanel.setVisible(false); 
        StartScreenPanel.setVisible(false);
        OptionsPanel.setVisible(true);
        AngryMonstorPanel.setVisible(false);
        WinPanel.setVisible(false);
        DeadPanel.setVisible(false);
    }

    @Override
    public void hideOptionsMenu() {
        RoomPanel.setVisible(true); 
        StartScreenPanel.setVisible(false);
        OptionsPanel.setVisible(false);
        AngryMonstorPanel.setVisible(false);
        WinPanel.setVisible(false);
        DeadPanel.setVisible(false);
    }

    @Override
    public void returnToStartScreen() {
        RoomPanel.setVisible(false); 
        StartScreenPanel.setVisible(true);
        OptionsPanel.setVisible(false);
        AngryMonstorPanel.setVisible(false);
        WinPanel.setVisible(false);
        DeadPanel.setVisible(false);
    }

    @Override
    public void setRoomLables(String left, String right) {
        LeftDoor.setText(left);
        LeftDoor1.setText(left);
        RightDoor.setText(right);
        RightDoor1.setText(right);
    }

    @Override
    public void setTextArea(String info) {
        notiforcation.setText(info);
    }
}
