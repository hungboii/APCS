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
        win.setSize(600, 720);
        win.setLocation(480, 60);
        win.setVisible(true);
      
        contentPane = win.getContentPane();
        g = contentPane.getGraphics();
      
        try {Thread.sleep(400);} catch (Exception e) {}
          
        g.setColor(new Color(135, 206, 250)); //background
        g.fillRect(0, 0, 600, 720);

        drawTree(win, contentPane, g);

        int i = 1;
        while(i > 0)
        {
            if(i % 108 >= 0 && i % 108 < 36)
                g.setColor(new Color(218,112,214));
            if(i % 108 >= 36 && i % 108 < 72)
                g.setColor(Color.RED);
            if(i % 108 >= 72)
                g.setColor(Color.BLUE);

            g.fillOval(294, 228, 12, 12);

            g.fillOval(294, 306, 12, 12);
            g.fillOval(354, 306, 12, 12);
            g.fillOval(234, 306, 12, 12);

            g.fillOval(294, 420, 12, 12);
            g.fillOval(210, 420, 12, 12);
            g.fillOval(378, 420, 12, 12);

            g.fillOval(294, 540, 12, 12);
            g.fillOval(180, 540, 12, 12);
            g.fillOval(408, 540, 12, 12);

            g.setColor(Color.WHITE); //snow
            g.fillOval((int)(Math.random() * 600), (int)(Math.random() * 720), 4, 4);

            if(i % 600 == 0) 
            {
                g.setColor(new Color(135, 206, 250)); 
                g.fillRect(0, 0, 600, 720); //get rid of the snow by wiping the screen clean 
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
        topTree.addPoint(300, 180);
        topTree.addPoint(210, 330);
        topTree.addPoint(390, 330);
        g.fillPolygon(topTree);

        Polygon middle = new Polygon();
        middle.addPoint(234, 330);
        middle.addPoint(366, 330);
        middle.addPoint(420, 450);
        middle.addPoint(180, 450);
        g.fillPolygon(middle);

        Polygon bottom = new Polygon();
        bottom.addPoint(204, 450);
        bottom.addPoint(396, 450);
        bottom.addPoint(450, 570);
        bottom.addPoint(150, 570);
        g.fillPolygon(bottom);

        g.setColor(new Color(150, 75, 0));

        g.fillRect(270, 570, 60, 90); //base/stump of tree  

        g.setColor(Color.WHITE);

        g.fillRect(0, 660, 600, 30); //snow on ground
        
        g.setColor(Color.YELLOW);

        int[] x = {300, 318, 312, 330, 306, 300, 294, 270, 288, 282};
        int[] y = {174, 186, 168, 156, 156, 136, 156, 156, 168, 186};
        g.fillPolygon(x, y, 10); //star on top
   }
}
