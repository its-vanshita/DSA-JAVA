/*

      *
    * *
  * * *
* * * *


*/


public class invertedAndRotatedHalfPyramid 

{

    public static void invertedHalfPyramid(int totRows,int totCols)
    {
        for(int i=1;i<=totRows;i++)
        {
            for(int j=totCols;j>=1;j--)
            {
                if(j<=i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public static void main(String args[])
    {
       int totRows = 4;
       int totCols = 4;

       invertedHalfPyramid(totRows, totCols);
    }    
}
