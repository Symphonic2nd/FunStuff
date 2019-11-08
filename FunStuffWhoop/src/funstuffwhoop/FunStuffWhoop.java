/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funstuffwhoop;
import javax.swing.JFrame;
import java.awt.Component;
import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
/**
 *
 * @author K1342960
 */
public class FunStuffWhoop extends JFrame{
    public static int WIDTH = 1000;
    public static int HEIGHT = 600;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        new FunStuffWhoop();
    }
    
    public FunStuffWhoop() throws FileNotFoundException {
        super("Yippe!");
        
        setSize(WIDTH, HEIGHT);
        
        FunCentral yippe = new FunCentral();
        
        ((Component) yippe).setFocusable(true);
        getContentPane().add(yippe);
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
}
