public class decimalToBinary 
{
  public static int decToBin(int n)
  {
    int power = 0;
    int binNum = 0;
    int rem=0;

    while(n>0)
    {
        rem = n % 2;
        binNum = binNum + rem * (int)Math.pow(10, power);
        power++;
        n = n/2;;
    }

    return binNum;
  }

  public static void main(String[] args) 
  {
     int n = 8;
     
     System.out.println(n+ " decimal value is: " + decToBin(n));
  }    
}
 
    

