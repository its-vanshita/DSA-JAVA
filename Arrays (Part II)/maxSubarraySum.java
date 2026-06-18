//Brute-force

public class maxSubarraySum
{
    public static int findMaxSubSum(int arr[])
    {
        
        int maxSum = 0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                int sum = 0;
                for(int start=i;start<=j;start++)
                {
                    sum=sum+arr[start];
                }

                if(sum>maxSum)
                {
                    maxSum=sum;
                }
            }
        }

        return maxSum;
    }
    public static void main(String args[])
    {
        int arr[]={-5,-1,-8,-9};

        int ans = findMaxSubSum(arr);

        System.out.println("Maximum subarray sum of the given array is: "+ans);
    }
}