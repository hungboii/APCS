import javax.swing.*; 
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;


public class ButtonTesting 
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Button Example");  
        JPanel absolute = (JPanel)(f.getContentPane());
        /*
        JButton smiley = new JButton();
        ImageIcon icon = new ImageIcon("smiley.png");
        smiley.setBounds(25,100,55,55);  
        f.add(smiley);  
        */
        JLabel joe = new JLabel();
        joe.setIcon(new ImageIcon("smiley.png"));
        joe.setBounds(0, 0, 400, 400);
        absolute.add(joe);

        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);

        
    }    
}