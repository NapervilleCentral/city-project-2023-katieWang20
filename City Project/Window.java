
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
    import java.util.Random;
    // creates windows
    
public class Window extends JComponent implements Runnable
{
    private Color myColor;
    private int w, h;
    private Random rand = new Random();
    private int xStart, xEnd, yStart, yEnd;
    private int xGap, yGap;
    //array/list
    // instance variables - replace the example below with your own
    
    public Window(int xStart, int xEnd, int yStart, int yEnd, int w, int h, int xGap, int yGap, Color userColor){
        myColor = userColor;
        this.xStart = xStart;
        this.yStart = yStart;
        this.xEnd = xEnd;
        this.yEnd = yEnd;
        this.w = w;
        this.h = h;
        this.xGap = xGap;
        this.yGap = yGap;
        
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
        //page.fillRect(x, y, 10, 10);
        //xstart = 155, x end  = 230, y start = 50, y end = 185
        for (int x = xStart, y = yStart; y <= yEnd; ) {
            page.fillRect(x, y, w, h);
            x+=xGap;
            // gaps in between windows
            
            if (x >=  xEnd){
                y+=yGap;
                x = xStart;
            }
            
            //w
            //Thread t4 = new Thread(window);
            //t4.start();
          
        }
            
    }
    
    public void run(){
        int running = 0;
        while (true){
            if (running % 2 == 0 )
                myColor = Color.yellow;
                
            else
                myColor = new Color (200, 200, 200);
                
            try{
                Thread.sleep(5000);
            }catch(Exception e){
                System.out.println(myColor.black);
            }
            running ++;
        }
        
       
    }

}
