
/**
 * Write a description of class Sign here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.awt.*;
import java.util.*;
    
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
    
public class Sign extends JComponent implements Runnable
{
    private String word;
    private Color color, initColor, finColor;
    int x, y;
    int size;
    // instance variables - replace the example below with your own
    public Sign(String word,Color initColor, Color finColor, int size, int x, int y){
        this.word = word;
        color = initColor;
        this.initColor = initColor;
        this.finColor = finColor;
        this.x = x;
        this.y = y;
        this.size = size;
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        // invoke the draw method
        // ...
        draw(g2);
        

    }
    
    public void draw(Graphics2D page){
        Font font = new Font ("Neoncity", 1, size);
        page.setFont(font);
        page.setColor(color);
        page.drawString(word, x, y); 
        
    
    }
    
    public void run(){
       int running = 0;
       while (true){
            if (running % 2 == 0){
                
                color = finColor;
                
        
            }else{
                color = initColor;
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
