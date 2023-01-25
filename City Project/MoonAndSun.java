
/**
 * Write a description of class MoonAndSun here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
    import java.util.*;
    import java.util.Random;
    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JComponent;
    
public class MoonAndSun extends JComponent implements Runnable
{
    private int x, y, w, h;
    private Color color;
    // instance variables - replace the example below with your own
    public MoonAndSun(){
        x = 10;
        y = 40;
        w = 30;
        h = 30;
        color = Color.white;
    
        
    }
    
    public void paintComponent(Graphics g) //required
    {
        Graphics2D g2 = (Graphics2D) g;
        
        // invoke the draw method 
        // ...
        draw(g2);
        
        
    }
    
    public void draw (Graphics2D page){
        page.setColor(color);
        page.fillOval(x, y, w, h);
        
        
        
    }
    
    public void run(){
        int running = 0;
        int count = 0;
        while (true){
            x+=2;
            
            if (x >= 610){
                
                
                if (count % 2 ==0)
                    color = Color.yellow;
                else
                    color = Color.white;
                count ++;
                x = 0;
            }else{
            ;
            }
            
            if (running % 2 == 0){
                
                //color = Color.white;
                
                x+=2;
            }else{
                x+=2;
                //color = Color.yellow;;
            }
            
            try{
                //color = Color.white;
                x+=2;
                Thread.sleep(50);
            }catch(Exception e){
                x+=2;
                
                System.out.println("iuu");
            }
            running++;
        }
            
        
    }
    
    
}
