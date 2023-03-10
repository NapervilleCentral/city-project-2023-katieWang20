import javax.swing.JFrame;
import java.awt.*;

 import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JComponent;
    
/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * Katie Wang
 * 
 */
public class CityscapeViewer
{
    // the cityscape will be animated for 60 seconds
    static final int ANIMATION_TIME_IN_SECONDS = 180;
   
    /**
     * main method for the program which creates and configures the frame for the program
     * 
     * @param args  not used
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        // create and configure the frame (window) for the program
        JFrame frame = new JFrame();
        
        frame.setSize(600 /* x */, 300 /* y */);
        frame.setTitle("Cityscape");
        frame.setBackground(Color.red);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        int h1 = 100 + (int)(Math.random()*45);
        int h2 = 100 + (int)(Math.random()*45);
        
        // a frame contains a single component; create the Cityscape component and add it to the frame
        Cityscape component = new Cityscape();
        
        
        
        frame.add(component);
        
        
        
        // make the frame visible which will result in the paintComponent method being invoked on the
        //  component.
        frame.setVisible(true);
        
        LineUp row = new LineUp();
        
        frame.add(row);
        // animate the cityscape
        
        for( int seconds = 0; seconds < ANIMATION_TIME_IN_SECONDS; seconds++ )
        {
            row.nextFrame();
            
            Thread.sleep( 100 );
        }
        /**/
        
    }
    

}
