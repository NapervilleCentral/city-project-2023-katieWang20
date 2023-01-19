
/**
 * Write a description of class Sign here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.awt.*;
    import java.util.*;
    
    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JComponent;
    
public class Sign extends JComponent implements Runnable
{
    private String word;
    private Color initColor, finColor;
    int x, y;
    int size;
    // instance variables - replace the example below with your own
    public Sign(String word,Color initColor, Color finColor, int size, int x, int y){
        this.word = word;
        this.initColor = initColor;
        this.finColor = finColor;
        this.x = x;
        this.y = y;
        this.size = size;
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        // invoke the draw method
        // ...
        draw(g2);
        

    }
    
    public void draw(Graphics2D page){
        Font font = new Font ("Neoncity", 1, size);
        page.setFont(font);
        page.setColor(initColor);
        page.drawString(word, x, y); 
        
    
    }
    
    public void run(){
       
        
        
    }
    
}
