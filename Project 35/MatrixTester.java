public class MatrixTester
{
    public static void main(String[] args)
    {
        int[][] a = { {1, 2, -2, 0},
                      {-3, 4, 7, 2},
                      {6, 0, 3, 1} };
        int[][] b = { {-1, 3}, 
                      {0, 9}, 
                      {1, -11}, 
                      {4, -5} };

        int[][] c = MatrixMult.mult(a, b);

        System.out.println(c[0][0] + "  " + c[0][1]);
        System.out.println(c[1][0] + "  " + c[1][1]);
        System.out.println(c[2][0] + "  " + c[2][1]);
    }
}