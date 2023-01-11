
/**
 * Write a description of class Window here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
    import java.awt.*;
    import java.util.*;

    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JComponent;
    
public class Window extends JComponent
{
    private Color myColor;
    private int[] xPositions = {95,105, 110, 90};
    private int[] yPositions= {45, 45, 70, 70};
    //array/list
    // instance variables - replace the example below with your own
    public Window(Color userColor){
        myColor = userColor;
    }
    
    public void paintComponent(Graphics g) //required
    {
        Graphics2D g2 = (Graphics2D) g;
        
        // invoke the draw method 
        // ...
        draw(g2);
        
        
    }
    
    public void draw(Graphics2D page){
        page.setColor(myColor);
        page.fillPolygon(xPositions, yPositions, xPositions.length);
    
    
    }

}
