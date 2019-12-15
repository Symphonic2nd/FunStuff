/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funstuffwhoop;
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
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
        
        PointLines basket = new PointLines(2, false, "gradient", true, true);
        
        getContentPane().add(basket);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
        
    }
    
}
