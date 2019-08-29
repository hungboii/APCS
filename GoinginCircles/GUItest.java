import javax.swing.JOptionPane;

public class GUItest
{
    public static void main(String[] args)
    {
        double ooga, booga;
        ooga = Double.parseDouble(JOptionPane.showInputDialog("What is the area? "));
        booga = Math.sqrt(ooga/Math.PI);
        JOptionPane.showMessageDialog(null,"Radius of your circle is " + booga + "");
    }
}