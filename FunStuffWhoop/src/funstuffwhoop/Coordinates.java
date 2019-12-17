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
import java.io.*;
import java.util.*;
import java.awt.*;
public class Coordinates {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    
    public Coordinates() {
        x1 = (int)(Math.random() * 1900);
        y1 = (int)(Math.random() * 1020);
        x2 = (int)(Math.random() * 1900);
        y2 = (int)(Math.random() * 1020);
    }
    
    public int getX1() {
        return x1;
    }
    
    public void setX1(int v) {
        x1 += v;
    }
    
    public int getY1() {
        return y1;
    }
    
    public void setY1(int v) {
        y1 += v;
    }
    
    public int getX2() {
        return x2;
    }
    
    public void setX2() {
        x2 = (int)(Math.random() * 1900);
    }
    
    public int getY2() {
        return y2;
    }
    
    public void setY2() {
        y2 = (int)(Math.random() * 1020);
    }
}
