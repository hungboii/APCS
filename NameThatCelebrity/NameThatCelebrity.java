public class NameThatCelebrity
{
    public static void main (String[] args)
    {
        String s1 = "Allan Alda";
        String s2 = "John Wayne";
        String s3 = "Gregory Peck";
        int len1 = s1.length();
        int len2 = s2.length();
        int len3 = s3.length();
        String Allan = s1.substring(2,len1 - 3);
        String John = s2.substring(2,len2 - 3);
        String Gregory = s3.substring(2,len3 - 3);
        System.out.println(s1 + ">>>" + Allan);
        System.out.println(s2 + ">>>" + John);
        System.out.println(s3 + ">>>" + Gregory);
        System.out.println();

        int x = 79 + 3 * (4 + 82 - 68) - 7 + 19;
        int y = (179 + 21 + 10) / 7 + 181;
        int z = 10389 * 56 * 11 + 2246;
        System.out.println("79 + 3 * (4 + 82 - 68) - 7 + 19 " + "= " + x);
        System.out.println("(179 + 21 + 10) / 7 + 181 " + "= " + y);
        System.out.println("10389 * 56 * 11 + 2246 " + "= " + z);
    }
}