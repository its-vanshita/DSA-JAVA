import java.util.*;

/*

If n = 10

then we have to print prime numbers between 2 to 10 which is 2, 3, 5, 7

*/

public class printAllPrimeInRange 
{
    public static boolean isPrime(int n)
    {
      if(n==2)
      {
        return true;
      }
      for(int i=2;i<=Math.sqrt(n);i++)
      {
        if(n%i==0)
        {
          return false;
        }
      }
      return true;
    }

     public static void main(String args[])
     {
      Scanner sc = new Scanner(System.in);
      
      int n;
      System.out.print("Enter a number: ");

      n = sc.nextInt();


      for(int i=2;i<=n;i++)
      {
        if(isPrime(i))
        {
            System.out.print(i + ",");
        }
      }
     }    
}
