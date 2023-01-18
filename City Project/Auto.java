
/**
 * Write a description of class Autos here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
    import java.util.*;
    
    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JComponent;
    
public class Auto extends JComponent
{

    private Color color;
    int x, y, w, h;
    
    public Auto(int x, int y, int w, int h, Color color)
    {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.color = color;
    }
    
     public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        // invoke the draw method
        // ...
        draw(g2);
        

    }
    
    public void draw(Graphics2D page){
        page.setColor(color);
        page.fillRect(x, y, w, h);
        page.setColor(Color.black);
        page.fillOval(x-5, y+1, 10, 10);
        page.fillOval(x+5, y +1, 10, 10);
    
    }
    
    
}
