// using prefix sum 

/*

Time-complexity: O(n^2)
Space-complexity: O(n)

*/

public class maxSubarraySum2 
{

    public static int maxSubPrefixSum(int arr[])
    {
        int currSum = 0;
        int maxSum = 0;

        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        // fill prefix sum value in prefix array
        for(int i=1;i<prefix.length;i++)
        {
            prefix[i] = prefix[i-1] + arr[i];
        }


        // now find maximum sum of the subarray

        for(int i=0;i<arr.length;i++)
        {
            int start = i;

            for(int j=0;j<arr.length;j++)
            {
                int end = j;

                currSum = (start ==0)?prefix[end]:prefix[end]-prefix[start-1];

                if(currSum > maxSum)
                {
                    maxSum = currSum;
                }
            }
        }


        return maxSum;
    }


    public static void main(String args[])
    {
        int arr[]={-2, -3, 4, -1, -2, 1, 5, -3};

        int maxSum = maxSubPrefixSum(arr);

        System.out.println("Max subarray sum using prefix array is: " + maxSum);
    }
    
    
}
