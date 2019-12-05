import javax.swing.*;
import java.awt.*; 

public class ChristmasTree
{  
    public static void main (String[] args)
    {
        JFrame win;
        Container contentPane;
        Graphics g;
      
        win = new JFrame("My First Graphics");
        win.setSize(400, 500);
        win.setLocation(1300, 40);
        win.setVisible(true);
      
        contentPane = win.getContentPane();
        g = contentPane.getGraphics();
      
        try {Thread.sleep(400);} catch (Exception e) {}
          
        g.setColor(Color.GREEN);
                    
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

        g.setColor(new Color(150, 75, 0)); //change color to brown

        g.fillRect(175, 375, 50, 75); //base/stump of tree  
        
        g.setColor(Color.YELLOW);

        int[] x = {200, 215, 210, 225, 205, 200, 195, 175, 190, 185};
        int[] y = {95, 105, 90, 80, 80, 64, 80, 80, 90, 105};
        g.fillPolygon(x, y, 10);

   }
}