/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funstuffwhoop;
import java.io.*;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author K1342960
 */
public class FunStuffWhoop extends JFrame{
    public static int WIDTH = 1600;
    public static int HEIGHT = 800;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        new FunStuffWhoop();
    }
    
    public FunStuffWhoop() throws FileNotFoundException {
        super("PointLines");
        setSize(WIDTH, HEIGHT);
        setBackground(Color.BLACK);
        
        //new PointLines( #of points, redraw bckgrnd, color, changing gradient, bouncy, changing size, fill in area)
        PointLines basket = new PointLines(2, false, "gradient", true, true, true, false);
        ((Component) basket).setFocusable(true);
        getContentPane().add(basket);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
        
    }
    
}
