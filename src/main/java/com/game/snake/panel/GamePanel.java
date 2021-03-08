package com.game.snake.panel;

import javax.swing.*;

public class GamePanel extends JFrame {

    public GamePanel(){
        initPanel();
    }

    private void initPanel(){
        this.setTitle("Gluttonous Snake");
        this.setSize(820,620);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
