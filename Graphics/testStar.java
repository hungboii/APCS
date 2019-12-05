import javax.swing.*;
import java.awt.*; 

public class testStar
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
          
        g.setColor(Color.YELLOW);

        int[] x = {200, 215, 210, 225, 205, 200, 195, 175, 190, 185};
        int[] y = {95, 105, 90, 80, 80, 64, 80, 80, 90, 105};
        g.fillPolygon(x, y, 10);
    }
}