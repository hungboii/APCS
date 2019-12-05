import javax.swing.*;
import java.awt.*; 

public class testAnimation
{
    public static void main(String[] args)
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

        int i = 1;
        while(i > 0)
        {
            if(i % 2 == 0)
                g.setColor(Color.WHITE);
            if(i % 2 == 1)
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

            try {Thread.sleep(400);} catch (Exception e) {}
            i++;
        }
   }
}