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
import javax.swing.*;
public class PointLines extends JPanel{
    
    private ArrayList<Coordinates> coord;
    private int r;
    private int g;
    private int b;
    private boolean changer;
    private boolean changeb;
    private boolean changeg;
    private boolean background;
    private boolean gradient;
    private boolean random;
    private boolean same;
    private boolean bouncy;
    private boolean changegrad;
    private Color set;
    
    public PointLines(int size, boolean bckgrnd, String c, boolean cgrad, boolean boing) {
        coord = new ArrayList<Coordinates>();
        if (size > 5000) {
            size = 5000;
        }
        for (int i = 0 ; i < size; i++) {
            coord.add(new Coordinates());
        }
        r = (int)(Math.random() * 225);
        g = (int)(Math.random() * 225);
        b = (int)(Math.random() * 225);
        changer = true;
        changeb = true;
        changeg = true;
        background = bckgrnd;
        random = false;
        same = false;
        set = Color.WHITE;
        bouncy = boing;
        changegrad = cgrad;
        if (c.toLowerCase().equals("gradient")) {
            gradient = true;
            
        }
        else if (c.toLowerCase().equals("random")) {
            random = true;
            
        }
        else {
            same = true;
            String[] poscol = {"black", "blue", "cyan", "darkgray", "green", "gray", "lightgray", "magenta", "orange", "pink", "red", "white", "yellow"};
            for (int i = 0; i < poscol.length; i++) {
                if (c.toLowerCase().equals(poscol[i])) {
                    if (i == 3) {
                        set = Color.darkGray;
                    }
                    else if (i == 6) {
                        set = Color.lightGray;
                    }
                    else if (i == 0) {
                        set = Color.black;
                    }
                    else if (i == 1) {
                        set = Color.blue;
                    }
                    else if (i == 2) {
                        set = Color.cyan;
                    }
                    else if (i == 4) {
                        set = Color.green;
                    }
                    else if (i == 5) {
                        set = Color.gray;
                    }
                    else if (i == 7) {
                        set = Color.magenta;
                    }
                    else if (i == 8) {
                        set = Color.orange;
                    }
                    else if (i == 9) {
                        set = Color.pink;
                    }
                    else if (i == 10) {
                        set = Color.red;
                    }
                    else if (i == 11) {
                        set = Color.white;
                    }
                    else {
                        set = Color.yellow;
                    }
                }
            }
        }
        
        
        
    }
    
    public void updates(Graphics window) {
        paint(window);
    }
    
    public void paint(Graphics window) {
        if (background) {
            window.fillRect(0, 0, 1600, 801);
        }
        
        for (int i = 0; i < coord.size(); i++) {
            int x1 = coord.get(i).getX1();
            int y1 = coord.get(i).getY1();
            
            if (x1 < coord.get(i).getX2()) {
                coord.get(i).setX1(1);
            }
            else if (x1 > coord.get(i).getX2()) {
                coord.get(i).setX1(-1);
            }
            
            if (y1 < coord.get(i).getY2()) {
                coord.get(i).setY1(1);
            }
            else if (y1 > coord.get(i).getY2()) {
                coord.get(i).setY1(-1);
            }
            
            if (x1 == coord.get(i).getX2() && y1 == coord.get(i).getY2() && !bouncy) {
                coord.get(i).setX2();
                coord.get(i).setY2();
            }
            
            if (x1 == coord.get(i).getX2() && bouncy) {
                coord.get(i).setX2();
            }
            
            if (y1 == coord.get(i).getY2() && bouncy) {
                coord.get(i).setY2();
            }
        }
        
        if (gradient) {
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
            
            if (changegrad) {
                int x = (int)(Math.random() * 999);
                if (x == 0) {
                    r = (int)(Math.random() * 225);
                    g = (int)(Math.random() * 225);
                    b = (int)(Math.random() * 225);
                }
            }
            window.setColor(new Color(r, g, b));
        }
        else if (same) {
            window.setColor(set);
        }
        else if (random) {
            window.setColor(new Color((int)(Math.random() * 225), (int)(Math.random() * 225), (int)(Math.random() * 225)));
        }
        
        for (int i = 0; i < coord.size() - 1; i++) {
           window.drawLine(coord.get(i).getX1(), coord.get(i).getY1(), coord.get(i + 1).getX1(), coord.get(i + 1).getY1());
        }
        if (coord.size() > 0) {
            window.drawLine(coord.get(coord.size() - 1).getX1(), coord.get(coord.size() - 1).getY1(), coord.get(0).getX1(), coord.get(0).getY1());
        }
        repaint();
    }
    
}
