public class binaryToDecimal 
{
  public static int binToDec(int n)
  {
    int power = 0;
    int dec = 0;

    while(n>0)
    {
        int lastDigit = n % 10;
        dec = dec + lastDigit * (int)Math.pow(2, power);
        power++;
        n = n/10;
    }

    return dec;
  }

  public static void main(String[] args) 
  {
     int n = 1010;
     
     System.out.println(n+ " decimal value is: " + binToDec(n));
  }    
}
