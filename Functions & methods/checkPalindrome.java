// Write a java method to check if a number is palindrome or not?


public class checkPalindrome 
{
    public static boolean checkNumPalindrome(int num)
    {
       int rev = 0;
       int originalNum = num;

       while(num>0)
       {
        int ld = num%10;
        rev = rev*10 + ld;
        num = num/10;
       }

       return rev==originalNum;
    }
    public static void main(String a[])
    {
       int n = 321;

       boolean ans = checkNumPalindrome(n);

       System.out.println(ans);
    }    
}
