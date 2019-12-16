public class MatrixMult
{
    public static int[][] mult(int[][] a, int[][] b)
    {
        int[][]c = new int[a.length][b[0].length];

        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < b[0].length; j++)
            {
                int sum = 0; 
                for(int k = 0; k < a[0].length; k++) 
                {
                    sum = sum + a[i][k] * b[k][j];
                }
                c[i][j] = sum;
            }
        }
        return c;
    }
}