//********************************************************************
//  LineUp.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of a graphical object.
// this is my City that "holds" the buildings, trees, cars, etc
// draws then calls refresh to change display (animate)
//********************************************************************

    import java.awt.*;
    import java.util.*;

    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JComponent;

public class LineUp extends JComponent //implements Runnable
{
   //private final int APPLET_WIDTH = 400;    //Size constants
   //private final int APPLET_HEIGHT = 150;
   private final int HEIGHT_MIN = 100;
   private final int VARIANCE = 45;
   Random generator = new Random();
   //Graphics page;
   // stickFigure = building
   
   //private StickFigure2 figure1 = new StickFigure2(100,150,Color.red,120);
   private StickFigure figure1,figure2, figure3, figure4;
   private Floor ground;
   private int running = 0;
   private Window myImage;
   
   //-----------------------------------------------------------------
   //  Creates several stick figures with varying characteristics.
   //-----------------------------------------------------------------
   public LineUp () //init in applet is like constructor; runs only once
   {                   //Different than start.
      int h1,h2,h3,h4;  // heights of stick figures

      h1 = HEIGHT_MIN + generator.nextInt(VARIANCE);
      h2 = HEIGHT_MIN + generator.nextInt(VARIANCE);
      h3 = HEIGHT_MIN + generator.nextInt(VARIANCE);
      h4 = HEIGHT_MIN + generator.nextInt(VARIANCE);

      //0,0 is upper left
      // +x moves object to right, +y moves object down
      
      figure1 = new StickFigure (140, 150, Color.red, h1);
      //x, y, color, height
      //(0,0) coordinate starts in the top left corner
      // coordinates push it around
      
      figure2 = new StickFigure(150, 150, Color.green, h2);
      figure3 = new StickFigure(200, 250, Color.cyan, h3);
      figure4 = new StickFigure(250, 150, Color.yellow, h4);
    
      myImage = new Window(200, 100, Color.yellow);
      
      
      
      ground = new Floor();

      Thread t1 = new Thread(ground);
      t1.start();
      Thread t2 = new Thread(figure2);
      t2.start();
      Thread t3 = new Thread(figure3);
      t3.start();
      Thread t4 = new Thread(myImage);
      t4.start();
    

      //setBackground (Color.black); //sets the color of background
      //setSize (APPLET_WIDTH, APPLET_HEIGHT); //Sets up applet window

      //figure2.draw(page);


   }

   //-----------------------------------------------------------------
   //  Paints the stick figures on the applet.
   //-----------------------------------------------------------------
   public void paintComponent(Graphics g)
    {
        Graphics2D page = (Graphics2D) g;
       //page = this.page;
      ground.draw(page);
      figure1.draw (page); //draw the buildings on top of the background
      figure2.draw (page);
      figure3.draw (page);
      figure4.draw (page);
      //ground.draw(page);
      myImage.draw(page);

      //Thread t1 = new Thread(ground);
      //t1.start();

      /*
      int newHeight = HEIGHT_MIN + generator.nextInt(VARIANCE);
      figure1.setHeight(newHeight);
      newHeight = HEIGHT_MIN + generator.nextInt(VARIANCE);
      figure2.setHeight(newHeight);
      newHeight = HEIGHT_MIN + generator.nextInt(VARIANCE);
      figure3.setHeight(newHeight);
      newHeight = HEIGHT_MIN + generator.nextInt(VARIANCE);
      figure4.setHeight(newHeight);
      */
      //try{
          //pause program for quarter-sec (in miliseconds)
          //Thread.sleep(250);
        //}
      //catch(InterruptedException e){}

      //figure1.draw(page);

      //repaint(); //IMPORTANT LINE
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
