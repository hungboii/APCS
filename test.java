public class test
{
    public static void main (String[] args)
    {
        String line = "try {Thread.sleep(400);} catch (Exception e) {}";
        String[] blacklist = {"import", "Color", "sleep", "Polygon"};

        for(String word : blacklist)
        {
            if(line.matches(".*import|.*Color.*|.*sleep.*|.*Polygon.*"))
            {
                System.out.println(line);
            }
            else
            {
                System.out.println("bruh");
            }
        }       
    }
}