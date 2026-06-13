public class findFactorial 
{
    public static int factorial(int n)
    {
        int fact = 1;

        while (n>0)
        {
            fact = n * fact;
            n--;
        }
        return fact;
    }
   public static void main(String args[])
   {
     int num = 3;

     int ans = factorial(num);

     System.out.println("Factorial of "+ num + " is: " + ans);
   }    
}
