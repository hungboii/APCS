public class zoebot
{
    public static void main(String[] args)
    {
            int[][] oceaniaPlus = new int[8][8];
            boolean facePort = false;
            boolean faceStarboard = false;
            boolean faceBow = false;
            boolean faceStern = false; 
            int startC;
            int startR;
            int len = 5;
            
            int direct = (int)(Math.random() * 4);
            if (direct == 0)
            {
                facePort = true; 
                    startC = (int)(Math.random() * len) + (8-len);
                    startR = (int)(Math.random() * 8);
                    System.out.println(direct);
                    System.out.println(startC);
                    System.out.println(startR);

                for (int ay = startC; ay > startC - len; ay--)
                {
                    oceaniaPlus[startR][ay] = len*11;   
                }
                
            }
            else if (direct==1)
            {
                faceStarboard = true;
                //column must be o to 8-len

                    startC = (int)(Math.random() * (8-len));
                    startR = (int)(Math.random() * 8);

                    System.out.println(direct);
                    System.out.println(startC);
                    System.out.println(startR);
                for (int jay = startC; jay < startC + len; jay++)
                {
                    oceaniaPlus[startR][jay] = len*11;
                }
            }
            else if (direct==2)
            {
                faceBow = true;
                //row must be starting at bottom and not go off the grid

                    startC = (int)(Math.random() * 8);
                    startR = (int)(Math.random() * (len)) + (8-len);
                    System.out.println(direct);
                    System.out.println(startC);
                    System.out.println(startR);
                for (int kay = startR; kay > startR - len; kay--)
                {
                    oceaniaPlus[kay][startC] = len*11;
                }

            }
            else if (direct==3)
            {
                faceStern = true;
                //row starts at top and can't go off the grid at the bottom  
                    startC = (int)(Math.random() * 8);
                    startR = (int)(Math.random() * (8-len));

                    System.out.println(direct);
                    System.out.println(startC);
                    System.out.println(startR);

                for (int elle = startR; elle < startR + len; elle++)
                {
                    oceaniaPlus[elle][startC] = len*11;
                }
            }
    }
}