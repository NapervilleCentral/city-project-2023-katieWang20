import java.awt.*;
    import java.util.*;
    
    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JComponent;
    
public class Building extends JComponent implements Runnable
{
    private int x, y, w, h;
    private Color color, initColor, nighColor;

    public Building(int x, int y, int w,int h, Color initColor, Color nighColor){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.color = initColor;
        this.initColor = initColor;
        this.nighColor = nighColor;
        
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
        page.fillRect(x, y, w, h); 
        
    
    }
    
    public void run(){
        int running = 0;
        while (true){
            if (running % 2 == 0){
                
                color = nighColor;
                
        
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