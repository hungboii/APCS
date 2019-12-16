public class Tester
{
    public static void main(String[] args)
    {
        double d1 = 37.9;
        double d2 = 1004.128;
        int i1 = 12;
        int i2 = 18;

        double p1 = 57.2 * (i1/i2) + 1;
        double p2 = 57.2 * ((double)i1/i2) + 1;
        double p3 = 15 - i1 * (d1 * 3) + 4;
        int p4 = 15 - i1 * (int)(d1 * 3) + 4;
        int p5 = 15 - i1 * ((int)d1 * 3) + 4;

        System.out.println("Problem 1: " + p1);
        System.out.println("Problem 2: " + p2);
        System.out.println("Problem 3: " + p3);
        System.out.println("Problem 4: " + p4);
        System.out.println("Problem 5: " + p5);
    }
}