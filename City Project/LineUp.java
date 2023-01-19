
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
    private Background road, greenGround, roadLines;
    private Sky sky;
    private Building hotel, build1, build2, waffles, theater;
    private Window window, hotelWindow;
    Sign theaterSign, hotelSign;
    
    
    private Auto car, bus;
    
    public LineUp(){
        road = new Background(0, 210, 800, 50, Color.gray);
        greenGround = new Background(0, 180, 800, 100, new Color(0, 100 , 0));
        
        build1 = new Building(150, 45, 80, 150, Color.black); 
        build2 = new Building(350, 10, 90, 180, Color.black); 
        hotel = new Building (20, 120, 150, 80, Color.darkGray); 
        theater = new Building (400, 120, 100, 80, new Color(193, 154, 107));
        theaterSign = new Sign("THEATER", Color.black, new Color(210, 39, 48),20, 405, 140);
        //window = new Window(155, 50, Color.yellow);
        //                  x start, x end, y start, y end, woidth, height, x gap, y gap, color
        window = new Window(  155,   230,    50,     185,     10,     10,    15,   20,     Color.yellow);
        hotelWindow = new Window (30, 155,   130,      185,    10,     10,    20,   25,     Color.yellow);            
        //x+=15;
        
        
        hotelSign = new Sign("HOTEL", Color.black, new Color(255, 16, 240),  35, 35, 120);
        Thread t0 = new Thread(hotelSign);
        t0.start();
        
        Thread t1 = new Thread(window);
        t1.start();
        
        
        
        //car = new Auto (0, 210, 15, 10, Color.blue );
        car = new Auto(0, 210, Color.blue,1);
        Thread t2 = new Thread(car);
        t2.start();
        
        bus = new Auto (0, 220, Color.red, 2);
        Thread t3 = new Thread(bus);
        t3.start();
        
        sky = new Sky ();
        Thread t4 = new Thread(sky);
        t4.start();
        
        Thread t5 = new Thread(hotelWindow);
        t5.start();
        
    }
    
    public void paintComponent (Graphics g){
        Graphics2D page = (Graphics2D) g;
        
        sky.draw(page);
        road.draw(page);
        greenGround.draw(page);
        road.draw(page);
        build1.draw(page);
        build2.draw(page);
        
        theater.draw(page);
        theaterSign.draw(page); 

        
        window.draw(page);
        
        car.draw(page);
        
        
        bus.draw(page);
        
        //t4.start();
        
        for (int x = 0; x <= 800; x+=80){
            roadLines = new Background (x, 235, 10, 5, Color.yellow);
            roadLines.draw(page);
        }
         
        
        
        //window.draw(page);
      
        hotel.draw(page);
        hotelSign.draw(page);
        hotelWindow.draw(page);
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
