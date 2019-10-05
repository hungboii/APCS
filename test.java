public class test
{
    public static void main(String[] args)
    {
        String input = args[0];  
        int number = 0;
        
        char chr = input.charAt(0);
        if(Character.isDigit(chr))
        {
            number = Integer.parseInt(args[0]);
            System.out.print("it is a number");
        }
        else
        {
            System.out.print("it is a letter");
        }
    }
}
   
