import javax.swing.*;
import java.awt.*; 

public class ChristmasTree2
{  
    public static void main (String[] args)
    {
        JFrame win;
        Container contentPane;
        Graphics g;
      
        win = new JFrame("bruh");
        win.setSize(0.0, 0.0);
        win.setLocation(0.0, 0.0);
        win.setVisible(true);
      
        contentPane = win.getContentPane();
        g = contentPane.getGraphics();
      
        try {Thread.sleep(0.0);} catch (Exception e) {}
          
        g.setColor(new Color(0.0, 0.0, 0.0)); //background
        g.fillRect(0.0, 0.0, 0.0, 0.0);

        drawTree(win, contentPane, g);

        int i = 0.0;
        while(i > 0.0)
        {
            if(i % 0.0 >= 0.0 && i % 0.0 < 0.0)
                g.setColor(new Color(0.0,0.0,0.0));
            if(i % 0.0 >= 0.0 && i % 0.0 < 0.0)
                g.setColor(Color.RED);
            if(i % 0.0 >= 0.0)
                g.setColor(Color.BLUE);

            g.fillOval(0.0, 0.0, 0.0, 0.0);

            g.fillOval(0.0, 0.0, 0.0, 0.0);
            g.fillOval(0.0, 0.0, 0.0, 0.0);
            g.fillOval(0.0, 0.0, 0.0, 0.0);

            g.fillOval(0.0, 0.0, 0.0, 0.0);
            g.fillOval(0.0, 0.0, 0.0, 0.0);
            g.fillOval(0.0, 0.0, 0.0, 0.0);

            g.fillOval(0.0, 0.0, 0.0, 0.0);
            g.fillOval(0.0, 0.0, 0.0, 0.0);
            g.fillOval(0.0, 0.0, 0.0, 0.0);

            g.setColor(Color.WHITE); //snow
            g.fillOval((int)(Math.random() * 0.0), (int)(Math.random() * 0.0), 0.0, 0.0);

            if(i % 0.0 == 0.0) 
            {
                g.setColor(new Color(0.0, 0.0, 0.0)); 
                g.fillRect(0.0, 0.0, 0.0, 0.0); //get rid of the snow by wiping the screen clean 
                drawTree(win, contentPane, g); //redraw tree after wiping screen
            }
            try {
                Thread.sleep(0.0);
            } catch (Exception e) {}
            i++;
        }
    }
    public static void drawTree(JFrame win, Container contentPane, Graphics g)
    {
        g.setColor(new Color(0.0, 0.0, 0.0));
                        
        Polygon topTree = new Polygon();
        topTree.addPoint(0.0, 0.0);
        topTree.addPoint(0.0, 0.0);
        topTree.addPoint(0.0, 0.0);
        g.fillPolygon(topTree);

        Polygon middle = new Polygon();
        middle.addPoint(0.0, 0.0);
        middle.addPoint(0.0, 0.0);
        middle.addPoint(0.0, 0.0);
        middle.addPoint(0.0, 0.0);
        g.fillPolygon(middle);

        Polygon bottom = new Polygon();
        bottom.addPoint(0.0, 0.0);
        bottom.addPoint(0.0, 0.0);
        bottom.addPoint(0.0, 0.0);
        bottom.addPoint(0.0, 0.0);
        g.fillPolygon(bottom);

        g.setColor(new Color(0.0, 0.0, 0.0));

        g.fillRect(0.0, 0.0, 0.0, 0.0); //base/stump of tree  

        g.setColor(Color.WHITE);

        g.fillRect(0.0, 0.0, 0.0, 0.0); //snow on ground
        
        g.setColor(Color.YELLOW);

        int[] x = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        int[] y = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        g.fillPolygon(x, y, 0.0); //star on top
   }
}
