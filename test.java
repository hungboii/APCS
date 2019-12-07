public class test
{
    public static void main(String[] args)
    {
        for(int i = 1; i > 0; i++)
        {
            if(i % 3 == 1)
                System.out.print("yes");
            if(i % 3 == 2)
                System.out.print("no");
            if(i % 3 == 0)
                System.out.print("nbot");

            // if(i % 3 == 0)
            //     g.setColor(new Color(135,206,250));
            //     g.fillOval(200, 200, 10, 10);
            //     g.fillOval(200, 250, 10, 10);
            //     g.setColor(Color.WHITE);
            //     g.fillOval(200, 300, 10, 10);

            try {Thread.sleep(400);} catch (Exception e) {}
        }
    }
}
