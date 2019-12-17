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
public class Locomotive {
    private int x;
    private int y;
    
    public Locomotive(int one, int two) {
        x = one;
        y = two;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setXY(String d, int change) {
        if (d.equals("x")) {
            x = change;
        }
        else {
            y = change;
        }
    }
}
