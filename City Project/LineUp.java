
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
    private Window window, hotelWindow, waffleWindow, theaterWindow, window2;
    private Sign theaterSign, hotelSign, waffleSign;
    
    private MoonAndSun ball;
    private Auto car, car2, car3;
    
    public LineUp(){
        road = new Background(0, 210, 800, 50, Color.gray);
        greenGround = new Background(0, 180, 800, 100, new Color(0, 100 , 0));
        
        build1 = new Building(150, 45, 80, 150, Color.darkGray, Color.black); 
        build2 = new Building(350, 10, 90, 180, Color.darkGray, Color.black); 
        window2 = new Window(360, 400, 35, 140, 40, 60, 25, 80, new Color(255,58,147)); 
        
        hotel = new Building (20, 120, 150, 80, Color.gray, Color.darkGray); 
        theater = new Building (400, 120, 100, 80, new Color(193, 154, 107), new Color (20, 15, 6));
        theaterSign = new Sign("THEATER", Color.black, new Color(255, 95, 31),20, 405, 140);
        theaterWindow = new Window( 405,  480,   165,  200,  25, 20, 32, 60, Color.orange);
        
        waffles = new Building(220,130, 100, 70, new Color(235, 221, 131), new Color (36, 34, 21));
        waffleSign = new Sign("WAFFLES", Color.black, new Color(224,231,34), 18, 227, 145);
        
        car3 = new Auto(0, 240, Color.black, 0);

        
        //window = new Window(155, 50, Color.yellow);
        
        // the waffle house has found its new host
        //                  x start, x end, y start, y end, woidth, height, x gap, y gap, color
        window = new Window(  155,   230,    50,     185,     10,     10,    15,   20,     Color.yellow);
        hotelWindow = new Window (30, 155,   130,      185,    10,     10,    20,   25,     Color.yellow);            
        //x+=15;
        waffleWindow = new Window (230, 320, 160, 170,          30, 35,         50,  60, Color.orange); 
        ball = new MoonAndSun();
        hotelSign = new Sign("HOTEL", Color.black, new Color(255, 16, 240),  35, 35, 120);
        
        
        
        Thread t0 = new Thread(hotelSign);
        t0.start();
        
        Thread t0o5 = new Thread (window2);
        t0o5.start();
        
        Thread t1 = new Thread(window);
        t1.start();
        
        Thread t1o5 = new Thread(hotelWindow);
        t1o5.start();
        
       
        
        //car = new Auto (0, 210, 15, 10, Color.blue );
        car = new Auto(0, 200, Color.blue, 1);
        Thread t2 = new Thread(car);
        t2.start();
        
        car2 = new Auto(0, 235, Color.red, 0);
       
        Thread t3 = new Thread (car2);
        t3.start();
        
        Thread t3o5 = new Thread (car3);
        t3o5.start();
        
        sky = new Sky ();
        Thread t4 = new Thread(sky);
        t4.start();
        
         Thread threadBall = new Thread(ball);
        threadBall.start();
        
        Thread t5 = new Thread(hotel);
        t5.start();
        
        Thread t6 = new Thread(theater);
        t6.start();
        
        Thread t7 = new Thread(hotelWindow);
        t7.start();
        
        Thread t8 = new Thread(theaterSign);
        t8.start();
        
        Thread t9 = new Thread(build1);
        t9.start();
        
        Thread t10 = new Thread(build2);
        t10.start();
        
        Thread t11 = new Thread(waffles);
        t11.start();
        
        Thread t12 = new Thread(waffleSign);
        t12.start();
        
        Thread t13 = new Thread(waffleWindow);
        t13.start();
        
        Thread t14 = new Thread(theaterWindow);
        t14.start();
    }
    
    public void paintComponent (Graphics g){
        Graphics2D page = (Graphics2D) g;
        
        sky.draw(page);
        ball.draw(page);
        road.draw(page);
        greenGround.draw(page);
        
        road.draw(page);
        
        build1.draw(page);
        build2.draw(page);
        window2.draw(page);
        
        theater.draw(page);
        theaterSign.draw(page); 
        theaterWindow.draw(page);
        
        window.draw(page);
        for (int x = 0; x <= 800; x+=80){
            roadLines = new Background (x, 235, 10, 5, Color.yellow);
            roadLines.draw(page);
        }
        
        hotel.draw(page);
        hotelSign.draw(page);
        hotelWindow.draw(page);
        
       waffles.draw(page);
        waffleSign.draw(page);
        waffleWindow.draw(page);
        
        car.draw(page);
        
        
        car2.draw(page);
        car3.draw(page);
        //t4.start();
        
        
         
        
        
        //window.draw(page);
      
        
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
