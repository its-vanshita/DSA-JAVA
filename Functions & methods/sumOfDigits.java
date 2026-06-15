// Write a java method to compute the sum of digits of a number.


public class sumOfDigits 
{
    public static int digitSum(int num)
    {
        int sum=0;

        while(num>0)
        {
            int ld = num%10;
            sum = sum +ld;
            num = num/10;
        }

        return sum;
    }
    public static void main(String args[])
    {
       int n = 6476;
       
       int sum = digitSum(n);

       System.out.println("Sum of digits of a number is :" + sum);
    }    
}
