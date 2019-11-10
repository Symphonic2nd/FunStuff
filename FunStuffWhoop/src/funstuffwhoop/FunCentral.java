/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funstuffwhoop;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;
import javax.imageio.ImageIO;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
/**
 *
 * @author K1342960
 */
public class FunCentral extends JPanel{
    private FractalGasket yippee;
    private int size;
    
    public FunCentral() {
        size = 700;
        yippee = new FractalGasket(size);
    }
    
    public void update(Graphics window) {
        paint(window);
    }
    
    public void paint(Graphics window) {
        yippee.fracture(window, 400, size/2 + 400, size + 400, 10 + (int)(size*0.87), 10, 10 + (int)(size*0.87));
    }
}
