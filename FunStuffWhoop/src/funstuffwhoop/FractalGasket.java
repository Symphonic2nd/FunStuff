/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funstuffwhoop;
import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author K1342960
 */
public class FractalGasket {
    private int size;
    
    public FractalGasket(int s) {
        size = s;
    }
    
    public static void fracture(Graphics window, int x1, int x2, int x3, int y1, int y2, int y3) {
        int r = (int)(Math.random() * 225);
        int g = (int)(Math.random() * 225);
        int b = (int)(Math.random() * 225);
        Color rand = new Color(r, g, b);
        int xPoints[] = {x1, x2, x3};
        int yPoints[] = {y1, y2, y3};
        window.setColor(rand);
        window.fillPolygon(xPoints, yPoints, 3);
        if (x2 - x1 > 3) {
            fracture(window, ((x2 - x1)/2 + x1), x2, ((x3 - x2)/2 + x2), ((y2 - y1)/2 + y1), y2, ((y2 - y1)/2 + y1) );
            fracture(window, x1, ((x2 - x1)/2 + x1), x2, y1, ((y2 - y1)/2 + y1), y1);
            fracture(window, x2, ((x3 - x2)/2 + x2), x3, y1, ((y2 - y1)/2 + y1), y1);
        }
    }
}
