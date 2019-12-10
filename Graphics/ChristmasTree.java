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
        win.setSize(500, 600);
        win.setLocation(400, 50);
        win.setVisible(true);
      
        contentPane = win.getContentPane();
        g = contentPane.getGraphics();
      
        try {Thread.sleep(400);} catch (Exception e) {}
          
        g.setColor(new Color(135, 206, 250)); //background
        g.fillRect(0, 0, 500, 600);

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

            g.fillOval(245, 190, 10, 10);

            g.fillOval(245, 255, 10, 10);
            g.fillOval(295, 255, 10, 10);
            g.fillOval(195, 255, 10, 10);

            g.fillOval(245, 350, 10, 10);
            g.fillOval(175, 350, 10, 10);
            g.fillOval(315, 350, 10, 10);

            g.fillOval(245, 450, 10, 10);
            g.fillOval(150, 450, 10, 10);
            g.fillOval(340, 450, 10, 10);

            g.setColor(Color.WHITE); //snow
            g.fillOval((int)(Math.random() * 500), (int)(Math.random() * 600), 4, 4);

            if(i % 500 == 0) 
            {
                g.setColor(new Color(135, 206, 250)); 
                g.fillRect(0, 0, 500, 600); //get rid of the snow by wiping the screen clean 
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
        topTree.addPoint(250, 150);
        topTree.addPoint(175, 275);
        topTree.addPoint(325, 275);
        g.fillPolygon(topTree);

        Polygon middle = new Polygon();
        middle.addPoint(195, 275);
        middle.addPoint(305, 275);
        middle.addPoint(350, 375);
        middle.addPoint(150, 375);
        g.fillPolygon(middle);

        Polygon bottom = new Polygon();
        bottom.addPoint(170, 375);
        bottom.addPoint(330, 375);
        bottom.addPoint(375, 475);
        bottom.addPoint(125, 475);
        g.fillPolygon(bottom);

        g.setColor(new Color(150, 75, 0));

        g.fillRect(225, 475, 50, 75); //base/stump of tree  

        g.setColor(Color.WHITE);

        g.fillRect(0, 550, 500, 25); //snow on ground
        
        g.setColor(Color.YELLOW);

        int[] x = {250, 265, 260, 275, 255, 250, 245, 225, 240, 235};
        int[] y = {145, 155, 140, 130, 130, 114, 130, 130, 140, 155};
        g.fillPolygon(x, y, 10); //star on top
   }
}