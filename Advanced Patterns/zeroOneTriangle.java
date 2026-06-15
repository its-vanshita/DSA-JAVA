/*

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1


In this question we will see row and column index for each value and we will be able to see that if (rowIndex+columnIndex)==Even where 1 is written and where (rowIndex+colIndex)==odd where 0 is written

*/




public class zeroOneTriangle 
{
    public static boolean isEven(int num)
    {
        return num%2==0;
    }


    public static void printPattern(int totRows, int totCols) 
    {
        for(int i=1;i<=totRows;i++)
        {
            for(int j=1;j<=i;j++)
            {
               
                if(isEven(i+j))
                {
                    System.out.print(1+" ");
                }
                else
                {
                    System.out.print(0+ " ");
                }
            }
            System.out.println("");
        }
    }   

    public static void main(String[] args)  
    {
        int totRows = 5;
        int totCols = 5;

        printPattern(totRows, totCols);
    }
}
