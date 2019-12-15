/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funstuffwhoop;

/**
 *
 * @author Vicky
 */
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;
public class Snake extends JPanel{
    private ArrayList<Locomotive> snake;
    private int stage;
    private boolean play;
    private String direction;
    private int ret;
    public Snake() {
        snake = new ArrayList<Locomotive>();
        snake.add(new Locomotive(200, 370));
        stage = 0;
        play = false;
        direction = "right";
        ret = 0;
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() > 0) {
                    ret = e.getKeyCode();
                }
            } 
        });
    }
    
    public void update(Graphics window) {
        paint(window);
    }
    
    public void paint(Graphics window) {
        window.setColor(Color.BLACK);
        window.fillRect(0, 0, 1600, 800);
        
        
        if (direction.equals("right")) {
            for (int i = 0; i < snake.size(); i++) {
                snake.get(i).setXY("x", 1);
            }
        }
        else if (direction.equals("left")) {
            for (int i = 0; i < snake.size(); i++) {
                snake.get(i).setXY("x", -1);
            }
        }
        else if (direction.equals("up")) {
            for (int i = 0; i < snake.size(); i++) {
                snake.get(i).setXY("y", 1);
            }
        }
        else if (direction.equals("down")) {
            for (int i = 0; i < snake.size(); i++) {
                snake.get(i).setXY("y", -1);
            }
        }
        
        window.setColor(Color.GREEN);
        window.drawString("" + ret, 40, 100);
        for (int i = 0; i < snake.size(); i++) {
            window.fillRect(snake.get(i).getX(), snake.get(i).getY(), 30, 30);
        }
        
        repaint();
    }
    
}
