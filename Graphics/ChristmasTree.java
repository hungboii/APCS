import javax.swing.*;
import java.awt.*; 

public class ChristmasTree
{  
    public static void main (String[] args)
    {
        JFrame win;
        Container contentPane;
        Graphics g;
      
        win = new JFrame("bruh");
        win.setSize(400, 500);
        win.setLocation(800, 40);
        win.setVisible(true);
      
        contentPane = win.getContentPane();
        g = contentPane.getGraphics();
      
        try {Thread.sleep(400);} catch (Exception e) {}
          
        g.setColor(new Color(135, 206, 250)); //background
        g.fillRect(0, 0, 400, 500);

        drawTree(win, contentPane, g);

        int i = 1;
        while(i > 0)
        {
            if(i % 90 >= 0 && i % 90 < 30)
                g.setColor(new Color(218,112,214));
            if(i % 90 >= 30 && i % 90 < 60)
                g.setColor(Color.RED);
            if(i % 90 >= 60)
                g.setColor(Color.BLUE);

            g.fillOval(195, 140, 10, 10);

            g.fillOval(195, 205, 10, 10);
            g.fillOval(245, 205, 10, 10);
            g.fillOval(145, 205, 10, 10);

            g.fillOval(195, 280, 10, 10);
            g.fillOval(130, 280, 10, 10);
            g.fillOval(260, 280, 10, 10);

            g.fillOval(195, 355, 10, 10);
            g.fillOval(115, 355, 10, 10);
            g.fillOval(275, 355, 10, 10);

            g.setColor(Color.WHITE); //snow
            g.fillOval((int)(Math.random() * 400), (int)(Math.random() * 500), 4, 4);

            if(i % 500 == 0) 
            {
                g.setColor(new Color(135, 206, 250)); 
                g.fillRect(0, 0, 400, 500); //get rid of the snow by wiping the screen clean 
                drawTree(win, contentPane, g); //redraw tree after wiping screen
            }
            try {Thread.sleep(10);} catch (Exception e) {}
            i++;
        }
    }
    public static void drawTree(JFrame win, Container contentPane, Graphics g)
    {
        g.setColor(new Color(34, 139, 34));
                        
        Polygon topTree = new Polygon();
        topTree.addPoint(200, 100);
        topTree.addPoint(125, 225);
        topTree.addPoint(275, 225);
        g.fillPolygon(topTree);

        Polygon middle = new Polygon();
        middle.addPoint(145, 225);
        middle.addPoint(255, 225);
        middle.addPoint(300, 300);
        middle.addPoint(100, 300);
        g.fillPolygon(middle);

        Polygon bottom = new Polygon();
        bottom.addPoint(120, 300);
        bottom.addPoint(280, 300);
        bottom.addPoint(325, 375);
        bottom.addPoint(75, 375);
        g.fillPolygon(bottom);

        g.setColor(new Color(150, 75, 0));

        g.fillRect(175, 375, 50, 75); //base/stump of tree  

        g.setColor(Color.WHITE);

        g.fillRect(0, 450, 400, 25); //snow on ground
        
        g.setColor(Color.YELLOW);

        int[] x = {200, 215, 210, 225, 205, 200, 195, 175, 190, 185};
        int[] y = {95, 105, 90, 80, 80, 64, 80, 80, 90, 105};
        g.fillPolygon(x, y, 10); //star on top
   }
}