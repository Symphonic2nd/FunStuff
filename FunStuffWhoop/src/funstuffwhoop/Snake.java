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
import java.awt.event.KeyListener;
import javax.swing.*;

public class Snake extends JPanel{

    private ArrayList<Locomotive> snake;
    private int stage;
    private boolean play;
    private String direction;
    private String prev;
    private int ret;
    private boolean RIGHT;
    private boolean LEFT;
    private boolean UP;
    private boolean DOWN;
    private int rx;
    private int ry;
    private int marker;
    
    public Snake() {
        RIGHT = false;
        LEFT = false;
        UP = false;
        DOWN = false;
        snake = new ArrayList<Locomotive>();
        snake.add(new Locomotive(200, 370));
        stage = 0;
        play = false;
        direction = "";
        prev = "";
        ret = 0;
        marker = 0;
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                ret = e.getKeyCode();
                prev = direction;
                if (ret == 37 && !prev.equals("right") && !prev.equals("left") && marker == 0) {
                    direction = "left";
                    LEFT = true;
                    RIGHT = false;
                    UP = false;
                    DOWN = false;
                }
                else if (ret == 38 && !prev.equals("down") && !prev.equals("up") && marker == 0) {
                    direction = "up";
                    UP = true;
                    RIGHT = false;
                    LEFT = false;
                    DOWN = false;
                }
                else if (ret == 39 && !prev.equals("left") && !prev.equals("right") && marker == 0) {
                    direction = "right";
                    RIGHT = true;
                    LEFT = false;
                    UP = false;
                    DOWN = false;
                }
                else if (ret == 40 && !prev.equals("up") && !prev.equals("down") && marker == 0) {
                    direction = "down";
                    DOWN = true;
                    RIGHT = false;
                    LEFT = false;
                    UP = false;
                }
            }
        });
        rx = 600;
        ry = 370;
    }

    public void update(Graphics window) {
        paint(window);
    }

    public void paint(Graphics window) {
        window.setColor(Color.BLACK);
        window.fillRect(0, 0, 1920, 1020);
        
        for (int i = snake.size() - 1; i > 0; i--) {
                snake.get(i).setXY("x", snake.get( i - 1).getX());
            }
        for (int i = snake.size() - 1; i > 0; i--) {
            snake.get(i).setXY("y", snake.get( i - 1).getY());
        }
        
        if (RIGHT) {
            snake.get(0).setXY("x", snake.get(0).getX() + 1);
        } 
        else if (LEFT) {
            snake.get(0).setXY("x", snake.get(0).getX() - 1);
        } 
        else if (UP) {
            snake.get(0).setXY("Y", snake.get(0).getY() - 1);
        } 
        else if (DOWN) {
            snake.get(0).setXY("y", snake.get(0).getY() + 1);
        }
        window.setColor(Color.RED);
        window.fill3DRect(rx, ry, 30, 30, true);

        window.setColor(Color.GREEN);
        for (int i = 0; i < snake.size(); i++) {
            window.fillRect(snake.get(i).getX(), snake.get(i).getY(), 30, 30);
        }
        
        int cx = snake.get(0).getX();
        int cy = snake.get(0).getY();
        
//        if (((cx + 30 >= rx && cx <= rx)) && ((cy >= ry && cy <= ry + 30) || (cy + 30 >= ry && cy <= ry - 30))) {
//            rx = (int)(Math.random() * 1570);
//            ry = (int)(Math.random() * 770);
//        }
        if (((cx <= rx && cx + 30 >= rx) || (cx >= rx && cx <= rx + 30)) && ((cy <= ry && cy + 30 >= ry) || (cy >= ry && cy <= ry + 30))) {
            rx = (int)(Math.random() * 1570);
            ry = (int)(Math.random() * 770);
            snake.add(new Locomotive(snake.get(snake.size() - 1).getX(), snake.get(snake.size() - 1).getY() - 30));
        }
        marker+=30;
        marker = marker %30;
        repaint();
    }
}
