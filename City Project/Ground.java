
/**
 * Write a description of class Ground here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
    import java.util.*;
    
    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JComponent;
    
public class Ground extends JComponent 
{
    private int x, y, w, h;
    
    public Ground(){
        x = 0;
        y = 200;
        w = 400;
        h = 80;
        
    }
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        // invoke the draw method
        // ...
        draw(g2);


    }
    
    public void draw(Graphics2D page){
        page.setColor(Color.gray);
        page.fillRect(x, y, w, h); 
        
    
    }
    

}
