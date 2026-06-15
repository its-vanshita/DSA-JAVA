/*

1 2 3 4 5
1 2 3 4
1 2 3
1 2 
1



*/

public class invertedHalfPyramidNumbers 
{
    public static void printPattern(int totRows, int totCols)
    {
        for(int i=1;i<=totRows;i++)
        {
            int num = 1;
            for(int j=totCols;j>=i;j--)
            {
                System.out.print(num++ + " ");
            }
            System.out.println("");
        }
    }
    public static void main(String args[])
    {
        int totCols = 5;
        int totRows=5;

        printPattern(totRows, totCols);
    }
}
