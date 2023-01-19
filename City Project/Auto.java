
/**
 * Write a description of class Autos here.
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
    
public class Auto extends JComponent implements Runnable
{

    private Color color;
    private int x, y, w, h;
    private int choice;
    private Random rand = new Random();
    public Auto(int x, int y, Color color, int choice)
    {
        this.x = x;
        this.y = y;
        this.w = 25;
        this.h = 15;
        this.color = color;
        this.choice = choice;
    }
    
     public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        // invoke the draw method
        // ...
        draw(g2);
        

    }
    
    public void draw(Graphics2D page){
        page.setColor(color);
        if (choice == 1){
            
            page.fillRect(x, y, w, h);
            page.fillRect(x-5, y+5, w+10, h-5);
            page.setColor(Color.black);
            page.fillOval(x-7, y+8, 10, 10);
            page.fillOval(x+19, y +8, 10, 10);
        }else if (choice == 2){
            
            w = 40;
            h = 25;
            page.fillRect(x, y, w, h);
            
            page.setColor(Color.black);
            page.fillOval(x-17, y+18, 10, 10);
            page.fillOval(x+35, y +18, 10, 10);
        
        }
    
    }
    
    public void run(){
        int running = 0;
        int randSpeed = rand.nextInt(10)+5;
        
        while (true){
            if (running % 2 == 0 ){
                x = x+randSpeed;
                if (x == 600){
                    x  = 0;
                }
            }else{
                ;
            }
            
            
            try{
                Thread.sleep(17);
            }catch(Exception e){
                System.out.println("A");
            }
            running ++;
            
        }

            
    
    }
}
