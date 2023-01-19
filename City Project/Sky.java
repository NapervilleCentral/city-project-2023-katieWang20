
/**
 * Write a description of class Sky here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
    import java.util.*;
    
    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JComponent;
    
public class Sky extends JComponent implements Runnable
{
    // instance variables - replace the example below with your own
    private int x, y, w, h;

    /**
     * Constructor for objects of class Sky
     */
    private Color skyColor;
    public Sky()
    {
        skyColor = new Color(137, 207, 240);
        //nightColor = new Color (1, 0, 21);
        x = 0;
        y = 0;
        w = 600;
        h = 400;
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        // invoke the draw method
        // ...
        draw(g2);
        

    }
    
    public void draw(Graphics2D page){
        page.setColor(skyColor);
        page.fillRect(x, y, w, h); 
        
    
    }
    
    
    public void run(){
        int running = 0;
        
        while (true){
            if (running % 2 == 0){
                
                skyColor = new Color(15, 15, 70);
                
        
            }else{
                skyColor = new Color(137, 207, 240);;
            }
            
            try{
                Thread.sleep(5000);
            }catch(Exception e){
                System.out.println("iuu");
            }
            running++;
        }
    }
}
