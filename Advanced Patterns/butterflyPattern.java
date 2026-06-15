

public class butterflyPattern
{
    public static void printPattern(int totRows)
    {
        for(int i=1;i<=totRows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            for(int j=1;j<=2*(totRows-i);j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            System.out.println("");

        }

        for(int i=totRows;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            for(int j=1;j<=2*(totRows-i);j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            System.out.println("");

        }
    }    

    public static void main(String args[])
    {
        int n = 4;

        printPattern(n);
    }

}
