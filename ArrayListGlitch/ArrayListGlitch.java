import java.util.*;

public class ArrayListGlitch
{
    public static void main(String[] args)
    {
        ArrayList<Integer> ary = new ArrayList<Integer>();
        ArrayList<Integer> evens = new ArrayList<Integer>();

        ary.add(5);
        ary.add(8);
        ary.add(1);
        ary.add(3);
        ary.add(6);
        ary.add(2);
        ary.add(7);
        ary.add(9);
        ary.add(4);

        System.out.println(ary);
        
        for(Integer bruh : ary)
        {
            if(bruh % 2 == 0)
                evens.add(bruh);
        }

        System.out.println(evens);

        //other method
        // for(int i = 0; i < ary.size(); i++)
        // {
        //     if(ary.get(i) % 2 != 0)
        //     {
        //         ary.remove(i);
        //         i--;
        //     }
        // }
        
        // System.out.println(ary);
    }
}