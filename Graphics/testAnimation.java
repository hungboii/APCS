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
            if(i % 4 == 1)
                g.setColor(Color.WHITE);
                g.fillOval(200, 150, 10, 10);
                g.setColor(new Color(135,206,250));
                g.fillOval(200, 250, 10, 10);
                // g.fillOval(200, 300, 10, 10);

            if(i % 4 == 2)
                g.setColor(Color.WHITE);
                g.fillOval(200, 250, 10, 10);
                g.setColor(new Color(135,206,250));
                g.fillOval(200, 350, 10, 10);

            if(i % 4 == 3)
                g.setColor(Color.WHITE);
                g.fillOval(200, 350, 10, 10);
                g.setColor(new Color(135,206,250));
                g.fillOval(200, 450, 10, 10);

            if(i % 4 == 0)
                g.setColor(Color.WHITE);
                g.fillOval(200, 450, 10, 10);
                // g.setColor(new Color(135,206,250));
                // g.fillOval(200, 300, 10, 10);

            try {Thread.sleep(500);} catch (Exception e) {}
        }
   }
}