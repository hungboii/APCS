import javax.swing.*;
import java.awt.*;
public class MichaelGraphics
{
    public static void main(String[] args)
    {
        JFrame win;
        Container contentPane;
        Graphics g;
        
        win = new JFrame("My First Graphics");
        win.setSize(800,600);
        win.setLocation(100,100);
        win.setVisible(true);
        
        contentPane = win.getContentPane();
        g = contentPane.getGraphics();
        
        try {Thread.sleep(400);} catch (Exception e) {}
        g.setColor(new Color(50,100,200));
        g.fillRect(0,0,800,600);
        g.setColor(Color.BLACK);
        //g.setColor(new Color(145,24,14));
        g.fillOval(205,330,20,20);//trap right
        g.fillOval(190,330,20,20);
        
        //g.setColor(Color.GREEN);
        g.fillOval(175,337,40,40);//pec left
        //g.fillOval(175,337,40,40);
        
        //g.setColor(Color.BLUE);
        g.fillOval(205,337,40,40);//pec right
        
        g.fillOval(190,340,40,80);
        
        g.fillOval(220,340,30,30);//right arm
        g.fillOval(230,345,30,30);
        g.fillOval(235,350,25,25);
        g.fillOval(239,360,25,25);
        g.fillOval(241,365,25,25);
        g.fillOval(242,370,23,23);
        g.fillOval(243,375,21,21);
        g.fillOval(243,390,20,20);
        g.fillOval(243,395,19,19);
        g.fillOval(243,400,19,19);
        //g.fillOval(210,320,20,50);
        
        g.fillOval(175,340,30,30);//left arm
        g.fillOval(165,345,30,30);
        g.fillOval(160,350,25,25);
        g.fillOval(156,360,25,25);
        g.fillOval(154,365,25,25);
        g.fillOval(153,370,23,23);
        g.fillOval(152,375,21,21);
        g.fillOval(152,390,20,20);
        g.fillOval(152,395,19,19);
        g.fillOval(152,400,19,19);
        
        g.fillRect(410,340,20,80);
        
        Polygon jLArm = new Polygon();
        jLArm.addPoint(410,340);
        jLArm.addPoint(370,400);
        jLArm.addPoint(380,400);
        jLArm.addPoint(410,380);
        g.fillPolygon(jLArm);
        
        Polygon jRArm = new Polygon();
        jRArm.addPoint(430,340);
        jRArm.addPoint(470,400);
        jRArm.addPoint(460,400);
        jRArm.addPoint(430,380);
        g.fillPolygon(jRArm);
        
        g.fillRect(405,400,10,90);
        g.fillRect(425,400,10,90);
        
        
        Polygon lLeg = new Polygon();
        lLeg.addPoint(198,410);
        lLeg.addPoint(185,515);
        lLeg.addPoint(205,415);
        g.fillPolygon(lLeg);
        
        Polygon rLeg = new Polygon();
        rLeg.addPoint(223,410);
        rLeg.addPoint(233,515);
        rLeg.addPoint(216,415);
        g.fillPolygon(rLeg);

        g.setColor(new Color(145,24,14));
        Polygon kFace = new Polygon();//kyven face
        kFace.addPoint(200,300);
        kFace.addPoint(216,300);
        kFace.addPoint(221,310);
        kFace.addPoint(223,325);
        kFace.addPoint(219,327);
        kFace.addPoint(214,340);
        kFace.addPoint(204,340);
        kFace.addPoint(197,327);
        kFace.addPoint(193,325);
        kFace.addPoint(195,310);
        kFace.addPoint(200,300);
        g.fillPolygon(kFace);
        
        g.fillOval(203,337,7,7);
        g.fillOval(208,337,7,7);//chin
        
        g.fillOval(400,300,40,40);//jordan head
        
        g.setColor(new Color(254,200,200));
        g.fillOval(200,320,3,3);
        g.fillOval(216,320,3,3);
        
        g.setColor(new Color(254,254,254));
        g.fillOval(400,310,10,10);
        g.fillOval(420,310,10,10);
        
        g.setColor(new Color(101,50,50));
        g.fillOval(208,330,6,6);
        
        g.setColor(new Color(170,180,130));
        Polygon toe1 = new Polygon();
        toe1.addPoint(410,150);
        toe1.addPoint(400,90);
        toe1.addPoint(360,80);
        g.fillPolygon(toe1);
        Polygon toe2 = new Polygon();
        toe2.addPoint(390,150);
        toe2.addPoint(380,100);
        toe2.addPoint(350,80);
        g.fillPolygon(toe2);
        Polygon toe3 = new Polygon();
        toe3.addPoint(360,150);
        toe3.addPoint(350,100);
        toe3.addPoint(310,80);
        g.fillPolygon(toe3);
        Polygon toe4 = new Polygon();
        toe4.addPoint(380,150);
        toe4.addPoint(370,100);
        toe4.addPoint(330,80);
        g.fillPolygon(toe4);
        Polygon toe5 = new Polygon();
        toe5.addPoint(260,150);
        toe5.addPoint(270,90);
        toe5.addPoint(310,80);
        g.fillPolygon(toe5);
        Polygon toe6 = new Polygon();
        toe6.addPoint(240,150);
        toe6.addPoint(250,100);
        toe6.addPoint(290,80);
        g.fillPolygon(toe6);
        Polygon toe7 = new Polygon();
        toe7.addPoint(210,150);
        toe7.addPoint(220,100);
        toe7.addPoint(260,80);
        g.fillPolygon(toe7);
        Polygon toe8 = new Polygon();
        toe8.addPoint(230,150);
        toe8.addPoint(240,100);
        toe8.addPoint(290,80);
        g.fillPolygon(toe8);
        
        g.setColor(Color.RED);

        g.fillOval(280,100,30,30);
        g.fillOval(310,100,30,30);
        g.fillOval(295,130,30,30);
        
        g.setColor(new Color(254,254,254));
        for(int i = 0; i<70; i++)
        {
            g.fillOval((int)(Math.random()*800),(int)(Math.random()*600),10,10);
        }
    }
}