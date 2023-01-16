
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
    // creates windows
    
public class Window extends JComponent implements Runnable
{
    private Color myColor;
    private int x, y;
    //array/list
    // instance variables - replace the example below with your own
    public Window(int x, int y, Color userColor){
        myColor = userColor;
        this.x = x;
        this.y = y;
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
        page.fillRect(x, y, 10, 10);
    
            
    }
    
    public void run(){
        int running = 0;
        while (true){
            if (running % 2 == 0 )
                myColor = new Color (200, 200, 200);
            else
                myColor = Color.yellow;
                
            try{
                Thread.sleep(17);
            }catch(Exception e){
                System.out.println(myColor.black);
            }
            running ++;
        }
        
       
    }

}
