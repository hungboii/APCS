//for 7 billion:
//method one: 13.0455336
//method two: 13.0192581
//method three: 0.0348618

//pc specs:
//cpu  - AMD ryzen 5 2600x, 6 cores, 4 GHz. about 1.5 yrs old

import java.util.Scanner;
import java.util.Arrays;
public class Divisors
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("What is the number? ");
        long num = kb.nextLong();

        System.out.println("Which method?\n1. Slow\n2. Fast\n3. Fastest");
        int choice = kb.nextInt();

        switch(choice)
        {
            case 1: 
                methodOne(num);
                break;
            case 2:
                methodTwo(num);
                break;
            case 3:
                methodThree(num);
        }
    }
    public static void methodOne(long num)
    {
        long d = 1;

        long startTime = System.nanoTime();
        do
        {
            if(num % d == 0)
                System.out.print(d + " ");
            d++;
        } while(d <= num / 2);
        System.out.println(num);

        long endTime = System.nanoTime();
        long elaspedTime = endTime - startTime;
        System.out.println("It took " + (elaspedTime)/1000000000.0 + " seconds.");
    }
    public static void methodTwo(long num)
    {
        long d = 1;
        long half = num / 2;

        long startTime = System.nanoTime();
        do
        {
            if(num % d == 0)
                System.out.print(d + " ");
            d++;
        } while(d <= half);
        System.out.println(num);

        long endTime = System.nanoTime();
        long elaspedTime = endTime - startTime;
        System.out.println("It took " + (elaspedTime)/1000000000.0 + " seconds.");
    }
    public static void methodThree(long num)
    {
        int d = 1;
        long end = (long) Math.sqrt(num);
        //ArrayList<Integer> factors = new ArrayList<Integer>();

        long startTime = System.nanoTime();
        do
        {
            if(num % d == 0)
            {
                System.out.print(d + " ");
                System.out.print(num / d + " ");
                //factors.add(d);
                //factors.add(num / d);
            }
            d++;
        } while(d <= end);

        // for(int divisor : factors)
        //     System.out.print(divisor + " ");
        System.out.println("");

        long endTime = System.nanoTime();
        long elaspedTime = endTime - startTime;
        System.out.println("It took " + (elaspedTime)/1000000000.0 + " seconds.");
    }
}