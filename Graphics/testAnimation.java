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

        g.setColor(new Color(135, 206, 250));
        g.fillRect(0, 0, 400, 500);

        for(int i = 1; i > 0; i++)
        {
            g.setColor(Color.WHITE);
            g.fillOval((int)(Math.random() * 400), (int)(Math.random() * 500), 4, 4);

            if(i % 1000 == 0)
            {
                g.setColor(new Color(135, 206, 250));
                g.fillRect(0, 0, 400, 500);
            }
            try {Thread.sleep(10);} catch (Exception e) {}
        }
   }
}