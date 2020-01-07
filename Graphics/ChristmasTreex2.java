import javax.swing.*;
import java.awt.*; 

public class ChristmasTreex2
{  
    public static void main (String[] args)
    {
        JFrame win;
        Container contentPane;
        Graphics g;
      
        win = new JFrame("bruh");
        win.setSize(750, 900);
        win.setLocation(600, 75);
        win.setVisible(true);
      
        contentPane = win.getContentPane();
        g = contentPane.getGraphics();
      
        try {Thread.sleep(400);} catch (Exception e) {}
          
        g.setColor(new Color(135, 206, 250)); //background
        g.fillRect(0, 0, 750, 900);

        drawTree(win, contentPane, g);

        int i = 1;
        while(i > 0)
        {
            if(i % 135 >= 0 && i % 135 < 45)
                g.setColor(new Color(218,112,214));
            if(i % 135 >= 45 && i % 135 < 90)
                g.setColor(Color.RED);
            if(i % 135 >= 90)
                g.setColor(Color.BLUE);

            g.fillOval(367, 285, 15, 15);

            g.fillOval(367, 382, 15, 15);
            g.fillOval(442, 382, 15, 15);
            g.fillOval(292, 382, 15, 15);

            g.fillOval(367, 525, 15, 15);
            g.fillOval(262, 525, 15, 15);
            g.fillOval(472, 525, 15, 15);

            g.fillOval(367, 675, 15, 15);
            g.fillOval(225, 675, 15, 15);
            g.fillOval(510, 675, 15, 15);

            g.setColor(Color.WHITE); //snow
            g.fillOval((int)(Math.random() * 750), (int)(Math.random() * 900), 6, 6);

            if(i % 750 == 0) 
            {
                g.setColor(new Color(135, 206, 250)); 
                g.fillRect(0, 0, 750, 900); //get rid of the snow by wiping the screen clean 
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
        topTree.addPoint(375, 225);
        topTree.addPoint(262, 412);
        topTree.addPoint(487, 412);
        g.fillPolygon(topTree);

        Polygon middle = new Polygon();
        middle.addPoint(292, 412);
        middle.addPoint(457, 412);
        middle.addPoint(525, 562);
        middle.addPoint(225, 562);
        g.fillPolygon(middle);

        Polygon bottom = new Polygon();
        bottom.addPoint(255, 562);
        bottom.addPoint(495, 562);
        bottom.addPoint(562, 712);
        bottom.addPoint(187, 712);
        g.fillPolygon(bottom);

        g.setColor(new Color(150, 75, 0));

        g.fillRect(337, 712, 75, 112); //base/stump of tree  

        g.setColor(Color.WHITE);

        g.fillRect(0, 825, 750, 37); //snow on ground
        
        g.setColor(Color.YELLOW);

        int[] x = {375, 397, 390, 412, 382, 375, 367, 337, 360, 352};
        int[] y = {217, 232, 210, 195, 195, 171, 195, 195, 210, 232};
        g.fillPolygon(x, y, 10); //star on top
   }
}
