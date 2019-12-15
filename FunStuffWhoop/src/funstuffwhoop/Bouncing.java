/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funstuffwhoop;
import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author Vicky
 */
public class Bouncing extends JPanel{
    private int size;
    private int x;
    private int y;
    private boolean right;
    private boolean down;
    private int r;
    private int g;
    private int b;
    private boolean changer;
    private boolean changeb;
    private boolean changeg;
    
    public Bouncing(int s) {
        size = s;
        x = 0;
        y = 0;
        right = true;
        down = true;
        r = (int)(Math.random() * 225);
        g = (int)(Math.random() * 225);
        b = (int)(Math.random() * 225);
        changer = true;
        changeb = true;
        changeg = true;
    }
    
    public void update(Graphics window) {
        paint(window);
    } 
    
    public void paint(Graphics window) {
        if (right && x < 1600 - size) {
            x++;
        }
        else if (!right && x > 0) {
            x--;
        }
        
        if (down && y < 800 - size) {
            y++;
        }
        else if (!down && y > 0) {
            y--;
        }
        
        if (right && x == 1600 - size) {
            x--;
            right = false;
        }
        else if (!right && x == 0) {
            x++;
            right = true;
        }
        
        if (down && y == 800 - size) {
            y--;
            down = false;
        }
        else if (!down && y == 0) {
            y++;
            down = true;
        }
        
        if (changer && r < 225) {
            r++;
        }
        else if (!changer && r > 0) {
            r--;
        }
        
        if (changer && r == 225) {
            changer = false;
        }
        else if (!changer && r == 0) {
            changer = true;
        }
        
        if (changeg && g < 225) {
            g++;
        }
        else if (!changeg && g > 0) {
            g--;
        }
        
        if (changeg && g == 225) {
            changeg = false;
        }
        else if (!changeg && g == 0) {
            changeg = true;
        }
        
        if (changeb && b < 225) {
            b++;
        }
        else if (!changeb && b > 0) {
            b--;
        }
        
        if (changeb && b == 225) {
            changeb = false;
        }
        else if (!changeb && b == 0) {
            changeb = true;
        }
        
        //Color col = new Color(r, g, b);
        Color col = new Color((int)(Math.random()*225) + 1, (int)(Math.random()*225) + 1, (int)(Math.random()*225) + 1);
        window.setColor(col);
        
        //window.fill3DRect(x, y, size, size, true);
        window.fillOval(x, y + 1, size, size);
        System.out.println(r + " " + g + " " + b + " ");
        repaint();
    }
    
}
