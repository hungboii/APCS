public class warmup
{
    public static void main(String []args)
    {
        // double gpa1 = 4.0;
        // double gpa2 = 1.4;
        // double gpa3 = 2.7;
        // double gpa4 = 1.9;
        double[] gpas = {4.0, 1.4, 2.7, 1.9};

        for(int i = 0; i < gpas.length; i++)
            if(gpas[i] < 2.0)
                System.out.println(gpas[i] + " good job!");

        //if(gpas[1] < 2.0)
            //System.out.println(gpas[1] + " good job!");
        
        //if(gpas[2] < 2.0)
            //System.out.println(gpa[2] + " good job!");

        //if(gpas[3] < 2.0)
            //System.out.print(gpas[3] + " good job!");
    }
}