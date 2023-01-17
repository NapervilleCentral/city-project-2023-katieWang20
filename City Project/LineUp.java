
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
    private Building hotel, build1, build2, build3, theater;
    private Window window;
    Sign theaterSign;
    String hotelStr = "H O T E L";
    public LineUp(){
        road = new Background(0, 210, 800, 50, Color.gray);
        greenGround = new Background(0, 180, 800, 100, new Color(0, 100 , 0));
        sky = new Background (0, 0, 800, 800, new Color(137, 207, 240));
        build1 = new Building(150, 45, 80, 150, Color.black); 
        hotel = new Building (20, 120, 150, 80, Color.darkGray); 
        theater = new Building (400, 120, 100, 80, new Color(193, 154, 107));
        theaterSign = new Sign("THEATER", Color.black, 405, 140);
        //window = new Window(155, 50, Color.yellow);
        //                  x start, x end, y start, y end, woidth, height, x gap, y gap, color
        window = new Window(  155,   230,    50,     185,     10,     10,    15,   20,     Color.yellow);
        //x+=15;
       
            
        Thread t4 = new Thread(window);
        t4.start();
            
        
    }
    
    public void paintComponent (Graphics g){
        Graphics2D page = (Graphics2D) g;
        
        sky.draw(page);
        road.draw(page);
        greenGround.draw(page);
        road.draw(page);
        build1.draw(page);
        
        
        theater.draw(page);
        theaterSign.draw(page); 

        
        window.draw(page);
        
        
        
        
        //t4.start();
        
        for (int x = 0; x <= 800; x+=80){
            roadLines = new Background (x, 235, 10, 5, Color.yellow);
            roadLines.draw(page);
        }
         
        
        //window.draw(page);
      
        hotel.draw(page);
        
        // use for loop to draw HOTEL sign vertically
    }
        
     public void nextFrame()
   {
       //figure1.setHeight(HEIGHT_MIN + generator.nextInt(VARIANCE));
       //figure2.setHeight(HEIGHT_MIN + generator.nextInt(VARIANCE));
       //figure3.setHeight(HEIGHT_MIN + generator.nextInt(VARIANCE));
       //figure4.setHeight(HEIGHT_MIN + generator.nextInt(VARIANCE));
       //running ++;
       //ground.setX(running);
       //Thread t1 = new Thread(ground);
       //t1.start();
//refreshes canvas
        
       repaint();

   }

   public void run()
   {
    }
    
}
