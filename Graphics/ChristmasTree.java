import javax.swing.*;
import java.awt.*; 

public class ChristmasTree
{  
    public static void main (String[] args)
    {
        JFrame win;
        Container contentPane;
        Graphics g;
      
        win = new JFrame("Christmas Tree");
        win.setSize(400, 500);
        win.setLocation(800, 40);
        win.setVisible(true);
      
        contentPane = win.getContentPane();
        g = contentPane.getGraphics();
      
        try {Thread.sleep(400);} catch (Exception e) {}
          
        g.setColor(new Color(135, 206, 250));
        g.fillRect(0, 0, 400, 500);

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

        int i = 1;
        while(i > 0)
        {
            if(i % 3 == 0)
                g.setColor(Color.WHITE);
            if(i % 3 == 1)
                g.setColor(Color.RED);
            if(i % 3 == 2)
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

            if(i % 5 == 1)
                g.setColor(Color.WHITE);
                g.fillOval(50, 50, 10, 10);
                g.setColor(new Color(135,206,250));
                g.fillOval(50, 100, 10, 10);

            if(i % 5 == 2)
                g.setColor(Color.WHITE);
                g.fillOval(50, 100, 10, 10);
                g.setColor(new Color(135,206,250));
                g.fillOval(50, 200, 10, 10);                
                g.fillOval(50, 50, 10, 10);

            if(i % 5 == 3)
                g.setColor(Color.WHITE);
                g.fillOval(50, 200, 10, 10);
                g.setColor(new Color(135,206,250));
                g.fillOval(50, 300, 10, 10);

            if(i % 5 == 4)
                g.setColor(Color.WHITE);
                g.fillOval(50, 300, 10, 10);
                g.setColor(new Color(135,206,250));
                g.fillOval(50, 440, 10, 10);

            if(i % 5 == 0)
                g.setColor(Color.WHITE);
                g.fillOval(50, 440, 10, 10);

            try {Thread.sleep(400);} catch (Exception e) {}
            i++;
        }
   }
}