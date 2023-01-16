
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
    
public class Sign extends JComponent
{
    private String word;
    private Color color;
    int x, y;
    // instance variables - replace the example below with your own
    public Sign(String word,Color color, int x, int y){
        this.word = word;
        this.color = color;
        this.x = x;
        this.y = y;
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        // invoke the draw method
        // ...
        draw(g2);
        

    }
    
    public void draw(Graphics2D page){
        Font font = new Font ("Neoncity", 1, 20);
        page.setFont(font);
        page.setColor(color);
        page.drawString(word, x, y); 
        
    
    }
}
