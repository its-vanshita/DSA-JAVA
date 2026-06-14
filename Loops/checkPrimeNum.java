import java.util.*;


public class checkPrimeNum 
{
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        n = sc.nextInt();

        boolean isPrime = true;

        if(n==2)
        {
            System.out.println(n+ " is prime");
        }

        else
        {
            for(int i=2;i<=(n-1);i++)
            {
            if(n%i==0)
                {
              isPrime=false;
              break;
                }
            }

        if(isPrime)
        {
            System.out.println(n+ " is prime");
        }

        else
        {
            System.out.println(n+ " is not prime");
        }

        }

       
    }    
}
