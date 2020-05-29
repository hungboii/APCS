import javax.swing.*;
import java.awt.*; 

public class graphicsTesting
{  
    
    public static void main (String[] args)
    {
        int faceX = 605;
        int faceY = 5;

        JFrame win;
        Container contentPane;
        Graphics g;
      
        win = new JFrame("bruh");
        win.setSize(1296, 839);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
      
        contentPane = win.getContentPane();
        g = contentPane.getGraphics();
      
        try {Thread.sleep(400);} catch (Exception e) {}

        g.setColor(Color.YELLOW);
        g.fillOval(faceX, faceY + 3, 60, 60);
        g.setColor(Color.BLACK);
        g.fillOval(faceX + 13, faceY + 19, 10, 10); //eyes
        g.fillOval(faceX + 37, faceY + 19, 10, 10);

        g.fillRect(faceX + 19, faceY + 49, 22, 5 ); //smile
        g.fillRect(faceX + 14, faceY + 44, 5, 5);
        g.fillRect(faceX + 41, faceY + 44, 5, 5);

        g.fillRect(faceX + 11, faceY + 17, 39, 5); //glasses frames
        g.fillRect(faceX + 11, faceY + 22, 17, 9);
        g.fillRect(faceX + 33, faceY + 22, 17, 9);

        g.fillRect(faceX + 6, faceY + 22, 5, 5); //glasses
        g.fillRect(faceX + 50, faceY + 22, 5, 5);
        g.fillRect(faceX + 1, faceY + 27, 5, 5);
        g.fillRect(faceX + 55, faceY + 27, 5, 5);

        JOptionPane.showMessageDialog(null, "you lose", "Test", JOptionPane.INFORMATION_MESSAGE);

    }
}