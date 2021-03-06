/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funstuffwhoop;
import javax.swing.JPanel;
import java.awt.*;
/**
 *
 * @author K1342960
 */
public class FunCentral extends JPanel{
    private FractalGasket fractal;
    private int size;
    private int init;
    private int r, g, b;
    
    public FunCentral() {
        size = 600;
        fractal = new FractalGasket(size);
        init = 0;
        r = 0;
        g = 0;
        b = 0;
        
    }
    
    public void update(Graphics window) {
        paint(window);
    }
    
    public void paint(Graphics window) {
        if (init == 0) {
            window.setColor(new Color(r, g, b));
            window.fillRect(0, 0, 1600, 1000);
            for (int i = 0; i < 160; i++) {
                for (int q = 0; q < 100; q++) {
                    window.setColor(new Color((int)(Math.random() * 225), (int)(Math.random() * 225), (int)(Math.random() * 225)));
                    if (q % 2 == 0) {
                        int fd = (int)(Math.random() * 4) + 1;
                        if (fd == 1) {
                            window.fill3DRect( (i * 10) + 5, q * 10, 5, 5, true);
                        }
                        else if (fd == 2) {
                            window.drawRect(  (i * 10) + 5, q * 10, 5, 5 );
                        }
                        else if (fd == 3) {
                            window.fillOval((i * 10) + 5, q * 10, 5, 5 );
                        }
                        else if (fd == 4) {
                            window.drawOval((i * 10) + 5, q * 10, 5, 5 );
                        }
                    } 
                    else {
                        int fd = (int)(Math.random() * 4) + 1;
                        if (fd == 1) {
                            window.fill3DRect( i * 10, q * 10, 5, 5, true);
                        }
                        else if (fd == 2) {
                            window.drawRect(  (i * 10), q * 10, 5, 5 );
                        }
                        else if (fd == 3) {
                            window.fillOval((i * 10), q * 10, 5, 5 );
                        }
                        else if (fd == 4) {
                            window.drawOval((i * 10), q * 10, 5, 5 );
                        }
                    }
                } 
            }
            fractal.fracture(window, 300, size/2 + 300, size + 300, 10 + (int)((size*0.87)*1.5), 10 + (int)((size*0.87)*.5), 10 + (int)((size*0.87)*1.5));
            fractal.fracture(window, 600, size/2 + 600, size + 600, 10 + (int)((size*0.87)*1.5), 10 + (int)((size*0.87)*.5), 10 + (int)((size*0.87)*1.5));
            fractal.fracture(window, 450, size/2 + 450, size + 450, 10 + (int)(size*0.87), 10, 10 + (int)(size*0.87));
            init++;
        }
        
        int x = (int)(Math.random()*2000);
        if (x == 999 || x == 1999) {
            int change = (int)(Math.random() * (224/3));
            if (x == 1999) {
                window.setColor(Color.BLACK);
                window.fillRect(0, 0, 1600, 1000);
            }
            for (int i = 0; i < 160; i++) {
                for (int q = 0; q < 100; q++) {
                    window.setColor(new Color((int)(Math.random() * 225), (int)(Math.random() * 225), (int)(Math.random() * 225)));
                    if (q % 2 == 0) {
                        int fd = (int)(Math.random() * 4) + 1;
                        if (fd == 1) {
                            window.fill3DRect( (i * 10) + 5, q * 10, 5, 5, true);
                        }
                        else if (fd == 2) {
                            window.drawRect(  (i * 10) + 5, q * 10, 5, 5 );
                        }
                        else if (fd == 3) {
                            window.fillOval((i * 10) + 5, q * 10, 5, 5 );
                        }
                        else if (fd == 4) {
                            window.drawOval((i * 10) + 5, q * 10, 5, 5 );
                        }
                    } 
                    else {
                        int fd = (int)(Math.random() * 4) + 1;
                        if (fd == 1) {
                            window.fill3DRect( i * 10, q * 10, 5, 5, true);
                        }
                        else if (fd == 2) {
                            window.drawRect(  (i * 10), q * 10, 5, 5 );
                        }
                        else if (fd == 3) {
                            window.fillOval((i * 10), q * 10, 5, 5 );
                        }
                        else if (fd == 4) {
                            window.drawOval((i * 10), q * 10, 5, 5 );
                        }
                    }
                } 
            }
            fractal.fracture(window, 300, size/2 + 300, size + 300, 10 + (int)((size*0.87)*1.5), 10 + (int)((size*0.87)*.5), 10 + (int)((size*0.87)*1.5));
            fractal.fracture(window, 600, size/2 + 600, size + 600, 10 + (int)((size*0.87)*1.5), 10 + (int)((size*0.87)*.5), 10 + (int)((size*0.87)*1.5));
            fractal.fracture(window, 450, size/2 + 450, size + 450, 10 + (int)(size*0.87), 10, 10 + (int)(size*0.87));
        }
        repaint();
    }
}
