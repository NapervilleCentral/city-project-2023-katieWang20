
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
    private Ground ground;

    
    public LineUp(){
        ground = new Ground();
        
    }
    
    public void paintComponent (Graphics g){
        Graphics2D page = (Graphics2D) g;
        ground.draw(page);
            
    }
        
    
    
}
