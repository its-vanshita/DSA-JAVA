public class findBinomialCoefficient
{
    public static int factorial(int n)
    {
        int fact = 1;

         while(n>0)
         {
            fact = fact * n;
            n--;
         }
      return fact;
    }

    public static int binCoeff(int n, int r)
    {
     int ans = factorial(n) / (factorial(r) * factorial(n-r));
     return ans;
    }
    public static void main(String args[])
    {
        int n = 6;
        int r = 2;

        

        System.out.println("Binomial coefficient of "+ n + "C" + r + " is: " + binCoeff(n, r));
    }
}