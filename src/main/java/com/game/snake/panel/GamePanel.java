package com.game.snake.panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JFrame implements ActionListener, KeyListener {

    private JPanel gamePanel, titlePanel;
    private JButton startButton;
    private JLabel numLabel;
    private volatile String operation = "-";

    public GamePanel() {
        initPanel();
        initCommons();
        setPanel();
        threadRun();
    }

    private void initCommons() {
        gamePanel = new JPanel();
        gamePanel.setBackground(new Color(2, 160, 6));
        gamePanel.setSize(800, 600);

        titlePanel = new JPanel();
        startButton = new JButton("start");
        startButton.addActionListener(this);

        numLabel = new JLabel();
        titlePanel.add(numLabel);
        titlePanel.add(startButton);
    }

    private void initPanel() {
        this.setTitle("Gluttonous Snake");
        this.setSize(820, 620);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void setPanel() {
        this.setLayout(new BorderLayout());
        this.add(BorderLayout.NORTH, titlePanel);
        this.add(BorderLayout.CENTER, gamePanel);
        addKeyListener(this);
    }

    public void threadRun(){
        Thread snick = new Thread(new Runnable() {
            public void run() {
                while(true){
                    if ("l".equalsIgnoreCase(operation)){
                        System.out.println("l");
                    }else if("r".equalsIgnoreCase(operation)){
                        System.out.println("l");
                    }else if("t".equalsIgnoreCase(operation)){
                        System.out.println("t");
                    }else if("b".equalsIgnoreCase(operation)){
                        System.out.println("b");
                    }

                }
            }
        });
        snick.start();
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());

    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        String key = String.valueOf(e.getKeyChar());
        System.out.println(e.getKeyChar());
        if("w".equalsIgnoreCase(key)){
            operation = "t";
        }else if("s".equalsIgnoreCase(key)){
            operation = "b";
        }else if("a".equalsIgnoreCase(key)){
            operation = "l";
        }else if("d".equalsIgnoreCase(key)){
            operation = "r";
        }
    }

    public void keyReleased(KeyEvent e) {

    }
}
