/*Write a Java method to compute the average
of three numbers. */
import java.util.*;

public class avgOfThreeNum
{
    public static void calcAvg(int a,int b,int c)
    {
        int avg = (a+b+c)/3;

        System.out.println("Average of "+ a +","+b+","+c+" is:"+avg);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;

        System.out.print("Enter a: ");
        a = sc.nextInt();

        System.out.print("Enter b: ");
        b = sc.nextInt();


        System.out.print("Enter c: ");
        c = sc.nextInt();

        calcAvg(a, b, c);
    }
}