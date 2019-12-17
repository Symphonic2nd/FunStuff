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
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                ret = e.getKeyCode();
                prev = direction;
                if (ret == 37 && !prev.equals("right") && !prev.equals("left")) {
                    direction = "left";
                }
                else if (ret == 38 && !prev.equals("down") && !prev.equals("up")) {
                    direction = "up";
                }
                else if (ret == 39 && !prev.equals("left") && !prev.equals("right")) {
                    direction = "right";
                }
                else if (ret == 40 && !prev.equals("up") && !prev.equals("down")) {
                    direction = "down";
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
        if (direction.equals("right")) {
            RIGHT = true;
            LEFT = false;
            UP = false;
            DOWN = false;
        }
        else if (direction.equals("left")) {
            LEFT = true;
            RIGHT = false;
            UP = false;
            DOWN = false;
        }
        else if (direction.equals("up")) {
            UP = true;
            RIGHT = false;
            LEFT = false;
            DOWN = false;
        }
        else if (direction.equals("down")) {
            DOWN = true;
            RIGHT = false;
            LEFT = false;
            UP = false;
        }    

        if (RIGHT) {
            for (int i = snake.size() - 1; i > 0; i--) {
                snake.get(i).setXY("x", snake.get( i - 1).getX());
            }
            snake.get(0).setXY("x", snake.get(0).getX() + 1);
        } 
        else if (LEFT) {
            for (int i = snake.size() - 1; i > 0; i--) {
                snake.get(i).setXY("x", snake.get( i - 1).getX());
            }
            snake.get(0).setXY("x", snake.get(0).getX() - 1);
        } 
        else if (UP) {
            for (int i = snake.size() - 1; i > 0; i--) {
                snake.get(i).setXY("y", snake.get( i - 1).getY());
            }
            snake.get(0).setXY("Y", snake.get(0).getY() - 1);
        } 
        else if (DOWN) {
            for (int i = snake.size() - 1; i > snake.size(); i--) {
                snake.get(i).setXY("y", snake.get( i - 1).getY());
            }
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
        
        if ((((cx >= rx && cx <= rx + 30)) || (cx + 30 >= rx && cx + 30 <= rx + 30)) && ((cy + 30 >= ry && cy + 30 <= ry + 30))) {
            
        }
        
        repaint();
    }
}
