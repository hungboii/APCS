import java.util.*;

public class ArrayListGlitch
{
    public static void main(String[] args)
    {
        ArrayList<Integer> ary = new ArrayList<Integer>();

        ary.add(5);
        ary.add(8);
        ary.add(1);
        ary.add(3);
        ary.add(6);
        ary.add(2);
        ary.add(7);
        ary.add(9);
        ary.add(4);

        for(Integer bruh : ary)
            System.out.print(bruh);

        System.out.println();
        
        for(int i = 0; i < ary.size(); i++)
        {
            if(ary.get(i) % 2 == 0)
                System.out.print(ary.remove(i));
        }
    }
}