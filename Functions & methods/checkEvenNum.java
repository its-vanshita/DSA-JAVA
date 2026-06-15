/*Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. Also write a program to test your method. */


import java.util.*;

public class checkEvenNum
{
    public static boolean isEven(int num)
    {
        return num%2==0;
    }

    public static void testNum(int num)
    {
        if(isEven(num))
        {
            System.out.println(num+" is even");
        }

        else
        {
            System.out.println(num+ " is odd");
        }
    }
    
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);

       int num;

       System.out.print("Enter a number: ");
       num = sc.nextInt();

       testNum(num);
    }
}