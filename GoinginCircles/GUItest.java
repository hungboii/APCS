import javax.swing.JOptionPane;

public class GUItest
{
    public static void main(String[] args)
    {
        double ooga = Double.parseDouble(JOptionPane.showInputDialog("What is the area? "));
        double booga = Math.sqrt(ooga/Math.PI);
        int mine = (int)(booga * 10);
        double craft = ((double)mine) / 10;
        JOptionPane.showMessageDialog(null,"Radius of your circle is " + craft + ".");
    }
}