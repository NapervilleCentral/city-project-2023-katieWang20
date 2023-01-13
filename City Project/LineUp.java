
/**
 * Write a description of class LineUp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

        import java.awt.*;
    import java.util.*;

    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JComponent;

public class LineUp extends JComponent
{
    // instance variables - replace the example below with your own
    private Background road, greenGround, sky, roadLines;
    private Building hotel, build2, build3;
    
    public LineUp(){
        road = new Background(0, 210, 800, 50, Color.gray);
        greenGround = new Background(0, 180, 800, 100, new Color(0, 100 , 0));
        sky = new Background (0, 0, 800, 800, new Color(137, 207, 240));
    
        hotel = new Building (20, 120, 150, 80, Color.darkGray); 
    }
    
    public void paintComponent (Graphics g){
        Graphics2D page = (Graphics2D) g;
        
        sky.draw(page);
        road.draw(page);
        greenGround.draw(page);
        road.draw(page);
        hotel.draw(page);
        for (int x = 0; x <= 800; x+=80){
            roadLines = new Background (x, 235, 10, 5, Color.yellow);
            roadLines.draw(page);
        }
        
    }
        
    
    
}
